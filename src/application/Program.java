package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");

        System.out.print("Enter id seller: ");
        int id = sc.nextInt();

        Seller seller = sellerDao.findId(id);
        sc.nextLine();

        System.out.println(seller);
    }
}