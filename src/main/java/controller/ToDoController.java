package controller;

import model.Biseness;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import repository.ToDoRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {

    @Autowired
    private ToDoRepository toDoRepository;

    @GetMapping
    public List<Biseness> getAllBiseness(){
        return toDoRepository.findAll();
    }

    @PostMapping
    public Biseness saveBiseness (@NonNull @RequestBody Biseness biseness){
        return toDoRepository.save(biseness);
    }
}
