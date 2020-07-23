package com.nirsb.webserver.test.Webservertest.Repository;

import com.nirsb.webserver.test.Webservertest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
