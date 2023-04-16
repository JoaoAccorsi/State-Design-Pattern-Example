public class Despertador {

    public EstadoDespertador estado;
    public int horaAtual;
    public int horaDespertar;

    public boolean pessoaDesarmou;

    //---------------------------------
    public Despertador(int horaDespertar, int horaAtual) {
        this.estado = new Desarmado();
        this.horaDespertar = horaDespertar;
        this.horaAtual =  horaAtual;
        this.pessoaDesarmou = false;
    }

    //---------------------------------

    public void armar(){
        estado = estado.armarDespertador(horaAtual, horaDespertar);
    }

    public void desarmar(){
        estado = estado.desarmarDespertador(pessoaDesarmou, horaAtual, horaDespertar);
    }
}
