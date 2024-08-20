package repo;

import model.Employee;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Operations {
    public int insert(Employee employee)
    {
        int i = 0;
        try (Connection con = Connect.getCon()) {
            PreparedStatement ps = con.prepareStatement("insert into emp values(?,?,?,?,?)");
            ps.setInt(1, employee.getEMPNO());
            ps.setString(2, employee.getENAME());
            ps.setString(3, employee.getJOB());
            ps.setFloat(4, employee.getSAL());
            ps.setInt(5, employee.getDEPTNO());

            i = ps.executeUpdate();
            if (i > 0) {
                System.out.println("data inserted");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }

    public void insert_procedure(Employee employee) {
        try (Connection con = Connect.getCon()) {

            CallableStatement cs = con.prepareCall("{call insert_employee(:1 ,:2 ,:3 ,:4 ,:5 )}");
            cs.setInt(1, employee.getEMPNO());
            cs.setString(2, employee.getENAME());
            cs.setString(3, employee.getJOB());
            cs.setFloat(4, employee.getSAL());
            cs.setInt(5, employee.getDEPTNO());
            int i = cs.executeUpdate();
            if (i > 0) {
                System.out.println("Data inserted using procedure");
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public ArrayList<Employee> viewAll()
    {
        ArrayList<Employee> elist=new ArrayList<Employee>();
        try {
            Connection con = Connect.getCon();
            PreparedStatement ps = con.prepareStatement("select * from emp");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Employee ee = new Employee();
                ee.setEMPNO(rs.getInt(1));
                ee.setENAME(rs.getString(2));
                ee.setJOB(rs.getString(3));
                ee.setSAL(rs.getFloat(4));
                ee.setDEPTNO(rs.getInt(5));

                elist.add(ee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return elist;
    }

}