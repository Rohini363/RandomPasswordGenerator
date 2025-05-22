package com.password;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.security.SecureRandom;

public class PasswordGeneratorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL = "!@#$%^&*()-_=+[]{};:,.<>?";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String lengthStr = request.getParameter("length");
        if (lengthStr == null) {
            response.sendRedirect("index.jsp");
            return;
        }

        int length = Integer.parseInt(lengthStr);
        boolean includeLowercase = request.getParameter("includeLowercase") != null;
        boolean includeUppercase = request.getParameter("includeUppercase") != null;
        boolean includeNumbers = request.getParameter("includeNumbers") != null;
        boolean includeSpecial = request.getParameter("includeSpecial") != null;

        StringBuilder charPool = new StringBuilder();
        if (includeLowercase) charPool.append(LOWERCASE);
        if (includeUppercase) charPool.append(UPPERCASE);
        if (includeNumbers) charPool.append(NUMBERS);
        if (includeSpecial) charPool.append(SPECIAL);

        if (charPool.length() == 0) {
            request.setAttribute("password", "Error: No character sets selected.");
        } else {
            String password = generatePassword(length, charPool.toString());
            request.setAttribute("password", password);
        }

        request.getRequestDispatcher("result.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Delegate POST to GET handler
        doGet(request, response);
    }

    private String generatePassword(int length, String charPool) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(charPool.length());
            password.append(charPool.charAt(index));
        }

        return password.toString();
    }
}
