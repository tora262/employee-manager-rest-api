package tech.tora.Employee.Manager.bus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.tora.Employee.Manager.dal.EmployeeRepository;
import tech.tora.Employee.Manager.model.Employee;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        repository.save(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {

        return repository.save(employee);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return repository.findEmployeeById(id);
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return repository.findAllByOrderById();
    }
}
