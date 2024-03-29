package com.motus.emotion.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.time.LocalDate;

@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Start date must be set ")
    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    @NotNull(message = "End date must be set ")
    private LocalDate endDate;

    @NotNull(message = "Start time must be set ")
    @Column(nullable = false)
    private Time startTime;

    @Column(nullable = false)
    @NotNull(message = "End time must be set ")
    private Time endTime;

    @OneToOne(targetEntity = User.class)
    private User user;

    @OneToOne(targetEntity = Vehicle.class)
    private Vehicle vehicle;

    @Enumerated(value = EnumType.STRING)
    @NotNull(message = "status of location must be set")
    @Column(nullable = false)
    private LocationStatus status;

    public Location() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
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

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocationStatus getStatus() {
        return status;
    }

    public void setStatus(LocationStatus status) {
        this.status = status;
    }
}
