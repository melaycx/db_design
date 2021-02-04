package cn.edu.zjut.po;

public class ReaderAccount {
    String account;
    String password;

    public ReaderAccount(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public ReaderAccount(){}

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
