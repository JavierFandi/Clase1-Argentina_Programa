import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 15;
        
        //Ejercicio A
        System.out.println("Numeros entre el 5 y el 15:");
        
        while(num1 != num2)
        {
            
            System.out.print(" "+num1+",");
            num1++;
        
        }
        
        num1 = 5;
        
        //Ejercicio B
        System.out.println("\nNumeros pares:");
        
        while(num1 != num2)
        {
            if(num1%2==0)
            {
                System.out.print(" "+num1+",");
            }
            num1++;
        
        }
        
        System.out.print("\n----------------------");
        
        //Ejercicio C
        num1 = 5;
        int opc;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nMostrar:");
        System.out.println("1. Numeros Pares entre 5 y 15.");
        System.out.println("2. Numeros Impares entre 5 y 15.");
        System.out.print("Opcion: ");
        opc = sc.nextInt();
        
        switch(opc){
            
            case 1: System.out.println("Mostrando numeros pares:");
                while(num1 != num2)
                {
                    if(num1%2==0)
                    {
                        System.out.print(" "+num1+",");
                    }
                    num1++;
                }
            break;
            
            case 2: System.out.println("Mostrando numeros impares");
                while(num1 != num2)
                {
                    if(num1%2!=0)
                    {
                        System.out.print(" "+num1+",");
                    }
                    num1++;
                }
            break;
        }
        
        System.out.print("\n----------------------");
        
        //Ejercicio D
        System.out.println("\nNumeros Pares al reves: ");
        
        for(int i=15; i>=5; i--){
        
            if(i%2==0)
            { 
                System.out.print(" "+i+",");
            }
        } 
    }
}