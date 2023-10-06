package Dao;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;

import com.model.bookpojo;
public class bookdao {

	 SessionFactory sf= new Configuration().configure().buildSessionFactory();
	 Session s= sf.openSession();//like preparedstatement 
	 Transaction t=s.beginTransaction();
	 bookpojo b = new bookpojo();
	 
	 public void addbook(int isfc,String bname,String aname,int price,int NoOfPage) {

		 b.setIsfc(isfc);
		 b.setBname(bname);
		 b.setAname(aname);
		 b.setPrice(price);
		 b.setNoOfPages(NoOfPage);
		 s.save(b);//hibernate will write insert query to store class data to table
		 t.commit();
		 System.out.println("data inserted");
	 }
	 public void updatebook(int isfc,int price) {

		 bookpojo b= s.get(bookpojo.class, isfc );
		 if(b!=null)
		  {
			 //b.setIsfc(isfc);
				b.setPrice(price);
				s.update(b);
				 t.commit();
				 System.out.println("data UPDATED");
		  }
		 else
		 	System.out.println("Entered wrong isfc number ");
		
	 }
	 public void viewallbooks(int isfc)

	 {
		 bookpojo d= s.get(bookpojo.class, isfc );

		 if(d!=null)
		  {
				System.out.println(d.getIsfc());
				System.out.println(d.getBname());
				System.out.println(d.getAname());
				System.out.println(d.getPrice());
				System.out.println(d.getNoOfPages());
		  }
		 else
		 	System.out.println("Entered wrong isfc number ");
		 
		/*
		 * Query q1= s.createQuery("from bookpojo");//select query //store whole data
		 * from Query to list List<bookpojo> l= q1.list(); return l;
		 */
	 }
	 public void deletbook(int isfc)

	 {
		 b.setIsfc(isfc);

		 s.delete(b);
		 t.commit();
	 }
	 
	 
}
