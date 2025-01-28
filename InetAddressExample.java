import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) throws Exception {
        InetAddress local = InetAddress.getLocalHost();
        System.out.println("Local Host Name: " + local.getHostName());
        System.out.println("Local Host Address: " + local.getHostAddress());

        InetAddress google = InetAddress.getByName("www.google.com");
        System.out.println("Google Host Name: " + google.getHostName());
        System.out.println("Google IP Address: " + google.getHostAddress());
    }
}

/* 
Methods of InetAddress

getByName(String host): Returns an InetAddress object for the given hostname.
getLocalHost(): Returns the InetAddress object for the local machine.
getByAddress(byte[] addr): Returns an InetAddress object for the given byte array representing the IP address.
getHostName(): Returns the hostname of the IP address.
getHostAddress(): Returns the IP address as a string.
isReachable(int timeout): Checks if the address is reachable within the specified timeout.

*/