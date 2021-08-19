<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<html>
<head>
    <title>My page</title>
    <style>
        h1 {
            text-align:center;
        }

    </style>
</head>
<body>
<h1>Loan Records</h1>

<div class="container">
    <p>The following are the loan records</p>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Client number</th>
            <th>Client Name</th>
            <th>Loan Amount</th>
            <th>Number of years</th>
            <th>Loan Type</th>
        </tr>
        </thead>
        <tbody>

        <c:forEach items="${todos}" var="todo">



            <tr>
                <td>${todo.clientno}</td>
                <td>${todo.clientname}</td>
                <td>${todo.loanamount}</td>
                <td>${todo.years}</td>
                <td>${todo.loantype}</td>

                <td>    <a type="button" class="btn btn-primary"
                           href="update-todo?id=${todo.clientno}" >Edit</a> </td>



                <td>    <a type="button" class="btn btn-primary"
                           href="update-todo?id=${todo.clientno}" >Delete</a> </td>



            </tr>


        </c:forEach>
        </tbody>
    </table>
</div>
<form>
    <div class="form-group">
        <label for="cnum">Client Number:</label>
        <input type="text" class="form-control" id="cnum">
    </div>
    <div class="form-group">
        <label for="cname">Client Name:</label>
        <input type="text" class="form-control" id="cname">
    </div>
    <div class="form-group">
        <label for="camt">Loan Amount:</label>
        <input type="text" class="form-control" id="camt">
    </div>
    <div class="form-group">
        <label for="nyears">Number of years:</label>
        <input type="text" class="form-control" id="nyears">
    </div>
    <div class="form-group">
        <label for="ltype">Loan Type:</label>
        <select type="text" class="form-control" id="ltype">
            <option value="personal">Personal</option>
            <option value="business">Business</option>
        </select>
    </div>
</form>
<a class="btn btn-success" href="add-todo">Add</a>


</body>
</html>
