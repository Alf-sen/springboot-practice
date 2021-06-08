package com.example.dao;

import com.example.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Map;

/**
 * @auther lenovo
 * @date 2021/6/8 19:06
 */
@Repository
public class DepartmentDao {

    private static Map<Integer, Department> departments = null;

    //模拟数据库加载信息
    static {
        departments.put(101, new Department(101, "开一"));
        departments.put(102, new Department(102, "开二"));
        departments.put(103, new Department(103, "研发"));
        departments.put(104, new Department(104, "创新"));
    }


    //查询所有部门信息
    public Collection<Department> getAllDepartments() {
        return departments.values();
    }

    //按id查询部门信息
    public Department getDepartmentById(Integer id) {
        return departments.get(id);
    }
}
