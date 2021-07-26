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

    @Test
    public void testCase2(){
        String username, password;
        username = "maor";
        password = "roam";
        Login login = new Login(username, password);
        Menu menu = new Menu();
        Assert.assertEquals(menu.chooseOption(2), "Actualmente, 30% de personas estan completamente vacunadas");
    }

    @Test
    public void testCase3(){
        String username, password;
        username = "maor";
        password = "roam";
        Login login = new Login(username, password);
        Menu menu = new Menu();
        Assert.assertEquals(menu.chooseOption(3), "Hay 30 centros de vacunacion");
    }

    @Test
    public void testCase4(){
        String username, password;
        username = "maor";
        password = "roam";
        Login login = new Login(username, password);
        Menu menu = new Menu();
        Assert.assertEquals(menu.chooseOption(4), "Hay 6 564 323 personas vacunadas parcialmente");
    }

    @Test
    public void testCase5(){
        String username, password;
        username = "maor";
        password = "roam";
        Login login = new Login(username, password);
        Menu menu = new Menu();
        Assert.assertEquals(menu.chooseOption(5), "Hay 3 842 323 personas vacunadas completamente");
    }

    @Test
    public void testCase6(){
        String username, password;
        username = "maor";
        password = "roam";
        Login login = new Login(username, password);
        Menu menu = new Menu();
        Assert.assertEquals(menu.chooseOption(6), "Elija el centro de vacunacion para dar de alta");
    }

    @Test
    public void testCase7(){
        String username, password;
        username = "maor";
        password = "roam";
        Login login = new Login(username, password);
        Menu menu = new Menu();
        Assert.assertEquals(menu.chooseOption(7), "Elija el centro de vacunacion para dar de baja");
    }

    @Test
    public void testCase8(){
        String username, password;
        username = "maor";
        password = "roam";
        Login login = new Login(username, password);
        Menu menu = new Menu();
        Assert.assertEquals(menu.chooseOption(8), "Vuelva pronto!");
    }

    @Test
    public void testCase9(){
        String username, password;
        username = "maor";
        password = "roam";
        Login login = new Login(username, password);
        Menu menu = new Menu();
        Assert.assertEquals(menu.chooseOption(10), "No marco una opcion valida");
    }

    @Test
    public void testCase10(){
        String username, password;
        username = "maor";
        password = "roam";
        Login login = new Login(username, password);
        Menu menu = new Menu();
        Assert.assertEquals(menu.chooseOption(1), "Actualmente, 50% de personas estan vacunadas");
    }
};