package com.cvmendes.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cvmendes.cursospring.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}
