package com.mikayelovich.validator;

import com.mikayelovich.model.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object obj, Errors errors) {
        User user = (User) obj;
        if (user.getUsername().isEmpty()) {
            errors.rejectValue("username", "empty");
        }   if (user.getPassword().isEmpty()) {
            errors.rejectValue("password", "empty");
        }
    }
}

