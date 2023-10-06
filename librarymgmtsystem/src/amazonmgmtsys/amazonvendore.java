package amazonmgmtsys;


import java.sql.*;

import java.util.*;

public class amazonvendore {
	db2connection b2;
	PreparedStatement s3;
	
	public amazonvendore() {

		
		b2 = new db2connection();
		//s2 = b1.getStatement(); U CANT WRITE LIKE THIS BECAUSE UR TAKING 
		//QUERY IT IS DIFF FOR INSER, DELETE ,UPDATE
		}
	
	void insert() throws Exception {

		System.out.println("insert values in vendor");
		s3= b2.getStatement("insert into vendor1 values(?,?,?,?)");
		Scanner sc = new Scanner(System.in); //you can comment this
		System.out.println("enter vid");
		s3.setInt(1,sc.nextInt());//or directly (2,7);
		System.out.println("enter vname"); //and add directly 
		//pname = sc.next();
		//s2.setString(1,pname);
		s3.setString(2, sc.next()); //k.setInt(1, 1223);
	
		System.out.println("enter vaddress");
		s3.setString(3,sc.next());
		System.out.println("enter mobno");
		s3.setLong(4, sc.nextLong());
		s3.execute();
		//s2.execute()???????????????if it is preparedstatement
	}
	
	void delete() throws Exception {


		//s2.execute("delete from product where pid=3");// Cannot invoke "java.sql.PreparedStatement.execute(String)
		s3=b2.getStatement("delete from vendor1 where vid=4");
		// s2= b1.getStatement("delete from book where bookname=?");
		 //s2.setString(1, "Webtech");
		 s3.execute();
		 System.out.println("data deleted ");	
	}
	
	void update() throws Exception {


		//s2.execute("update product set qty =11 where pid=1");u can't do this Cannot invoke "java.sql.PreparedStatement.execute(String)"
		//because "this.s2" is null
		
		s3= b2.getStatement("update vendor1 set vaddress = 'baglore' where vid=1");
		 //s2= b1.getStatement("update set price=?  where bookname=?");
		// s2.setInt(1, 890);
		 //s2.setString(2, "webtech");
		 s3.execute();
		 System.out.println("data updated ");

	}
	
	void display() throws Exception{

		s3= b2.getStatement("select * from vendor1 where vid=?");
		 s3.setInt(1, 3);
		 ResultSet rs= s3.executeQuery();
		 if(rs.next())    //without this it will nullpointer exception 
		     System.out.println(rs.getInt(1) +"  "+ rs.getString(2) +" "+ rs.getInt(3) +" "+rs.getInt(4));
		 else
			 System.out.println("no record found");
		 
		/* to display all elements
		   s2= b1.getStatement("select * from product");
		 
		 ResultSet rs= s2.executeQuery();
		 while(rs.next())  {  //without this it will nullpointer exception 
		     System.out.println(rs.getInt(1) +"  "+ rs.getString(2) +" "+ rs.getInt(3) +" "+rs.getInt(4));
		 }*/
		 }


	public static void main(String[] args) {



		/*try {
			Scanner sc = new Scanner(System.in);
			amazonvendore e = new amazonvendore();
			System.out.println("1...add data");
			System.out.println("2....delete data");
			System.out.println("3....update data");
			System.out.println("4....display data");
			System.out.println("enter ur choice");
			int ch = sc.nextInt();
			if(ch==1) e.insert();
			else if(ch==2) e.delete();
			else if(ch==3) e.update();
			else if(ch==4) e.display();
			else System.out.println("incorect choice");
		}catch(ClassNotFoundException s) {System.out.println(s);}
		catch(SQLException a) {System.out.println(a);}
		catch(Exception a1) {System.out.println(a1);}*/
	}

}