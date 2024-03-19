package edu.harbour.space.university.builder;

import java.util.UUID;

public class Employee {
    private final UUID id;
    private final String name;
    private final String surname;
    private final int age;

    private Employee(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.age = builder.age;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private UUID id;
        private String name;
        private String surname;
        private int age;

        public Builder setId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder setNameAndSurname(String[] nameAndSurname) {
            this.name = nameAndSurname[0];
            this.surname = nameAndSurname[1];
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
