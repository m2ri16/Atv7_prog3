public class Lutador {
    public String nome; 
    public double energia;
    public double forca;

    public Lutador(String nome, double energia, double forca) {
        this.nome = nome;
        this.energia = energia;
        this.forca = forca;
    }

    public void reduzirEnergia(double forcaLuta) {
        this.energia -= forcaLuta;
    }

    public void aplicarGolpe(Lutador oponente) {
        oponente.reduzirEnergia(this.forca);
    }
    
    public static void main(String[] args) {
        Lutador ryu = new Lutador("Ryu", 100, 10);
        Lutador bison = new Lutador("Bison", 100, 12);
        for (int i = 0; i < 3; i++) {
            ryu.aplicarGolpe(bison);
        }
         System.out.println("Energia de Bison após os golpes: " + bison.energia);
        for (int i = 0; i < 8; i++) {
            bison.aplicarGolpe(ryu);
        }
        System.out.println("Energia de Ryu após os golpes: " + ryu.energia);
    }
}

