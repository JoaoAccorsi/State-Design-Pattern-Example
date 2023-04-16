public interface EstadoDespertador{

    EstadoDespertador armarDespertador(int horaDespertar, int horaAtual);
    EstadoDespertador desarmarDespertador(boolean pessoaDesarmou, int horaDespertar, int horaAtual);
}
