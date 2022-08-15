package br.com.fiap.epictaskapi.controller;

import br.com.fiap.epictaskapi.dto.TaskDto;
import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskService service;

    @GetMapping("/api/task")
    public List<Task> index(){
        return service.listAll();
    }

    @PostMapping("/api/task")
    public ResponseEntity<Task> create(@RequestBody Task task){
        service.save(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(task);
    }
}
