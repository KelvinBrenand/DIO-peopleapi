package one.digitalinnovation.peopleapi.dto.request;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.peopleapi.entity.Phone;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotNull
    @Size(min = 2, max = 100)
    private String firstName;

    @NotNull
    @Size(min = 2, max = 100)
    private String lastName;

    @NotNull
    @Size(min = 11, max = 11)
    private String cpf;

    private String birthdate;
    @Valid
    @NotNull
    @Size(min = 1)
    private List<Phone> phones;
}
