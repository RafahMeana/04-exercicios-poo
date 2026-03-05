package exercicio02;

public class Main {
    public static void main(String[] args) {

        SenhaAtendimento s1 = new SenhaAtendimento("Arthur Morgan");
        SenhaAtendimento s2 = new SenhaAtendimento("Sadie Adler");
        SenhaAtendimento s3 = new SenhaAtendimento("John Marston");


        System.out.println(s1.getDados());
        System.out.println(s2.getDados());
        System.out.println(s3.getDados());

        System.out.println("Próxima senha disponivel --> " + SenhaAtendimento.controle);
    }
}

