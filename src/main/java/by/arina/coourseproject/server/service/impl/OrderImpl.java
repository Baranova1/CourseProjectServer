package by.arina.coourseproject.server.service.impl;

import by.arina.coourseproject.server.dao.OrderDAO;
import by.arina.coourseproject.server.dao.impl.SQLOrderDAO;
import by.arina.coourseproject.server.service.OrderService;

import java.util.Map;

public class OrderImpl implements OrderService {
    private final OrderDAO orderDAO = new SQLOrderDAO();

    @Override
    public Map<Integer, Map<String, String>> showUserOrders(int user) {
        return orderDAO.showUserOrders(user);
    }

    @Override
    public Map<Integer, Map<String, String>> showOrders() {
        return orderDAO.showOrders();
    }

    @Override
    public boolean createOrder(Map<String, String> order) {
        orderDAO.createOrder(order);
        return true;
    }


    @Override
    public int calculateProfitByYear() {
        int money = orderDAO.calculateProfitByYear();
        int expenses = orderDAO.calculateExpensesByYear();
        int profit = money - expenses;
        return profit;
    }

    @Override
    public int calculateProfitByMonth() {
        int money = orderDAO.calculateProfitByMonth();
        int expenses = orderDAO.calculateExpensesByMonth();
        int profit = money - expenses;
        return profit;
    }

    @Override
    public Map<String, Integer> calculateProfitByAllMonths() {
        return orderDAO.calculateProfitByAllMonths();
    }
}
