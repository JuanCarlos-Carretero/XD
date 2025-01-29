package com.entrainement;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "OpenAPIServlet", urlPatterns = {"/openapi.json"})
public class OpenAPIServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Redirige la requête vers l'emplacement du fichier swagger.json
        req.getRequestDispatcher("/swagger.json").forward(req, resp);
    }
}
