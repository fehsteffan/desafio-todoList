package br.com.felipesteffan.desafio_todolist.service;

import br.com.felipesteffan.desafio_todolist.entities.Todo;
import br.com.felipesteffan.desafio_todolist.repositories.TodoRepository;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    public TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return list();

    }

    public List<Todo> list(){
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
       return todoRepository.findAll(sort);

    }

    public List<Todo> update(Todo todo){
        todoRepository.save(todo);
        return list();

    }


    public List<Todo> delete(Long id){
        todoRepository.deleteById(id);
        return list();

    }
}
