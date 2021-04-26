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
public class Club {
    private int clubID;
    private String clubName;
    private String presidentName;
    private int numberMember;
    private String clubGoal;
    private String logoUrl;
    private Date dobClub;

    public int getClubID() {
        return clubID;
    }

    public void setClubID(int clubID) {
        this.clubID = clubID;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getPresidentName() {
        return presidentName;
    }

    public void setPresidentName(String presidentName) {
        this.presidentName = presidentName;
    }

    public int getNumberMember() {
        return numberMember;
    }

    public void setNumberMember(int numberMember) {
        this.numberMember = numberMember;
    }

    public String getClubGoal() {
        return clubGoal;
    }

    public void setClubGoal(String clubGoal) {
        this.clubGoal = clubGoal;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Date getDobClub() {
        return dobClub;
    }

    public void setDobClub(Date dobClub) {
        this.dobClub = dobClub;
    }
    
}
