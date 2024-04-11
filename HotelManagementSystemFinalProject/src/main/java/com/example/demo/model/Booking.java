package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Room room;

    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany(mappedBy = "booking")
    private List<ProvidedService> providedServices;

    // constructors
    public Booking() {
    }

    public Booking(Customer customer, Room room, LocalDate startDate, LocalDate endDate) {
        this.customer = customer;
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public List<ProvidedService> getProvidedServices() {
        return providedServices;
    }

    public void setProvidedServices(List<ProvidedService> providedServices) {
        this.providedServices = providedServices;
    }

    // to string
	@Override
	public String toString() {
		return "Booking [id=" + id + ", customer=" + customer + ", room=" + room + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", providedServices=" + providedServices + "]";
	}
    
    
}