package model;

public class User {
    private String username;
    private String password;
    private int saldo;
    private String role;

    // Constructor
    public User(String username, String password, int saldo, String role) {
        this.username = username;
        this.saldo = saldo;
        this.password = password;
        this.role = role;
    }

    // getter setter
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
