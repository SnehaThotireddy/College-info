package com.example.Collegeinfo.service;

import com.example.Collegeinfo.model.Department;
import com.example.Collegeinfo.repository.departmentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Departmentservice {
    @Autowired
    private departmentrepo repo;

    public Department adddepartment(Department department) {
        return repo.save(department);
    }

    public Department getdepartment(int id) {
        return repo.findById(id).orElse(null);
    }
}
