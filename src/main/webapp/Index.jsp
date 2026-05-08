<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>

<style>

    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }

    body{
        height: 100vh;
        display: flex;
        justify-content: center;
        align-items: center;
        background: linear-gradient(to right, #4facfe, #00f2fe);
        font-family: Arial, sans-serif;
    }

    .container{
        width: 400px;
        background-color: white;
        padding: 35px;
        border-radius: 15px;
        box-shadow: 0px 5px 20px rgba(0,0,0,0.3);
    }

    h2{
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    label{
        font-weight: bold;
        color: #444;
    }

    input{
        width: 100%;
        padding: 12px;
        margin-top: 8px;
        margin-bottom: 18px;
        border: 1px solid #ccc;
        border-radius: 8px;
        font-size: 15px;
        transition: 0.3s;
    }

    input:focus{
        border-color: #4facfe;
        outline: none;
        box-shadow: 0px 0px 8px rgba(79,172,254,0.5);
    }

    button{
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 8px;
        background-color: #4facfe;
        color: white;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
    }

    button:hover{
        background-color: #2196f3;
    }

    .links{
        margin-top: 20px;
        text-align: center;
    }

    .links a{
        text-decoration: none;
        color: #2196f3;
        font-weight: bold;
        margin: 0 10px;
        transition: 0.3s;
    }

    .links a:hover{
        color: #0d47a1;
        text-decoration: underline;
    }

</style>

</head>
<body>

<div class="container">

    <h2>Employee Details Form</h2>

    <form action="add" method="post">

        <label>Employee ID</label>
        <input type="number" name="id" required>

        <label>Name</label>
        <input type="text" name="name" required>

        <label>Age</label>
        <input type="number" name="age" required>

        <label>Salary</label>
        <input type="number" step="0.01" name="salary" required>

        <button type="submit">Submit</button>

    </form>

    <div class="links">
        <a href="updateEmployee.jsp">Update Employee</a>
        <a href="deleteEmployee.jsp">Delete Employee</a>
    </div>

</div>

</body>
</html>