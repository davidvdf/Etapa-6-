
package service;

import model.Produto;

public class ProdutoService {
    
    public double aplicarDesconto(Produto produto, double percentual) {
        double desconto = produto.getPreco() * (percentual / 100);
        return produto.getPreco() - desconto;
  }
}