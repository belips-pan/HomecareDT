/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homecaredt;

/**
 *
 * @author <Panagiotis Beligiannis at HOU>
 */
import java.time.LocalDateTime;

public class Communication {
    private Person fromPerson;
    private Person toPerson;
    private String message;
    private String timestamp;

    public Communication(Person fromPerson, Person toPerson, String message, String timestamp) {
        this.fromPerson = fromPerson;
        this.toPerson = toPerson;
        this.message = message;
        this.timestamp = LocalDateTime.now().toString();
    }

    public Person getFromPerson() {
        return fromPerson;
    }

    public Person getToPerson() {
        return toPerson;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setFromPerson(Person fromPerson) {
        this.fromPerson = fromPerson;
    }

    public void setToPerson(Person toPerson) {
        this.toPerson = toPerson;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = LocalDateTime.now().toString();
    }

    @Override
    public String toString() {
        return "Communication{" + "fromPerson= " + fromPerson.getName() + ", toPerson= " 
                + toPerson.getName() + ", message= " + message + ", timestamp= " + timestamp + '}';
    } 
}
