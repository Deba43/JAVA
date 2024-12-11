package Networking.TCPIP;

import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String hostname = "localhost"; // Change to server's IP address if on a network
        int port = 8000; // Port number

        try (Socket socket = new Socket(hostname, port)) {
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));

            // User input
            BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
            String text;

            System.out.println("Connected to the server. Type messages (type 'bye' to exit):");

            while (true) {
                text = consoleReader.readLine();
                writer.println(text);

                String response = reader.readLine();
                System.out.println(response);

                if (text.equalsIgnoreCase("bye")) {
                    break;
                }
            }
        } catch (UnknownHostException ex) {
            System.out.println("Server not found: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("I/O error: " + ex.getMessage());
        }
    }
}
