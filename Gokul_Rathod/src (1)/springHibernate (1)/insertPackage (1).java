package springHibernate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class insertPackage implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse arg1) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext obj=new ClassPathXmlApplicationContext("Bean.xml");
		packageDao dao =(packageDao)obj.getBean("p");  
		
		String pid = req.getParameter("pid");
		String pname = req.getParameter("pname");
		String duration = req.getParameter("duration");
		String dest = req.getParameter("dest");
		String amt = req.getParameter("amt");
		String source = req.getParameter("source");
		String dod = req.getParameter("dod");
		String img = req.getParameter("img");
		
		HttpSession session=req.getSession(); 
		String forkey =(String) session.getAttribute("key");
		System.out.println(forkey);
		packgePojo pkc=new packgePojo(pid, pname, duration, dod, amt, source, dest, img, new travelPojo(forkey));
		try {
			dao.savePackage(pkc);
		} catch (Exception e) {
			System.out.println("error");
			return new ModelAndView("agentHome","inskey","Package Successfully Inserted..!!");
		}
		System.out.println("suceess");

		return new ModelAndView("agentHome","inskey","Package Successfully Inserted..!!");
	}

}
