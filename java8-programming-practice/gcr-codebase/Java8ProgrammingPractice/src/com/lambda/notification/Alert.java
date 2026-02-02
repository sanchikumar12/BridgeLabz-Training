package com.lambda.notification;
//Create Alter class 
class Alert {
    String message;
    String type;
    
    public Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    @Override
    public String toString() {
        return type + " Alert: " + message;
    }
}