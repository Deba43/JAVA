import java.net.*;
import java.io.*;

public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");

            // Display URL components
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort()); // -1 indicates default port
            System.out.println("Path: " + url.getPath());

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Connect to the URL
            connection.connect();

            // Display header information
            System.out.println("Content-Type: " + connection.getHeaderField("Content-Type"));

            // Read data from the URL
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            System.out.println("Response Data:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
