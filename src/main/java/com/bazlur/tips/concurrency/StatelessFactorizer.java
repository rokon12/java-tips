package com.bazlur.tips.concurrency;

import javax.servlet.*;
import java.io.IOException;
import java.math.BigInteger;

/**
 * @author Bazlur Rahman Rokon
 * @since 12/7/15.
 */
public class StatelessFactorizer implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        BigInteger i = extractFromRequest(servletRequest);
       // BigInteger[] factors = factor(i);

    }

    private BigInteger extractFromRequest(ServletRequest servletRequest) {
        return BigInteger.ONE;
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
