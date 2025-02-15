package org.airtribe.AuthenticationAuthorization.Config;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.airtribe.AuthenticationAuthorization.util.JwtUtil;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;


public class JwtFilter extends OncePerRequestFilter {
  @Override
  protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
      throws ServletException, IOException {
    String authHeader = request.getHeader("Authorization");

    if (request.getRequestURI().contains("/register") || request.getRequestURI().contains("/verifyRegistration") || request.getRequestURI().contains("/signin")) {
      filterChain.doFilter(request, response);
      return;
    }

    if (authHeader == null) {
      response.setStatus(HttpStatus.UNAUTHORIZED.value());
      response.getWriter().write("Missing Authorization header");
      return;
    }

    if(!JwtUtil.validateToken(authHeader)) {
      response.setStatus(HttpStatus.UNAUTHORIZED.value());
      response.getWriter().write("Invalid token");
      return;
    }

    filterChain.doFilter(request, response);

  }
}
