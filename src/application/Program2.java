package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DepartmentDao department = DaoFactory.createDepartmentDao();
		System.out.println("---TEST 1 : Department insert---");
		Department insertDepartment = new Department(null, "Ovo");
		department.insert(insertDepartment);
		System.out.println("---TEST 2 : Department update---");
		insertDepartment.setId(2);
		insertDepartment.setName("Rock");
		department.update(insertDepartment);
		System.out.println("---TEST 3 : Department delete---");
		System.out.println("Enter one number for delete one department");
		int id = sc.nextInt();
		department.deleteById(id);
		System.out.println("---TEST 4 : Department findById---");
		System.out.println("Enter one number for search one department");
		id = sc.nextInt();
		insertDepartment = department.findById(id);
		System.out.println(insertDepartment);
		System.out.println("---TEST 5 : Department findAll---");
		List<Department> list = new ArrayList<>();
		list = department.findAll();
		list.forEach(System.out::println);
		sc.close();
	}

}
