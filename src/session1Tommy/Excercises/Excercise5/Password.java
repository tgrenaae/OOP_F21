package session1Tommy.Excercises.Excercise5;

public class Password {
    String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean isStrongPassword(){
        boolean letters = isLetters();
        boolean digit = isDigit();
        boolean nonLetterDigit = isNonLetterDigit();

        if(letters && digit && nonLetterDigit){
            return true;
        }

        return false;
    }

    public boolean isLetters(){
        if(this.password.length() >= 8){
            return true;
        }
        return false;
    }

    public boolean isDigit(){
        char[] chars = this.password.toCharArray();
        for (char c: chars) {
            if(Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    public boolean isNonLetterDigit(){
        if (this.password.contains("[a-zA-Z]+") || this.password.contains("[0-9]")){
            return false;
        }
        return true;
    }
}
