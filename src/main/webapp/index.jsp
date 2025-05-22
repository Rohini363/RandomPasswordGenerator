<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Password Generator</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h2>🔐 Random Password Generator</h2>
        <form action="generate" method="post">
            <label>Password Length:</label>
            <input type="number" name="length" min="4" max="50" required>

            <label><input type="checkbox" name="includeLowercase" checked> Lowercase</label>
            <label><input type="checkbox" name="includeUppercase" checked> Uppercase</label>
            <label><input type="checkbox" name="includeNumbers" checked> Numbers</label>
            <label><input type="checkbox" name="includeSpecial" checked> Special Characters</label>

            <button type="submit">Generate Password</button>
        </form>
    </div>
</body>
</html>
