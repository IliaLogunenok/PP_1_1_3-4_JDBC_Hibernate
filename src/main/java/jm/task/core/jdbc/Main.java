package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao dao = new UserDaoJDBCImpl();
        dao.createUsersTable();
        dao.saveUser("Lilia", "Per", (byte) 30);
        dao.saveUser("Olga", "Iva", (byte) 48);
        dao.saveUser("Aleksander", "Petrov", (byte) 48);
        dao.saveUser("Igor", "Ivanov", (byte) 48);
        dao.getAllUsers().forEach(System.out::println);
        dao.cleanUsersTable();
        dao.dropUsersTable();
    }
}
