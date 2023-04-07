package springmock_controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring_dao.Emp_dao;
import spring_dto.Emp_class;

@Controller
public class Emp_controller {
	@Autowired
	Emp_dao dao = new Emp_dao();
	Emp_class class1 = new Emp_class();

	@RequestMapping("/signup")

	public ModelAndView signup() {
		ModelAndView modelAndView = new ModelAndView("Signup.jsp");

		modelAndView.addObject("empobject", class1);

		return modelAndView;

	}

	@RequestMapping("/insert")
	public String saveData(Emp_class recobject) {

		dao.insert(recobject);
		return "saved";

	}

	@RequestMapping("/fetch")
	public ModelAndView fetch() {
		ModelAndView modelAndView = new ModelAndView("fetch.jsp");
		return modelAndView.addObject("fetch", class1);
	}

}
