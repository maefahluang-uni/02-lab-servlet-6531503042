package th.mfu.web.calulate;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//TODO: add @WebServlet annotation with urlPatterns = "/sum"
public class CalculatorServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        //TODO: retreive the parameter num1 and num2 from the request 
     
        //TODO: convert the parameter values from String to int
       
        //TODO: print out result as <h2>Result is 10</h2>
       
    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        //TODO: this method should work the same way as doGet()
       
    }
}
