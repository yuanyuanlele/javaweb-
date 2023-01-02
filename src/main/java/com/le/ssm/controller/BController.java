package com.le.ssm.controller;

import com.le.ssm.pojo.A;
import com.le.ssm.pojo.D;
import com.le.ssm.service.DService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
public class BController {
    @Autowired
    private DService dService;
    @RequestMapping("/PayBill")
    public void PayBill(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        A a= (A) session.getAttribute("A");
        int dbalance= (int) session.getAttribute("balance");
        boolean dbool=false;
        int Aid=a.getAid();
        dService.insertD(dbalance,dbool,Aid);
        List<D> DAlist=dService.getAllD();
        session.setAttribute("DAlist",DAlist);
        request.getRequestDispatcher("/DAindex.jsp").forward(request,response);
    }

    @RequestMapping("/AllowPay")
    public void AllowPay(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int did= Integer.parseInt(request.getParameter("Did"));
        dService.updateBoolByDid(did);
        request.getRequestDispatcher("/Bindex").forward(request,response);
    }

    @RequestMapping("/Bindex")
    public void Bindex(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        List<D> Dlist=dService.getAllD();
        session.setAttribute("Dlist",Dlist);
        request.getRequestDispatcher("/Dindex.jsp").forward(request,response);
    }
}
