package org.diplomado.apiservlet.webapp.headers.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet ebServlet("/cabeceras-request")
public class CabecerasHttpRequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

        String metodoHttp = req.getMethod();
        String requestUri = req.getRequestURI();
        String requestUrl = req.getRequestURL();
        String contexPath = req.getContextPath();
        String servletPath = req.getServletPath();
        String ipCliente = req.getRemoteAddr();
        String ip = req.getLocalAddr();
        int port = req.getLocalPort();
        String scheme = req.getScheme();
        String host = req.getHeader("host");
        String url = Scheme + "://" + host contexPath + servletPath;
        String url2 = Scheme + "://" + port + contexPath + servletPath;

         try (Printwriter()){
             out.println("<!DOCTYPE html>");
             out.println("html");
             out.println("   <head>");
             out.println("   <meta charset=\"UTF-8\">");
             out.println("   <title> Resultadoform<title>");
             out.println("   </head>");
             out.println("   <body>");
             out.println("   <h1> Redultado form! <h1>");
             out.println("   <head>");

         }
}
