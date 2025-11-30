public class task_1 {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount("Jhon Brown");
        BankAccount acc2 = new BankAccount("Jane Kilt");
        BankAccount acc3 = new BankAccount("Anne Smith");

        System.out.println("Account 1: " + acc1);
        System.out.println("Account 2: " + acc2);
        System.out.println("Account 3: " + acc3);
        
        boolean depositRes = acc1.deposit(15000);
        System.out.println("Account refill:" + depositRes);
        System.out.println("Balance acc1 = " + acc1.getBalance());
        System.out.println("Balance acc2 = " + acc2.getBalance());
        System.out.println("Balance acc3 = " + acc3.getBalance());

        boolean withdrawRes = acc1.withdraw(5000);
        System.out.println("Account withdrawal:" + withdrawRes);
        System.out.println("Balance acc1 = " + acc1.getBalance());
        System.out.println("Balance acc2 = " + acc2.getBalance());
        System.out.println("Balance acc3 = " + acc3.getBalance());

        boolean transferRes = acc1.transfer(acc2, 7000);
        System.out.println("Transfer:" + transferRes);
        System.out.println("Balance acc1 = " + acc1.getBalance());
        System.out.println("Balance acc2 = " + acc2.getBalance());
        System.out.println("Balance acc3 = " + acc3.getBalance());

        System.out.println("Acc1 number = " + acc1.getNumber());
        System.out.println("Acc2 number = " + acc2.getNumber());
        System.out.println("Acc3 number = " + acc3.getNumber());

        System.out.println("acc1 = acc2: " + acc1.equals(acc2));
        System.out.println("acc2 = acc3: " + acc2.equals(acc3));
        System.out.println("acc3 = acc1: " + acc3.equals(acc1));

        System.out.println("Hasncode acc1 = " + acc1.hashCode());
        System.out.println("Hasncode acc2 = " + acc2.hashCode());
        System.out.println("Hasncode acc3 = " + acc3.hashCode());

        acc1.setBlocked(true);
        boolean operation = acc1.deposit(5000);
        System.out.println("Operation with blocked account:" + operation);
    }
}
