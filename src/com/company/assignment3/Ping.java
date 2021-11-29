package com.company.assignment3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;
import java.util.Date;
import java.util.Scanner;

public class Ping {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            String hostAddress = scn.nextLine();
            int port = 80;
            long timeToRespond = 0;

            InetAddress inetAddress = InetAddress.getByName(hostAddress);
            InetSocketAddress socketAddress = new InetSocketAddress(inetAddress, port);

            SocketChannel sc = SocketChannel.open();
            sc.configureBlocking(true);

            Date start = new Date();
            if (sc.connect(socketAddress)) {
                Date stop = new Date();
                timeToRespond = (stop.getTime() - start.getTime());
            }
            System.out.println("Response time: " + timeToRespond + " ms");
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
