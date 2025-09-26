package com.codevault.util;

import java.security.MessageDigest;

public class PasswordUtil {

	// Hash the password
	public static String hashPassword(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("SHA-256");
			byte[] hash = md.digest(password.getBytes("UTF-8"));
			StringBuilder hexString = new StringBuilder();
			for (byte b : hash) {
				hexString.append(String.format("%02x", b));
			}
			return hexString.toString();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	// Check if plain password matches hashed
	public static boolean checkPassword(String password, String hashedPassword) {
		String hashOfInput = hashPassword(password);
		return hashOfInput.equals(hashedPassword);
	}
}
