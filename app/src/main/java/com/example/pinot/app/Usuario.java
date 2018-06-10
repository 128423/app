package com.example.pinot.app;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.List;

public class Usuario {

    public String nome ;
    public String email;
    public String senha;
    public List<String> amigos;
//    private Cripto crip;


    // Write a message to the database
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("message");



    public Usuario(String nome, String email, String senha,String confsenha) {
        this.nome = nome;
        this.email = email;

        if (confsenha == senha){
            this.senha = senha ;

        }

//        try {
//            crip = new Cripto();
//        } catch (NoSuchProviderException e) {
//            e.printStackTrace();
//        } catch (NoSuchAlgorithmException e) {
//            e.printStackTrace();
//        }

    }


    public boolean criarusuario (String nome, String email, String senha,String conf){
        if(senha != conf){
            return false;
        }


        if(nome == ""){
            return false;
        }
        return true ;


    }
}

