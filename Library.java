package Lib_Management;

public class Library {
    private int id;
    private String bname;
    private String auth;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", bname=" + bname +
                ", auth=" + auth +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }
}
