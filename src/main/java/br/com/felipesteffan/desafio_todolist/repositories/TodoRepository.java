package br.com.felipesteffan.desafio_todolist.repositories;


import br.com.felipesteffan.desafio_todolist.entities.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}
