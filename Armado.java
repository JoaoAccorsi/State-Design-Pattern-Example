public class Armado implements EstadoDespertador{
    private int contador;

    //---------------------------------

    @Override
    public EstadoDespertador armarDespertador(int horaAtual, int horaDespertar) {
        return new Armado();
    }

    @Override
    public EstadoDespertador desarmarDespertador(boolean pessoaDesarmou, int horaAtual, int horaDespertar) {

        contador = 0;

        while(true) {

            if (horaAtual == horaDespertar) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Tocando!!");
                }
            }

            if (pessoaDesarmou) {
                System.out.println("\n\nDespertador Desarmado por uma Pessoa!");
                return new Desarmado();
            }

            if (contador < 3) {
                horaDespertar = horaDespertar + 5;
                System.out.println("\nDespertador Desarmado Automaticamente --> Soneca de 5 minutos\n");
            }

            if (contador == 3) {
                System.out.println("\n\nDespertador Desarmado Automaticamente! As três sonecas de 5 minutos já foram utilizadas!");
                return new Desarmado();
            }

            contador++;

                // Passaram-se 5 minutos
            horaAtual = horaAtual + 5;

        }

    }

}
