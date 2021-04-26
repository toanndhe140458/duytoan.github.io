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
public class Hr {
    public int HrID;
    public String hrName;
    public String hrDetail;
    public Date hrDob;
    public String hrJob;

    public int getHrID() {
        return HrID;
    }

    public void setHrID(int HrID) {
        this.HrID = HrID;
    }

    public String getHrName() {
        return hrName;
    }

    public void setHrName(String hrName) {
        this.hrName = hrName;
    }

    public String getHrDetail() {
        return hrDetail;
    }

    public void setHrDetail(String hrDetail) {
        this.hrDetail = hrDetail;
    }

    public Date getHrDob() {
        return hrDob;
    }

    public void setHrDob(Date hrDob) {
        this.hrDob = hrDob;
    }

    public String getHrJob() {
        return hrJob;
    }

    public void setHrJob(String hrJob) {
        this.hrJob = hrJob;
    }
    
}
