package org.assignment.spring;

import java.util.List;

import org.assignment.spring.services.Student;
import org.assignment.spring.services.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	
	@Autowired
	private StudentDAO studentDAO;
	
	//@RequestMapping(value = "/", method = RequestMethod.GET)
	@GetMapping("/")
	public ModelAndView homepage(ModelAndView model) {
		List<Student> liststudents = studentDAO.getAllStudents();
	    model.addObject("liststudents", liststudents);
	    Student stud=new Student();
	    model.addObject("s",stud);
	    model.setViewName("index");	 
	    return model;
	}
	
	//@RequestMapping(value="/newStudent", method=RequestMethod.GET)
	@GetMapping("/newStudent")
	public ModelAndView newStudent(ModelAndView model) {
		
		Student stud = new Student();
	    model.addObject("student",stud);
	    model.setViewName("AddStudent");
	    return model;		
	}
	
	//@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	@PostMapping("/addStudent")
	public ModelAndView addStudent(@ModelAttribute Student student) {
	    studentDAO.saveOrUpdate(student);
	    return new ModelAndView("redirect:/");
	}
	
	//@RequestMapping(value="/getByRegNum", method=RequestMethod.POST)
	@PostMapping("/getByRegNum")
	public ModelAndView getByRegNum(@ModelAttribute Student student,ModelAndView model)
	{
		
		model.addObject("Student",studentDAO.get(student.getRegnum()));
		model.setViewName("ByRegNum");
		return model;
	}

	
	//@RequestMapping(value = "/goBack", method = RequestMethod.GET)
	@GetMapping("/goBack")
	public ModelAndView goBack() {
	    
	    return new ModelAndView("redirect:/");
	}
}
