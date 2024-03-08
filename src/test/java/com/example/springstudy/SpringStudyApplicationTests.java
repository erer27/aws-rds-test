package com.example.springstudy;

import com.example.springstudy.model.Member;
import com.example.springstudy.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class SpringStudyApplicationTests {

	@Autowired
	private MemberRepository memberRepository;

	@Test
	void testJpa() {
		Member m1 = new Member();
		m1.setId("def");
		m1.setEmail("def@def.com");
		m1.setPassword("1234");
		this.memberRepository.save(m1);
	}

}
