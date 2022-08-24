package tags;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class Campo extends SimpleTagSupport{
	
	private String label;
	private String id;
	
	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("<label for=\"" + this.id + "\">" + this.label + "</label>");
		out.println("<input type=\"text\" id=\"" + this.id + "\" /><br/>");
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	

}
