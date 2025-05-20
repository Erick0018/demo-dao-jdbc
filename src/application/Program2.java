package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args ) {

        Scanner sc =  new Scanner(System.in);
        DepartmentDao dep = DaoFactory.createDepartmentDao();


    }
}
