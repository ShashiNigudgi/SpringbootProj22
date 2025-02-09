package com.example.SpringbootProj2.repository;
import com.example.SpringbootProj2.model.bms;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface bmsrepo extends JpaRepository<bms,Integer> {

}
