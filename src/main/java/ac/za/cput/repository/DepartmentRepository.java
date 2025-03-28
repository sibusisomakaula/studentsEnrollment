package ac.za.cput.repository;

import ac.za.cput.domain.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository implements IDepartmentRepository {

    private static IDepartmentRepository repository = null;
    private List<Department>departmentList;


    private DepartmentRepository(){
        departmentList = new ArrayList<Department>();

    }
    public static IDepartmentRepository getRepository(){
        if(repository == null){
            repository = new DepartmentRepository();
        }
        return repository;
    }

    @Override
    public Department create(Department department) {
        boolean success = department.add(department);
        if(success){
            return department;
        }
        return null;
    }

    @Override
    public Department read(String departmentid) {
        for(Department d : departmentList){
            if(c.getDepartmentId().equals(departmentid))
                return d;
        }
        return null;
    }

    @Override
    public Department update(Department department) {
        String departmentid = department.getDepartmentId();
        Department departmentcold = read(departmentid);
        if (Departmentold == null)
            return null;
        boolean success = delete(departmentid);
        if (success) {
            if (departmentList.add(department));

        }
        return department;
    }


    @Override
    public boolean delete(String departmentid) {
        Department departmentToDelete = read(departmentid);
        if(departmentToDelete == null)
            return false;
        return(departmentList.remove(departmentToDelete));
    }

    @Override
    public List<Department> getAll(Department departmentAll) {
        return departmentList;
    }
}
