package springHibernate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class loginAgent implements Controller {

	
		@Override
		public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
			// TODO Auto-generated method stub
			ApplicationContext obj=new ClassPathXmlApplicationContext("Bean.xml");
			agentDao dao =(agentDao)obj.getBean("a");  

			
			String name=req.getParameter("name");
			String mobile=req.getParameter("mobile");
			String email=req.getParameter("email");
			String pass=req.getParameter("pass");
		
		     
			 travelPojo tra=new travelPojo(email,name,mobile,pass);
			 
			 try {
				dao.saveAgent(tra);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return new ModelAndView("agentlogin","agentmsg","E-mail address already registerd..!!");		
				}
			return new ModelAndView("agentlogin","agentmsg","Successfully Registered..!!");
		}
}	

