package NotePad.service.validation;



import NotePad.dto.ClientRequest;

import java.util.ArrayList;
import java.util.List;

public class ValidationService {

 /*
 name != null
 name.length > 5 && < 15

 description != null
 description.length > 5 && < 30

  */

    public List<String> checkRequest(ClientRequest request){
        List<String> errors = new ArrayList<>();

        if (request.getName().isBlank()) errors.add("task name must be not null");
        if (request.getDescription().isBlank()) errors.add("task description must be not null");

        if (request.getName().length() < 5 || request.getName().length() > 15) errors.add("неправильная длина имени задачи");
        if (request.getDescription().length() < 5 || request.getDescription().length() > 30) errors.add("неправильная длина описания задачи");

        return errors;
    }
}
