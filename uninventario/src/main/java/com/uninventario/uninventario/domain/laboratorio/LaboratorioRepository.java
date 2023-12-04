package com.uninventario.uninventario.domain.laboratorio;

import com.uninventario.uninventario.domain.database.Database;

public class LaboratorioRepository {

    public void adicionarLaboratorio(Laboratorio laboratorio) {
        Database.adicionarLaboratorio(laboratorio);
    }

    public Laboratorio[] buscarTodosLaboratorios() {
        Laboratorio[] resultado = Database.buscarTodosLaboratorios();
        return resultado;
    }

    public Laboratorio buscarUmLaboratorio(Number id) {
        Laboratorio resultado = Database.buscarUmLaboratorio(id);
        return resultado;
    }

    public void editarLaboratorio(Laboratorio laboratorioAtualizado) {
        Database.editarLaboratorio(laboratorioAtualizado);
    }

    public void deletarLaboratorio(Number id) {
        Database.deletarLaboratorio(id);
    }
}
