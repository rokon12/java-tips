package com.bazlur.tips.nio;

import java.io.IOException;
import java.net.*;
import java.nio.channels.NetworkChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Enumeration;
import java.util.Set;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/5/15.
 */
public class NetworkChannelDemo {
    public static void main(String[] args) throws IOException {
        SelectorProvider provider = SelectorProvider.provider();

        NetworkChannel channel = provider.openDatagramChannel();
        SocketAddress address = new InetSocketAddress(3080);
        channel.bind(address);
        Set<SocketOption<?>> socketOptions = channel.supportedOptions();
        System.out.println(socketOptions.toString());

        channel.setOption(StandardSocketOptions.IP_TOS, 3);
       // Boolean keepAlive = channel.getOption(StandardSocketOptions.SO_KEEPALIVE);

        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        while (networkInterfaces.hasMoreElements()){
            System.out.println(networkInterfaces.nextElement());
        }

    }
}
