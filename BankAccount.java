import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Random;

public class BankAccount {
    private String owner;
    private int balance;
    private LocalDateTime opening;
    private boolean blocked;
    private String number;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0; // начальный баланс
        this.opening = LocalDateTime.now(); // текущая дата и время
        this.blocked = false; // счет не заблокирован
        this.number = generateNumber(); // генерация номера счета
    }

    public String generateNumber(){
        Random random = new Random();
        StringBuilder accNumber = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            accNumber.append(random.nextInt(10)); // цифра от 0 до 9
        }
        
        return accNumber.toString();
        
    }

    public boolean deposit(int amount){
        if (blocked | amount <= 0){
            return false;
        }
        balance += amount;
        return true;
    }

    public boolean withdraw(int amount){
        if (blocked | amount <= 0 | amount > balance){
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean transfer(BankAccount otherAccount,int amount){
        if (this.blocked | otherAccount.blocked | amount <= 0 | amount > balance){
            return false;
        }
        this.balance -= amount;
        otherAccount.balance += amount;
        return true;
    }

    public String toString() {
        return "BankAccount{" +
                "number = '" + number + '\'' +
                ", owner = '" + owner + '\'' +
                ", balance = " + balance +
                ", opening = " + opening +
                ", blocked = " + blocked +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        BankAccount that = (BankAccount) obj;
        
        return Objects.equals(number, that.number);
    }

    public int hashCode(){
        return Objects.hash(number);
    }

    public String getOwner(){
        return owner;
    }

    public int getBalance(){
        return balance;
    }

    public LocalDateTime getOpening(){
        return opening;
    }

    public boolean blocked(){
        return blocked;
    }

    public String getNumber(){
        return number;
    }

    public void setBlocked(boolean block){
        blocked = block;
    }
}
