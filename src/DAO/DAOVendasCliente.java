/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelVendasCliente;
import model.ModelVendas;
import model.ModelCliente;

/**
 *
 * @author fcorr
 */
public class DAOVendasCliente extends ConexaoMySql{
    
        /**
    * recupera uma lista de Vendas
        * @return ArrayList
    */
    public ArrayList<ModelVendasCliente> getListaVendasClienteDAO(){
        ArrayList<ModelVendasCliente> listaModelVendasCliente = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente modelCliente = new ModelCliente();
        ModelVendasCliente modelVendasCliente = new ModelVendasCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "ven_data_venda,"
                    + "ven_valor_liquido,"
                    + "ven_valor_bruto,"
                    + "ven_desconto,"
                    + "pk_id_cliente,"
                    + "cli_nome,"
                    + "cli_endereco,"
                    + "cli_bairro,"
                    + "cli_cidade,"
                    + "cli_uf,"
                    + "cli_cep,"
                    + "cli_telefone"
                 + " FROM"
                     + " tbl_vendas INNER JOIN tbl_cliente "
                     + "on tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente "
                + ";"
            );

            while(this.getResultSet().next()){
                //vendas
                //primeiro limpar a classe ModelVendas no início do loop
                modelVendas = new ModelVendas();    
                //carregar os dados os objetos da Classe ModelCliente
                modelVendas.setIdVenda(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenDataVenda(this.getResultSet().getDate(3));
                modelVendas.setVenValorLiquido(this.getResultSet().getDouble(4));
                modelVendas.setVenValorBruto(this.getResultSet().getDouble(5));
                modelVendas.setVenDesconto(this.getResultSet().getDouble(6));
                //cliente
                //primeiro limpar a classe ModelCliente no início do loop
                modelCliente = new ModelCliente();
                //carregar os dados os objetos da Classe ModelCliente
                modelCliente.setIdCliente(this.getResultSet().getInt(7));
                modelCliente.setCliNome(this.getResultSet().getString(8));
                modelCliente.setCliEndereco(this.getResultSet().getString(9));
                modelCliente.setCliBairro(this.getResultSet().getString(10));
                modelCliente.setCliCidade(this.getResultSet().getString(11));
                modelCliente.setCliUf(this.getResultSet().getString(12));
                modelCliente.setCliCep(this.getResultSet().getString(13));
                modelCliente.setCliTelefone(this.getResultSet().getString(14));
                
                //limpar dados da classe ModelVendasCliente
                modelVendasCliente = new ModelVendasCliente();
                //setar dados do ModelVendas para a Classe ModelVendasCliente
                modelVendasCliente.setModelVendas(modelVendas);
                //setar dados do ModelCliente para a Classe ModelVendasCliente
                modelVendasCliente.setModelCliente(modelCliente);
                
                //adicionar na lista os dados das duas classes Model
                listaModelVendasCliente.add(modelVendasCliente);
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendasCliente;
    }
    
}
