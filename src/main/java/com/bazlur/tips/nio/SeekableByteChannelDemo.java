package com.bazlur.tips.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/4/15.
 */
public class SeekableByteChannelDemo {
    public static void main(String[] args) throws IOException {
        Path logFile = Paths.get("/var/log/formreleaf.log");

        ByteBuffer buffer = ByteBuffer.allocate(1024);
        FileChannel fileChannel = FileChannel.open(logFile, StandardOpenOption.READ);
        long size = fileChannel.size();
        System.out.println(size);

        int read = fileChannel.read(buffer, fileChannel.size() - 1000);

    }
}
