package Métodos;

import java.util.Locale;

public class MediaEscolar {
    public double mediaDoAluno(double notaUm, double notaDois, double notaTres) {
        return (notaUm + notaDois + notaTres) / 3;
    }
    public String situacaoDoAluno(double media){
        if (media >= 6){

            return "Aprovado";

        } else if (media >= 4) {
            return "Verificação Suplementar";

        } else {
            return "Reprovado";
        }

    }

    public static void main(String[] args) {
     MediaEscolar aluno = new MediaEscolar();
     Locale.setDefault(Locale.US);

     double nota1 = 5.5;
     double nota2 = 0.0;
     double nota3 = 0.0;


     double media = aluno.mediaDoAluno(nota1, nota2, nota3);
     String status = aluno.situacaoDoAluno(media);

        System.out.printf("a media desse aluno foi: %.2f \n", media);
        System.out.println("e o aluno foi: " + status);

    }
}
