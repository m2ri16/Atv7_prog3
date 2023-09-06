import java.util.Scanner;

public class Paciente {
    private String codigo;
    private String nome;
    private String dataNascimento;
    private String planoSaude;
    private String alergia;
    private String tipoSanguineo;

    public Paciente(String codigo, String nome, String dataNascimento, String planoSaude, String alergia, String tipoSanguineo ){
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.planoSaude = planoSaude;
        this.alergia = alergia;
        this.tipoSanguineo = tipoSanguineo;
    }

    @Override
    public String toString() {
        return "Paciente: codigo = " + codigo + ", nome = " + nome + ", dataNascimento = " + dataNascimento + ", planoSaude = "
                + planoSaude + ", alergia = " + alergia + ", tipoSanguineo = " + tipoSanguineo + ".";
    }

    public static void main(String[] args) {
    System.out.println("Dados do paciente: ");
    Paciente paciente1 = new Paciente("2345677890", "Matheus", "20/10/2003", "Unimed" , "Poeira", "A+");
    System.out.println(paciente1.toString());
    paciente1.codigo = "1234567890";
    paciente1.nome = "Glauciana";
    paciente1.dataNascimento = "27/03/1973";
    paciente1.planoSaude = "Bradesco";
    paciente1.alergia = "Camarão";
    paciente1.tipoSanguineo = "B+";
    System.out.println("Dados da mãe: ");
    System.out.println(paciente1.toString());

    }
}

 