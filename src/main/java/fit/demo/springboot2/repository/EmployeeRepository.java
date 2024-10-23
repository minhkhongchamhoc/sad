package fit.demo.springboot2.repository;
import fit.demo.springboot2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}
