public class Aluno {
    public String nome ;
    public String cpf;
    public double[] notas = new double[4];

    public Aluno(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNotas(double[] notas) {
        if (notas.length == 4) {
            this.notas = notas;
        } else {
            System.out.println("Erro.");
        }
    }

    public double calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Rennan", "123.456.789-23");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("CPF: " + aluno1.cpf);
        double[] notas = {8.0, 7.0, 9.0, 6.0};
        aluno1.setNotas(notas);
        double media = aluno1.calcularMedia();
        System.out.println("Média do aluno: " + media);
        aluno1.notas[1] = 5.0;
        media = aluno1.calcularMedia();
        System.out.println("Nova média do aluno: " + media);
    }

    
}
