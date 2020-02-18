package com.students.demo.Service;

import ch.qos.logback.classic.spi.ILoggingEvent;
import com.students.demo.Entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//@Service
@Component
public class ResponseService {

    private static List<Student> students = new ArrayList<>(3);
    static{
        students.add(new Student(1,"Hannah"));
        students.add(new Student(2,"Tom"));
        students.add(new Student(3,"David"));

    }

    public  List<Student> findAll(){
        return students;
    }

    //findById

    public Student findById(int id){
        for (int i = 0; i < students.size(); i++) {
            if (id == students.get(i).getID()) {
                return students.get(i);
            }
        }
        return null;
    }

    //addStudent
    public void addStudent(Student student){
        boolean isIdExist=false;

        // check if Id already existed
        for (int i = 0; i < students.size(); i++) {
            if (student.getID()==students.get(i).getID()){
                isIdExist=true;
            }
        }

        if (isIdExist==true){
            //do nothing if Id already existed
        }else {
            //add new student instance to students list if Id is not existed.
            students.add(student);
        }

//        for (int i = 0; i < students.size(); i++) {
////            if(student.getID() == students.get(i).getID() && !student.getName().equals(students.get(i).getName())) {
////                students.get(i).setName(student.getName());
////            } else if (student.getID() != students.get(i).getID() && !student.getName().equals(students.get(i).getName())){
////                students.add(student);
////            }
////        }
     }

}

