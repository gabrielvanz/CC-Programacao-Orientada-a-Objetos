package br.edu.atitus.poo.projetofinaltb.dao;

import br.edu.atitus.poo.projetofinaltb.dados.Usuario;
import java.util.List;

public class UsuarioDao {
    public Usuario save(Usuario usuario) {
        if (usuario.getId() <= 0){
            int idMaior = 0;
            for (int i = 0; i < DataBase.usuariosDB.size(); i++) {
                if (DataBase.usuariosDB.get(i).getId() > idMaior)
                    idMaior = DataBase.usuariosDB.get(i).getId();
            }
            usuario.setId(++idMaior);
            
            DataBase.usuariosDB.add(usuario);
        }else{
            //alterar um registro já salvo
            for (int i = 0; i < DataBase.usuariosDB.size(); i++) {
                if (DataBase.usuariosDB.get(i).getId() == usuario.getId()){
                    DataBase.usuariosDB.get(i).setNome(usuario.getNome());
                    DataBase.usuariosDB.get(i).setDepartamento(usuario.getDepartamento());
                    break;
                }
            }
        }
        return usuario;
    }
    
    public List<Usuario> findAll() {
        return DataBase.usuariosDB;
    }
    
    public void removeById(int id){
        for (int i = 0; i < DataBase.usuariosDB.size(); i++) {
            if (id == DataBase.usuariosDB.get(i).getId()) {
                DataBase.usuariosDB.remove(i);
                break;
            }
        }
    }
}
