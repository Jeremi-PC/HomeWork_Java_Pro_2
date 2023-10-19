package org.example.organization;

public class Department {
    String nameOfDepartment;
    int numberOfEmployees;
    Director director;

    public Department(String nameOfDepartment, int numberOfEmployees, Director director) {
        this.nameOfDepartment = nameOfDepartment;
        this.numberOfEmployees = numberOfEmployees;
    }


    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}