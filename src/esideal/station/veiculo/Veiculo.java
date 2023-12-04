package esideal.station.veiculo;

import java.util.Objects;

import esideal.station.veiculo.*;

public class Veiculo {
    private String nome;
    private String nomeDono;
    private String matricula;
    private TipoVeiculo tipoVeiculo;
    private TipoMotor tipoMotor;

    /*CONSTRUTORES*/

    public Veiculo(String nome, String nomeDono, String matricula, TipoVeiculo tipoVeiculo, TipoMotor tipoMotor) {
        this.nome = nome;
        this.nomeDono = nomeDono;
        this.matricula = matricula;
        this.tipoVeiculo = tipoVeiculo;
        this.tipoMotor = tipoMotor;
    }

    public Veiculo(Veiculo v) {
        this.nome = v.getNome();
        this.nomeDono = v.getDono();
        this.matricula = v.getMatricula();
        this.tipoVeiculo = v.getTipoVeiculo();
        this.tipoMotor = v.getTipoMotor();
    }

    /*GETTERS*/

    public String getNome(){
        return this.nome;
    }

    public String getDono(){
        return this.nomeDono;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public TipoVeiculo getTipoVeiculo(){
        return this.tipoVeiculo;
    }

    public TipoMotor getTipoMotor(){
        return this.tipoMotor;
    }

    /*OUTROS MÉTODOS*/

    public Veiculo clone() {
        return new Veiculo(this);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Veiculo v = (Veiculo) o;
        return Objects.equals(nome, v.nome) &&
        Objects.equals(matricula, v.matricula) &&
        Objects.equals(nomeDono, v.nomeDono) &&
        tipoVeiculo == v.tipoVeiculo &&
        tipoMotor == v.tipoMotor;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do Veículo: ").append(nome).append("\n");
        sb.append("Nome do Dono: ").append(nomeDono).append("\n");
        sb.append("Matrícula do Veículo: ").append(matricula).append("\n");
        sb.append("Tipo de Veículo: ").append(tipoVeiculo).append("\n");
        sb.append("Tipo de Motor: ").append(tipoMotor).append("\n");
        return sb.toString();
    }
}
