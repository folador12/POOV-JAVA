
import java.util.ArrayList;

import itens.Produto;

public class App {
    public static void main(String[] args) throws Exception {
        Produto p1 = new Produto();
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto());
        // produtos.add(p1.obterProduto());

        for (Produto produto : produtos) {
            produto.mostrar();
            System.out.println();
        }
    }
}
