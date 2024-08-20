package servlet;
import model.Employee;
import repo.Operations;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class InsertServlet extends GenericServlet
{
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        Employee ee =new Employee();
        ee.setEMPNO(Integer.parseInt(req.getParameter("empno")));
        ee.setENAME(req.getParameter("name"));
        ee.setJOB(req.getParameter("job"));
        ee.setSAL(Float.parseFloat(req.getParameter("sal")));
        ee.setDEPTNO(Integer.parseInt(req.getParameter("dept")));
        int insert = new Operations().insert(ee);
        if(insert>0)
        {
            System.out.println("emp details inserted");
            RequestDispatcher rd = req.getRequestDispatcher("added_emp.jsp");
            rd.forward(req, res);
        }


    }
}
