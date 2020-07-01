package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		System.out.println("---TEST 1 : Department insert---");
		Department insertDepartment = new Department(7, "Pop");
		department.insert(insertDepartment);

	}

}
