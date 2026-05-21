package DAO;

import Model.Aso;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AsoDAO {

    private final Connection connection;

    public AsoDAO(Connection connection) {
        this.connection = connection;
    }

    // INSERT
    public void inserir(Aso aso) {

        String sql = """
                INSERT INTO aso
                (data_emissao, data_vencimento, tipo_aso,
                 resultado, id_colaborador, id_medico)
                VALUES (?, ?, ?, ?, ?, ?)
                """;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setDate(1, Date.valueOf(aso.getDataEmissao()));
            stmt.setDate(2, Date.valueOf(aso.getDataVencimento()));
            stmt.setString(3, aso.getTipoAso());
            stmt.setString(4, aso.getResultado());
            stmt.setLong(5, aso.getIdColaborador());
            stmt.setLong(6, aso.getIdMedico());

            stmt.executeUpdate();

            System.out.println("ASO inserido com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void atualizar(Aso aso) {

        String sql = """
                UPDATE aso
                SET data_emissao = ?,
                    data_vencimento = ?,
                    tipo_aso = ?,
                    resultado = ?,
                    id_colaborador = ?,
                    id_medico = ?
                WHERE id_aso = ?
                """;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setDate(1, Date.valueOf(aso.getDataEmissao()));
            stmt.setDate(2, Date.valueOf(aso.getDataVencimento()));
            stmt.setString(3, aso.getTipoAso());
            stmt.setString(4, aso.getResultado());
            stmt.setLong(5, aso.getIdColaborador());
            stmt.setLong(6, aso.getIdMedico());
            stmt.setLong(7, aso.getIdAso());

            stmt.executeUpdate();

            System.out.println("ASO atualizado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deletar(Long id) {

        String sql = "DELETE FROM aso WHERE id_aso = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setLong(1, id);

            stmt.executeUpdate();

            System.out.println("ASO deletado com sucesso!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SELECT BY ID
    public Aso buscarPorId(Long id) {

        String sql = "SELECT * FROM aso WHERE id_aso = ?";

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                Aso aso = new Aso();

                aso.setIdAso(rs.getLong("id_aso"));
                aso.setDataEmissao(
                        rs.getDate("data_emissao").toLocalDate());
                aso.setDataVencimento(
                        rs.getDate("data_vencimento").toLocalDate());
                aso.setTipoAso(rs.getString("tipo_aso"));
                aso.setResultado(rs.getString("resultado"));
                aso.setIdColaborador(rs.getLong("id_colaborador"));
                aso.setIdMedico(rs.getLong("id_medico"));

                return aso;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // SELECT ALL
    public List<Aso> listarTodos() {

        List<Aso> lista = new ArrayList<>();

        String sql = "SELECT * FROM aso";

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {

                Aso aso = new Aso();

                aso.setIdAso(rs.getLong("id_aso"));
                aso.setDataEmissao(
                        rs.getDate("data_emissao").toLocalDate());
                aso.setDataVencimento(
                        rs.getDate("data_vencimento").toLocalDate());
                aso.setTipoAso(rs.getString("tipo_aso"));
                aso.setResultado(rs.getString("resultado"));
                aso.setIdColaborador(rs.getLong("id_colaborador"));
                aso.setIdMedico(rs.getLong("id_medico"));

                lista.add(aso);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}