/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import DAO.DaoProdutos;
import model.ModelProdutos;
import java.util.ArrayList;

/**
 *
 * @author fcorr
 */
public class ControllerProdutos {
    
    private DaoProdutos daoProdutos = new DaoProdutos();
    /**
     * Salvar produtos controller
     * @param pModelProdutos
     * @return 
     */
    
    public int salvarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.salvarProdutosDAO(pModelProdutos);
    }
    
    /**
     * excluir um produto pelo código
     * @param pCodigo
     * @return 
     */
    public boolean excluirProdutoController(int pCodigo){
        return this.daoProdutos.excluirProdutoDAO(pCodigo);
    }
    
    /**
     * alterar um produto
     * @param pModelProdutos
     * @return 
     */

    public boolean alterarProdutoController(ModelProdutos pModelProdutos) {
        return this.daoProdutos.alterarProdutoDAO(pModelProdutos);
    }
    
    /**
     * retornar produto pelo código
     * @param pCodigo
     * @return 
     */
    public ModelProdutos retornarProdutoController(int pCodigo){
        return this.daoProdutos.retornarProdutoDAO(pCodigo);
    }
    /**
     * retornar produto pelo código
     * @param pNomeProduto
     * @return 
     */
    public ModelProdutos retornarProdutoController2(String pNomeProduto){
        return this.daoProdutos.retornarProdutoDAO(pNomeProduto);
    }
    
    /**
     * retorna uma lista de produtos
     * @return  lista Model Produtos
     */
    public ArrayList<ModelProdutos> retornarListaProdutController() {
        return this.daoProdutos.retornarListaProdutosDAO();
    }
    /*
    alterar lista de produtos no banco
    */
    public boolean alterarEstoqueProdutoController(ArrayList<ModelProdutos> pListaModelProdutos) {
        return this.daoProdutos.alterarEstoqueProdutosDAO(pListaModelProdutos);
    }
}
