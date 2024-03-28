package com.sky.sp0320;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.sky.sp0320.dao.MemberDao;
import com.sky.sp0320.dto.Member;

@SpringBootTest
class Sp0320ApplicationTests {
	
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Test
	@DisplayName("테스트 프로그램")
	void insertTest() {
		Member member = Member.builder().name("이하나").password("7777").email("lee2@korea.com").build();
		int before = memberDao.count();
		memberDao.insert(member);
		int after = memberDao.count();
		assertEquals(before+1, after);
	}
	
	@Test
	@DisplayName("jdbc 테스트")
	void jdbcTest() {
		Member member = Member.builder().name("이하나").password("7777").email("lee2@korea.com").build();
		SqlRowSet rs = jdbcTemplate.queryForRowSet("select * from member where id = ?", 15);
		rs.next();
		assertEquals(15, rs.getInt("id"));
	}
	@Test
	@DisplayName("jdbc 테스트2")
	void jdbcTest2() {
		System.out.println(memberDao.selectAll());
	}

}
