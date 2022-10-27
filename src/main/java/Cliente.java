import java.util.Date;

public class Cliente implements  Cloneable{
    private String nome;
    private String email;
    private Date dataNascimento;
    private String numeroTelefone;
    private MetricaDeLealdadeCliente metricaDeLealdadeCliente;

    public Cliente(String nome, String email, Date dataNascimento, String numeroTelefone, MetricaDeLealdadeCliente metricaDeLealdadeCliente){
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.numeroTelefone = numeroTelefone;
        this.metricaDeLealdadeCliente = metricaDeLealdadeCliente;
    }

    public MetricaDeLealdadeCliente getNps() {
        return metricaDeLealdadeCliente;
    }

    public void setNps(MetricaDeLealdadeCliente metricaDeLealdadeCliente) {
        this.metricaDeLealdadeCliente = metricaDeLealdadeCliente;
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

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public Cliente clone() throws CloneNotSupportedException{
        Cliente clienteClone = (Cliente) super.clone();
        clienteClone.metricaDeLealdadeCliente = (MetricaDeLealdadeCliente) clienteClone.metricaDeLealdadeCliente.clone();
        return clienteClone;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + '\'' + "Email: " + email + '\'' + "Telefone: " + numeroTelefone + '\'' + "Data de nascimento: " + dataNascimento +  '\'' + "Metrica de lealdade Cliente: " + metricaDeLealdadeCliente.getMetrica();
    }
}
