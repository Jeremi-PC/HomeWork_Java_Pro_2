package org.example.organization;

public class Director extends Employee {

    int workExperience;

    public Director(String firstName, String lastName, String jobTitle, int age, int workExperience) {
        super(firstName, lastName, jobTitle, age);
    }

    public Director(String firstName, String lastName) {
    }

    public int getWorkExperience() {
        return workExperience;
    }

    @Override
    public void action() {
        System.out.println("I'm " + this.getFirstName() + " " + this.getLastName() + " I'm " + this.getJobTitle() + ". I check others work");
    }

}
