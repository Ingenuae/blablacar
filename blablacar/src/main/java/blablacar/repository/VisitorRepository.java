package blablacar.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import blablacar.domain.Visitor;


@Repository
public interface VisitorRepository extends CrudRepository<Visitor, Long> {
}