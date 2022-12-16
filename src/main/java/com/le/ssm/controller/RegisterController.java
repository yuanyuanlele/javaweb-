package com.le.ssm.controller;

import com.le.ssm.pojo.A;
import com.le.ssm.service.AServiece;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@Controller
public class RegisterController{
    @Autowired
    private AServiece aServiece;
    private static final long serialVersionUID = 1L;
    @RequestMapping(value = "/register")
    protected void register(HttpServletRequest request,
                            HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String Aname = request.getParameter("Aname");
        String Apassword = request.getParameter("Apassword");
        Integer Ahid = Integer.valueOf(request.getParameter("Ahid"));
        String Atype = request.getParameter("Atype");
        String Acptype = request.getParameter("Acptype");
        Integer Acpid = Integer.valueOf(request.getParameter("Acpid"));
        String Actype = request.getParameter("Actype");
        String Acname = request.getParameter("Acname");
        String Aphone = request.getParameter("Aphone");
        A a = new A(null, Aname, Apassword, Ahid, Atype, Acptype, Acpid, Actype, Acname, Aphone);
        aServiece.insertA(a);
        request.getRequestDispatcher("success.jsp").forward(request, response);
    }
}
