package com.le.ssm.controller;

import com.le.ssm.pojo.A;
import com.le.ssm.pojo.D;
import com.le.ssm.service.AServiece;
import com.le.ssm.service.DService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class AController {
    @Autowired
    private AServiece aServiece;
    @Autowired
    private DService dService;
    @RequestMapping("/Aindex")
    public void Aindex(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        A a=aServiece.selectAByusername(username);
        HttpSession session=request.getSession();
        System.out.println(a);
        session.setAttribute("A",a);
        request.getRequestDispatcher("/Pay.jsp").forward(request,response);
    }

    @RequestMapping("/DAindex")
    public void DAindex(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        List<D> DAlist=dService.getAllD();
        HttpSession session=request.getSession();
        session.setAttribute("DAlist",DAlist);
        request.getRequestDispatcher("/DAindex.jsp").forward(request,response);
    }
}
