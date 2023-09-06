import javax.print.DocFlavor.STRING;

public class Endereço {
    private String rua;
    private int numero; 
    private String complemento;
    private String bairro;
    private String cidade;
    private String Uf;
    private String cep;

    public Endereço(String rua, int numero, String complemento, String bairro, String cidade, String Uf, String cep){
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade; 
        this.Uf = Uf;
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Endereço: rua = " + rua + ", numero = " + numero + ", complemento = " + complemento + ", bairro = " + bairro
                + ", cidade = " + cidade + ", Uf = " + Uf + ", cep = " + cep + ".";
    }

    public static void main(String[] args) {
        System.out.println("Dados iniciais: ");
        Endereço Endereço1 = new Endereço("Avenida 17 de agosto", 345, "25b", "Casa forte", "Recife", "PE", "23467 - 234");
        System.out.println(Endereço1.toString());
        Endereço1.rua = "Rosa e silva";
        System.out.println("Dados atualizados: ");
        System.out.println(Endereço1.toString());

    }
}


