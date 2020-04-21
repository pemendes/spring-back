package com.cvmendes.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cvmendes.cursospring.domain.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
