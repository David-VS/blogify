package be.ehb.blogify.model;

public class User {

    private String username;
    private String email;
    private String password;
    private String phonenr;
    private String role;

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPhonenr() {
        return phonenr;
    }

    public void setPhonenr(String phonenr) {
        this.phonenr = phonenr;
    }

    public String getRol() {
        return role;
    }

    public void setRol(String role) {
        this.role = role;
    }
}
