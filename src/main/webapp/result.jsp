<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Generated Password</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h2>✅ Your Secure Password</h2>
        <div class="password-box"><%= request.getAttribute("password") %></div>
        <a href="index.jsp" class="back-button">Generate Another</a>
    </div>
</body>
</html>
