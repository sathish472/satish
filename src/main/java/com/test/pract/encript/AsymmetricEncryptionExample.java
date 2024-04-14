package com.test.pract.encript;

import javax.crypto.Cipher;
import java.security.*;

public class AsymmetricEncryptionExample {

    public static void main(String[] args) throws Exception {
        // Generate public and private keys
        KeyPair keyPair = generateKeyPair();

        // Data to be encrypted
        String data = "Hello, World!";

        // Encrypt the data using public key
        System.out.println("\n Public key format"+keyPair.getPublic().getFormat());
        byte[] encryptedData = encrypt(data, keyPair.getPublic());

        // Print the encrypted data
        System.out.println("Encrypted Data: " + new String(encryptedData));

        // Decrypt the data using private key
        String decryptedData = decrypt(encryptedData, keyPair.getPrivate());

        // Print the decrypted data
        System.out.println("Decrypted Data: " + decryptedData);
    }

    public static KeyPair generateKeyPair() throws Exception {
        // Generate RSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        return keyPairGenerator.generateKeyPair();
    }

    public static byte[] encrypt(String data, PublicKey publicKey) throws Exception {
        // Create cipher instance and initialize it for encryption
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);

        // Encrypt the data
        return cipher.doFinal(data.getBytes());
    }

    public static String decrypt(byte[] encryptedData, PrivateKey privateKey) throws Exception {
        // Create cipher instance and initialize it for decryption
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);

        // Decrypt the data
        byte[] decryptedData = cipher.doFinal(encryptedData);

        // Convert decrypted byte array to String
        return new String(decryptedData);
    }
}
