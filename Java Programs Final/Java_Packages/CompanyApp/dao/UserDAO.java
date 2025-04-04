package dao;

public class UserDAO {
    public String getUserById(int id) {
        if (id == 1) return "Alice";
        if (id == 2) return "Bob";
        return "User not found";
    }
}
