import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    private ArrayList<Account> acct;
    private int numOfAccount = 0;

    public Customer (String firstName, String lastName) {
        acct = new ArrayList();
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Account getAccount(int index){
        return (Account)acct.get(index);
    }
    public void addAccount(Account acct) {
        this.acct.add(acct);
    }
    public int getNumOfAccount() {
        return acct.size();
    }

    @Override
    public String toString() {
        System.out.println(firstName+" "+lastName+" has "+getNumOfAccount()+" accounts.");
        return "";
    }
    public static void main(String[] args) {
        Customer cust = new Customer("Somsri", "Boonjing");
        Account acct1 = new Account(5000, "Somsri01");
        Account acct2 = new Account(3000, "Somsri02");
        cust.addAccount(acct1);
        cust.addAccount(acct2);
        // ทดลองฝากเงิน ถอนเงินในบัญชีต่างๆ
        cust.getAccount(0).withdraw(3000);
        cust.getAccount(1).deposit(3000);
        // แสดงข้อมูลของลูกค้า เช่น Somsri Boonjing has 2 accounts.
        System.out.println(cust);
        // ทดลองสร้างบัญชีและเพิEมบัญชีนัFนๆ ให้กับลูกค้า มากกว่า 5 บัญชี
        for (int i = 0; i < cust.getNumOfAccount(); i++) {
        cust.getAccount(i).showAccount();
        }
    }
}

