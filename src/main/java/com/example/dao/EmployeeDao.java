package com.example.dao;

import com.example.pojo.Department;
import com.example.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

/**
 * @auther lenovo
 * @date 2021/6/8 19:07
 */
@Repository
public class EmployeeDao {

    private static Map<Integer, Employee> employees = null;

    @Autowired
    public DepartmentDao departmentDao;

    //模拟数据库加载员工信息
    static {
        employees.put(1001, new Employee(1001, "AA", 0, "A37482749.qq", new Department(101,"开一")));
        employees.put(1002, new Employee(1002, "BB", 1, "B37482749.qq", new Department(102,"开二")));
        employees.put(1003, new Employee(1003, "CC", 1, "C37482749.qq", new Department(103,"研发")));
        employees.put(1004, new Employee(1004, "DD", 0, "D37482749.qq", new Department(104,"创新")));
    }

    //获取所有员工信息
    public Collection<Employee> getAllEmployees() {
        return employees.values();
    }

    //
    private static Integer employeeId = 1005;
    //新增员工
    public void addEmployee(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(employeeId++);
        }

        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getId()));

        employees.put(employee.getId(), employee);
    }

    //查询员工信息
    public Employee getEmployeeById(Integer id) {
        return employees.get(id);
    }

    //删除员工
    public void deleteEmployeeByid(Integer id) {
        employees.remove(id);
    }
}
