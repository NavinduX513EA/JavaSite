package com.navindu.router;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.navindu.pages.HomePageHandler;
import com.navindu.api.ApiHandler;


public class Router {

    public void initRoutes(HttpServer server) {
    server.createContext("/", new HomePageHandler());
    server.createContext("/api/hello", new ApiHandler());
}
}
