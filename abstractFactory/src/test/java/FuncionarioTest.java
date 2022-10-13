import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FuncionarioTest {
    @Test
    public void deveTestarHorarioVendedor(){
        FabricaUsuario fabrica = new FabricaVendedor();
        Funcionario vendedor = new Funcionario(fabrica);
        assertEquals("Historico do Vendedor",vendedor.emitirHorario());
    }

    @Test
    public void deveTestarHorarioGerente(){
        FabricaUsuario fabrica = new FabricaGerente();
        Funcionario vendedor = new Funcionario(fabrica);
        assertEquals("Historico do Gerente",vendedor.emitirHorario());
    }

    @Test
    public void deveTestarVendasVendedor(){
        FabricaUsuario fabrica = new FabricaVendedor();
        Funcionario vendedor = new Funcionario(fabrica);
        assertEquals("Vendas do Vendedor",vendedor.emitirRelatorioVenda());
    }

    @Test
    public void deveTestarVendasGerente(){
        FabricaUsuario fabrica = new FabricaGerente();
        Funcionario vendedor = new Funcionario(fabrica);
        assertEquals("Vendas do Gerente",vendedor.emitirRelatorioVenda());
    }
}