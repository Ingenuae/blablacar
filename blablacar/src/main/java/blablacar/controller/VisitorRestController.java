package blablacar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import blablacar.Service.VisitorService;
import blablacar.domain.TOVisitor;
import blablacar.domain.Visitor;
import blablacar.repository.VisitorRepository;

@RestController
@RequestMapping("/visitor")
public class VisitorRestController {

		@Autowired
		VisitorService visitorService;

//        	@GetMapping("/show/{id}")  
        	@RequestMapping(method = RequestMethod.GET, value = "/show/{id}")
        	public TOVisitor show(@PathVariable("id") long id) { 
        		return visitorService.get(id);
        	}
        	
         	@RequestMapping(method = RequestMethod.GET, value = "/showAll")        
        	public Iterable<Visitor> showAll() { 
        		return visitorService.getAll();
        	}
         	
         	@RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
        	public String delete(@PathVariable("id") long id) {        		
        		visitorService.delete(id);				
        		return "VISITOR AS CORRECTLY BE DELETED";        		
        	}
        	      	
        	
//        	, , @RequestParam("firstName") 
//        	String firstName, @RequestParam("lastName") String lastName, @RequestParam("birthDate") 
//        	String birthDate,  @RequestParam("email") 
//        	String email, @RequestParam("rating") 
//        	String rating, @RequestParam("confirmed") 
//        	String confirmed
        	
        	@RequestMapping("/add")        
        	public String addUser(@RequestParam("login") 
        	String login, @RequestParam("password") String password) {
        		
        		Visitor visitor = new Visitor();
        		visitor.setLogin(login);
        		visitor.setPassword(password);
//        		visitor.setFirstName(firstName);
//        		visitor.setLastName(lastName);
//        		visitor.setEmail(email);
		
        		visitorService.add(visitor);	        		
        		return "VISITOR AS CORRECTLY BE INSERT TO H2";		
        	}
        	

       
       
}
