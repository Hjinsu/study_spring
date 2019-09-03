package com.mvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mvc.dto.MVCBoardDto;

@Repository
public class MVCBoardDaoImpl implements MVCBoardDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<MVCBoardDto> selectList() {
		List<MVCBoardDto> list = jdbcTemplate.query("SELECT * FROM MVCBOARD ORDER BY SEQ DESC", (rs,rownum)->{
			MVCBoardDto res = new MVCBoardDto();
			res.setSeq(rs.getInt(1));
			res.setWriter(rs.getString(2));
			res.setTitle(rs.getString(3));
			res.setContent(rs.getString(4));
			res.setRegdate(rs.getDate(5));
			
			return res;
		});
		return list;
	}

	@Override
	public MVCBoardDto selectOne(int seq) {
		MVCBoardDto dto = jdbcTemplate.queryForObject("SELECT * FROM MVCBOARD WHERE SEQ = ?", new Object[] {seq}, new RowMapper<MVCBoardDto>() {

			@Override
			public MVCBoardDto mapRow(ResultSet rs, int rowNum) throws SQLException {
				MVCBoardDto res = new MVCBoardDto();
				res.setSeq(rs.getInt(1));
				res.setWriter(rs.getString(2));
				res.setTitle(rs.getString(3));
				res.setContent(rs.getString(4));
				res.setRegdate(rs.getDate(5));
				
				return res;
			}
		});
		return dto;
	}

	@Override
	public int insert(MVCBoardDto dto) {
		int res = jdbcTemplate.update("INSERT INTO MVCBOARD VALUES(MVCBOARDSEQ.NEXTVAL, ?, ?, ?, SYSDATE)",
										new Object[] {dto.getWriter(), dto.getTitle(), dto.getContent()});
			
		return res;
	}

	@Override
	public int update(MVCBoardDto dto) {
		int res = jdbcTemplate.update("UPDATE MVCBOARD SET WRITTER = ?, TITLE = ?, CONTENT = ? WHERE SEQ = ?",
				new Object[] {dto.getWriter(), dto.getTitle(), dto.getContent(), dto.getSeq()});

		return res;
	}

	@Override
	public int delete(int seq) {
		int res = jdbcTemplate.update("DELETE FROM MVCBOARD WHERE SEQ = ?",
				new Object[] {seq});

		return res;
	}

	public int getListSize() {
		return 0;
	}
}
