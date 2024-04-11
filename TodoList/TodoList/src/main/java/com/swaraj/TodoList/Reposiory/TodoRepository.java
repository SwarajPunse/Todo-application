package com.swaraj.TodoList.Reposiory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.swaraj.TodoList.Entities.TodoEntity;

import jakarta.transaction.Transactional;

@Repository
public interface TodoRepository extends JpaRepository<TodoEntity, Long> {

	@Query(value = "SELECT * FROM `to-do-list` a WHERE a.userid = :userid", nativeQuery = true)
	public List<TodoEntity> getTodoOfUser(String userid);
}
