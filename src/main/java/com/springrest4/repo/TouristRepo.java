package com.springrest4.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest4.model.Tourist;

@Repository
public interface TouristRepo extends JpaRepository<Tourist,Integer>{

}
