package springHibernate;

import java.util.ArrayList;
import java.util.List;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class RegisterDao {


	HibernateTemplate template;
	public HibernateTemplate getTemplate() {
		return template;
	}


	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}



public void saveCustomer(Customer e){  
  template.save(e);  
}  
public Customer getById(String username){  
	Customer e=(Customer)template.get(Customer.class,username);  
    return e;  
}   
	
}






