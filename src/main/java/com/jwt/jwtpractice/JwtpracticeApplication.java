package com.jwt.jwtpractice;

import com.jwt.jwtpractice.entity.Authority;
import com.jwt.jwtpractice.entity.User;
import org.hibernate.engine.spi.SessionFactoryDelegatingImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.*;

@SpringBootApplication
public class JwtpracticeApplication {
//	INSERT INTO USER (USER_ID, USERNAME, PASSWORD, NICKNAME, ACTIVATED) VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 1);
//	INSERT INTO USER (USER_ID, USERNAME, PASSWORD, NICKNAME, ACTIVATED) VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 1);
//
//	INSERT INTO AUTHORITY (AUTHORITY_NAME) values ('ROLE_USER');
//	INSERT INTO AUTHORITY (AUTHORITY_NAME) values ('ROLE_ADMIN');
//
//	INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_NAME) values (1, 'ROLE_USER');
//	INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_NAME) values (1, 'ROLE_ADMIN');
//	INSERT INTO USER_AUTHORITY (USER_ID, AUTHORITY_NAME) values (2, 'ROLE_USER');
	public static void main(String[] args) {
		SpringApplication.run(JwtpracticeApplication.class, args);

//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("db");
//		EntityManager em = emf.createEntityManager();
//		EntityTransaction tx = em.getTransaction();
//		try {
//			tx.begin();
//			em.persist(User.builder().userId(1L)
//					.username("admin")
//					.password("$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi")
//					.nickname("admin")
//					.activated(true)
//					.build());
//
//			em.persist(User.builder().userId(2L)
//					.username("user")
//					.password("$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC")
//					.nickname("user")
//					.activated(true)
//					.build());
//
//			tx.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			tx.rollback();
//		} finally {
//			em.close();
//		}
//		emf.close();
	}

}
