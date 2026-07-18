package com.sbk.ems_fullstack.repository;

import com.sbk.ems_fullstack.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
