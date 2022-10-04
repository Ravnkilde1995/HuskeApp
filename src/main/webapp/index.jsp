<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Huske Appen</title>
</head>
<body>
<h1><%= "Velkommen til din online huske app" %>
</h1>
<br/>

<h1>Login for eksiterende bruger: </h1>




<form action="LoginServlet" method="get">
    <label for="navn">Navn:</label><br>
    <input type="text" id="navn" name="navn" value=""><br>
    <label for="kode">Indtast kode:</label><br>
    <input type="text" id="kode" name="kode" value=""><br><br>
    <input type="submit" value="Submit">
</form>

<h1>eller opret dig som bruger</h1>

${requestScope.besked}

<form action="LoginServlet" method="post">
    <label for="opretNavn">Indtast navn:</label><br>
    <input type="text" id="opretNavn" name="opretNavn" value=""><br>
    <label for="kode1">Angiv kode:</label><br>
    <input type="text" id="kode1" name="kode1" value=""><br>
    <label for="kode2">Angiv kode igen:</label><br>
    <input type="text" id="kode2" name="kode2" value=""><br><br>
    <input type="submit" value="Opret">
</form>

</body>
</html>