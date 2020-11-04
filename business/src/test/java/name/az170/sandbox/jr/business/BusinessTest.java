package name.az170.sandbox.jr.business;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BusinessTest {
    public static final String url1 = "http://localhost:8081?route=%s";
    public static final String url2 = "http://localhost:8082?route=%s";
    public static final String url3 = "http://localhost:8083?route=%s";

    @Test
    public void testA() {
        String response1 = httpGet(url1, "A");
        assertEquals("Account route A.", response1);
        String response2 = httpGet(url2, "A");
        assertEquals("Order route A.", response2);
        String response3 = httpGet(url3, "A");
        assertEquals("Storage route A.", response3);
    }

    @Test
    public void testB() {
        String response1 = httpGet(url1, "B");
        assertEquals("Account route B.", response1);
        String response2 = httpGet(url2, "B");
        assertEquals("Order route B.", response2);
        String response3 = httpGet(url3, "B");
        assertEquals("Storage route B.", response3);
    }

    private String httpGet(String url, String param) {
        String responseString = null;
        try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
            HttpGet httpGet = new HttpGet(String.format(url, param));
            CloseableHttpResponse response = httpclient.execute(httpGet);
            assertEquals(HttpStatus.SC_OK, response.getStatusLine().getStatusCode());
            responseString = IOUtils.toString(response.getEntity().getContent());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseString;
    }
}
