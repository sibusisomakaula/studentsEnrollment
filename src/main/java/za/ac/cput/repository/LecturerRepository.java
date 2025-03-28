package za.ac.cput.repository;

import za.ac.cput.domain.Lecturer;

import java.util.ArrayList;
import java.util.List;

public class LecturerRepository implements ILecturerRepository {

    private static ILecturerRepository repository = null;
    private final List<Lecturer>lecturerList=new ArrayList<>();


    private LecturerRepository(){

    }
    public static ILecturerRepository getRepository(){
        if(repository == null){
            repository = new LecturerRepository();
        }
        return repository;
    }

    @Override
    public Lecturer create(Lecturer lecturer) {
        lecturerList.add(lecturer);
        return lecturer;
    }

    @Override
    public Lecturer read(String lecturerID) {
        for(Lecturer lecturer : lecturerList){
            if(lecturer.getLecturerID().equals(lecturerID))
                return lecturer;
        }
        return null;
    }

    @Override
    public Lecturer update(Lecturer lecturer) {
        Lecturer existingLecturer = read(lecturer.getLecturerID());
        if(existingLecturer != null){
            lecturerList.remove(existingLecturer);
            lecturerList.add(lecturer);
            return lecturer;
        }
        return null;
    }

    @Override
    public boolean delete(String lecturerID) {
        Lecturer lecturerToDelete = read(lecturerID);
        if(lecturerToDelete == null)
            return false;
        return(lecturerList.remove(lecturerToDelete));
    }

    @Override
    public List<Lecturer> getAll() {
        return new ArrayList<>(lecturerList);
    }
}

