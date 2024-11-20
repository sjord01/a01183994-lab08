<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/styles.css">
    <title>COMP3601 Lab8 - Results</title>
</head>
<body>
    <jsp:useBean id="user" class="ca.bcit.comp3601.a01183994.lab08.domain.User" scope="request"/>
    <jsp:useBean id="initParams" class="ca.bcit.comp3601.a01183994.lab08.InitParams" scope="application"/>
    <div class="wrapper-body">
        <header class="primary-header flex">
            <h2>COMP 3601</h2>
        </header>
        <main>
            <p>Hello <span class="txt-blue"><jsp:getProperty name="user" property="firstName" /></span></p>
            <p><jsp:getProperty name="initParams" property="greeting" /></p>
            <jsp:include page="dateAndTime.jsp" />
        </main>
    </div>
</body>
</html>