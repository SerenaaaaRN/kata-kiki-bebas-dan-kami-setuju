package src.model;

public class User {
    // Class untuk User nanti diisi dengan atribut nya
    private String nama;
    private int saldo;
    private String email;
    private String password;
    
    //Constructor
    public User(String nama, int saldo, String email, String password) {
        this.nama = nama;
        this.saldo = saldo;
        this.email = email;
        this.password = password;
    }

    //getter setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}
