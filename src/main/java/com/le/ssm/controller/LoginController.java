package com.le.ssm.controller;

import com.le.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/loginCheck")
    public void loginCheck(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("进入loginCheck");
        String username= request.getParameter("username");
        String password = request.getParameter("password");
        boolean isA = loginService.hasMatchA(username, password);
        boolean isB = loginService.hasMatchB(username, password);
        boolean isC = loginService.hasMatchC(username, password);
        if (isA){
            request.getRequestDispatcher("/Aindex").forward(request, response);
        }
        else if (isB){
            request.getRequestDispatcher("/Bindex").forward(request, response);
        }
        else if (isC){
            request.getRequestDispatcher("/Cindex").forward(request, response);
        }
    }
}
