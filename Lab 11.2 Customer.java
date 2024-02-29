public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    public Customer(){
        this("", "", null);
    }
    public Customer(String firstName, String lastName){
        this(firstName, lastName, null);
    }
    public Customer(String firstName, String lastName, CheckingAccount acct){
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setAcct(CheckingAccount acct){
        this.acct = acct;
    }
    public CheckingAccount getAcct(){
        return acct;
    }
    @Override
    public String toString(){
        if (this.acct == null){
            System.out.print(String.format("%s %s doesn’t have account.", getFirstName(), getLastName()));
        }else{
            System.out.print(String.format("The %s account has %.1f baht and %.1f credits.", getFirstName(), this.acct.getBalance(), this.acct.getCredit()));
        }
        return "";
    }
    public boolean equals(Customer c){
        return ((this.getFirstName().equals(c.getFirstName())) && (this.getLastName().equals(c.getLastName())));
    }
}
