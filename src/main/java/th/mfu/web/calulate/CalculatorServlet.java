package th.mfu.web.calulate;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/sum")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the parameter num1 and num2 from the request
        String num1Param = request.getParameter("num1");
        String num2Param = request.getParameter("num2");

        // Convert the parameter values from String to int
        int num1 = Integer.parseInt(num1Param);
        int num2 = Integer.parseInt(num2Param);

        // Calculate the sum
        int sum = num1 + num2;

        // Set the content type of the response
        response.setContentType("text/html");

        // Get the PrintWriter
        PrintWriter out = response.getWriter();

        // Print out the result as <h2>Result is 10</h2>

        out.print("<h2>Result is " + sum + "</h2>");
       
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        // Call doGet() since the logic is the same for both methods
        doGet(request, response);
    }
}