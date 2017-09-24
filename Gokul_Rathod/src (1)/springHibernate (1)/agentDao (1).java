package springHibernate;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class agentDao {
		HibernateTemplate template;
		public HibernateTemplate getTemplate() {
			return template;
		}


		public void setTemplate(HibernateTemplate template) {
			this.template = template;
		}



	public void saveAgent(travelPojo e){  
	  template.save(e);  
	}


	public travelPojo getById(String email) {
		travelPojo tra=(travelPojo)template.get(travelPojo.class,email);  
	    return tra;  
	}   
}  


