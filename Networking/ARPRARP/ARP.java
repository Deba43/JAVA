package Networking.ARPRARP;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ARP {
    public static void main(String[] args) {
        try {
            // Execute the ARP command
            Process process = Runtime.getRuntime().exec("arp -a");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            System.out.println("ARP Table:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
