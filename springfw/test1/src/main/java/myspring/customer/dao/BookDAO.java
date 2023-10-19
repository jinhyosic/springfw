package myspring.customer.dao;

import java.util.List;

import myspring.customer.vo.BookVO;

public interface BookDAO {
	
	List<BookVO> selectAllCustomer();

	BookVO selectCustomer(int id);
	
}
