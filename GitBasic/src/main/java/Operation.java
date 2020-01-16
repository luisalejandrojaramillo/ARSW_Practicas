import java.util.Scanner;
public class Operation {
    public static void main(String args[]){
        Anagram anagram = new Anagram();
        Scanner x = new Scanner(System.in);
        Scanner y = new Scanner(System.in);
        String palabraUno = x.next();
        String palabraDos = y.next();
        System.out.println(anagram.comparation(palabraUno,palabraDos));
    }
}
