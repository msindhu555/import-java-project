package org.import2;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) {
		Import_company_details icd = new Import_company_details();
		icd.setImportCompanyId("111");
		icd.setImportCompanyName("aaa");
		icd.setImportCompanyAddress("cbe");
		icd.setImportCompanyEmailId("aaa@gmail.com");
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(icd);
		session.update(icd);
		session.getTransaction().commit();
		session.close();
	}

}





