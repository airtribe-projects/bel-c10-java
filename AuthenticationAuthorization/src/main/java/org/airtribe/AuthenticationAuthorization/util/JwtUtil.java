package org.airtribe.AuthenticationAuthorization.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Date;


public class JwtUtil {

  private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

  public static String generateToken(String email) {
    return Jwts.builder()
        .setSubject(email)
        .setExpiration(new Date(System.currentTimeMillis() + 24 * 60 * 60 * 1000))
        .setIssuedAt(new Date())
        .signWith(key)
        .compact();

  }

  public static boolean validateToken(String token) {
    try {
      Claims claims = Jwts.parser()
          .setSigningKey(key)
          .parseClaimsJws(token)
          .getBody();
      return claims.getExpiration().after(new Date());
    } catch (Exception e) {
      return false;
    }

  }
}
