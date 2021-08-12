package com.lti.mypack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.mypack.farmerreg.Farmer;

@Repository
public interface FarmerRepo extends JpaRepository<Farmer, Integer>{

}
