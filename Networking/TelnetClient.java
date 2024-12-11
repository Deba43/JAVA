package Networking;

import java.io.*;
import java.net.*;

public class TelnetClient {
    public static void main(String[] args) {
        String server = "towel.blinkenlights.nl"; // Telnet server address
        int port = 23; // Default Telnet port
        String message = "Hello, Telnet Server!"; // Sample message to send

        try (Socket socket = new Socket(server, port);
                InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
                BufferedReader reader = new BufferedReader(inputStreamReader);
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(socket.getOutputStream());
                BufferedWriter writer = new BufferedWriter(outputStreamWriter)) {

            // Send a command to the Telnet server
            writer.write(message);
            writer.newLine();
            writer.flush();

            // Read the response from the server
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error connecting to the Telnet server: " + e.getMessage());
        }
    }
}
