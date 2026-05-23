package Service;

import DAO.TipoExameDAO;
import Model.TipoExame;

import java.util.List;

public class TipoExameService {

    private final TipoExameDAO tipoExameDAO;

    public TipoExameService() {

        this.tipoExameDAO =
                new TipoExameDAO();
    }

    public List<TipoExame> listarTodos() {

        return tipoExameDAO.listarTodos();
    }
}