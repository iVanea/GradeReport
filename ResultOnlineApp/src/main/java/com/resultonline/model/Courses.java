package com.resultonline.model;

public class Courses {
    private int idCourse;

    private String nameCourse;

    public Courses(int idCourse, String nameCourse) {
        this.idCourse = idCourse;

        this.nameCourse = nameCourse;
    }

    public Courses(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Courses)) return false;

        Courses courses = (Courses) o;

        if (getIdCourse() != courses.getIdCourse()) return false;
        return getNameCourse() != null ? getNameCourse().equals(courses.getNameCourse()) : courses.getNameCourse() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdCourse();
        result = 31 * result + (getNameCourse() != null ? getNameCourse().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Courses{" +
                "idCourse=" + idCourse +
                ", nameCourse='" + nameCourse + '\'' +
                '}';
    }
}
