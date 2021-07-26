package cs.lab;
import java.util.Scanner;
import java.util.logging.Logger;

public class Login {
    static final Logger logger = Logger.getLogger(Login.class.getName());

    private String username;
    private String password;

    public Login(){
        Scanner scanner = new Scanner(System.in);
        logger.info("Bienvenido!!!");
        logger.info("Inicie sesión por favor: ");
        logger.info("Usuario: ");
        username = scanner.nextLine();
        logger.info("Contraseña: ");
        password = scanner.nextLine();
        scanner.close();
        if(password.equals(reverseWord(username))){
            logger.info("Usuario autenticado correctamente");
        }else{
            logger.info("Usuario autenticado incorrectamente :(");
        }
    }

    public Login(String username){
        this.username = username;
        this.password = reverseWord(username);
    }

    public Login(String username, String password){
        /*logger.info("Bienvenido!!!");
        logger.info("Inicie sesión por favor: ");
        logger.info("Usuario: ");*/
        this.username = username;
        //logger.info("Contraseña: ");
        this.password = password;
        /*if(this.password.equals(reverseWord(this.username))){
            logger.info("Usuario autenticado correctamente");
        }else{
            logger.info("Usuario autenticado incorrectamente :(");
        }*/
    }

    public String statusLogin(){
        if(password.equals(reverseWord(this.username))){
            return "Usuario autenticado correctamente";
        }
        return "Usuario autenticado incorrectamente";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static String reverseWord(String s){
        if(s.isEmpty()){
            return s;
        }
        return reverseWord(s.substring(1)) +  s.charAt(0);
    }
}
