package Dao.member;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Dao.implDao;
import FACT.factModel;
import FACT.modelDi;
import Model.member;

public class memberDao implements implDao{

	public static void main(String[] args) {
		//System.out.println(implDao.getDb());

		ApplicationContext a1=new ClassPathXmlApplicationContext("spModel.xml");
		ApplicationContext a2=new AnnotationConfigApplicationContext(modelDi.class);
		//factModel fm=a1.getBean(factModel.class, "factModel");
		//fm.getM().setName("aaa");
		
		factModel fm=a2.getBean(factModel.class, "factModel");
		System.out.println(fm.getM().getName());
		
		
		
		member m=new member();
		/*m.add("恩", "kkk", "1234", "2222", "淡水", true);
		new memberDao().add(m);*/
	}

	@Override
	public void add(Object o) {
		Session se=implDao.getDb();
		Transaction tx=se.beginTransaction();
		se.save(o);
		tx.commit();
		se.close();
		
	}

	@Override
	public Object get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Object o) {
		Session se=implDao.getDb();
		Transaction tx=se.beginTransaction();
		se.update(o);
		tx.commit();
		se.close();
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
