package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Test 1: Department findById ====");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n==== Test 2: Department findAll ====");
		List<Department> list = departmentDao.findAll();
		for (Department dp : list) {
			System.out.println(dp);
		}
		
		System.out.println("\n==== Test 3: Department insert ====");
		Department dep = new Department(null, "Design");
		departmentDao.insert(dep);
		System.out.println("Created a new department successfully!");
	}

}
