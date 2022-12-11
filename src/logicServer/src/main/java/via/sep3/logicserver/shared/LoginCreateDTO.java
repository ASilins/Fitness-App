package via.sep3.logicserver.shared;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
// In new build
public class LoginCreateDTO {
    private String Username;
    private byte[] Password;
    private byte[] Salt;
}
