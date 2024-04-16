package medical.mano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import medical.mano.model.Patient;



@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>{}