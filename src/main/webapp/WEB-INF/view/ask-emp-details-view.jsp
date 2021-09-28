<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>

<h2>Enter your details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surName"/>
    <form:errors path="surName"/>
    <br>
    <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resources" label="HR"/>--%>
<%--    <form:option value="Sales" label="SALES"/>--%>
    </form:select>
    <br>
    <br>
    Choose your car:
    <form:radiobuttons path="carBrand"  items="${employee.carBrands}"/>
<%--    BMW<form:radiobutton path="carBrand" value="BMW"/>--%>
<%--    AUDI<form:radiobutton path="carBrand" value="AUDI"/>--%>
<%--    FERRARI<form:radiobutton path="carBrand" value="FERRARI"/>--%>
    <br>
    <br>
    Foreign language(s):
    <form:checkboxes path="language" items="${employee.languages}"/>
    <br>
    <br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br>
    <br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br>
    <br>
    <input type="submit" value="OK">

</form:form>
</body>

</html>