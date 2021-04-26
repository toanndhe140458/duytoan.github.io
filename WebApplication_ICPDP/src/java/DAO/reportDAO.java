/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Event;
import Model.Hr;
import Model.Report;
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
public class reportDAO extends BaseDAO {

    public ArrayList<Report> listReport() {
        ArrayList<Report> reports = new ArrayList<>();
        try {
            String sql = "select * from movement";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Report h = new Report();
                h.setStudentID(rs.getString("studentID"));
                h.setStudentName(rs.getString("studentName"));
                h.setStudentMajor(rs.getString("studentMajor"));
                h.setClubID(rs.getInt("clubID"));
                h.setPoint(rs.getInt("point"));
                reports.add(h);
            }
        } catch (SQLException ex) {
            Logger.getLogger(reportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return reports;
    }

    public void insertReport(Report s) {
        try {
            String sql = "INSERT INTO [dbo].[movement]\n"
                    + "           ([studentID]\n"
                    + "           ,[studentName]\n"
                    + "           ,[studentMajor]\n"
                    + "           ,[clubID]\n"
                    + "           ,[point])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, s.getStudentID());
            stm.setString(2, s.getStudentName());
            stm.setString(3, s.getStudentMajor());
            stm.setInt(4, s.getClubID());
            stm.setInt(5, s.getPoint());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(reportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editEvent(Report s) {
        try {
            String sql = "UPDATE [dbo].[movement]\n"
                    + "   SET [studentName] = ?\n"
                    + "      ,[studentMajor] = ?\n"
                    + "      ,[clubID] = ?\n"
                    + "      ,[point] = ?\n"
                    + " WHERE studentID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, s.getStudentName());
            stm.setString(2, s.getStudentMajor());
            stm.setInt(3, s.getClubID());
            stm.setInt(4, s.getPoint());
            stm.setString(5, s.getStudentID());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(reportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteReport(String id) {
        try {
            String sql = "DELETE FROM [dbo].[movement]\n"
                    + "      WHERE studentID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(reportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
