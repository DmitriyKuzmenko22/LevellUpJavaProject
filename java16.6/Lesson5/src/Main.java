public class Main {

    public static void main(String[] args) {



        int[] arr = {1,2,3};

        modArr(arr);

    }
    public static int[] modArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
            System.out.println(arr[i]);
        }
        return arr;
    }
}

