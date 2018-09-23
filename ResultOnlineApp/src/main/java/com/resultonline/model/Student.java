package com.resultonline.model;

public class Student {

    private int idStudent;
    private String firstNameStudent;
    private  String lastNameStudent;

    public Student(int idStudent, String firstNameStudent, String lastNameStudent) {
        this.idStudent = idStudent;
        this.firstNameStudent = firstNameStudent;
        this.lastNameStudent = lastNameStudent;
    }


    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getFirstNameStudent() {
        return firstNameStudent;
    }

    public void setFirstNameStudent(String firstNameStudent) {
        this.firstNameStudent = firstNameStudent;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getIdStudent() != student.getIdStudent()) return false;
        if (getFirstNameStudent() != null ? !getFirstNameStudent().equals(student.getFirstNameStudent()) : student.getFirstNameStudent() != null)
            return false;
        return getLastNameStudent() != null ? getLastNameStudent().equals(student.getLastNameStudent()) : student.getLastNameStudent() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdStudent();
        result = 31 * result + (getFirstNameStudent() != null ? getFirstNameStudent().hashCode() : 0);
        result = 31 * result + (getLastNameStudent() != null ? getLastNameStudent().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idStudent=" + idStudent +
                ", firstNameStudent='" + firstNameStudent + '\'' +
                ", lastNameStudent='" + lastNameStudent + '\'' +
                '}';
    }
}
