package gov.samhsa.c2s.c2suiapi.infrastructure.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class AbstractProviderDto {
    protected Long id;
    @Valid
    @NotEmpty
    protected Set<IdentifierDto> identifiers = new HashSet<>();
    @Valid
    protected AddressDto address;
    private String firstName;
    private String middleName;
    private String lastName;
    private String name;
    protected Boolean deletable;
    /**
     * Immutable property to represent the {@link ProviderType} of this instance
     */
    private ProviderType providerType;

    private void setProviderType(ProviderType providerType) {
        // Make providerType immutable
    }

    enum ProviderType {
        PRACTITIONER, ORGANIZATION
    }
}