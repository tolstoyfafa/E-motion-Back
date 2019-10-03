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
    private LocalDate starDate;

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

    public Location() {
    }

    public LocalDate getStarDate() {
        return starDate;
    }

    public void setStarDate(LocalDate starDate) {
        this.starDate = starDate;
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
}