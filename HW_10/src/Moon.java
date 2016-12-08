/**
 * Created by Dmitriy on 08.12.2016.
 */
public class Moon extends Planet {

    public String p7="Луна";

    public Moon(String p1, String p2, String p3, String p4, String p5, String p6, String p7) {
        super(p1, p2, p3, p4, p5, p6);
        this.p7 = p7;
    }
    public Moon(){

    }

    @Override
    public int Kolich() {
        String[] arr = new String[15];
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        arr[3] = p4;
        arr[4] = p5;
        arr[5] = p6;
        arr[6] = p7;

        int kol =0;

        for (int i=0; i<arr.length;i++){
            if(arr[i]!=null){
                kol++;
            }

        }
        System.out.println(kol);
        return kol;

    }

    @Override
    public String toString() {
        return "new planet {" +
                "p7='" + p7 + '\'' +
                '}';
    }
}
