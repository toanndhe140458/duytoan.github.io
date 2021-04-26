/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Club;
import Model.Event;
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
public class eventDAO extends BaseDAO {

    public ArrayList<Event> listEvent() {
        ArrayList<Event> events = new ArrayList<>();
        try {
            String sql = "select * from event";
            PreparedStatement stm = connection.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Event c = new Event();
                c.setEventID(rs.getInt("eventID"));
                c.setEventName(rs.getString("eventName"));
                c.setHostName(rs.getString("hostName"));
                c.setDateEvent(rs.getDate("dateEvent"));
                c.setPlaceEvent(rs.getString("placeEvent"));
                c.setBudgetEvent(rs.getFloat("budgetEvent"));
                c.setContentEvent(rs.getString("contentEvent"));
                c.setClubID(rs.getInt("clubID"));
                c.setTypeEventID(rs.getInt("typeEventID"));
                c.setURL(rs.getString("URL"));
                events.add(c);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClubDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return events;
    }

    public void insertEvent(Event s) {
        try {
            String sql = "INSERT INTO [dbo].[event]\n"
                    + "           ([eventID]\n"
                    + "           ,[eventName]\n"
                    + "           ,[hostName]\n"
                    + "           ,[dateEvent]\n"
                    + "           ,[placeEvent]\n"
                    + "           ,[budgetEvent]\n"
                    + "           ,[contentEvent]\n"
                    + "           ,[clubID]\n"
                    + "           ,[typeEventID])\n"
                    + "     VALUES\n"
                    + "           (?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?\n"
                    + "           ,?)";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, s.getEventID());
            stm.setString(2, s.getEventName());
            stm.setString(3, s.getHostName());
            stm.setDate(4, s.getDateEvent());
            stm.setString(5, s.getPlaceEvent());
            stm.setFloat(6, s.getBudgetEvent());
            stm.setString(7, s.getContentEvent());
            stm.setInt(8, s.getClubID());
            stm.setInt(9, s.getTypeEventID());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(eventDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editEvent(Event s) {
        try {
            String sql = "UPDATE [dbo].[event]\n"
                    + "   SET [eventName] = ?\n"
                    + "      ,[hostName] = ?\n"
                    + "      ,[dateEvent] = ?\n"
                    + "      ,[placeEvent] = ?\n"
                    + "      ,[budgetEvent] = ?\n"
                    + "      ,[contentEvent] = ?\n"
                    + "      ,[clubID] = ?\n"
                    + "      ,[typeEventID] = ?\n"
                    + " WHERE eventID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);

            stm.setString(1, s.getEventName());
            stm.setString(2, s.getHostName());
            stm.setDate(3, s.getDateEvent());
            stm.setString(4, s.getPlaceEvent());
            stm.setFloat(5, s.getBudgetEvent());
            stm.setString(6, s.getContentEvent());
            stm.setInt(7, s.getClubID());
            stm.setInt(8, s.getTypeEventID());
            stm.setInt(9, s.getEventID());
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(eventDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteEvent(int id) {
        try {
            String sql = "DELETE FROM [dbo].[event]\n"
                    + "      WHERE eventID = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setInt(1, id);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(eventDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
