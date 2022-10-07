public class FabricaGerente implements FabricaUsuario{

    @Override
    public HistoricoPonto createHorario() {
        return new HistoricoPontoGerente();
    }

    @Override
    public RelatorioVenda createVenda() {
        return new RelatorioVendaGerente();
    }
}
