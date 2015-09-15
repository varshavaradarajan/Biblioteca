//Job of this class is to hold the library number and password and check if the entered login and password matches.
package com.tw.libsystem;

public class User {

    private String libraryNumber, password, role;

    public User(String libraryNumber, String password, String role) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.role = role;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject != null && otherObject.getClass() == User.class) {
            User otherUser = (User)otherObject;
            if(this == otherUser) {
                return true;
            }
            if((this.libraryNumber.equals(otherUser.libraryNumber) && (this.password.equals(otherUser.password))))
            {
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = libraryNumber != null ? libraryNumber.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        return result;
    }

    public String roleOfUser() {
        return role;
    }
}
