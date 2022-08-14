<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Book</title>
</head>
<body>

<h1>List of all books</h1>

<a href="<%=request.getContextPath()%>/book/new">Add</a>

<table>

    <tr>
        <td>id</td>
        <td>price</td>
        <td>author</td>
        <td>publisher id</td>
        <td>book name</td>
        <td>number of pages</td>
        <td>publication year</td>
    </tr>

    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>
                <a href="<%=request.getContextPath()%>/book/${book.id}">${book.name}</a>
            </td>
        </tr>
    </c:forEach>

</table>

</body>
</html>