package org.assignment.spring.services;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentDAO {
	
	    public void saveOrUpdate(Student student);
     
	    public void delete(String regnum);
	     
	    public Student get(String regnum);
	     
	    public List<Student> getAllStudents();

}
