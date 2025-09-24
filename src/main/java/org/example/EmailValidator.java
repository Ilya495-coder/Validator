package org.example;

public class EmailValidator {
    public boolean isEmailValidator(String email){
        if (email == null || email.isBlank()){
            return false;

        }
        if(email.contains(" ")){
            return false;
        }
        int d = email.indexOf("@");
         if(d < 0){
            return false;
        }

        int dotIndex = email.lastIndexOf(".");
        if (dotIndex < d + 2) { // точка после @, но слишком близко
            return false;
        }

        if (dotIndex >= email.length() - 2) { // домен слишком короткий
            return false;
        }

        return true;
    }

    }

