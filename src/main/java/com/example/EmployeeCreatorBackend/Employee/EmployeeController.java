package com.example.EmployeeCreatorBackend.Employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeCreatorBackend.exceptions.NotFoundException;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getAll() {
        List<Employee> allEmployees = this.employeeService.getAll();
        return new ResponseEntity<>(allEmployees, HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<Employee> createEmployee(@RequestBody EmployeeCreateDTO data) {
        Employee newEmployee = this.employeeService.createEmployee(data);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getById(@PathVariable Long id) {
        Optional<Employee> found = this.employeeService.getById(id);

        if (found.isPresent()) {
            return new ResponseEntity<Employee>(found.get(), HttpStatus.OK);
        }
        throw new NotFoundException(String.format("Employee with the id: %d does not exist", id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> deleteById(@PathVariable Long id) {
        boolean deleted = this.employeeService.deleteById(id);

        if (deleted == true) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }

        throw new NotFoundException(String
                .format("Post with id: %d does not exist, could not be deleted", id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Employee> updateById(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeUpdateDTO data) {
        Optional<Employee> updated = this.employeeService.updateById(id, data);

        if (updated.isPresent()) {
            return new ResponseEntity<>(updated.get(), HttpStatus.OK);
        }

        throw new NotFoundException(String.format("Post with id: %d does not exist, could not be updated", id));
    }
}
