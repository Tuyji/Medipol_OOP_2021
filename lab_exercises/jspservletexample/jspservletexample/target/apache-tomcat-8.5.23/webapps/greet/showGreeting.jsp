<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head><title>Greeter</title></head>
<body>
<h1>${requestScope.greeting == null ? "I have nothing to say" : requestScope.greeting}</h1>
</body>
</html>