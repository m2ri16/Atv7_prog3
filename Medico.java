public class Medico {
    public String codigo;
    public String nome;
    public String sexo;
    public String especialidade; 
    public String endereco;

    public Medico(String codigo, String nome, String sexo, String especialidade, String endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.sexo = sexo;
        this.especialidade = especialidade;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Medico: codigo = " + codigo + ", nome = " + nome + ", sexo = " + sexo + ", especialidade = " + especialidade
                + ", endereco = " + endereco + ".";
    }

    public static void main(String[] args) {
        System.out.println("Dados iniciais: ");
        Medico Medico1 = new Medico("1234567890", "Fernando", "Masculino", "Ortopedista", "17 de Agosto");
        System.out.println(Medico1.toString());
        Medico1.nome = "Manuel";
        System.out.println("Dados atualizados: ");
        System.out.println(Medico1.toString());

    }

}
