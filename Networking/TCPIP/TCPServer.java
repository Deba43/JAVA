package Networking.TCPIP;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        int port = 8000; // Port number
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                // Create input and output streams
                InputStream input = socket.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));

                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);

                // Read and respond to client
                String text;
                while ((text = reader.readLine()) != null) {
                    System.out.println("Received: " + text);
                    writer.println("Server: " + text);
                    if (text.equalsIgnoreCase("bye")) {
                        System.out.println("Connection closed by client");
                        break;
                    }
                }

                socket.close();
            }
        } catch (IOException ex) {
            System.out.println("Server error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
