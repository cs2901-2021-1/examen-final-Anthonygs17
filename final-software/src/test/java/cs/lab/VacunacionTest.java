package cs.lab;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.String;
import java.util.logging.Logger;


class VacunacionTest {
    static final Logger logger = Logger.getLogger(Vacunacion.class.getName());

    @Test
    public void testCase0(){
        String username, password;
        username = "anthony";
        password = "ynohtna";
        Login login = new Login(username, password);
        String response = login.statusLogin();
        Assert.assertEquals(response, "Usuario autenticado correctamente");
        /*CSTranslator csTranslator = new CSTranslator();
        String response = csTranslator.translateXYZ();
        Assert.assertEquals(response, "Door");*/
    }

    @Test
    public void testCase1(){
        String username, password;
        username = "anthony";
        password = "ohtna";
        Login login = new Login(username, password);
        String response = login.statusLogin();
        Assert.assertEquals(response, "Usuario autenticado incorrectamente");
    }
};