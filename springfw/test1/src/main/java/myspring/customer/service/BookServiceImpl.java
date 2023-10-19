package myspring.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.customer.dao.BookDAO;
import myspring.customer.vo.BookVO;

@Service("customerService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDAO customerDAO;
	
	@Override
	public List<BookVO> getAllCustomerList() {
		return customerDAO.selectAllCustomer();
	}

	@Override
	public BookVO getCustomerInfo(int id) {
		return customerDAO.selectCustomer(id);
	}

}
