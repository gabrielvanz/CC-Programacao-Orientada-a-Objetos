package br.edu.atitus.poo.projetofinaltb.dao;

import br.edu.atitus.poo.projetofinaltb.dados.Departamento;
import java.util.List;

public class DepartamentoDao {
    public Departamento save(Departamento departamento) {
        if (departamento.getId() <= 0){
            int idMaior = 0;
            for (int i = 0; i < DataBase.departamentosDB.size(); i++) {
                if (DataBase.departamentosDB.get(i).getId() > idMaior)
                    idMaior = DataBase.departamentosDB.get(i).getId();
            }
            departamento.setId(++idMaior);
            
            DataBase.departamentosDB.add(departamento);
        }else{
            //alterar um registro já salvo
            for (int i = 0; i < DataBase.departamentosDB.size(); i++) {
                if (DataBase.departamentosDB.get(i).getId() == departamento.getId()){
                    DataBase.departamentosDB.get(i).setNome(departamento.getNome());
                    break;
                }
            }
        }
        return departamento;
    }
    
    public List<Departamento> findAll() {
        return DataBase.departamentosDB;
    }
    
    public void removeById(int id){
        for (int i = 0; i < DataBase.departamentosDB.size(); i++) {
            if (id == DataBase.departamentosDB.get(i).getId()) {
                DataBase.departamentosDB.remove(i);
                break;
            }
        }
    }
}
