package br.com.alura.conversor.modelos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Cambio {
    @SerializedName("result")
    private String resultado;
    @SerializedName("documentation")
    private String documentacao;
    @SerializedName("terms_of_use")
    private String termosDeUso;
    @SerializedName("time_last_update_unix")
    private long ultimaAtualizacaoUnix;
    @SerializedName("time_last_update_utc")
    private String ultimaAtualizacaoUtc;
    @SerializedName("time_next_update_unix")
    private long proximaAtualizacaoUnix;
    @SerializedName("time_next_update_utc")
    private String proximaAtualizacaoUtc;
    @SerializedName("base_code")
    private String codigoBase;
    @SerializedName("conversion_rates")
    private Map<String, Double> taxasDeCambio;

    public Map<String, Double> getTaxasDeCambio() {
        return taxasDeCambio;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(String documentacao) {
        this.documentacao = documentacao;
    }

    public String getTermosDeUso() {
        return termosDeUso;
    }

    public void setTermosDeUso(String termosDeUso) {
        this.termosDeUso = termosDeUso;
    }

    public long getUltimaAtualizacaoUnix() {
        return ultimaAtualizacaoUnix;
    }

    public void setUltimaAtualizacaoUnix(long ultimaAtualizacaoUnix) {
        this.ultimaAtualizacaoUnix = ultimaAtualizacaoUnix;
    }

    public String getUltimaAtualizacaoUtc() {
        return ultimaAtualizacaoUtc;
    }

    public void setUltimaAtualizacaoUtc(String ultimaAtualizacaoUtc) {
        this.ultimaAtualizacaoUtc = ultimaAtualizacaoUtc;
    }

    public long getProximaAtualizacaoUnix() {
        return proximaAtualizacaoUnix;
    }

    public void setProximaAtualizacaoUnix(long proximaAtualizacaoUnix) {
        this.proximaAtualizacaoUnix = proximaAtualizacaoUnix;
    }

    public String getProximaAtualizacaoUtc() {
        return proximaAtualizacaoUtc;
    }

    public void setProximaAtualizacaoUtc(String proximaAtualizacaoUtc) {
        this.proximaAtualizacaoUtc = proximaAtualizacaoUtc;
    }

    public String getCodigoBase() {
        return codigoBase;
    }

    public void setCodigoBase(String codigoBase) {
        this.codigoBase = codigoBase;
    }


    public void setTaxasDeCambio(Map<String, Double> taxasDeCambio) {
        this.taxasDeCambio = taxasDeCambio;
    }
}
