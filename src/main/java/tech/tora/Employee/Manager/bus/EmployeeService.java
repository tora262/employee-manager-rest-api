package tech.tora.Employee.Manager.bus;

import org.springframework.stereotype.Service;
import tech.tora.Employee.Manager.model.Employee;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public Employee findEmployeeById(Long id);
    public void deleteEmployee(Long id);
    public List<Employee> getAllEmployee();
}
