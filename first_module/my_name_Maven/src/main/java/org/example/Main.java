package com.example;

import com.google.gson.Gson;

public class Main {

    public static class Person {
        private String name;
        private String lastName;

        public Person(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public String getName() {
            return name;
        }

        public String getLastName() {
            return lastName;
        }
    }

    public static void main(String[] args) {
        Gson gson = new Gson();
        Person person = new Person("Valerii", "Chernous");
        String json = gson.toJson(person);
        System.out.println(json);
    }
}