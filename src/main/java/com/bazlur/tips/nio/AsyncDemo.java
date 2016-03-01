package com.bazlur.tips.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/5/15.
 */
public class AsyncDemo {
    public static void main(String[] args) throws IOException, ExecutionException, InterruptedException {

        Path logFile = Paths.get("/var/log/formreleaf.log");

        AsynchronousFileChannel channel = AsynchronousFileChannel.open(logFile);
        ByteBuffer buffer = ByteBuffer.allocate(100_000);

//        Future<Integer> result = channel.read(buffer, 0);
//        while (!result.isDone()) {
//            // doing something else here
//            System.out.println("....");
//        }
//
//        Integer bytesRead = result.get();
//        System.out.println("Bytes read [" + bytesRead + "]");

        channel.read(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
            @Override
            public void completed(Integer result, ByteBuffer attachment) {
                System.out.println("Bytes read [" + result + "]");
            }

            @Override
            public void failed(Throwable exc, ByteBuffer attachment) {
                System.out.println(exc.getMessage());
            }
        });
    }
}
