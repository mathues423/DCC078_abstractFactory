public class Funcionario {
    private HistoricoPonto horario;
    private RelatorioVenda venda;

    public Funcionario(FabricaUsuario usuario){
        this.horario = usuario.createHorario();
        this.venda = usuario.createVenda();
    }

    public String emitirHorario() {
        return this.horario.emitir();
    }

    public String emitirRelatorioVenda() {
        return this.venda.emitir();
    }

}
