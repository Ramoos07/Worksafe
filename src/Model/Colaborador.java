package Model;

import java.util.Date;

public class Colaborador {
    private int idColaborador;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private Date dataAdmissao;
    private String status;
    private int idEmpresa;
    private int idCargo;

    public Colaborador() {
    }

    public Colaborador(int idColaborador, String nome, String cpf, Date dataNascimento,
                       Date dataAdmissao, String status, int idEmpresa, int idCargo) {
        this.idColaborador = idColaborador;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.status = status;
        this.idEmpresa = idEmpresa;
        this.idCargo = idCargo;
    }


    public int getIdColaborador() {
        return idColaborador;
    }
    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }
    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdCargo() {
        return idCargo;
    }
    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
}