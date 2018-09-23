package com.resultonline.dao;

import com.resultonline.model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfessorDao {

private List<Professor>  professorBd = new ArrayList<>();

    {
        professorBd.add(new Professor("jean1","jean","charles"));
        professorBd.add(new Professor("chris2","chris","chrisner"));
        professorBd.add(new Professor("ion3","ion","ion"));
    }


    public void addProfessor(Professor professor){
        professorBd.add(professor);
    }

    public void deleteProfessor(String idProfessor, String name){

        for (Professor prof: professorBd){
            if (prof.getIdProfessor().equals(idProfessor) && prof.getFirstNameProfessor().equals(name)){

                professorBd.remove(prof);
            }
        }
    }

    public List<Professor> getAllProfessor(){
        return new ArrayList<>(professorBd);
    }

    public boolean checkProfessorExist(String idProfessor,String name){

        for (Professor prof: professorBd){
            if (prof.getIdProfessor().equals(idProfessor) && prof.getFirstNameProfessor().equals(name)){

                return true;
            }
        }
             return false;
    }
}
