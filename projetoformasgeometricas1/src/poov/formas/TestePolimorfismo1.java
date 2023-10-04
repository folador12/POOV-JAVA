
public class TestePolimorfismo1 {

    public static void desenharQuadrados(Quadrado quadrados[]) {
        for (Quadrado f : quadrados) {
            f.desenhar();
        }
    }
    
    public static void desenhaTodos(Forma formas[]) {
        for (Forma f : formas) {
            f.desenhar();
        }
    }
    
   
    public static void main(String[] args) {
       
       Quadrado q = new Quadrado();
       q.exclusivoQuadrado();
        
//        Forma f = new Quadrado();
//        f.desenhar();
//        
//        f = new Circulo();
//        f.desenhar();
        
//         Forma vetor[] = new Forma[5];
//         vetor[0] = new Quadrado(3, 3, "Azul", 2);
//         vetor[1] = new Retangulo(3, 3, "Vermelho", 2, 4);
//         vetor[2] = new Circulo(3, 3, "Verde", 4);
//         vetor[3] = new Triangulo(3, 3, "Azul", 2, 7);         
//         vetor[4] = new Hexagono();
//         desenhaTodos(vetor);
// ////        //for(int cont = 0; cont < vetor.length; cont++) {
//         for (Forma f : vetor) {
//             f.desenhar();
//             System.out.println("Area: " + f.area());
//             System.out.println("Perimetro: " + f.perimetro());
//         }

//         //NAO FAZ O MENOR SENTIDO, MAS EH PERMITIDO
//         Forma f = new Forma(3, 3, "Amarelo");
//         System.out.println(f.area());
//         System.out.println(f.perimetro());
//         f.desenhar();

    }
}
