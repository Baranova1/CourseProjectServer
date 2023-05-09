package by.arina.coourseproject.server.dao;

import java.util.Map;

public interface UserDAO {
    Map<String, String> findUser(Map<String, String> map);
    Map<String, String> findUser(int user);
    Map<Integer, Map<String, String>> findUsers();
    void deleteUser(int id);
    void updateUser(Map<String,String> user);
    void addUser(Map<String,String> user);
}
