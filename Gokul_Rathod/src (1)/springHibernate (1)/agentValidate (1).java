package springHibernate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class agentValidate implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		
		ApplicationContext obj=new ClassPathXmlApplicationContext("Bean.xml");
		agentDao dao =(agentDao)obj.getBean("a");  
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		 
		HttpSession session=req.getSession(); 
		session.setAttribute("key", email);
		
		
		 try {
		travelPojo tra=dao.getById(email);
	if(email.equals("admin") && pass.equals("admin")){
		return new ModelAndView("adminHome","adminmsg","Welcome "+email);		

	}
			if(email.equals(tra.getEmail()) && pass.equals(tra.getPass())) {
				return new ModelAndView("agentHome","agentmsg","Welcome "+email);		
			}
			else
			{
				return new ModelAndView("agentlogin","agentmsg","Invalid Username/Password");		
	
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ModelAndView("agentlogin","agentmsg","Invalid Username/Password");		
}
	}
}
	
