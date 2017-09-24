package springHibernate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class insertCustomer implements Controller{

	

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext obj=new ClassPathXmlApplicationContext("Bean.xml");
		RegisterDao dao =(RegisterDao)obj.getBean("d");  

		
		String userName=req.getParameter("userName");
		String passWord=req.getParameter("passWord");
		String email=req.getParameter("email");
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");
		String mobile=req.getParameter("mobile");
		String city=req.getParameter("city");
		String pcode=req.getParameter("pcode");
		String addr=req.getParameter("addr");		 
		
	     
		 Customer cust=new Customer(userName,passWord,email,fname,lname,mobile,city,pcode,addr);
		 
		 try {
			dao.saveCustomer(cust);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ModelAndView("login","key","duplicate record");		
			}
		return new ModelAndView("login","key","Successfully Registered..!!");
	}  
}