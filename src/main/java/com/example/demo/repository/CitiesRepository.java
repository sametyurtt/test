package com.example.demo.repository;

import com.example.demo.entity.Cities;
import org.springframework.data.repository.CrudRepository;

public interface CitiesRepository extends CrudRepository<Cities, Long> {
}
