//Job of this class is to hold the library number and password and check if the entered login and password matches.
package com.tw.libsystem;

public class User {

    private String libraryNumber, password;

    public User(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (otherObject != null && otherObject.getClass() == User.class) {
            User otherUser = (User)otherObject;
            if((this.libraryNumber.equals(otherUser.libraryNumber) && (this.password.equals(otherUser.password)))){
                return true;
            }
            else{
                return false;
            }
        }
        return false;
    }

}
