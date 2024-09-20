package models;

public class User {
    private int userId;
    private String username;
    private String email;
    private String password;
    private String registrationDate;

    // Constructor vacío
    public User() {
    }

    // Constructor con parámetros
    public User(int userId, String username, String email, String password, String registrationDate) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    // Getters y Setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    // Método toString para representar al usuario
    @Override
    public String toString() {
        return "User [userId=" + userId + ", username=" + username + ", email=" + email
                + ", registrationDate=" + registrationDate + "]";
    }
}