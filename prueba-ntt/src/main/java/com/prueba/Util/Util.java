package com.prueba.Util;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class Util {

	private final static String secretKey = "586E3272357538782F413F4428472B4B6250655368566B597033733676397924";
	private final static long expirationTimeInMillis = 600_000; // 10 minutes

	public static boolean validarString(String input) {
		String patron = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d.*\\d).+$";

		Pattern pattern = Pattern.compile(patron);
		Matcher matcher = pattern.matcher(input);

		return matcher.matches();
	}

	public static String generateOtp(String subject) {
		Date now = new Date();
		Date expiration = new Date(now.getTime() + expirationTimeInMillis);
		return Jwts.builder().setSubject(subject).setIssuedAt(now).setExpiration(expiration)
				.signWith(SignatureAlgorithm.HS256, secretKey).compact();

	}

	public static Boolean verifyOtpToken(String token) {
		try {
			Jwts.parser().setSigningKey(secretKey).parseClaimsJws(token);
			return true;
		} catch (Exception e) {
			return false;
		}

	}
}
