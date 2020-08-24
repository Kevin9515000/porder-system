package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public interface implDao {
	//連線
	public static Session getDb() {
		Configuration conn=new Configuration().configure();
		SessionFactory sf=conn.buildSessionFactory();
		Session se=sf.openSession();
		return se;
	}
	
	//新增
	void  add(Object o);
	
	//查詢
	Object get(Integer id);
	
	//修改
	void  update(Object o);
	
	//刪除
	void  delete(Integer id);
}
