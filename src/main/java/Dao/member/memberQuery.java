package Dao.member;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import Dao.implDao;
import Model.member;

public class memberQuery {

	public static void main(String[] args) {
		
		//System.out.println(memberQuery.checkUser("kkk", "1234"));
		
		//System.out.println(memberQuery.checkUserName("kkk"));
	}
	//檢查帳號密碼
	public static member checkUser(String username,String password) {
		Session se=implDao.getDb();
		String HQL="from member where username=?1 and password=?2";
		Query q=se.createQuery(HQL);
		q.setParameter(1, username);
		q.setParameter(2, password);
		List l=q.list();
		member m=null;
		for(Object o:l) {
			m=(member)o;
		}
		return m;
	}
	
	//檢查帳號重複
	public static member checkUserName(String username) {
		Session se=implDao.getDb();
		String HQL="from member where username=?1";
		Query q=se.createQuery(HQL);
		q.setParameter(1, username);
		List l=q.list();
		member m=null;
		for(Object o:l) {
			m=(member) o;
		}
		
		return m;
	}
}
