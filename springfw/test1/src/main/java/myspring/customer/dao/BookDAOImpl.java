package myspring.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.customer.dao.mapper.CustomerMapper;
import myspring.customer.vo.BookVO;

@Repository("customerDAO")
public class BookDAOImpl implements BookDAO {
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Override
	public List<BookVO> selectAllCustomer() {
		return customerMapper.selectAllCustomer();
	}

	@Override
	public BookVO selectCustomer(int id) {
		return customerMapper.selectCustomer(id);
	}

}
