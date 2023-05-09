package by.arina.coourseproject.server.service.impl;

import by.arina.coourseproject.server.dao.DAOProvider;
import by.arina.coourseproject.server.dao.FurnitureDAO;
import by.arina.coourseproject.server.dao.OrderDAO;
import by.arina.coourseproject.server.dao.UserDAO;
import by.arina.coourseproject.server.service.UserService;

import java.util.Map;

public class UserImpl implements UserService {
    private final UserDAO userDAO = DAOProvider.getInstance().getUserDAO();
    private final FurnitureDAO furnitureDAO = DAOProvider.getInstance().getFurnitureDAO();
    private final OrderDAO orderDAO = DAOProvider.getInstance().getOrderDAO();

    @Override
    public Map<String, String> findUser(Map<String, String> map) {
        return userDAO.findUser(map);
    }

    @Override
    public Map<String, String> findUser(int user) {
        return userDAO.findUser(user);
    }

    @Override
    public Map<Integer, Map<String, String>> findUsers() {
        return userDAO.findUsers();
    }

    @Override
    public void addUser(Map<String, String> user) {
        userDAO.addUser(user);
    }

    @Override
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Override
    public void updateUser(Map<String,String> user) {
        userDAO.updateUser(user);
    }

    @Override
    public int calculateProfit() {
        int money = orderDAO.calculateProfit();
        int expenses = furnitureDAO.calculateExpenses() + orderDAO.calculateExpenses();
        int profit = money - expenses;
        return profit;
    }


}
