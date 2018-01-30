package blablacar.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import blablacar.domain.Home;

@RestController
public class VisitorController {

    private static final String template = "WELCOME ON FUNKY BLABLACAR, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Home home(@RequestParam(value="name", defaultValue="World") String name) {
        return new Home(counter.incrementAndGet(),
                            String.format(template, name));
       
        	
        	@RequestMapping("/show")        
        	public TOVisitor show(@RequestParam("id") long id) {
        		
        		Visitor visitor = new Visitor();
        		visitor = visitorDao.get(id);
        		TOVisitor tOVisitor = new TOVisitor(visitor);
        		return tOVisitor;        		
        	}
        	   	
        	
        	
        	@RequestMapping("/add")        
        	public String addUser(@RequestParam("login") 
        	String login, @RequestParam("password") String password, @RequestParam("firstName") 
        	String firstName, @RequestParam("lastName") String userSurname, @RequestParam("email") 
        	String email) {
        		
        		Visitor visitor = new Visitor();
        		visitor.setFirstName(firstName);
        		visitor.setUserSurname(lastName);
        		visitor.setEmail(email);
        		visitor.setPassword(password);		
        		userDao.add(visitor);		
        		
        		return "USER AS CORRECTLY BE INSERT TO BBD";		
        	}
        	
        	@GET
        	@Path("delete")
        	@Produces("text/html")	
        	public String delete(@QueryParam("id") long userId) {
        		
        		userDao.delete(userId);				
        		return "USER AS CORRECTLY BE DELETED";
        		
        	}
        	
        	

        	
        }
    
        
        
    }
}
