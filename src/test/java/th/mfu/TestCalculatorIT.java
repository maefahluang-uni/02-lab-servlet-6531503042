package th.mfu;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestCalculatorIT {

    private static Client client;
    private static Logger _logger = LoggerFactory.getLogger(TestHelloIT.class);
    private static String WEB_URI = "http://localhost:8080/sum";

    @BeforeClass
    public static void createClient() {
        // Use ClientBuilder to create a new client that can be used to create
        // connections to the Web service.
        client = ClientBuilder.newClient();
    }

    @AfterClass
    public static void closeConnection() {
        client.close();
    }

    @Test
    public void testCaclulate1() {

        // Make a HTTP GET request to retrieve the last created Parolee.
        try (Response response = client.target(WEB_URI+"?num1=2&num2=3").request().get()) {

            // Check that the HTTP response code is 200 OK.
            int responseCode = response.getStatus();
            assertEquals(200, responseCode);

            String jsonResponse = response.readEntity(String.class);
            assertEquals("<h2>Result is 5</h2>", jsonResponse);
            _logger.info("IT1 test passed");
        }
    }

    @Test
    public void testCaclulate2() {

        try (Response response = client.target(WEB_URI+"?num1=5&num2=5").request().get()) {

            // Check that the HTTP response code is 200 OK.
            int responseCode = response.getStatus();
            assertEquals(200, responseCode);

            String jsonResponse = response.readEntity(String.class);
            assertEquals("<h2>Result is 10</h2>", jsonResponse);
            _logger.info("IT2 test passed");
        }
    }

    @Test
    public void testCaclulate3() {

        try (Response response = client.target(WEB_URI+"?num1=4&num2=3").request().get()) {

            // Check that the HTTP response code is 200 OK.
            int responseCode = response.getStatus();
            assertEquals(200, responseCode);

            String jsonResponse = response.readEntity(String.class);
            assertEquals("<h2>Result is 7</h2>", jsonResponse);
            _logger.info("IT3 test passed");
        }
    }

}