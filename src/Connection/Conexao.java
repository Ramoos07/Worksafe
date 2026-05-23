package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static Conexao instance;
    private Connection conexao;

    private static final String URL =
            "jdbc:postgresql://db.bvppxnzbndjmbysrygxt.supabase.co:5432/postgres?sslmode=require";

    private static final String USER = "postgres";
    private static final String PASSWORD = "projetobancodedados";

    private Conexao() {
        conectar();
    }

    public static synchronized Conexao getInstance() {
        if (instance == null) {
            instance = new Conexao();
        }
        return instance;
    }

    private void conectar() {
        try {

            if (conexao == null || conexao.isClosed()) {
                conexao = DriverManager.getConnection(URL, USER, PASSWORD);
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao conectar com banco: " + ex.getMessage(), ex);
        }
    }

    public Connection getConexao() {

        try {

            if (conexao == null || conexao.isClosed()) {
                conectar();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao validar conexão: " + ex.getMessage(), ex);
        }

        return conexao;
    }

    public void fecharConexao() {

        try {

            if (conexao != null && !conexao.isClosed()) {
                conexao.close();
            }

        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao fechar conexão: " + ex.getMessage(), ex);
        }
    }
}