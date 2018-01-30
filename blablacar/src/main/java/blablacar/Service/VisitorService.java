package blablacar.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blablacar.domain.TOVisitor;
import blablacar.domain.Visitor;
import blablacar.repository.*;

@Service
public class VisitorService {
	
//	@PersistenceContext (unitName = "persistence-unit-h2")
//    private EntityManager em;
	
	@Autowired
	VisitorRepository visitorDao;
	
    public TOVisitor get(Long userId) {    	
    	Visitor visitor = new Visitor();
		//FIND A VISITOR IN H2 WITH REPOSITORY INTERFACE
		visitor = visitorDao.findOne(userId);		
		TOVisitor tOVisitor = new TOVisitor(visitor);
		return tOVisitor;        	
    }
    
    public Iterable<Visitor> getAll() {    	
    	Iterable<Visitor> visitors;
		//FIND A VISITOR IN H2 WITH REPOSITORY INTERFACE
		visitors = visitorDao.findAll();
		return visitors;
//		TOVisitor tOVisitor = new TOVisitor(visitor);
//		return tOVisitor;        	
    }

    public void add(Visitor visitor) {
    	visitorDao.save(visitor);
    }

	public void delete(long userId) {
		// TODO Auto-generated method stub
		visitorDao.delete(userId);
	}	
    
}
