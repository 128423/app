package com.example.pinot.app;



import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;

public class Cripto {

    KeyPair keys;

 //aeqw
    public Cripto() throws NoSuchProviderException, NoSuchAlgorithmException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("DSA", "SUN");
        SecureRandom random = SecureRandom.getInstance("SHA1PRNG", "SUN");
        keyGen.initialize(1024, random);
        keys = keyGen.generateKeyPair();

    }

    public Cripto(KeyPair keys) {
        this.keys = keys;
    }

    public KeyPair getKeys() {
        return keys;
    }

    public void setKeys(KeyPair keys) {
        this.keys = keys;
    }

    private boolean gerakey() {

        return false;
    }


}
