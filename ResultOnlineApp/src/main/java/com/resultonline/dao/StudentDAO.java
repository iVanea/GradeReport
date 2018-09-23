package com.resultonline.dao;
import com.resultonline.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDAO {

    static Map<Integer,Student> studentsBd = new HashMap<>();

    {
        studentsBd.put(100,new Student(100,"Jean","Charles"));
        studentsBd.put(101,new Student(101,"Ion","Carl"));
        studentsBd.put(102,new Student(102,"Peter","Jacques"));
        studentsBd.put(103,new Student(103,"Lee","Georges"));
        studentsBd.put(104,new Student(104,"Lu","Bush"));
        studentsBd.put(105,new Student(105,"Charles","Obama"));
        studentsBd.put(106,new Student(106,"Pierre","Linda"));
        studentsBd.put(107,new Student(107,"John","Joseph"));
        studentsBd.put(108,new Student(108,"Paul","Charles"));
        studentsBd.put(109,new Student(109,"Nadia","Paul"));
        studentsBd.put(110,new Student(110,"Marlyn","Peterson"));

    }



    public int studId() {
        return studentsBd.size()+100;
    }

    public void addStudents(Student student){

        studentsBd.put(student.getIdStudent(),student);
    }

    public void deleteStudent(int studentId){
        studentsBd.remove(studentId);
    }

    public void updateStudent(Student student){
        studentsBd.put(student.getIdStudent(),student);
    }


    public List<Student> getAllStudents(){
        return new ArrayList<>(studentsBd.values());
    }

    public Student getStudentById(int studentId){
        return studentsBd.get(studentId);
    }



}
