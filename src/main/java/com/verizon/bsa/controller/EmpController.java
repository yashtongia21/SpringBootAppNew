package com.verizon.bsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.verizon.bsa.model.Book;
import com.verizon.bsa.model.Emp;

import com.verizon.bsa.service.EmpService;


@Controller
public class EmpController {
	
	
	@Autowired(required=true)
	private EmpService empService;

	@GetMapping({ "", "/", "home" })
	public ModelAndView defaultEmpController() {
		return new ModelAndView("index", "emps", empService.getAllEmps());
	}
	@GetMapping("/addEmp")
	public ModelAndView addBookAction() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empFormPage");
		mv.addObject("emp",new Emp());
		mv.addObject("possibCatgs",new String[] {"HR","IT","Sales"});
		mv.addObject("possibTypes",new String[] {"Hard Copy","Soft Copy"});
		return mv;
	}
	@PostMapping("/saveEmp")
	public String saveEmpAction(@ModelAttribute Emp emp) {
		
		if(empService.getEmpById(emp.getEmpid())==null) {
			empService.addEmp(emp);
		}
		else
			empService.updateEmp(emp);
		return "redirect:/home";
	}
	
	@GetMapping("/editEmp")
	public ModelAndView editEmpAction(@RequestParam("empid")int empid) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("empFormPage");
		mv.addObject("emp",empService.getEmpById(empid));
		mv.addObject("possibCatgs",new String[] {"HR","IT","Sales"});
		mv.addObject("possibTypes",new String[] {"Hard Copy","Soft Copy"});
		return mv;
	}
	
	@GetMapping("/delEmp")
	public String deleteBookAction(@RequestParam("empid")int empid) {
		empService.deleteEmpById(empid);
		return "redirect:/home";
		
	}

}
