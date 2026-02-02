package com.functionaiInterfaces.sensitivedatatagging;

public class TestEncryption {

    public static void main(String[] args) {

        UserCredentials user = new UserCredentials("admin", "secret123");
        String publicInfo = "Non-sensitive data";

        EncryptionService.encryptIfSensitive(user);
        EncryptionService.encryptIfSensitive(publicInfo);
    }
}
