package lab;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import entity.Student;
import repository.StudentRepository;

@CrossOrigin
@RestController
public class StudentController {
	@Autowired
	StudentRepository studentRepository;
	
	@RequestMapping(value="/submitStudentDetails",
		    consumes=MediaType.APPLICATION_JSON_VALUE,
		    produces=MediaType.APPLICATION_JSON_VALUE,
		    method=RequestMethod.POST)
	
	public void submitStudentDetails(@RequestBody Student student){ 
	studentRepository.save(student);
	
	}
	@RequestMapping(value="/getStudentByEmail",
		    produces=MediaType.APPLICATION_JSON_VALUE,
		    method=RequestMethod.GET)
	
	@ResponseBody
	private ResponseEntity<?> getStudentByEmail(String email){
		return new ResponseEntity<Student>(studentRepository.findOne(email),HttpStatus.OK);
	}
	
	@RequestMapping(value="/getStudents",
		    produces=MediaType.APPLICATION_JSON_VALUE,
		    method=RequestMethod.GET)
	@ResponseBody
public ResponseEntity<?> getStudents(){
	return new ResponseEntity<List<Student>>(studentRepository.findAll(), HttpStatus.OK);
	
}
}
