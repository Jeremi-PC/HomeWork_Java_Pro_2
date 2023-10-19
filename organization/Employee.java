package org.example.organization;

public class Employee {
    private String firstName;
    private String lastName;
    private String jobTitle;
    private int age;

    public Employee() {
    }

    public Employee(int age) {
        this.age = age;
    }

    public Employee(String firstName, String lastName, String jobTitle, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jobTitle = jobTitle;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void action() {
        System.out.println("I'm " + this.firstName + " " + this.lastName + ", I make my job");
    }

}
