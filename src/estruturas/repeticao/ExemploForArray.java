package estruturas.repeticao;

public class ExemploForArray {
    public static void main(String[] args) {
//        //Em array o índice de elementos inicia em 0
//        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
//
//        for (int i=0; i<alunos.length; i++) {
//            System.out.println("O aluno no indice x=" + i + " é " + alunos[i]);
//        }
        String alunos [] =  {"FELIPE","JONAS","JULIA","MARCOS"};

        //Forma abreviada
        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);
        }

    }
}
