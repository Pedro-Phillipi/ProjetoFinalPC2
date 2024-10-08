package tf.pc2.model;

import java.time.LocalDate;

public class Cliente {
    private Integer codCliente;
    private String nomeCliente;
    private Integer rgCliente;
    private String enderecoCliente;
    private String bairroCliente;
    private String cidadeCliente;
    private String estadoCliente;
    private Integer cepCliente;
    private LocalDate nascimentoCliente;

    public Cliente() {
    }

    // Getters and Setters
    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        this.codCliente = codCliente;
    }
    
    public String getNomeCliente() {
		return nomeCliente;
	}
    
    public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
    
    public Integer getRgCliente() {
        return rgCliente;
    }

    public void setRgCliente(Integer rgCliente) {
        this.rgCliente = rgCliente;
    }

    public String getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(String enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public String getBairroCliente() {
        return bairroCliente;
    }

    public void setBairroCliente(String bairroCliente) {
        this.bairroCliente = bairroCliente;
    }

    public String getCidadeCliente() {
        return cidadeCliente;
    }

    public void setCidadeCliente(String cidadeCliente) {
        this.cidadeCliente = cidadeCliente;
    }

    public String getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(String estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public Integer getCepCliente() {
        return cepCliente;
    }

    public void setCepCliente(Integer cepCliente) {
        this.cepCliente = cepCliente;
    }

    public LocalDate getNascimentoCliente() {
        return nascimentoCliente;
    }

    public void setNascimentoCliente(LocalDate nascimentoCliente) {
        this.nascimentoCliente = nascimentoCliente;
    }

}