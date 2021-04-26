/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Hr;
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
public class HrDAO extends BaseDAO {

    public ArrayList<Hr> listHr() {
        ArrayList<Hr> hrs = new ArrayList<>();
        try {
            String sql = "select * from HR";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Hr h = new Hr();
                h.setHrID(rs.getInt("hrID"));
                h.setHrName(rs.getString("hrName"));
                h.setHrDetail(rs.getString("hrDetail"));
                h.setHrDob(rs.getDate("hrDOB"));
                h.setHrJob(rs.getString("hrJob"));
                hrs.add(h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(HrDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hrs;
    }

    public void insertHr(Hr s) {
        try {
            String sql = "INSERT INTO [dbo].[HR]\n"
                    + "           ([hrID]\n"
                    + "           ,[hrName]\n"
                    + "           ,[hrDetail]\n"
                    + "           ,[hrDOB]\n"
                    + "           ,[hrJob])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, s.getHrID());
            stm.setString(2, s.getHrName());
            stm.setString(3, s.getHrDetail());
            stm.setDate(4, s.getHrDob());
            stm.setString(5, s.getHrJob());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClubDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editHr(Hr s) {
        try {
            String sql = "UPDATE [dbo].[HR]\n"
                    + "   SET [hrName] = ?\n"
                    + "      ,[hrDetail] = ?\n"
                    + "      ,[hrDOB] = ? \n"
                    + "      ,[hrJob] = ?\n"
                    + " WHERE hrID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            
            stm.setString(1, s.getHrName());
            stm.setString(2, s.getHrDetail());
            stm.setDate(3, s.getHrDob());
            stm.setString(4, s.getHrJob());
            stm.setInt(5, s.getHrID());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HrDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteHr(int id) {
        try {
            String sql = "DELETE FROM [dbo].[HR]\n"
                    + "      WHERE hrID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HrDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
