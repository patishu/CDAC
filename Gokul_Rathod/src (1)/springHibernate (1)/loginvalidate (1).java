package springHibernate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class loginvalidate implements Controller {


	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		ApplicationContext obj=new ClassPathXmlApplicationContext("Bean.xml");
		RegisterDao dao =(RegisterDao)obj.getBean("d");  
		String userName=req.getParameter("userName");
		String passWord=req.getParameter("passWord");
		 
		 
		 try {
		Customer cust=dao.getById(userName);
	
			if(userName.equals(cust.getUserName()) && passWord.equals(cust.getPassWord()) ) {
				
		
				return new ModelAndView("custHome","msg","Welcome "+userName );		
			}
			else
			{
				return new ModelAndView("login","msg","Invalid Username/Password");		
	
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ModelAndView("login","msg","Invalid Username/Password");		
}
	}
}
	
