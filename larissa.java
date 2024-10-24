import java.util.Scanner;
public class Exer01 {
    public static void main(String [] args){ 
        Scanner input = new Scanner (System.in);
        System.out.println("Informe um nûmero:");
        int num =input.nextInt();

        int (num <0){
            System.out.println(String.format("O número %d é negativo", num));
        }
    } else if (num > 0 ) {
        System.out.printrln(String.format("O número %d é positivo", num))
     }
     else {
        System.out.println(String.format("O número informado %d é igual a 0", num));
     }
}