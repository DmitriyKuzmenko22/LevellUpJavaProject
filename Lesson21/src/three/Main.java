package three;

/**
 * Created by java on 27.01.2017.
 */
public class Main {

    public static void main(String[] args) {
//        int n = 487;
//    }
//        public int recurs(int n){
//            if (n<=10) return n;
//            return (n/10)+n%10;

        Tree<Integer> tree = new BinaryTree<>(Integer::compare);
       // BinaryTree<Integer> tree = new BinaryTree<>(Integer::compare);
        tree.add(52);

        tree.add(67); //right
        tree.add(64); //left
        tree.add(58); //left

        tree.add(29); //left
        tree.add(1); //left
        tree.add(1); //none

        tree.add(14); //left


        tree.print();

        System.out.println("df "+tree.findValue(29));

        //tree.findValue(58);
    }

    }

