import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int n1;
    int n2;
    int answer;
        Scanner in = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = in.nextLine();
    int count =0;
    while(count<5){
        n1 =(int)(Math.random()*100);
        n2 = (int)(Math.random()*100);
        System.out.println(n1 + "+" + n2 + "=");
        answer = in.nextInt();
        writeToText(answer, n1, n2, name);
        count++;
    }
    }

public static boolean ans(int ans, int n1, int n2){
int c = n1 + n2;
if (ans==c){
    return true;
}
return false;
}
public static void writeToText(int answer, int n1, int n2, String path) {
String n = path + "-answers.txt";
    try (FileWriter outStream = new FileWriter(n, true)) {
        boolean check = ans(answer, n1, n2);
        outStream.write("question: " + n1 + " + " + n2 + " = " + answer + " " + check + "\n");
        System.out.println();
    } catch (IOException e) {
        System.out.println(e);
    }
}
    }
