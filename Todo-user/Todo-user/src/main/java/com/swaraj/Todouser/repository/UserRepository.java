package com.swaraj.Todouser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.swaraj.Todouser.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
