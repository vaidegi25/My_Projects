package mobile;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DataCurd dc=new DataCurd();
		try (Scanner sc = new Scanner(System.in)) {
			while(true)
			{
			System.out.println("enter your choice");
			System.out.println("1.Add Product");
			System.out.println("2.Fetch Product");
			System.out.println("3.delete Produt");
			System.out.println("4.Fetch all");
			System.out.println("5.exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:{
				System.out.println("enter the id");
				int id=sc.nextInt();
				System.out.println("enter brand");
				String brand=sc.next();
				System.out.println("enter cost");
				Double cost=sc.nextDouble();
				System.out.println("enter discount");
				Double discount=sc.nextDouble();
				Product p=new Product(id, brand, cost, discount);
				int a=dc.insert(p);
				System.out.println(a+" row added");}
			break;
			case 2:{
				System.out.println("enter the id");
				int id=sc.nextInt();
				Product p=dc.fetch(id);
				System.out.println(p.getId()+" "+p.getBrand()+" "+" "+p.getCost()+" "+p.getDiscount());}
			break;
			case 3:{
				System.out.println("enter the id");
				int id=sc.nextInt();
				int a=dc.delete(id);
				System.out.println(a+" row deleted");}
			break;
			case 4:{
				List<Product> p=dc.fetchAll();
				for (Product pro : p) {
					System.out.println(pro.getId()+" "+pro.getBrand()+" "+" "+pro.getCost()+" "+pro.getDiscount());}}
			break;
			case 5:
			{
				System.exit(0);
			}
			default:
				System.out.println("invalied choice");
			}
			}
		}
		
		
	}

}
