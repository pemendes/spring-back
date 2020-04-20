package com.cvmendes.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cvmendes.cursospring.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
