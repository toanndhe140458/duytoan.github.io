/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Club;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nhat Anh PC
 */
public class BaseDAO {

    protected Connection connection;

    public BaseDAO() {
       try {
             
   
            String url = "jdbc:sqlserver://DESKTOP-5G0K01R:1433;databaseName=ICPDP";
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection= DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public ArrayList<Club> getRect()
    {
        ArrayList<Club> clubs = new ArrayList<>();
        try {
            String sql = "select clubID,clubName,presidentName"
                    + ",numberMember,clubGoal,logoURL,dob from CLUB";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while(rs.next())
            {
                 Club c = new Club();
                c.setClubID(rs.getInt("clubID"));
                c.setClubName(rs.getString("clubName"));
                c.setPresidentName(rs.getString("presidentName"));
                c.setNumberMember(rs.getInt("numberMember"));
                c.setClubGoal(rs.getString("clubGoal"));
                c.setLogoUrl(rs.getString("logoURL"));
                c.setDobClub(rs.getDate("dob"));
                clubs.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClubDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clubs;
    }
}
