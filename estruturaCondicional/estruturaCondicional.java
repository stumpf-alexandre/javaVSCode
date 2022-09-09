package estruturaCondicional;

public record estruturaCondicional() {
    public static void main(String[] args) {
        int nota = 50;
        String graduacao;

        //se nota maior ou igual 70, então aprovado

        if(nota >= 70){
            System.out.println("Aluno aprovado");
        } else{
            System.out.println("Aluno reprovado");
        }

        //A>=80 B>=70 C>=60 D=0

        if(nota >= 80){
            System.out.println("Graduação A");
        } else if(nota < 80 && nota >= 70){
            System.out.println("Graduação B");
        } else if(nota < 70 && nota >= 60){
            System.out.println("Graduação C");
        } else{
            System.out.println("Graduação D");
        }

        if(nota >= 80){
            graduacao = "A";
        } else if(nota < 80 && nota >= 70){
            graduacao = "B";
        } else if(nota < 70 && nota >= 60){
            graduacao = "C";
        } else{
            graduacao = "D";
        }

        switch(graduacao){
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Aluno não aprovado");
                break;
            default:
                System.out.println("Graduação invalida");
                break;
        }
    }
}
