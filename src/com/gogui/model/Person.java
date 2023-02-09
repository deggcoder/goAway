package com.gogui.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person {
    private static int cont = 0;
    private int noPerson;
    private String name;
    private String lastname;
    private String phone;
    private LocalDate birthday;
    private String city;
    private Period age;

    public Person(String name, String lastname, String phone, LocalDate birthday, String city) {
        this.name = name;
        this.lastname = lastname;
        this.phone = phone;
        this.birthday = birthday;
        this.city = city;
        this.age = Period.between(birthday, LocalDate.now());
        this.noPerson = ++cont;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + birthday +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone) && Objects.equals(birthday, person.birthday) && Objects.equals(city, person.city) && Objects.equals(age, person.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, phone, birthday, city, age);
    }

    public int getNoPerson() {
        return noPerson;
    }

    public void setNoPerson(int noPerson) {
        this.noPerson = noPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Period getAge() {
        return age;
    }

    public void setAge(Period age) {
        this.age = age;
    }
}
