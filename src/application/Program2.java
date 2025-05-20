package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("\n=== TEST 1: department findById ===");
        Department dep = departmentDao.findById(4);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: department findAll ===");
        List<Department> list = departmentDao.findAll();

        for (Department obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n=== TEST 3: department insert ===");
        System.out.print("Insert a department: ");
        String name = sc.nextLine();
        Department newDepartment = new Department(null, name);
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Department: " + newDepartment.getId() + ", " + newDepartment.getName());

    }
}
