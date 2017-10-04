package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println("write 'from': ");
        int a = Integer.parseInt(bufferedReader.readLine());
        System.out.println("write 'until': ");
        int b = Integer.parseInt(bufferedReader.readLine());
        System.out.println("write interval: ");
        int h = Integer.parseInt(bufferedReader.readLine());;
        double function;

        ArrayList<String[]> result = new ArrayList<String[]>();
        String[] first  = {"x"+"\t","\t" +"y"};
        result.add(first);

        for (int i = a; i <= b ; i+=h) {
            function = Math.tan(2 * i - 3);
            String[] temp = {Integer.toString(i) + " \t","\t" + Double.toString(function)};
            result.add(temp);
        }
        for (String i[]:result){
            System.out.println(Arrays.deepToString(i));
        }
        }
}
