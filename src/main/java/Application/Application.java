package Application;

import Util.Plus;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootConfiguration
public class Application {
    public static void main(String[] args){
        int x = 3;
        int y = 1;
        System.out.println(Plus.calc(x, y));
        System.out.println("dev branch!");
    }
}
