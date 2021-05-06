public class App {
    public static void main(String[] args){
        int nota = 65;

        // teste condicional ou desvio de fluxo
        if(nota >= 70)
        {
            System.out.println("Aprovado");
        }
        else if(nota >= 40)
        {
            System.out.println("Recuperação");
        }
        else
        {
            System.out.println("Reprovado");
        }

        // Operação ternário
        String res;

        res = (nota >= 70 ? "Aprovado": "Reprovado");
        System.out.println("Resultado: " + res);

        // switch - case
        int pos = 1;
        switch(pos)
        {
            case 1:
                System.out.println("Primeiro Lugar");
                break;
            case 2:
                System.out.println("Segundo Lugar");
                break;
            case 3:
                System.out.println("Terceiro Lugar");
                break;
            default:
                System.out.println("N~~ao subiu no podio");
                break;
        }
    }
}
