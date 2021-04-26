/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Nhat Anh PC
 */
public class Event {

    public int eventID;
    public String eventName;
    public String hostName;
    public Date dateEvent;
    public String placeEvent;
    public float budgetEvent;
    public String contentEvent;
    public int clubID;
    public int typeEventID;
    public String URL;

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public int getEventID() {
        return eventID;
    }

    public void setEventID(int eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Date getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(Date dateEvent) {
        this.dateEvent = dateEvent;
    }

    public String getPlaceEvent() {
        return placeEvent;
    }

    public void setPlaceEvent(String placeEvent) {
        this.placeEvent = placeEvent;
    }

    public float getBudgetEvent() {
        return budgetEvent;
    }

    public void setBudgetEvent(float budgetEvent) {
        this.budgetEvent = budgetEvent;
    }

    public String getContentEvent() {
        return contentEvent;
    }

    public void setContentEvent(String contentEvent) {
        this.contentEvent = contentEvent;
    }

    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public int getTypeEventID() {
        return typeEventID;
    }

    public void setTypeEventID(int typeEventID) {
        this.typeEventID = typeEventID;
    }

}
