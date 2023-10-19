package myspring.customer.dao.mapper;

import java.util.List;

import myspring.customer.vo.BookVO;

public interface CustomerMapper {
	
	List<BookVO> selectAllCustomer();
	BookVO selectCustomer(int id);
	
}
