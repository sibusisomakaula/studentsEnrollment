package za.ac.cput.repository;

import za.ac.cput.domain.Enrollment;

import java.time.LocalDate;
import java.util.List;

    public interface IEnrollmentRepository extends IERepository<Enrollment,String>{

        List<Enrollment> getAll(Enrollment enrollmentAll);

    }
