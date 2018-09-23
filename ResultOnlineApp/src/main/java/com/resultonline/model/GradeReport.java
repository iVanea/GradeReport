package com.resultonline.model;

public class GradeReport {
    private int idGradeReport;
    private int year;
    private int semester;
    private int idStudent;
    private int idCourse;
    private String idProfessor;
    private double grade;


    public GradeReport(int year, int semester, int idStudent, int idCourse, String idProfessor, double grade) {
        this.year = year;
        this.semester = semester;
        this.idStudent = idStudent;
        this.idCourse = idCourse;
        this.idProfessor = idProfessor;
        this.grade = grade;
    }

    public GradeReport(int idGradeReport, int year, int semester, int idStudent, int idCourse, String idProfessor, double grade) {
        this.idGradeReport = idGradeReport;
        this.year = year;
        this.semester = semester;
        this.idStudent = idStudent;
        this.idCourse = idCourse;
        this.idProfessor = idProfessor;
        this.grade = grade;
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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public int getIdGradeReport() {
        return idGradeReport;
    }

    public void setIdGradeReport(int idGradeReport) {
        this.idGradeReport = idGradeReport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GradeReport)) return false;

        GradeReport that = (GradeReport) o;

        if (getIdGradeReport() != that.getIdGradeReport()) return false;
        if (getYear() != that.getYear()) return false;
        if (getSemester() != that.getSemester()) return false;
        if (getIdStudent() != that.getIdStudent()) return false;
        if (getIdCourse() != that.getIdCourse()) return false;
        if (Double.compare(that.getGrade(), getGrade()) != 0) return false;
        return getIdProfessor() != null ? getIdProfessor().equals(that.getIdProfessor()) : that.getIdProfessor() == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getIdGradeReport();
        result = 31 * result + getYear();
        result = 31 * result + getSemester();
        result = 31 * result + getIdStudent();
        result = 31 * result + getIdCourse();
        result = 31 * result + (getIdProfessor() != null ? getIdProfessor().hashCode() : 0);
        temp = Double.doubleToLongBits(getGrade());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }


    @Override
    public String toString() {
        return "GradeReport{" +
                "idGradeReport=" + idGradeReport +
                ", year=" + year +
                ", semester=" + semester +
                ", idStudent=" + idStudent +
                ", idCourse=" + idCourse +
                ", idProfessor='" + idProfessor + '\'' +
                ", grade=" + grade +
                '}';
    }
}
