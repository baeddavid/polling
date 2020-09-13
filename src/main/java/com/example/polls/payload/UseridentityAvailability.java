package com.example.polls.payload;

public class UseridentityAvailability {
    private Boolean available;

    public UseridentityAvailability(Boolean available) {
        this.available = available;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
