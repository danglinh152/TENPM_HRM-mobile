package com.example.tenpm_hrm;

public class Project {
    private String id;
    private String name;
    private String participant;
    private String status;

    public Project(String id, String name, String participant, String status) {
        this.id = id;
        this.name = name;
        this.participant = participant;
        this.status = status;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}