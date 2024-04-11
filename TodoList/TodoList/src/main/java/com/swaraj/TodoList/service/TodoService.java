package com.swaraj.TodoList.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swaraj.TodoList.Entities.TodoEntity;
import com.swaraj.TodoList.Reposiory.TodoRepository;

@Service
public class TodoService {

	@Autowired
	public TodoRepository todoRepository;
	
	
	public TodoEntity addelement(TodoEntity todo) {
	  TodoEntity to = todoRepository.save(todo);
	  return to;
	}
	
	public TodoEntity getelement(Long id) {
		
//		Optional <TodoEntity> op = todoRepository.findById(id);
//		TodoEntity a =null;
//		try {
//			a=op.get();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return a;
		
		return todoRepository.findById(id).get();
	}
	
	
	public List<TodoEntity> getAllTodoOfUser(String userId){
		List<TodoEntity> listOfTodo = todoRepository.getTodoOfUser(userId);
		
		return listOfTodo;
	}
}
