public class CheckingAccount extends Account {
    private double credit;
    public CheckingAccount(){
        super(0.0, "");
    }
    public CheckingAccount(double balance, String name, double credit){
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit){
        if (credit > 0){
            this.credit = credit;
        }else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit(){
        return credit;
    }
    @Override
    public void withdraw(double a){
        if (getBalance() - a >= 0){
            setBalance(getBalance()- a);
            System.out.println(String.format("%.1f baht is withdrawn from %s and your credit balance is %.1f.", a, getName(), getCredit()));
        }else if ((getBalance() - a < 0) && ((getBalance() + getCredit())- a) >= 0){
            setBalance(getBalance()- getBalance());
            setCredit(getCredit() - a);
            System.out.println(String.format("%.1f baht is withdrawn from %s and your credit balance is %.1f.", a, getName(), getCredit()));
        }else{
            System.out.println("Not enough money!");
        }
    }
    public void withdraw(String a){
        this.withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString(){
        System.out.print(String.format("The %s account has %.1f baht and %.1f credits.", getName(), getBalance(), getCredit()));
        return "";
    }

}
