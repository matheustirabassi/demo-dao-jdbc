package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao department = DaoFactory.createDepartmentDao();
		System.out.println("---TEST 1 : Department insert---");
		Department insertDepartment = new Department(null, "Ovo");
		department.insert(insertDepartment);
		System.out.println("---TEST 2 : Department update---");
		insertDepartment.setId(1);
		insertDepartment.setName("Rock");
		department.update(insertDepartment);

	}

}
