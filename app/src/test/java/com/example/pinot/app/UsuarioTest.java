package com.example.pinot.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class UsuarioTest {

    Usuario user;

    @Test
    public void addition_isCorrect() {
        assertEquals(   4, 2 + 2);
    }

    public void ct001_isCorrect () {
        assertEquals(user.criarusuario("nome01","nome01@nome01.com","1234","1234") ,true ) ;
    }
    public void ct002_isCorrect () {
        assertEquals(user.criarusuario("","","","") ,false ) ;
    }
    public void ct003_isCorrect () {
        assertEquals(user.criarusuario("nome01", "nome01@nome01.com", "1234", "4321"), false);
    }
    public void ct004_isCorrect () {
        assertEquals(user.criarusuario("nome01","nome01@nome01.com","1234","1234") ,false ) ;
    }
}