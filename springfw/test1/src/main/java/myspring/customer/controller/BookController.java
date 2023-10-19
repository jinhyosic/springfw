package myspring.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.customer.service.BookService;
import myspring.customer.vo.BookVO;

@Controller
public class BookController {
	@Autowired
	BookService customerService;

	@RequestMapping(path = "/customerList.do")
	ModelAndView customerList() {
		List<BookVO> customerList = customerService.getAllCustomerList();
		return new ModelAndView("customerList","customerList",customerList);
	}
	
	@RequestMapping(path = "/getCustomer.do")
	ModelAndView getCustomer(@RequestParam int id) {
		BookVO customerInfo = customerService.getCustomerInfo(id);
		return new ModelAndView("customerInfo","customerInfo",customerInfo);
	}
}
