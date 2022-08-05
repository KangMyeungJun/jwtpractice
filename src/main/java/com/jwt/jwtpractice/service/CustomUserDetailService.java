package com.jwt.jwtpractice.service;

import com.jwt.jwtpractice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Component("userDetailsService")
@RequiredArgsConstructor
@Slf4j
public class CustomUserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {

        return userRepository.findOneWithAuthoritiesByUsername(username)
                .map(user -> createUser(username,user))
                .orElseThrow(() -> new UsernameNotFoundException(username + "-> 데이터베이스에서 찾을 수 없습니다."));
    }

    private User createUser(String username, com.jwt.jwtpractice.entity.User user) {
        if (!user.isActivated()) {
            throw new RuntimeException(username + "활성화가 되어있지 않습니다!");
        }
        List<SimpleGrantedAuthority> grantedAuthorities = user.getAuthorities()
                .stream().map(authority -> new SimpleGrantedAuthority(authority.getAuthorityName()))
                .collect(Collectors.toList());
        //grantedAuthorities.stream().forEach(s-> log.info("authority -> {}", s));

        return new User(user.getUsername(),user.getPassword(),grantedAuthorities);
    }
}
