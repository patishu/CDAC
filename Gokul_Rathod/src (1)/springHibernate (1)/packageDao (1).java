package springHibernate;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class packageDao {
		HibernateTemplate template;
		public HibernateTemplate getTemplate() {
			return template;
		}


		public void setTemplate(HibernateTemplate template) {
			this.template = template;
		}



	public void savepackage(packageDao e){  
	  template.save(e);  
	}


	public void savePackage(packgePojo pk1) {
		// TODO Auto-generated method stub
		template.save(pk1);
	}
}

