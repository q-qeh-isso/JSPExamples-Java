package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MeuListener
 *
 */
@WebListener
public class MeuListener implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public MeuListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("Atributo adicionado ao context app.");
        System.out.println("Atributo: " + event.getName());
        System.out.println("Valor: " + event.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0) {
    	// TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent event) {
    	System.out.println("Atributo removido do context app.");
        System.out.println("Atributo: " + event.getName());
        System.out.println("Valor: " + event.getValue());
    }
	
}
