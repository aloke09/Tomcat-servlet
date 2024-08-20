package servlet;

import model.Employee;
import repo.Operations;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/viewallemp")
public class ViewServlet extends GenericServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
    {
        ArrayList<Employee> elist=new Operations().viewAll();
        req.setAttribute("list", elist);
        RequestDispatcher rd = req.getRequestDispatcher("viewall.jsp");
        rd.forward(req, res);
    }
}
