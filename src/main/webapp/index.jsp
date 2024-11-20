<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css">
    <title>COMP3601 Lab8</title>
</head>
<body>
    <jsp:useBean id="initParams" class="ca.bcit.comp3601.a01183994.lab08.InitParams" scope="application">
        <jsp:setProperty name="initParams" property="instruction" value='<%= application.getInitParameter("instruction") %>'/>
        <jsp:setProperty name="initParams" property="greeting" value='<%= application.getInitParameter("greeting") %>'/>
    </jsp:useBean>
    <div class="wrapper-body">
        <header class="primary-header flex">
            <h2>COMP 3601</h2>
        </header>
        <main>
            <section>
                <h1><jsp:getProperty name="initParams" property="instruction" /></h1>
                <form class="flex" id="form-greeting" action="${pageContext.request.contextPath}/results" method="POST">
                    <input id="input-name" type="text" name="firstName" required>
                    <input id="btn-form" type="submit" value="Submit">
                </form>
            </section>
        </main>
    </div>
</body>
</html>