package studentcrud.studentcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studentcrud.studentcrud.domain.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long > {
}
