package cn.edu.zjut.po;

public class UserAccount {
    String account;
    String password;
    int type;//0为manager，1为reader

    public UserAccount(){}

    public UserAccount(String account, String password, int type) {
        this.account = account;
        this.password = password;
        this.type = type;
    }

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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserAccount{" +
                "account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", type=" + type +
                '}';
    }
}
