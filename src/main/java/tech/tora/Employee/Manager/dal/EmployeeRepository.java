package tech.tora.Employee.Manager.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.tora.Employee.Manager.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Employee getEmployeeById(Long id);

    void deleteEmployeeById(Long id);

    Employee findEmployeeById(Long id);

    List<Employee> findAllByOrderById();

}
