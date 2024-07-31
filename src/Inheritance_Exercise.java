import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Inheritance_Exercise {
    public static void main(String[] args){
        Account acc = new Account(2031, "Carlos", 5700.00);
        BusinessAccount bacc = new BusinessAccount(7831, "Diniz", 0.0, 500.00);

        // UPCASTING - Atribuição de um objeto da Subclasse para Superclasse
        // Deve-se notar a atribuição sempre, verifica-se do último para o primeiro
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING - Atribuição de um objeto da Superclasse para Subclasse
        // Subclasse             Casting          Superclasse
        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        // Verificando se é instância - instanceof
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("acc5 is instanceof BusinessAccount!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("update");
        }

        System.out.println(acc);
        System.out.println(bacc);
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
