package com.example.havagas;

public class FormularioPessoa {
    private String nome;
    private String email;
    private String telefone;
    private String tipoTelefone;
    private boolean temCelular;
    private String celular;
    private String sexo;
    private String dataNasc;
    private String escolaridade;
    private String vagasInteresse;

    public FormularioPessoa() {}

    public FormularioPessoa(String nome, String email, String telefone, String tipoTelefone, boolean temCelular, String celular, String sexo, String dataNasc, String escolaridade, String vagasInteresse) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.tipoTelefone = tipoTelefone;
        this.temCelular = temCelular;
        this.celular = celular;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.escolaridade = escolaridade;
        this.vagasInteresse = vagasInteresse;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public boolean isTemCelular() {
        return temCelular;
    }

    public void setTemCelular(boolean temCelular) {
        this.temCelular = temCelular;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getVagasInteresse() {
        return vagasInteresse;
    }

    public void setVagasInteresse(String vagasInteresse) {
        this.vagasInteresse = vagasInteresse;
    }

    @Override
    public String toString() {
        return "FormularioPessoa{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", tipoTelefone='" + tipoTelefone + '\'' +
                ", temCelular=" + temCelular +
                ", celular='" + celular + '\'' +
                ", sexo=" + sexo +
                ", dataNasc='" + dataNasc + '\'' +
                ", escolaridade='" + escolaridade + '\'' +
                ", vagasInteresse='" + vagasInteresse + '\'' +
                '}';
    }
}
