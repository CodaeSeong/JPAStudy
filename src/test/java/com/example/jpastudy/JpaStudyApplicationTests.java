package com.example.jpastudy;

import com.example.jpastudy.entity.Member;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
class JpaStudyApplicationTests {

	@Autowired
	private EntityManager em;

	@Test
	@Transactional
	@Rollback(value = false)
	void contextLoads() {

		Member member = new Member();
		member.setName("홍길동");
		member.setAge(22);

		em.persist(member);
	}

}
