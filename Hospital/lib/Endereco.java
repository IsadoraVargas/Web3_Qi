package projetos.Hospital.lib;

public class Endereco {
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private int cep;

public String getRua() {
    return this.rua;
}

public int getnumero() {
    return this.numero;
}

public String getBairro() {
    return this.bairro;
}

public String getCidade() {
    return this.cidade;
}

public String getEstado() {
    return this.estado;
}

public int getCep() {
    return this.cep;
}

//set
public void setRua(String rua) {
    this.rua = rua;
}

public void setNumero(int numero) {
    this.numero = numero;
}

public void setBairro(String bairro) {
    this.bairro = bairro;
}

public void setCidade(String cidade ) {
    this.cidade = cidade;
}

public void setEstado(String estado) {
    this.estado = estado;
}

public void setCep(int cep) {
    this.cep = cep;
}
}