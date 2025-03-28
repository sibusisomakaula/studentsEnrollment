package za.ac.cput.repository;

import za.ac.cput.domain.Enrollment;

import java.util.ArrayList;
import java.util.List;

public class EnrollmentRepository implements IEnrollmentRepository{
    private static IEnrollmentRepository repository = null;
    private List<Enrollment> enList;


    private EnrollmentRepository(){
        enList = new ArrayList<Enrollment>();

    }
    public static IEnrollmentRepository getRepository(){
        if(repository == null){
            repository = new EnrollmentRepository();
        }
        return repository;
    }

    @Override
    public Enrollment create(Enrollment enrollment) {
        boolean success = enList.add(enrollment);
        if(success){
            return enrollment;
        }
        return null;
    }

    @Override
    public Enrollment read(String enrollmentId) {
        for(Enrollment c : enList){
            if(c.getEnrollmentId().equals(enrollmentId))
                return c;
        }
        return null;
    }

    @Override
    public Enrollment update(Enrollment enrollment) {
        String enrollmentId = enrollment.getEnrollmentId();
        Enrollment oldEnrol = read(enrollmentId);
        if (oldEnrol == null)
            return null;
        boolean success = delete(enrollmentId);
        if (success) {
            enList.add(enrollment);

        }
        return enrollment;
    }


    @Override
    public boolean delete(String enrollmentId) {
        Enrollment enrollmentToDelete = read(enrollmentId);
        if(enrollmentToDelete == null)
            return false;
        return(enList.remove(enrollmentToDelete));
    }

    @Override
    public List<Enrollment> getAll(Enrollment enrollmentAll) {
        return enList;
    }
}
