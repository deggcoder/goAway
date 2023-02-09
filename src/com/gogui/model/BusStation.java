package com.gogui.model;

import java.time.LocalDate;
import java.util.Objects;

public class BusStation {
    private static int cont = 0;
    private int noStation;
    private String name;
    private int number;
    private LocalDate startDate;
    private String city;
    private String location;
    private Person boss;

    public BusStation(String name, int number, LocalDate startDate, String city, String location, Person boss) {
        this.noStation = ++cont;
        this.name = name;
        this.number = number;
        this.startDate = startDate;
        this.city = city;
        this.location = location;
        this.boss = boss;
    }

    public BusStation() {
    }

    @Override
    public String toString() {
        return "BusStation{" +
                "noStation=" + noStation +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startDate=" + startDate +
                ", city='" + city + '\'' +
                ", location='" + location + '\'' +
                ", boss=" + boss +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BusStation that = (BusStation) o;
        return noStation == that.noStation && number == that.number && Objects.equals(name, that.name) && Objects.equals(startDate, that.startDate) && Objects.equals(city, that.city) && Objects.equals(location, that.location) && Objects.equals(boss, that.boss);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noStation, name, number, startDate, city, location, boss);
    }

    public int getNoStation() {
        return noStation;
    }

    public void setNoStation(int noStation) {
        this.noStation = noStation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Person getBoss() {
        return boss;
    }

    public void setBoss(Person boss) {
        this.boss = boss;
    }
}
