
package etapa6refatorado;

import model.Produto;
import repository.ProdutoRepository;
import service.ProdutoService;

public class Etapa6Refatorado {

    public static void main(String[] args) {
        // Criar um produto
        Produto produto = new Produto("Whey Protein", 150.0);

        // Aplicar desconto
        ProdutoService service = new ProdutoService();
        double precoComDesconto = service.aplicarDesconto(produto, 15);

        // Salvar o produto
        ProdutoRepository repo = new ProdutoRepository();
        repo.salvar(produto);

        // Exibir os dados
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço original: R$ " + produto.getPreco());
        System.out.println("Preço com desconto: R$ " + precoComDesconto);
        System.out.println("Quantidade total cadastrada: " + repo.listar().size());
    }
    
}
