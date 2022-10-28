import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void deveSerClienteClone() throws CloneNotSupportedException{
        Cliente cliente = new Cliente("Lorem", "lorem@example.com", new Date(1998, 5, 13), "(32) 99999-9999", new MetricaDeLealdadeCliente(10));

        Cliente clienteClone = cliente.clone();
        clienteClone.setEmail("ipsum@example.com");
        clienteClone.setNome("Lorem Ipsum");
        clienteClone.getMetricaDeLealdadeCliente().setMetrica(8);

        assertEquals( "Nome: " + "Lorem" + '\'' + "Email: " + "lorem@example.com" + '\'' + "Telefone: " + "(32) 99999-9999" + '\'' + "Data de nascimento: " + new Date(1998, 5, 13) +  '\'' + "Metrica de lealdade Cliente: " + "10", cliente.toString() );
        assertEquals( "Nome: " + "Lorem Ipsum" + '\'' + "Email: " + "ipsum@example.com" + '\'' + "Telefone: " + "(32) 99999-9999" + '\'' + "Data de nascimento: " + new Date(1998, 5, 13) +  '\'' + "Metrica de lealdade Cliente: " + "8", clienteClone.toString() );

    }


}