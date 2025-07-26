package com.navindu;

import com.navindu.router.Router;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class JavaSite {
    public static void main(String[] args) throws IOException {
        int port = 8080;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        Router router = new Router();
        router.initRoutes(server); // register all routes

        server.setExecutor(Executors.newCachedThreadPool());
        server.start();

        System.out.println("Server is running at http://localhost:" + port);
    }
    
}
