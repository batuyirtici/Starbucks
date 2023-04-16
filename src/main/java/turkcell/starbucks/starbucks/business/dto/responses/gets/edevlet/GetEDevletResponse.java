package turkcell.starbucks.starbucks.business.dto.responses.gets.edevlet;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GetEDevletResponse {
    private int id;
    private String name;
    private String lastName;
    private LocalDate ofDateBirth;
    private String identificationNumber;
}


