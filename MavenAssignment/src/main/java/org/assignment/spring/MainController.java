package org.assignment.spring;

import java.util.List;

import org.assignment.spring.services.Student;
import org.assignment.spring.services.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	
	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView homepage(ModelAndView model) {
		List<Student> liststudents = studentDAO.getAllStudents();
	    model.addObject("liststudents", liststudents);
	    Student stud=new Student();
	    model.addObject("s",stud);
	    model.setViewName("index");	 
	    return model;
	}
	
	@RequestMapping(value="/newStudent", method=RequestMethod.GET)
	public ModelAndView newStudent(ModelAndView model) {
		System.out.println("In new Student method");
		Student stud = new Student();
	    model.addObject("student",stud);
	    model.setViewName("AddStudent");
	    return model;		
	}
	
	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public ModelAndView addStudent(@ModelAttribute Student student) {
	    studentDAO.saveOrUpdate(student);
	    return new ModelAndView("redirect:/");
	}
	
	@RequestMapping(value="/getByRegNum", method=RequestMethod.POST)
	public ModelAndView getByRegNum(@ModelAttribute Student student,ModelAndView model)
	{
		
		model.addObject("Student",studentDAO.get(student.getRegnum()));
		model.setViewName("ByRegNum");
		return model;
	}

	
	@RequestMapping(value = "/goBack", method = RequestMethod.GET)
	public ModelAndView goBack() {
	    
	    return new ModelAndView("redirect:/");
	}
}
