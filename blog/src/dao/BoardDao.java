package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.cos.model.Board;
import com.cos.util.DBClose;

public class BoardDao {
	private Connection conn; //MySQL과 연결하기 위한 객체
	private PreparedStatement pstmt; //SQL 작성을 위한 객체
	private ResultSet rs; //결과를 보관할 객체
	
	//글쓰기
		public int update(Board board) {
			conn = DBConn.getConnection();
			
			final String SQL = "UPDATE board SET title = ?, content = ? WHERE id = ?";
			
			try {
				pstmt = conn.prepareStatement(SQL);
				
				pstmt.setString(1, board.getTitle());
				pstmt.setString(2, board.getContent());
				pstmt.setInt(3, board.getId());
				
				int result = pstmt.executeUpdate(); //변경된 튜플의 갯수 리턴
				return result;
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				DBClose.close(conn, pstmt);
			}
			
			return -1;

		}
	
	//글쓰기
	public int save(Board board) {
		conn = DBConn.getConnection();
		
		final String SQL = "INSERT INTO board(userId, title, content, createDate) VALUES(?, ?, ?, now())";
		
		try {
			pstmt = conn.prepareStatement(SQL);
			
			pstmt.setInt(1, board.getUserId());
			pstmt.setString(2, board.getTitle());
			pstmt.setString(3, board.getContent());			
			
			int result = pstmt.executeUpdate(); //변경된 튜플의 갯수 리턴
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		
		return -1;
	}
	
	//리스트 전체
	public List<Board> findAll(){
		conn = DBConn.getConnection();
		
		final String SQL = "SELECT * FROM board ORDER BY id DESC";
		
		try {
			List<Board> boards = new ArrayList<Board>();
			
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setUserId(rs.getInt("userId"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setReadCount(rs.getInt("readCount"));
				board.setCreateDate(rs.getTimestamp("createDate"));
				
				boards.add(board);
			}
			
			return boards;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
	//리스트 페이징
	public List<Board> findAll(int page){
		conn = DBConn.getConnection();
		
		//한 페이지에 글 3개씩 페이징
		final String SQL = "SELECT * FROM board ORDER BY id DESC limit ?, 3";
		
		try {
			List<Board> boards = new ArrayList<Board>();
			
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, 3*(page-1));
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setUserId(rs.getInt("userId"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setReadCount(rs.getInt("readCount"));
				board.setCreateDate(rs.getTimestamp("createDate"));
				
				boards.add(board);
			}
			
			return boards;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
	//상세보기
	public Board findById(int id) {
		conn = DBConn.getConnection();
		
		final String SQL = "SELECT * FROM board WHERE id = ?";
		
		try {			
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, id);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setUserId(rs.getInt("userId"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setReadCount(rs.getInt("readCount"));
				board.setCreateDate(rs.getTimestamp("createDate"));
				
				return board;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
	//조회수 증가
	public int increaseReadCount(int id) {
		conn = DBConn.getConnection();
		
		final String SQL = "UPDATE board SET readCount = readCount+1 WHERE id = ?";
		
		try {
			pstmt = conn.prepareStatement(SQL);
			
			pstmt.setInt(1, id);			
			
			int result = pstmt.executeUpdate(); //변경된 튜플의 갯수 리턴
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		
		return -1;
	}
	
	// 인기리스트 3건 가져오기
	public List<Board> findOrderByReadCountDesc(){
		conn = DBConn.getConnection();
		
		final String SQL = "SELECT * FROM board ORDER BY readCount DESC limit 3";
		
		try {
			List<Board> boards = new ArrayList<Board>();
			
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setId(rs.getInt("id"));
				board.setUserId(rs.getInt("userId"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setReadCount(rs.getInt("readCount"));
				board.setCreateDate(rs.getTimestamp("createDate"));
				
				boards.add(board);
			}
			
			return boards;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt, rs);
		}
		
		return null;
	}
	
	//글 삭제
	public int deleteById(int id) {
		conn = DBConn.getConnection();
		
		final String SQL = "DELETE FROM board WHERE id = ?";
		
		try {			
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, id);
			
			int result = pstmt.executeUpdate();
			return result;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBClose.close(conn, pstmt);
		}
		
		return -1;
	}
	
	
	
}
