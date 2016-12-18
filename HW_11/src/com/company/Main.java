package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        AList aList = new AList(8);
        aList.add(555);
        aList.add(225);
        aList.add(65);
        aList.add(750);
        aList.add(15);
      //  aList.addElemontForIndex(33,3);
      //  aList.removeToIndex(2);
       // aList.outAllElementsThroughtSeparator("rr");
//        aList.addRazdelenieElemen("test");


//
        System.out.println(aList.addRazdelenieElemen("test"));
//        System.out.println(aList.sortArr());
//        System.out.println(aList.sortArr());
//        System.out.println(aList.addRazdelenieElemen("frf"));
        System.out.println(aList.get(1));
        System.out.println(aList.get(2));
        System.out.println(aList.get(3));
        System.out.println(aList.get(4));
        System.out.println(aList.get(5));
//        System.out.println(aList.indexOf(750));
    }
}

//}
//    public static String numberToString(int num) {
//        if(num == 0) return "zero";
//        StringBuilder builder = new StringBuilder(num < 0 ? "minus" : "");
//        num = Math.abs(num);
//        String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
//                "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//
//        String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
//
//        String[] hundreds = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
//                "six hundred", "seven hundred", "eight hundred", "nine hundred"};
//
//        int millions = num/1_000_000;
//        int thousand = num/1_000%1_000;
//        int left = num%1_000;
//
//        if(millions > 0) {
//            builder.append(hundreds[millions/100] + " " + (millions%100 < 20 ? units[millions%100] : tens[millions%100/10] + " " + units[millions%10]) + " million ");
//        }
//        if(thousand > 0) {
//            builder.append(hundreds[thousand/100] + " " + (thousand%100 < 20 ? units[thousand%100] : tens[thousand%100/10] + " " + units[thousand%10]) + " thousand ");
//        }
//        if(left > 0) {
//            builder.append(hundreds[left/100] + " " + (left%100 < 20 ? units[left%100] : tens[left%100/10] + " " +  units[left%10]));
//        }
//        return builder.toString().trim();
//    }
//}
