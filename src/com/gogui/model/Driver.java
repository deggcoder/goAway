package com.gogui.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Driver extends Person {
    private static int cont = 0;
    private int noDriver;
    private int idCard;
    private LocalDate licenceIssuance;
    private Period experience;
    private Bus bus;
    private BusStation busStation;

    public Driver(String name, String lastname, String phone, LocalDate birthday, String city,
                  int idCard, LocalDate licenceIssuance, Period experience, Bus bus, BusStation busStation) {
        super(name, lastname, phone, birthday, city);
        this.idCard = idCard;
        this.licenceIssuance = licenceIssuance;
        this.experience = experience;
        this.bus = bus;
        this.busStation = busStation;
        this.noDriver = ++cont;
    }

    public Driver() {
        super();
    }

    @Override
    public String toString() {
        return "Driver{" +
                "noDriver=" + noDriver +
                ", idCard=" + idCard +
                ", licenceIssuance=" + licenceIssuance +
                ", experience=" + experience +
                ", bus=" + bus +
                ", busStation=" + busStation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Driver driver = (Driver) o;
        return noDriver == driver.noDriver && idCard == driver.idCard && Objects.equals(licenceIssuance, driver.licenceIssuance) && Objects.equals(experience, driver.experience) && Objects.equals(bus, driver.bus) && Objects.equals(busStation, driver.busStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), noDriver, idCard, licenceIssuance, experience, bus, busStation);
    }

    public BusStation getBusStation() {
        return busStation;
    }

    public void setBusStation(BusStation busStation) {
        this.busStation = busStation;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public int getNoDriver() {
        return noDriver;
    }

    public void setNoDriver(int noDriver) {
        this.noDriver = noDriver;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public LocalDate getLicenceIssuance() {
        return licenceIssuance;
    }

    public void setLicenceIssuance(LocalDate licenceIssuance) {
        this.licenceIssuance = licenceIssuance;
    }

    public Period getExperience() {
        return experience;
    }

    public void setExperience(Period experience) {
        this.experience = experience;
    }
}
