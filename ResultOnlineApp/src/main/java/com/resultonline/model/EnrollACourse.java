package com.resultonline.model;

public class EnrollACourse {
    private int idEnrollACourse;
    private int year;
    private int semester;
    private int idStudent;
    private int idCourse;
    private String idProfessor;


    public EnrollACourse() {
        super();
    }

    public EnrollACourse(int idEnrollACourse, int year, int semester, int idStudent, int idCourse, String idProfessor) {
        this.idEnrollACourse = idEnrollACourse;
        this.year = year;
        this.semester = semester;
        this.idStudent = idStudent;
        this.idCourse = idCourse;
        this.idProfessor = idProfessor;
    }

    public EnrollACourse(int idEnrollACourse, int year, int semester, int idStudent, int idCourse) {
        this.idEnrollACourse = idEnrollACourse;
        this.year = year;
        this.semester = semester;
        this.idStudent = idStudent;
        this.idCourse = idCourse;
    }


    public int getIdEnrollACourse() {
        return idEnrollACourse;
    }

    public void setIdEnrollACourse(int idEnrollACourse) {
        this.idEnrollACourse = idEnrollACourse;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollACourse)) return false;

        EnrollACourse that = (EnrollACourse) o;

        if (getIdEnrollACourse() != that.getIdEnrollACourse()) return false;
        if (getYear() != that.getYear()) return false;
        if (getSemester() != that.getSemester()) return false;
        if (getIdStudent() != that.getIdStudent()) return false;
        if (getIdCourse() != that.getIdCourse()) return false;
        return getIdProfessor() != null ? getIdProfessor().equals(that.getIdProfessor()) : that.getIdProfessor() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdEnrollACourse();
        result = 31 * result + getYear();
        result = 31 * result + getSemester();
        result = 31 * result + getIdStudent();
        result = 31 * result + getIdCourse();
        result = 31 * result + (getIdProfessor() != null ? getIdProfessor().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "EnrollACourse{" +
                "idEnrollACourse=" + idEnrollACourse +
                ", year=" + year +
                ", semester=" + semester +
                ", idStudent=" + idStudent +
                ", idCourse=" + idCourse +
                ", idProfessor='" + idProfessor + '\'' +
                '}';
    }
}
