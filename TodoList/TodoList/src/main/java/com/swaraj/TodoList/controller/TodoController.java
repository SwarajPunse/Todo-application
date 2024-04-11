package com.swaraj.TodoList.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaraj.TodoList.Dao.DummyTodo;
import com.swaraj.TodoList.Entities.TodoEntity;
import com.swaraj.TodoList.Reposiory.TodoRepository;
import com.swaraj.TodoList.service.TodoService;


@RestController
@RequestMapping("/todo")
public class TodoController {
	
	@Autowired
	public TodoService todoService;
	
	@Autowired
	public TodoRepository todoRepository;
	

	

	//works
	//@PreAuthorize("hasRole('ADMIN')")
	@PostMapping
	public ResponseEntity<TodoEntity> add(@RequestBody TodoEntity to) {
		TodoEntity todo = todoService.addelement(to);
		return ResponseEntity.status(HttpStatus.CREATED).body(todo);
		
	}
	
	//works
	@GetMapping("/{id}")
	public ResponseEntity<TodoEntity> getEntity(@PathVariable Long id ) 
	{
      TodoEntity t=new TodoEntity();
        
     t=todoService.getelement(id);
     System.out.println(t.toString());
     return ResponseEntity.ok(t);
		
	}
	
	//@PreAuthorize("hasRole('NORMAL')")
	@GetMapping
	public ResponseEntity<List<TodoEntity>> getallEntity()
	{
		
		List<TodoEntity> to= todoRepository.findAll();
		
		return ResponseEntity.ok(to);
	}
	
	//works
	@PutMapping("/{id}")
	public ResponseEntity<TodoEntity> updateTask(@PathVariable Long id, @RequestBody DummyTodo todo ) {
		TodoEntity t = todoService.getelement(id);
		if(todo.getUpdatedDate()!=null) {
			t.setScheduledAt(todo.getUpdatedDate());
		}
		if(todo.getUpdatedTask()!=null) {
			t.setTask(todo.getUpdatedTask());
		}
		t.setId(id);
		System.out.println(t.toString());
		todoService.addelement(t);
		return ResponseEntity.ok(t);
		
	}
	
	//works
	@DeleteMapping("/{id}")
	public ResponseEntity<TodoEntity> deleteTodo(@PathVariable Long id) {
		Optional<TodoEntity> todo = todoRepository.findById(id);
		TodoEntity todo1 = null;
		try {
			todo1=todo.get();
			todoRepository.delete(todo1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok(todo1);
	}
	
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<TodoEntity>> getAllTodoOfUser(@PathVariable String userId){
		List<TodoEntity> todolist = todoService.getAllTodoOfUser(userId);
		
		return ResponseEntity.ok(todolist);
	}
	
	
}
