package org.example;

public class UserValidator {
    public boolean getUsername(String username){
        if(username == null || username.length() < 5 || username.length() > 20) {
            return false;
        }
        for(char c : username.toCharArray()){
            boolean b = Character.isDigit(0);
            if(b == true){
                return false;
            }
            if (!username.matches("^[A-Za-z_][A-Za-z0-9_]*$")) {
                return false;
            }
        }
        return true;
    }


    public boolean getPassword(String password){
if(password == null || password.length() < 8){
    return false;
}
if(password.contains(" ")){
    return false;
}
boolean isdigit = false;
boolean isLower= false;
boolean isUpper= false;
for(char r : password.toCharArray()){
    if(Character.isDigit(r)){
        isdigit = true;
    }
    if(Character.isLowerCase(r)){
        isLower = true;
    }
    if(Character.isUpperCase(r)){
        isUpper = true;
    }
}
        if (isdigit && isLower && isUpper){
            return true;
}
        return isdigit && isLower && isUpper;

    }
}
