package Networking.ARPRARP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class RARP {
    public static void main(String[] args) {
        try {
            // Execute the ARP command
            Process process = Runtime.getRuntime().exec("arp -a");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;

            // HashMap to store MAC to IP mappings
            HashMap<String, String> macToIpMap = new HashMap<>();

            System.out.println("Building ARP table...");
            while ((line = reader.readLine()) != null) {
                System.out.println("DEBUG: ARP Output Line - " + line); // Debugging

                // Parse valid ARP entries
                String[] parts = line.trim().split("\\s+");
                if (parts.length == 3 && isValidIPAddress(parts[0]) && isValidMACAddress(parts[1])) {
                    String ipAddress = parts[0]; // Extract IP address
                    String macAddress = parts[1].toLowerCase(); // Normalize MAC address
                    macToIpMap.put(macAddress, ipAddress);
                }
            }

            System.out.println("DEBUG: Completed ARP table build. Entries: " + macToIpMap);

            // Simulate a query for MAC to IP conversion
            String targetMacAddress = "01-00-5e-00-00-fc".toLowerCase(); // Replace with your MAC address
            if (macToIpMap.containsKey(targetMacAddress)) {
                System.out.println(
                        "IP address for MAC address " + targetMacAddress + " is: " + macToIpMap.get(targetMacAddress));
            } else {
                System.out.println("MAC address not found in the ARP table.");
            }

            process.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to validate IP addresses
    private static boolean isValidIPAddress(String ip) {
        return ip.matches("\\d+\\.\\d+\\.\\d+\\.\\d+");
    }

    // Helper method to validate MAC addresses
    private static boolean isValidMACAddress(String mac) {
        return mac.matches("([0-9a-fA-F]{2}[-:]){5}[0-9a-fA-F]{2}");
    }
}
