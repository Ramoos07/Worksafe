package Service;

import DAO.CargoDAO;
import Model.Cargo;

import java.util.List;

public class CargoService {

    private final CargoDAO cargoDAO;

    public CargoService() {

        this.cargoDAO =
                new CargoDAO();
    }

    public List<Cargo> listarTodos() {

        return cargoDAO.listarTodos();
    }
}