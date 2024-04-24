package filters;

import java.io.IOException; 


import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 *  Servlet Filter implementation class EncodingFilter
 */
@WebFilter("/*")
public class Encodingfilter implements Filter{

	
	/** 
	 * Default constructor.
	 */
	public Encodingfilter() {
		
		
	}
	
	/**
	 *  @see Filter#destroy
	 */
	public void destroy() {	
		
	}

	/**
	 * @see Filter#doFiter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		
		chain.doFilter(request, response);
		
	}

	/**
	 * @see Filter"init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
}
	
}
