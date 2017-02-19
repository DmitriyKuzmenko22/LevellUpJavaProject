import DMDSoft_Solutions.Factory;

import java.io.*;

/**
 * Created by Дмитрий on 18.02.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
  
        Factory DMDSoft_Solutions = new Factory("DMDSoft_Solutions");
        DMDSoft_Solutions.add("DEVELOPER",0,"Kuzmenko","Dmitriy",1900);
        DMDSoft_Solutions.add("DEVELOPER",1,"Petrov","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",0,"Petrov","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",1,"Ivanod","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",2,"Petrov2","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",3,"Ivanod2","Ivan",900);
        DMDSoft_Solutions.add("DESINGER",4,"Petrov3","Ivan",900);
        DMDSoft_Solutions.getAll();
        DMDSoft_Solutions.get("DEVELOPER",0);
        DMDSoft_Solutions.getis("DEVELOPER");
    }
    }

