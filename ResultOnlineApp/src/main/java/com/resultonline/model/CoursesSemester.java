package com.resultonline.model;

public class CoursesSemester {
    private int idCoursesSemester;
    private int year;
    private int semester;
    private int idCourse;
    private String idProfessor;


    public CoursesSemester(int idCoursesSemester, int year, int semester, int idCourse,String idProfessor) {
        this.idCoursesSemester = idCoursesSemester;
        this.year = year;
        this.semester = semester;
        this.idCourse = idCourse;
    }

    public CoursesSemester(int year, int semester, int idCourse) {
        this.year = year;
        this.semester = semester;
        this.idCourse = idCourse;
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

    public int getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(int idCourse) {
        this.idCourse = idCourse;
    }

    public int getidCoursesSemester() {
        return idCoursesSemester;
    }

    public void setidCoursesSemester(int idCoursesSemester) {
        this.idCoursesSemester = idCoursesSemester;
    }


    public int getIdCoursesSemester() {
        return idCoursesSemester;
    }

    public void setIdCoursesSemester(int idCoursesSemester) {
        this.idCoursesSemester = idCoursesSemester;
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
        if (!(o instanceof CoursesSemester)) return false;

        CoursesSemester that = (CoursesSemester) o;

        if (getIdCoursesSemester() != that.getIdCoursesSemester()) return false;
        if (getYear() != that.getYear()) return false;
        if (getSemester() != that.getSemester()) return false;
        if (getIdCourse() != that.getIdCourse()) return false;
        return getIdProfessor() != null ? getIdProfessor().equals(that.getIdProfessor()) : that.getIdProfessor() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdCoursesSemester();
        result = 31 * result + getYear();
        result = 31 * result + getSemester();
        result = 31 * result + getIdCourse();
        result = 31 * result + (getIdProfessor() != null ? getIdProfessor().hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "CoursesSemester{" +
                "idCoursesSemester=" + idCoursesSemester +
                ", year=" + year +
                ", semester=" + semester +
                ", idCourse=" + idCourse +
                ", idProfessor='" + idProfessor + '\'' +
                '}';
    }
}
