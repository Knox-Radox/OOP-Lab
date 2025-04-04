package app;

import dao.UserDAO;

public class MainApp {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        System.out.println("User ID 1: " + userDAO.getUserById(1));
        System.out.println("User ID 3: " + userDAO.getUserById(3));
    }
}
