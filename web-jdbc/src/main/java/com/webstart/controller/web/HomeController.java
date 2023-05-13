package com.webstart.controller.web;
import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns ={"/trangchu"})
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//String path = req.getScheme() + "://" + req.getServerName() + ":" + req.getServerPort() + req.getContextPath();
		System.out.println("ssasass");
		RequestDispatcher rd =req.getRequestDispatcher("/views/web/home.jsp");
		
		rd.forward(req, res);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}
}
