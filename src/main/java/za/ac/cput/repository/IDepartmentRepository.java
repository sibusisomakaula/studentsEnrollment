package ac.za.cput.repository;

import ac.za.cput.domain.Department;

import java.util.List;

public interface IDepartmentRepository extends IRepository<Department,String>{

    List<Departments> getAll(Department departmentAll);



}
