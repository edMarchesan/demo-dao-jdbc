import entities.Department;
import entities.Seller;
import modelDao.DaoFactory;
import modelDao.DepartmentDao;
import modelDao.SellerDao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//       SellerDao sellerDao = DaoFactory.createSellerDao();
//Department department = new Department(2, null);
//        List<Seller> sellers = sellerDao.findAll();
//        for (Seller s : sellers) {
//            System.out.println(s);
//        }
//
//        Seller newSeller = new Seller(null, "Tonho", "tonho@gmail.com", new Date(), 4000.00, department);
//        sellerDao.insert(newSeller);
//
//     Seller seller = sellerDao.findById(1);
//      seller.setName("Jack");
//     sellerDao.update(seller);
//
//        System.out.println("Enter id for delete test: ");
//        int id = scanner.nextInt();
//        sellerDao.deleteById(id);
//        scanner.close();

        Scanner scanner = new Scanner(System.in);
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
        System.out.println("=== TEST 1: findById =======");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("\n=== TEST 2: findAll =======");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println("\n=== TEST 3: insert =======");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New id: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: update =======");
        Department dep2 = departmentDao.findById(1);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update completed");

        System.out.println("\n=== TEST 5: delete =======");
        System.out.print("Enter id for delete test: ");
        int id = scanner.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        scanner.close();
    }
}