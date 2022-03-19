/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cadastroclienteswing.dao;


import cadastroclienteswing.domain.Cliente;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author mauriciooliveira
 */
public class ClienteMapDAO implements IClienteDAO{
    
    private Map<String, Cliente> map;
    
    public ClienteMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Cliente cliente) {
        if (this.map.containsKey(cliente.getCpf())){
            return false;
        }
        this.map.put(cliente.getCpf(), cliente);
        return true;
    }

    @Override
    public void excluir(String cpf) {
        Cliente clienteCadastrado = map.get(cpf);
        map.remove(clienteCadastrado.getCpf(), clienteCadastrado);
    }

    @Override
    public void alterar(Cliente cliente) {
        Cliente clienteCadastrado = map.get(cliente.getCpf());
        clienteCadastrado.setNome(cliente.getNome());
        clienteCadastrado.setTel(cliente.getTel());
        clienteCadastrado.setNumero(cliente.getNumero());
        clienteCadastrado.setEnd(cliente.getEnd());
        clienteCadastrado.setCidade(cliente.getCidade());
        clienteCadastrado.setEstado(cliente.getEstado());
    }

    @Override
    public Cliente consultar(String cpf) {
        return map.get(cpf);
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return map.values();
    }
       
}
