package iub.oop.courseproject.cse213_finalproject_group41_dosa.nishat;

import java.io.Serializable;
import java.time.LocalDate;

public class Event implements Serializable {
    private String title, description,venue;
    private LocalDate date;
    private int participants;
    private double budget;

    public Event() {
    }

    public Event(String title, String description, String venue, LocalDate date, int participants, double budget) {
        this.title = title;
        this.description = description;
        this.venue = venue;
        this.date = date;
        this.participants = participants;
        this.budget = budget;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Event{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", venue='" + venue + '\'' +
                ", date=" + date +
                ", participants=" + participants +
                ", budget=" + budget +
                '}';
    }
}
