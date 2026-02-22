//Para leer las entradas
import java.util.Scanner;

public class Calculadora {

    private static final Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //iniciamos con 0 para que empieza el ciclo while
        int operacion = 0;
        
        while (operacion != 7){
            System.out.println("----------Calculadora----------");
            System.out.println("Que operacion deseas realizar: ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raiz");
            System.out.println("7. Salir");
            
            try{
                operacion = sc.nextInt();
                
                //Opción de terminar el programa
                if(operacion == 7){
                    System.out.println("Programa finalizado");
                    break;
                }
                
                //tipo double para que admita la función Math.pow y es para un resultado más exacto.
                double a;
                double b;
                double resultado;
                
                //Pedimos el valor de a
                System.out.print("Ingrese el valor a: ");
                a = sc.nextDouble();
                
                //para la raiz solo necesitaremos el valor de a
                if(operacion == 6 ){
                    b = 0;
                }else{
                    
                    //Pedimos el valor de b
                    System.out.print("Ingrese el valor b: ");
                    b = sc.nextDouble();
                }
                
                switch(operacion){
                    //SUMA
                    case 1 ->{
                        resultado = a + b;
                        System.out.println("El restulado de la suma es: " + resultado);
                    }
                    //RESTA
                    case 2 ->{
                        resultado = a - b;
                        System.out.println("El resultado de la resta es: " + resultado);
                    }
                    //MULTIPLICACIÓN
                    case 3 ->{
                        resultado = a * b;
                        System.out.println("El resultado de la multiplicación es: " + resultado);
                    }
                    //DIVISIÓN
                    case 4 ->{
                        if(b==0){
                            System.out.println("No se puede dividir entre cero.");
                        }else{
                            resultado = a / b;
                            System.out.println("El resultado de la división es: " + resultado);
                        }
                    }
                    //POTENCIA
                    case 5 ->{
                        resultado = Math.pow(a,b);
                        System.out.println("El resultado de la potencia es: " + resultado);
                    }
                    //RAIZ
                    case 6 ->{
                        if(a >= 0){
                            resultado = Math.sqrt(a);
                            System.out.println("El resultado de la raiz es: " + resultado);
                        }else{
                            System.out.println("No existe raiz negativa");
                        }
                    }
                    default ->{ System.out.println("Opción Invalida"); }
                }
            }catch(Exception e){
                //Opción invalida en caso de que se ingrese un String
                System.out.println("Opcion invalida");
                //Limpiamos las entradas
                sc.nextLine();
            }
        }
    }
    
}
