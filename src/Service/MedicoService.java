package Service;

import DAO.MedicoDAO;
import Model.Medico;

import java.util.List;

public class MedicoService {

    private final MedicoDAO medicoDAO;

    public MedicoService() {

        this.medicoDAO =
                new MedicoDAO();
    }

    public List<Medico> listarTodos() {

        return medicoDAO.listarTodos();
    }
}