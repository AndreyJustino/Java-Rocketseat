package banco.entities;
import java.time.LocalDate;

public class Conta {
    private int numberAccount;
    private int numberAgent;
    private String nameClient;
    private LocalDate dateBirth;
    private double balance;
    private boolean active = true;

    public Conta(int numberAccount, double balance, LocalDate dateBirth, String nameClient, int numberAgent) {
        this.numberAccount = numberAccount;
        this.balance = balance;
        this.dateBirth = dateBirth;
        this.nameClient = nameClient;
        this.numberAgent = numberAgent;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public int getNumberAgent() {
        return numberAgent;
    }

    public void setNumberAgent(int numberAgent) {
        this.numberAgent = numberAgent;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numberAccount=" + numberAccount +
                ", numberAgent=" + numberAgent +
                ", nameClient='" + nameClient + '\'' +
                ", dateBirth=" + dateBirth +
                ", balance=" + balance +
                '}';
    }

    public void sacar(double value){
        balance = balance - value;
    };

    public void transferir(Conta contaDestino, double value){
        contaDestino.setBalance(value);
        sacar(value);
    }

    public void cancelar(String justificativa){
        setActive(false);

    }

}
