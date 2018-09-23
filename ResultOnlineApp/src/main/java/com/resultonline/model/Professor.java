package com.resultonline.model;

public class Professor {
    private String idProfessor;
    private String firstNameProfessor;
    private String lastNameProfessor;

    public Professor(String idProfessor, String firstNameProfessor, String lastNameProfessor) {
        this.idProfessor = idProfessor;
        this.firstNameProfessor = firstNameProfessor;
        this.lastNameProfessor = lastNameProfessor;
    }

    public String getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(String idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getFirstNameProfessor() {
        return firstNameProfessor;
    }

    public void setFirstNameProfessor(String firstNameProfessor) {
        this.firstNameProfessor = firstNameProfessor;
    }

    public String getLastNameProfessor() {
        return lastNameProfessor;
    }

    public void setLastNameProfessor(String lastNameProfessor) {
        this.lastNameProfessor = lastNameProfessor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Professor)) return false;

        Professor professor = (Professor) o;

        if (getIdProfessor() != null ? !getIdProfessor().equals(professor.getIdProfessor()) : professor.getIdProfessor() != null)
            return false;
        if (getFirstNameProfessor() != null ? !getFirstNameProfessor().equals(professor.getFirstNameProfessor()) : professor.getFirstNameProfessor() != null)
            return false;
        return getLastNameProfessor() != null ? getLastNameProfessor().equals(professor.getLastNameProfessor()) : professor.getLastNameProfessor() == null;
    }

    @Override
    public int hashCode() {
        int result = getIdProfessor() != null ? getIdProfessor().hashCode() : 0;
        result = 31 * result + (getFirstNameProfessor() != null ? getFirstNameProfessor().hashCode() : 0);
        result = 31 * result + (getLastNameProfessor() != null ? getLastNameProfessor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "idProfessor=" + idProfessor +
                ", firstNameProfessor='" + firstNameProfessor + '\'' +
                ", lastNameProfessor='" + lastNameProfessor + '\'' +
                '}';
    }
}
