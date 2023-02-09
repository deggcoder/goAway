package com.gogui.model;

import java.util.Objects;

public class Bus {
    private static int cont = 0;
    private int noBus;
    private String alias;
    private int capacity;
    private double price;
    // add state
    private BusStation busStation;

    public Bus(String alias, int capacity, double price, BusStation busStation) {
        this.noBus = noBus;
        this.alias = alias;
        this.capacity = capacity;
        this.price = price;
        this.busStation = busStation;
        this.noBus = ++cont;

    }

    public Bus() {
    }

    @Override
    public String toString() {
        return "Bus{" +
                "noBus=" + noBus +
                ", alias='" + alias + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                ", busStation=" + busStation +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o;
        return noBus == bus.noBus && capacity == bus.capacity && Double.compare(bus.price, price) == 0 && Objects.equals(alias, bus.alias) && Objects.equals(busStation, bus.busStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noBus, alias, capacity, price, busStation);
    }

    public int getNoBus() {
        return noBus;
    }

    public void setNoBus(int noBus) {
        this.noBus = noBus;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BusStation getBusStation() {
        return busStation;
    }

    public void setBusStation(BusStation busStation) {
        this.busStation = busStation;
    }
}
