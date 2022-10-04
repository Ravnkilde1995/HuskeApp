package com.example.notehelper;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Du ramte login sevletten med Get");

        request.getRequestDispatcher("src/main/webapp/WEB-INF/Bruger side.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Du ramte login sevletten med Post");

        request.getRequestDispatcher("src/main/webapp/WEB-INF/Bruger side.jsp").forward(request,response);

        String opretNavn = request.getParameter("OpretNavn");
        String kode1 = request.getParameter("kode1");
        String kode2 = request.getParameter("kode2");

        String besked = "";

        if (opretNavn.equals("") || kode1.equals("") || kode2.equals("")) {
            besked = "husk alle felter skal udfyldes";

            System.out.println("opret bruger ikke udfyldt korrekt.");
            log("opret bruger ikke udfyldt korrekt.");

            request.setAttribute("besked", besked);
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }

        if (!kode1.equals(kode2)){
            System.out.println("Koderne er ikke ens, prøv igen.");

            request.setAttribute("besked", besked);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        request.setAttribute("navn", opretNavn);
        request.getRequestDispatcher("bruger side.jsp").forward(request, response);

    }
}
