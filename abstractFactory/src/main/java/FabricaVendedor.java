public class FabricaVendedor implements FabricaUsuario{

    @Override
    public HistoricoPonto createHorario() {
        return new HistoricoPontoVendedor();
    }

    @Override
    public RelatorioVenda createVenda() {
        return new RelatorioVendaVendedor();
    }
}
