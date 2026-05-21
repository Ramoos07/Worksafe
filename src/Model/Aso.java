package Model;

import java.sql.Date;

public class Aso {
    private int idAso;
    private int idColaborador;
    private int idMedico;
    private String tipoAso;
    private Date dataEmissaoAso;
    private Date dataValidade;
    private String resultadoAso;
    private String observacaoAso;

    public Aso() {
    }

    public Aso(int idAso, int idColaborador, int idMedico, String tipoAso,
               Date dataEmissaoAso, Date dataValidade, String resultadoAso, String observacaoAso) {
        this.idAso = idAso;
        this.idColaborador = idColaborador;
        this.idMedico = idMedico;
        this.tipoAso = tipoAso;
        this.dataEmissaoAso = dataEmissaoAso;
        this.dataValidade = dataValidade;
        this.resultadoAso = resultadoAso;
        this.observacaoAso = observacaoAso;
    }

    public int getIdAso() {
        return idAso;
    }
    public void setIdAso(int idAso) {
        this.idAso = idAso;
    }

    public int getIdColaborador() {
        return idColaborador;
    }
    public void setIdColaborador(int idColaborador) {
        this.idColaborador = idColaborador;
    }

    public int getIdMedico() {
        return idMedico;
    }
    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getTipoAso() {
        return tipoAso;
    }
    public void setTipoAso(String tipoAso) {
        this.tipoAso = tipoAso;
    }

    public Date getDataEmissaoAso() {
        return dataEmissaoAso;
    }
    public void setDataEmissaoAso(Date dataEmissaoAso) {
        this.dataEmissaoAso = dataEmissaoAso;
    }

    public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getResultadoAso() {
        return resultadoAso;
    }
    public void setResultadoAso(String resultadoAso) {
        this.resultadoAso = resultadoAso;
    }

    public String getObservacaoAso() {
        return observacaoAso;
    }
    public void setObservacaoAso(String observacaoAso) {
        this.observacaoAso = observacaoAso;
    }
}