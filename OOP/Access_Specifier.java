import java.util.*;
public class Access_Specifier {
    public static void main(String args[]){
        Bank bank=new Bank();
        bank.Username="Rohit";
        //bank.Password=2424;  not accessble because Password is set in private access specifier.
        bank.setPass(342352);
        System.err.println(bank.Username);
    }
}

class Bank{
    public String Username;
    private int Password;
    public void setPass(int newPass){
        Password=newPass;
    }
}
