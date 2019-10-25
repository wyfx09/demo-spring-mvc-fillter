package com.example.demospringmvcfilter.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Order(1)
@WebFilter(filterName = "firstFilter", urlPatterns = "/*")
public class FirstFilter implements Filter {
    @Override
    public void destroy() {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("request: ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(this.getClass().getName());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("response :++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(this.getClass().getName());
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
}
