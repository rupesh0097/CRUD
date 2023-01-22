package com.crud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.Entity.User;

public interface Repository extends JpaRepository<User,Long>{

}
