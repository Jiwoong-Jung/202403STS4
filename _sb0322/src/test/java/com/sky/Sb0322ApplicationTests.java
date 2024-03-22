package com.sky;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import com.sky.dao.MemberDao;
import com.sky.dto.Member;

@SpringBootTest
class Sb0322ApplicationTests {

	@Autowired
	private MemberDao memDao;
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Test
	@DisplayName("jdbc 테스트")
	void jdbcTest() {
		SqlRowSet rs = jdbcTemplate
				.queryForRowSet("select * from member where id = ?", 15);
		rs.next();
		assertEquals(15, rs.getInt("id"));
	}
	
	//@Test
	@DisplayName("assertEquals로 테스트")
	public void test3() {

		int before = memDao.count();
		Member member = Member.builder()
				.email("aaa4@korea.com")
				.name("가나다").password("2345").build();
		memDao.insert2(member);
		int after = memDao.count();
		assertEquals(before+1, after);
	}
	
	
	@Test
	@DisplayName("selectAll() 테스트")
	public void test1() {
		System.out.println(memDao.selectAll());
	}
	
	//@Test
	@DisplayName("insert() 테스트")
	public void test2() {
		Member member = Member.builder()
				.email("aaa123@korea.com")
				.name("가나다").password("2345").build();
		memDao.insert(member);
	}
	
}
