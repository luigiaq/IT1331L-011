package com.uap.it1311l.registrationapi.model;

public class Attendee {
    private String attendeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String course;
    private Integer age;

    // Constructors, getters, and setters can be generated using your IDE or added manually
    public Attendee() {
        // Default constructor
    }

    // Generate getters and setters for all properties
    public String getAttendeeId() {
        return attendeeId;
    }

    public void setAttendeeId(String attendeeId) {
        this.attendeeId = attendeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
