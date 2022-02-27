package org.example;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.ServerBuilder;
import org.example.service.UserService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ManagedChannel walletServiceChannel = ManagedChannelBuilder.forTarget("localhost:9000").usePlaintext().build();

        final var server = ServerBuilder.forPort(9001)
                .addService(new UserService(walletServiceChannel))
                .build()
                .start();

        server.awaitTermination();
    }
}
