package cn.edu.zjut.po;

public class ManagerAccount {
    String password;
    String account;

    @Override
    public String toString() {
        return "ManagerAccount{" +
                "password='" + password + '\'' +
                ", account='" + account + '\'' +
                '}';
    }

    public ManagerAccount(String account, String password) {
        this.password = password;
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    public ManagerAccount(){}
}
