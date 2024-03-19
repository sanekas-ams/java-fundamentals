package edu.harbour.space.university.singleton;

import edu.harbour.space.university.builder.Employee;

import java.util.UUID;

public enum CEO {
    INSTANCE(Employee.builder()
            .setId(UUID.fromString("772beb3e-cc52-4eb0-b4e7-39bf8fa38648"))
            .setNameAndSurname(new String[] {"Jeff", "Bezos"})
            .setAge(54)
            .build());

    CEO(Employee employee) {
        this.employee = employee;
    }

    private final Employee employee;

    public Employee getEmployee() {
        return employee;
    }
}
