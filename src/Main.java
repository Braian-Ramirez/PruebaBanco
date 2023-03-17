import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Usuario;
        int op;
        double montoDeposito, resultado, montoRetiro;
        System.out.println("Bienvenido a su banco en linea");
        System.out.println("Por favor ingrese su usuario: ");
        Usuario = scan.nextLine();

        Banco cuenta1 = new Banco();
        System.out.println("Su usuario es : " + cuenta1.getUsuario(Usuario));
        System.out.println("El saldo actual de la cuenta 1 es: " + cuenta1.getSaldo(10000));
        System.out.println("Seleccione una opción: \n 1. realizar consignación \n 2. realizar retiro\n 3. Salir");
        op = scan.nextInt();
        switch (op) {
            case 1 -> {
                System.out.println("Por favor ingrese el monto que desea consignar");
                montoDeposito = scan.nextDouble();
                resultado = cuenta1.getSaldo(10000) + montoDeposito;
                System.out.println("El nuevo saldo de cuenta 1 es: " + resultado);
                System.out.println("Transaccion finalizada");
            }
            case 2 -> {
                System.out.println("Por favor ingrese el monto que desea retirar");
                montoRetiro = scan.nextDouble();
                if(montoRetiro < cuenta1.getSaldo(10000)){
                resultado = cuenta1.getSaldo(10000) - montoRetiro;
                System.out.println("El nuevo saldo de cuenta 1 es: " + resultado);
                System.out.println("Transaccion finalizada");
                }else {
                    System.out.println("Saldo insuficiente");
                    System.out.println("Transaccion finalizada");
                }
            }
            case 3 -> {
                System.out.println("Su saldo es " + cuenta1.getSaldo(10000));
                System.out.println("Transaccion finalizada");}
        }








    }
}