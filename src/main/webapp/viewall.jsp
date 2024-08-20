<%@ page language="java"
    contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*,model.Employee"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
  border: 2px solid;
  color: black;
  margin: 2px;
}
tr, th, td {
  border: 2px solid;
  color: black;
  margin: 2px;
}
</style>
</head>
<body>
<table>
<tr>
<th>Empno</th>
<th>EName</th>
<th>Job</th>
<th>Salary</th>
<th>Dept no</th>
</tr>
<%
ArrayList<Employee> al = (ArrayList<Employee>) request.getAttribute("list");
if (al == null || al.size() == 0) {
    out.println("Table is empty<br>");
} else {
    Iterator<Employee> it = al.iterator();
    while (it.hasNext()) {
        Employee ee = it.next();
%>
        <tr>
        <td><%= ee.getEMPNO() %></td>
        <td><%= ee.getENAME() %></td>
        <td><%= ee.getJOB() %></td>
        <td><%= ee.getSAL() %></td>
        <td><%= ee.getDEPTNO() %></td>
        </tr>
<%
    }
}
%>
</table>

<%@ include file="index.jsp" %>
</body>
</html>
