package com.javacodegeeks.jsp_servlet.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Objects;

@WebServlet("/greetme")
public final class Greeter extends HttpServlet {

    public static final String GREETING_REQUEST_PARAMETER_KEY = "greeting";
    private static final String NAME_REQUEST_PARAMETER_KEY = "name";

    protected void doGet(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {

        handleRequestForGreeting(req, resp);
    }

    protected void doPost(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {

        handleRequestForGreeting(req, resp);
    }

    private void handleRequestForGreeting(final HttpServletRequest req, final HttpServletResponse resp)
            throws ServletException, IOException {
        assert !Objects.isNull(req) : "Request required for greeting request";
        assert !Objects.isNull(resp) : "Response required for greeting request";

        final String name = extractNameFromRequest(req);
        final String greeting = greet(name);

        req.setAttribute(GREETING_REQUEST_PARAMETER_KEY, greeting);
        req.getRequestDispatcher("/showGreeting.jsp").forward(req, resp);
    }

    private String extractNameFromRequest(final HttpServletRequest req) {
        assert !Objects.isNull(req) : "Request required for name extraction";

        return req.getParameter(NAME_REQUEST_PARAMETER_KEY);
    }

    private String greet(final String name) {
        assert !Objects.isNull(name) && !name.isEmpty() : "Name required for greeting";

        return String.format("Hello %s, the date on the server is %s", name, DateFormatterUtility.format(LocalDate.now()));
    }
}
