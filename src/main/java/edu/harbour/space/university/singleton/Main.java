package edu.harbour.space.university.singleton;

import edu.harbour.space.university.builder.Employee;

import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Employee employee = Employee.builder()
                .setId(UUID.randomUUID())
                .setNameAndSurname(new String[]{"Peter", "Ross"})
                .setAge(23)
                .build();
        System.out.println(CEO.INSTANCE.getEmployee());
        System.out.println();
    }
}
