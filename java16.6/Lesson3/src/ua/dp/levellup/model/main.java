package ua.dp.levellup.model;

/**
 * Created by java on 11.11.2016.
 */
public class main {
    static String lessonNumber = "lesson3";

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.perimetr = 16;
        s1.color = "black";
        s1.side = 4;
        System.out.println(s1);

        Square s2 = new Square(5);
        //s2.perimetr=25;

        System.out.println(s2.color + s2.getPerimetr());

        //System.out.println(s1.getPerimetr());
//        System.out.println("Begin program");
//        String global = "Global Var";
//        {
//            String local = "Local Var";
//            {
//                System.out.println("Local Scope : ");
//                System.out.println("global=" + global);
//                System.out.println("local=" + local);
//            }
//        }
//        System.out.println("_____________");
//        System.out.println("Global Scope :");
//        System.out.println("global=" + global);
//        //System.out.println("local=" + local);
//        System.out.println();
//        System.out.println("End program");

    }

}

