package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.DBConnection;
import vo.ProductVO;

public class ProductDao extends DBConnection {
	
	// 쓰기 
	public int insert(ProductVO productVO) {
		Connection conn = getConnection();
		PreparedStatement stmt = null;
		int res = 0;
		String sql = "INSERT INTO PRODUCT(PRODUCT_CODE, PRODUCT_NAME, PRODUCT_PRICE, PRODUCT_COUNT, PRODUCT_FACTORY, PRODUCT_DATE) "
				+ "VALUES(?,?,?,?,?,?)";
		try {
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, productVO.getProduct_code());
			stmt.setString(2, productVO.getProduct_name());
			stmt.setInt(3, productVO.getProduct_price());
			stmt.setInt(4, productVO.getProduct_count());
			stmt.setString(5, productVO.getProduct_factory());
			stmt.setString(6, productVO.getProduct_date());
			res = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn);
			close(stmt);
		}
		return res;
	}
	
	
	// 전체조회 
	public List<ProductVO> select(){
		Connection conn = getConnection();
		String sql = "SELECT * FROM PRODUCT";
		Statement stmt = null;
		ResultSet rs = null;
		
		List<ProductVO> list = new ArrayList<ProductVO>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				ProductVO vo = new ProductVO();
				vo.setProduct_code(rs.getInt("PRODUCT_CODE"));
				vo.setProduct_name(rs.getString("PRODUCT_NAME"));
				vo.setProduct_price(rs.getInt("PRODUCT_PRICE"));
				vo.setProduct_count(rs.getInt("PRODUCT_COUNT"));
				vo.setProduct_factory(rs.getString("PRODUCT_FACTORY"));
				vo.setProduct_date(rs.getString("PRODUCT_DATE"));
				list.add(vo);
				
			} 
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn);
			close(rs);
			close(stmt);
		}
		return list;
	}
	// 검색
	public List<ProductVO> search(String search){
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM PRODUCT WHERE PRODUCT_NAME LIKE ?";
		List<ProductVO> list = new ArrayList<ProductVO>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + search + "%");
			
			stmt = conn.createStatement();
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setProduct_code(rs.getInt("PRODUCT_CODE"));
				vo.setProduct_name(rs.getString("PRODUCT_NAME"));
				vo.setProduct_price(rs.getInt("PRODUCT_PRICE"));
				vo.setProduct_count(rs.getInt("PRODUCT_COUNT"));
				vo.setProduct_factory(rs.getString("PRODUCT_FACTORY"));
				vo.setProduct_date(rs.getString("PRODUCT_DATE"));
				list.add(vo);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn);
			close(pstmt);
			close(rs);
			close(stmt);
		}
		return list;
	}
	
	// 삭제 
	public int delete(int code) {
		Connection conn = getConnection();
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM PRODUCT "
				+ "WHERE PRODUCT_CODE = ?";
		
		int res = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, code);
			res = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(conn);
			close(pstmt);
		}
		return res;
	}
	
	
	// 수정
	public int update(ProductVO vo) {
		Connection conn = getConnection();
		// 해당하는 상품코드의 가격과 수량을 수정하는 쿼리문 !! 
		String sql = "UPDATE PRODUCT "
				+ "SET PRODUCT_PRICE = ?, PRODUCT_COUNT = ? "
				+ "WHERE PRODUCT_CODE = ?";
		PreparedStatement pstmt = null;
		int res = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getProduct_price());
			pstmt.setInt(2, vo.getProduct_count());
			pstmt.setInt(3, vo.getProduct_code());
			res = pstmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			close(conn);
		}
		return res;
	}
	
	
	
	
	
	
	
}
