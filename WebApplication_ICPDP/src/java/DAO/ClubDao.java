/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Club;
import Model.Hr;
import java.sql.Date;
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
public class ClubDao extends BaseDAO {

    public ArrayList<Club> getClub() {
        ArrayList<Club> clubs = new ArrayList<>();
        try {
            String sql = "select clubID,clubName,presidentName"
                    + ",numberMember,clubGoal,logoURL,dob from CLUB";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

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

  



    public void insertClub(Club s) {
        try {
            String sql = "INSERT INTO [dbo].[CLUB]\n"
                    + "           ([clubID]\n"
                    + "           ,[clubName]\n"
                    + "           ,[presidentName]\n"
                    + "           ,[numberMember]\n"
                    + "           ,[clubGoal]\n"
                    + "           ,[logoURL]\n"
                    + "           ,[dob])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, s.getClubID());
            stm.setString(2, s.getClubName());
            stm.setString(3, s.getPresidentName());
            stm.setInt(4, s.getNumberMember());
            stm.setString(5, s.getClubGoal());
            stm.setString(6, s.getLogoUrl());
            stm.setDate(7, s.getDobClub());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClubDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editClub(Club s) {
        try {
            String sql = "UPDATE [dbo].[CLUB]\n"
                    + "   SET [clubName] = ?\n"
                    + "      ,[presidentName] = ?\n"
                    + "      ,[numberMember] = ?\n"
                    + "      ,[clubGoal] = ?\n"
                    + "      ,[logoURL] = ?\n"
                    + "      ,[dob] = ?\n"
                    + " WHERE clubID =  ?";
            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, s.getClubName());
            stm.setString(2, s.getPresidentName());
            stm.setInt(3, s.getNumberMember());
            stm.setString(4, s.getClubGoal());
            stm.setString(5, s.getLogoUrl());
            stm.setDate(6, s.getDobClub());
            stm.setInt(7, s.getClubID());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClubDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteClub(int id) {
        try {
            String sql = "DELETE FROM [dbo].[CLUB]\n"
                    + "      WHERE clubID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClubDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
