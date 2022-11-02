package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		
		
		//TESTE Department obj = new Department (1, "Books");
		
		//TESTE Seller seller = new Seller (21, "Bob", "bob@email.com", new Date(), 3000.0, obj);
		
		//TESTE SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//TESTE System.out.println(seller);
		
	}

}
