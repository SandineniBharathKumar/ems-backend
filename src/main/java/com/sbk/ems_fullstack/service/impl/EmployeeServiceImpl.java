package com.sbk.ems_fullstack.service.impl;

import com.sbk.ems_fullstack.dto.EmployeeDto;
import com.sbk.ems_fullstack.entity.Employee;
import com.sbk.ems_fullstack.exception.ResourceNotFoundException;
import com.sbk.ems_fullstack.mapper.EmployeeMapper;
import com.sbk.ems_fullstack.repository.EmployeeRepository;
import com.sbk.ems_fullstack.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private  EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee= employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);

    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
       Employee employee= employeeRepository.findById(employeeId)
               .orElseThrow(()-> new ResourceNotFoundException("Employee is not exist with given id: "+employeeId));
       return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List <Employee> employees =employeeRepository.findAll();
        return employees.stream().map((employee)->EmployeeMapper.mapToEmployeeDto(employee))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
        Employee employee=employeeRepository.findById(employeeId)
                .orElseThrow(()-> new ResourceNotFoundException("Employee is not exists with given id:"+employeeId));
        employee.setFirstName(updatedEmployee.getFirstName());
        employee.setLastName(updatedEmployee.getLastName());
        employee.setEmail(updatedEmployee.getEmail());
        Employee updatedemployeeobj=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(updatedemployeeobj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
       employeeRepository.findById(employeeId)
                .orElseThrow(()-> new ResourceNotFoundException("Employee is not exists with given id:"+employeeId));
        employeeRepository.deleteById(employeeId);
    }
}
