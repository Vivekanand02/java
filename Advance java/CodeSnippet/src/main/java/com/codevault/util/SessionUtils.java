package com.codevault.util;

import java.io.IOException;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SessionUtils {

	// Check if user is logged in
	public static boolean isLoggedIn(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		return session != null && session.getAttribute("userId") != null;
	}

	// Get user ID from session
	public static int getLoggedInUserId(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null && session.getAttribute("userId") != null) {
			return (int) session.getAttribute("userId");
		}
		return -1; // Not logged in
	}

	// Redirect if not logged in
	public static void redirectIfNotLoggedIn(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		if (!isLoggedIn(request)) {
			response.sendRedirect("index.jsp"); // or login.jsp
		}
	}

	// Log user out
	public static void logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
		}
	}
}
