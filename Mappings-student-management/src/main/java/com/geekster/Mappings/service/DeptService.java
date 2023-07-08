package com.geekster.Mappings.service;

import com.geekster.Mappings.model.Dept;
import com.geekster.Mappings.model.Course;
import com.geekster.Mappings.repo.IDeptRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptService {

    @Autowired
    IDeptRepo iDeptRepo;

    public void addDeptSpec(Dept dept)
    {

    }

    public void addDept(Dept dept)
    {

        iDeptRepo.save(dept);
    }
}
