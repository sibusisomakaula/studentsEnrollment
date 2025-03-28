package za.ac.cput.repository;

public interface IERepository<Enrollment,enrollmentId> {

    Enrollment create(Enrollment enrollment);

    Enrollment read(enrollmentId enrollmentId);

    Enrollment update(Enrollment enrollment);

    boolean delete(enrollmentId enrollmentId);
}
