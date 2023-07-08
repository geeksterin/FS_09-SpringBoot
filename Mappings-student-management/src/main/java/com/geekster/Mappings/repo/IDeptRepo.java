package com.geekster.Mappings.repo;

import com.geekster.Mappings.model.Dept;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeptRepo extends CrudRepository<Dept,Long> {
}
