package myspring.customer.service;

import java.util.List;

import myspring.customer.vo.BookVO;

public interface BookService {
	
	List<BookVO> getAllCustomerList();

	BookVO getCustomerInfo(int id);
}
