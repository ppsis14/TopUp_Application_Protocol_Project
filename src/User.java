/*
    สมาชิกกลุ่ม
    1. นางสาวฑิฆัมพร    สิมอุด  5910401033
    2. นางสาววิภาวดี    ม่อนคุต 5910406451

 */

public class User {
    private String username;
    private String password;
    private DebitCard debitCard;

    public User(String username, String password, DebitCard debitCard) {
        this.username = username;
        this.password = password;
        this.debitCard = debitCard;

    }

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

    public DebitCard getDebitCard() {
        return debitCard;
    }

    public void setDebitCard(DebitCard debitCard) {
        this.debitCard = debitCard;
    }
}
