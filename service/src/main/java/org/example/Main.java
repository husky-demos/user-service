package org.example;

import io.grpc.ServerBuilder;
import org.example.service.UserService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        final var server = ServerBuilder.forPort(9001)
                .addService(new UserService())
                .build()
                .start();
        server.awaitTermination();
    }
}
