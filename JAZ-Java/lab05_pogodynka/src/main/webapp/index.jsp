<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Witaj na stronie - Pogodynka!</h1>
Wybierz z formularza miasto, w którym interesuje Cie pogoda:

<form action="/pogoda" method="post">
    <select name="town">
        <option>Warszawa</option>
        <option>Gdańsk</option>
        <option>Kraków</option>
        <option>Wrocław</option>
        <option>Poznań</option>
        <option>Łódź</option>
        <option>Katowice</option>
    </select>
    <input type="submit" value="Sprawdź pogodę">
</form>
</body>
</html>
