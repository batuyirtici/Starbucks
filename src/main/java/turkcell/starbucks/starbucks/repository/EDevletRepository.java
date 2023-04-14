package turkcell.starbucks.starbucks.repository;

import turkcell.starbucks.starbucks.entities.EDevlet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface EDevletRepository extends JpaRepository<EDevlet, Integer> {
    boolean existsByNameAndLastNameAndOfDateBirthAndIdentificationNumber
            (String name, String lastName, LocalDate ofDateBirth, String identificationNumber);
}