# Web Lab - Servlet
This lab demonstrate how to develop basic web application using Servlet. The project use Jetty as an embeded web server where the servlet will be built and deployed on. This web application simply have an HTML form that submit a parameter to servlet to process.

 This project contains 3 things
 1. The servlet code in `src/main/java`
 2. The html pages in `src/main/webapp`
 3. The integration test script in `src/test/java`

## Exercise A - Hello servlet
This webapp contains `hello.html` that have a forms to obtain user input for name. The form is submitted to `/hello`, which is mapped to `HelloServlet` to print out `Hello [name]`. Complete this program by filling out missing code in `HelloServlet`

1. Complete `doGet()` method by following `TODO`.
2. run this project using Maven with Jetty by calling goal `jetty:run`. By doing this, the web server should be up and running 
3. go to URL `http://localhost:8080/hello.html`, and try to test this program
4. When the server is up and running, run `TestHelloIT` to test whether the `HelloServlet` works properly.

## Exercise B - Calculator servlet
This webapp contains a forms in `calculator.html` that get two numbers and call `/sum`, which is mapped to `CalculatorServlet` to sum two numbers and give the result back. Complete this program by filling out missing code.

1. Add a form in `calculator.html` with two textfields for number1 and number2. The form should be submitted to `/sum`
2. Complete the source code in `doGet()` method of CalculatorServlet.java
3. Complete the source code in `doPost()` method of CalculatorServlet.java **you may look at the HelloServlet as a sample**
4. go to URL `http://localhost:8080/calculator.html`, and try to test this program
5. When the server is up and running, run `TestCalculatorIT` to test whether the `CalculatorServlet` works properly.

## Challenge 
Think about how to make a modification for the following:
- What's happen if we change the form's method from `POST` to `GET` 
- How can we change the web server to run on port 9090, instead of 8080
- How can we modify the format of result, as it is currently print out with HTML's heading text `H2`.

```
Your thought here
```


## Finish up 
run maven goal `verify` on the project. This should calls `TestHelloIT` and `TestCalculatorIT` to test both apps. The maven should run successfully with `BUID SUCCESS`

**Please don't forget to push the source code to GitHub**
