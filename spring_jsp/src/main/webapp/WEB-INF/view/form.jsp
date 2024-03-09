<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
<form:form method="POST" action="/submitForm" modelAttribute="user">
    <form:input path="username" />
    <form:errors path="username" cssClass="error" />
    <form:password path="password" />
    <form:errors path="password" cssClass="error" />
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
