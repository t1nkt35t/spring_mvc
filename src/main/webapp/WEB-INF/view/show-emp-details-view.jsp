<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>

<body>

<h2>You have been registered! Welcome, ${employee.name} !</h2>
<br>
<br>
<br>
Surname: ${employee.surName}
<br>
Salary: ${employee.salary}
<br>
Department: ${employee.department}
<br>
Your car brand: ${employee.carBrand}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.language}">
        <li>${lang}</li>
    </c:forEach>
</ul>
Phone number: ${employee.phoneNumber}
<br>
Email: ${employee.email}

</body>

</html>