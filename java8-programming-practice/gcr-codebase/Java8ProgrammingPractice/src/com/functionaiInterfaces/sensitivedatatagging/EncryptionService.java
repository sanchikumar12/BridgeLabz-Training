package com.functionaiInterfaces.sensitivedatatagging;

public class EncryptionService {

    public static void encryptIfSensitive(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting: " + obj.getClass().getSimpleName());
        } else {
            System.out.println("No encryption required: " + obj.getClass().getSimpleName());
        }
    }
}

