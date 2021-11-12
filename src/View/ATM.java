package View;
import Model.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ATM
{
    public static void Operation(Customer customer1, Customer customer2)
    {
        Scanner sc = new Scanner(System.in);
        int input = 0;
        double amount = 0.0;

        while (input != 5)
        {
            System.out.println("BIENVANIDO AL CAJERO AUTOMÁTICO. \n Por favor, seleccione una de las siguientes opciones:");
            System.out.println("1. Consulta de saldo.\n 2. Depositar dinero. \n 3. Retirar dinero. \n 4. Transferir dinero. \n 5. Salir");

            input = sc.nextInt();

            if(input <1 || input > 5)
            {
                System.out.println("Por favor, seleccione una opción válida");
            }
            else
            {
                switch (input)
                {
                    case 1:

                        System.out.println("Su saldo actual es $" + customer1.getAccountBalance());
                        break;

                    case 2:
                        System.out.println("Introduzca la cantidad de dinero a depositar:");
                        amount = sc.nextDouble();
                        customer1.Deposit(amount);
                        System.out.println("Ha depositado correctamente " + amount + "\nSu saldo actual es $" + customer1.getAccountBalance());
                        break;

                    case 3:
                        System.out.println("Introduzca la cantidad de dinero a retirar:");
                        amount = sc.nextDouble();
                        customer1.Withdraw(amount);
                        System.out.println("Ha retirado correctamente " + amount + "\nSu saldo actual es $" + customer1.getAccountBalance());
                        break;

                    case 4:
                        System.out.println("Desea realizar una transferencia a " + customer2.getName() + ". \n 1. Confirmar. \n 2. Anular.");
                        input = sc.nextInt();

                        if(input == 1)
                        {
                            System.out.println("Indique el importe a transferir: ");
                            amount = sc.nextDouble();
                            if(customer1.getAccountBalance() > amount)
                            {
                                customer1.Withdraw(amount);
                                customer2.Deposit(amount);
                                System.out.println("La transferencia ha sido exitosa. Su saldo actual es " + customer1.getAccountBalance());
                            }
                            else
                            {
                                System.out.println("Lo sentimos. Usted no tiene dinero suficiente para realizar la operación.");
                            }

                        }
                        break;

                }
            }

        }

        System.out.println("MUCHAS GRACIAS POR UTILIZAR NUESTROS SERVICIOS");

    }
}
