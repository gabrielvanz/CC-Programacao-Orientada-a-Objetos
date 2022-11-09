package br.edu.atitus.poo.projetofinaltb.negocio;

import br.edu.atitus.poo.projetofinaltb.dados.Departamento;
import br.edu.atitus.poo.projetofinaltb.dao.DepartamentoDao;
import java.util.List;

public class DepartamentoNegocio {
    private DepartamentoDao dao;
    public DepartamentoNegocio() {
        this.dao = new DepartamentoDao();
    }
    
    public Departamento save(Departamento departamento) {
        if (departamento.getNome() == null || departamento.getNome().isEmpty()){
            
        }
        return this.dao.save(departamento);
    }
    
    public List<Departamento> findAll() {
        return this.dao.findAll();
    }
    
    public void removeById(int id){
        this.dao.removeById(id);
    }
}
