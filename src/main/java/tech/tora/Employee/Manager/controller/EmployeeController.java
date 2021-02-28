package tech.tora.Employee.Manager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.tora.Employee.Manager.bus.EmployeeService;
import tech.tora.Employee.Manager.model.Employee;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> hello(){
        return ResponseEntity.status(HttpStatus.OK).body("Hello World!");
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        Employee tmp = employeeService.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(tmp);
    }

    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee tmp = employeeService.updateEmployee(employee);

        return ResponseEntity.status(HttpStatus.OK).body(tmp);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployee() {
        List<Employee> employees = new ArrayList<>();

        employees = employeeService.getAllEmployee();

        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }

    @GetMapping("find/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        Employee employee = employeeService.findEmployeeById(id);

        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }
}
