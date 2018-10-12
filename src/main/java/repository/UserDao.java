package repository;

import pojo.User;
import repository.connectionManager.ConnectionManager;
import repository.connectionManager.ConnectionManagerJdbcImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserDao {
    private static ConnectionManager connectionManager =
            ConnectionManagerJdbcImpl.getInstance();

    private static UserDao instance = new UserDao();

    private List<User> model;

    public static UserDao getInstance() {
        return instance;
    }

    private UserDao() {
        model = new ArrayList<>();
    }

    public void add(User user) {
        model.add(user);
    }

    public List<String> list() {
        return model.stream().map(User::getName).collect(Collectors.toList());
    }
}
