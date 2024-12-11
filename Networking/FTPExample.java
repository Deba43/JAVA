package Networking;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FTPExample {
    public static void main(String[] args) {
        // FTP server details
        String server = "ftp.example.com"; // Replace with your FTP server
        int port = 21; // FTP port (default is 21)
        String username = "your-username"; // Replace with your FTP username
        String password = "your-password"; // Replace with your FTP password

        FTPClient ftpClient = new FTPClient();

        try {
            // Connect to the FTP server
            ftpClient.connect(server, port);
            ftpClient.login(username, password);

            // Set FTP to passive mode (optional, helps with firewalls)
            ftpClient.enterLocalPassiveMode();

            // Check if the connection is successful
            if (ftpClient.isConnected()) {
                System.out.println("Connected to the FTP server.");

                // Upload a file
                String localFile = "path/to/local/file.txt"; // Local file to upload
                String remoteFile = "remote/file.txt"; // Remote file path on the FTP server
                uploadFile(ftpClient, localFile, remoteFile);

                // Download a file
                localFile = "path/to/local/downloaded-file.txt"; // Local path for downloading
                remoteFile = "remote/file.txt"; // Remote file path to download
                downloadFile(ftpClient, remoteFile, localFile);

                // Logout and disconnect
                ftpClient.logout();
            } else {
                System.out.println("Failed to connect to the FTP server.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Always disconnect from the server
            try {
                if (ftpClient.isConnected()) {
                    ftpClient.disconnect();
                    System.out.println("Disconnected from the FTP server.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to upload a file to the FTP server
    public static void uploadFile(FTPClient ftpClient, String localFile, String remoteFile) {
        try (FileInputStream inputStream = new FileInputStream(localFile)) {
            // Set file type to binary for uploading (ensure correct transfer mode)
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            // Upload the file
            boolean done = ftpClient.storeFile(remoteFile, inputStream);
            if (done) {
                System.out.println("File uploaded successfully.");
            } else {
                System.out.println("Failed to upload file.");
            }
        } catch (IOException e) {
            System.out.println("Error uploading file: " + e.getMessage());
        }
    }

    // Method to download a file from the FTP server
    public static void downloadFile(FTPClient ftpClient, String remoteFile, String localFile) {
        try (FileOutputStream outputStream = new FileOutputStream(localFile)) {
            // Set file type to binary for downloading
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            // Download the file
            boolean done = ftpClient.retrieveFile(remoteFile, outputStream);
            if (done) {
                System.out.println("File downloaded successfully.");
            } else {
                System.out.println("Failed to download file.");
            }
        } catch (IOException e) {
            System.out.println("Error downloading file: " + e.getMessage());
        }
    }
}
