package dbConnect;

import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.customer.dao.mapper.CustomerMapper;
import myspring.customer.service.BookService;
import myspring.customer.vo.BookVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/resources/spring-bean-customer.xml")
public class DbConnectTest {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	CustomerMapper customerMapper;
	
	@Autowired
	BookService customerService;
	


	@Test
	public void sqlSessionFactoryTest(){
		System.out.println(sqlSessionFactory.getClass().getName());
		System.out.println(sqlSessionFactory.getConfiguration());
	}
	

}
