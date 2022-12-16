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
import java.util.List;

@Controller
public class CController {
    @Autowired
    private AServiece aServiece;
    @RequestMapping("/Cindex")
    public void Cindex(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<A> Alist=aServiece.getAllA();
        request.setAttribute("Alist",Alist);
        request.getRequestDispatcher("/Cindex.jsp").forward(request,response);
    }

    @RequestMapping("ToUpdateA")
    public void ToUpdateA(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int Aid= Integer.parseInt(request.getParameter("Aid"));
        A a=aServiece.selectAByAid(Aid);
        request.setAttribute("a",a);
        request.getRequestDispatcher("/updateA.jsp").forward(request,response);
    }

    @RequestMapping("updateA")
    public void updateA(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Integer Aid = Integer.parseInt(request.getParameter("Aid"));
        String Aname = request.getParameter("Aname");
        String Apassword = request.getParameter("Apassword");
        Integer Ahid = Integer.valueOf(request.getParameter("Ahid"));
        String Atype = request.getParameter("Atype");
        String Acptype = request.getParameter("Acptype");
        Integer Acpid = Integer.valueOf(request.getParameter("Acpid"));
        String Actype = request.getParameter("Actype");
        String Acname = request.getParameter("Acname");
        String Aphone = request.getParameter("Aphone");
        A a = new A(Aid, Aname, Apassword, Ahid, Atype, Acptype, Acpid, Actype, Acname, Aphone);
        aServiece.updateA(a);
        Cindex(request,response);
    }

    @RequestMapping("deleteA")
    public void deleteA(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int Aid= Integer.parseInt(request.getParameter("Aid"));
        aServiece.deleteAByAid(Aid);
        Cindex(request,response);
    }
}
