/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cadastroclienteswing.dao;


import cadastroclienteswing.domain.Cliente;
import java.util.Collection;

/**
 *
 * @author mauriciooliveira
 */
public interface IClienteDAO {
    
    public Boolean cadastrar(Cliente cliente);
    
    public void excluir(String cpf);
    
    public void alterar(Cliente cliente);
    
    public Cliente consultar(String cpf);

    public Collection<Cliente> buscarTodos();
    
}
