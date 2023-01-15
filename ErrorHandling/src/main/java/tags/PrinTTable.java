package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import javax.servlet.jsp.tagext.TryCatchFinally;

public class PrinTTable extends TagSupport {

	
	public int number;
	
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public int doStartTag() throws JspException {
		
	
		try {
			JspWriter out = pageContext.getOut();
			out.print("<br>");
			for(int i=0;i<=10;i++) {
				
				out.println((i*number)+"<br>");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
