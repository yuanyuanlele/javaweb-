package com.le.ssm.controller;

import com.le.ssm.pojo.A;
import com.mysql.cj.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class PayController {
    @RequestMapping("/ApplyPay")
    public void ApplyPay(HttpServletRequest request, HttpServletResponse response) throws ParseException, ServletException, IOException {
        HttpSession session=request.getSession();
        System.out.println(1);
        String begintime=request.getParameter("begintime");
        String endtime=request.getParameter("endtime");
        System.out.println(2);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(3);
        Date begindate = simpleDateFormat.parse(begintime);
        Date enddate = simpleDateFormat.parse(endtime);
        System.out.println(4);
        long from1 = begindate.getTime();
        long to1 = enddate.getTime();
        int days = (int) ((to1 - from1) / (1000 * 60 * 60 * 24));
        int balance=0;
        System.out.println(5);
        request.setAttribute("days",days);
        System.out.println(5.1);
        A a= (A) session.getAttribute("A");
        System.out.println(5.2);
        System.out.println(a);
        String cptype=a.getAcptype();
        System.out.println(6);
        if (cptype.equals("固定")){
            balance=5*days;
            request.setAttribute("balance",balance);
        }
        else {
            balance=8*days;
            request.setAttribute("balance",balance);
        }
        System.out.println(7);
        session.setAttribute("balance",balance);
        request.getRequestDispatcher("/ApplyPay.jsp").forward(request,response);

    }
}
