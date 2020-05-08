/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import DAO.DAOVendasCliente;
import java.util.ArrayList;
import model.ModelVendasCliente;

/**
 *
 * @author fcorr
 */
public class ControllerVendasCliente {
    
    DAOVendasCliente dAOVendasCliente = new DAOVendasCliente();

    public ArrayList<ModelVendasCliente> getListaVendasClienteController() {
        return this.dAOVendasCliente.getListaVendasClienteDAO();
    }
    
}
