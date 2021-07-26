package cs.lab;

import java.util.logging.Logger;

public class Main {
    static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args){
        Login login = new Login();
        Menu menu = new Menu();
        String response = login.statusLogin();
        if(response.equals("Usuario autenticado correctamente")){
            menu.displayMenu();
        }else{
            logger.info("Contraseña incorrecta, vuelva a intentarlo");
        }

    }

}
