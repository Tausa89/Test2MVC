<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>

<head>
    <title>Student Registration Form</title>
</head>

<body>

<form:form action="processForm" modelAttribute="student">

    First name: <form:input path="firstName"/>
    <br><br>
    Last name : <form:input path="lastName"/>
    <br><br>
    Country:
    <form:select path="country">
        <form:options items="${student.countryOption}"/>

    </form:select>

    <br><br>

    Favorite Language:
    Java <form:radiobutton path="favoriteLanguage" value="Java"/>
    C# <form:radiobutton path="favoriteLanguage" value="C#"/>
    Kotlin <form:radiobutton path="favoriteLanguage" value="Kotlin"/>
    JS <form:radiobutton path="favoriteLanguage" value="JS"/>
    <br><br>
    Operating Systems:
    Linux <form:checkbox path="operatingSystems" value="Linux"/>
    Linux <form:checkbox path="operatingSystems" value="Windows"/>
    Linux <form:checkbox path="operatingSystems" value="Mac"/>
    <br><br>
    <input type="submit" value="Submit">


</form:form>

</body>

</html>