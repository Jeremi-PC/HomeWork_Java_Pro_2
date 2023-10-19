package org.example.organization;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Patric", "Loose", "HR-maneger", 35);
        Employee employee1 = new Employee("Lisa", "Brown", "Programmer", 27);
        Employee employee2 = new Employee(25);
        employee2.setFirstName("Irma");
        employee2.setLastName("Blumen");
        employee2.setJobTitle("FE developer");
        employee.action();
        employee1.action();
        employee2.action();
        Director director = new Director("Rymma", "Goldberg", "Director", 18, 12);
        director.action();
        //класс Director является наследником класса Employee
        //классы Department и Organization не являются наследниками по сути,
        // класс Organization включает в себя объекты класса Department и если Department
        // может существать без Organization, то это агрегация,
        // но в случае отношений Director и Department это неотъемлимые объекты,
        // поэтому отнощения будут композицией.
    }
}


