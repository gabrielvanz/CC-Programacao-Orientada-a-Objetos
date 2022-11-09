package br.edu.atitus.poo.projetofinaltb.dao;

import br.edu.atitus.poo.projetofinaltb.dados.Departamento;
import br.edu.atitus.poo.projetofinaltb.dados.Usuario;
import java.util.ArrayList;
import java.util.List;


public abstract class DataBase {
    public static List<Departamento> departamentosDB;
    public static List<Usuario> usuariosDB;
    static {
        departamentosDB = new ArrayList<>();
        departamentosDB.add(new Departamento(1, "Faturamento"));
        departamentosDB.add(new Departamento(2, "RH"));
        departamentosDB.add(new Departamento(3, "Informática"));
        
        usuariosDB = new ArrayList<>();
    }
}
