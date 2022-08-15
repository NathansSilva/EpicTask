package br.com.fiap.epictaskapi.service;

import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    TaskRepository repository;
    public List<Task> listAll(){
        return repository.findAll();
    }

    public void save(Task task){
        repository.save(task);
    }
}
