package org.example;

public class PasswordValidator {
    public boolean isPasswordValidator( String password){
        if(password == null || password.length() < 8 ){
            return false;
        }
        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }

            // Оптимизация: если все условия выполнены — можно выйти раньше
            if (hasDigit && hasUpperCase && hasLowerCase) {
                return true;
            }
        }

        return hasDigit && hasUpperCase && hasLowerCase;
    }
}
