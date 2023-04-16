public class Desarmado implements EstadoDespertador{

    //---------------------------------
    @Override
    public EstadoDespertador armarDespertador(int horaAtual, int horaDespertar) {
        return new Armado();
    }

    @Override
    public EstadoDespertador desarmarDespertador(boolean pessoaDesarmou, int horaAtual, int horaDespertar) {
        return new Desarmado();
    }
}
