package filtro;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FiltroDois
 */
@WebFilter(dispatcherTypes = {DispatcherType.REQUEST }
					, urlPatterns = { "/*" })
public class FiltroDois implements Filter {

    /**
     * Default constructor. 
     */
    public FiltroDois() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//executado no request - IDA
		System.out.println("Executando filtro 2 (IDA) ... ");

		//executado no response - VOLTA
		// pass the request along the filter chain
		chain.doFilter(request, response);
		System.out.println("Executando filtro 2 (VOLTA) ... ");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
