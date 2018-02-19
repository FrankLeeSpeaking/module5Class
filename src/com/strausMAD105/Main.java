package com.strausMAD105;

public class Main {

    public static void main(String[] args) {

                // ------------------ Create OBJECT VARIABLES
                Employee employee1 = new Employee("John Doe", "12345", 1);
                Employee employee2 = new Employee("Jane Doe", "98765", 2);
                Employee employee3 = new Employee("Joe Doe", "22222", 3);

                // ------------- Display objects formatted for display in Employee.java
                employee1.displayAll();
                employee2.displayAll();
                employee3.displayAll();


            }// ------------ END of method main ------------

        }// -------------END of class Main
