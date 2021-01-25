package com.broship.peter.web.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.broship.peter.web.board.BoardVO;

@Repository
public class BoardDAOSpring {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private final String BOARD_LIST = "select * from board1 order by seq desc";
	
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}


	public List<BoardVO> getBoardList(){
		return jdbcTemplate.query(BOARD_LIST, new BoardRowMapper());
	}
	
}
