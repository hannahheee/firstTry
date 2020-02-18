package com.students.demo.Controller;

import com.students.demo.Entity.Student;
import com.students.demo.Service.ResponseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ResponseService responseService;



    //Get: findAll()
    @GetMapping(value = "/students")
    public List<Student> findAll(){
        return responseService.findAll();
    }

    //Get: findById {id}
    //@RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    @GetMapping(value = "/students/{id}")
    public Student findById(@PathVariable int id){
        return responseService.findById(id);
    }

    //Post: addStudent(....???)
    @PostMapping(value = "/students")
    public void addStudent(@RequestParam("id") int id,@RequestParam("name") String name) {

        Student student=new Student(id,name);

        responseService.addStudent(student);
    }


}

