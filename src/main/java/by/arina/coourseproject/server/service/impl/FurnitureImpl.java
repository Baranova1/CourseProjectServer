package by.arina.coourseproject.server.service.impl;

import by.arina.coourseproject.server.dao.DAOProvider;
import by.arina.coourseproject.server.dao.FurnitureDAO;
import by.arina.coourseproject.server.service.FurnitureService;

import java.util.Map;

public class FurnitureImpl implements FurnitureService {
    private final FurnitureDAO furnitureDAO = DAOProvider.getInstance().getFurnitureDAO();

    public Map<Integer, Map<String, String>> showFurniture() {
        return furnitureDAO.showFurniture();
    }

    @Override
    public void deleteFurniture(int id) {
        furnitureDAO.deleteFurniture(id);
    }

    @Override
    public void addFurniture(Map<String, String> furniture) {
        furnitureDAO.addFurniture(furniture);
    }

    @Override
    public void updateFurniture(Map<String, String> furniture) {
        furnitureDAO.updateFurniture(furniture);
    }

    @Override
    public int checkQuantity(int furniture, int quantity) {
        return furnitureDAO.checkQuantity(furniture, quantity);
    }

    @Override
    public void editQuantity(int furniture, int quantity) {
        furnitureDAO.editQuantity(furniture, quantity);
    }


}
