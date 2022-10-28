public class MetricaDeLealdadeCliente implements Cloneable{

    private int metrica;

    public MetricaDeLealdadeCliente(int metrica){
        super();
        this.metrica = metrica;
    }

    public int getMetrica() {
        return metrica;
    }

    public void setMetrica(int metrica) {
        this.metrica = metrica;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Metrica de lealdade Cliente: " + metrica;
    }
}
