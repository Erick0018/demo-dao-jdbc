package application;

import db.DB;
import db.DbException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBTest {
    public static void main(String[] args) {

        Connection conn = null;
        Statement st = null;
        try{
            conn = DB.getConnection();

            conn.setAutoCommit(false);

            st = conn.createStatement();

            int rowAffected = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

//            int x = 1;
//            if (x < 2) {
//                throw new SQLException("Fake error");
//            }

            int rowAffected2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");

            conn.commit();

            System.out.println("Rows 1 = " + rowAffected);
            System.out.println("Rows 1 = " + rowAffected2);
        }
        catch (SQLException e) {
            try {
                conn.rollback();
                throw  new DbException("Transation rolled back: " + e.getMessage());
            } catch (SQLException ex) {
                throw  new DbException("Error in try rolled back: " + e.getMessage());
            }
        }
    }
}
