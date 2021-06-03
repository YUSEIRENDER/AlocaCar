package controller;

import dao.ClienteDAO;
import java.util.ArrayList;
import model.Cliente;


public class FormCadastroAluguelController {
    
    public void obterCliente()
    {
        
        //buscar cliente no banco de dados
        ClienteDAO clienteDAO = new ClienteDAO();
        //chamar objeto
        ArrayList<Cliente> selecioneTudo = clienteDAO.selecioneTudo();
        //exibir clientes no combobox cliente
        
    }        
    
}
