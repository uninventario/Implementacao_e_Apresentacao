package com.uninventario.uninventario.domain.laboratorio;
import com.uninventario.uninventario.domain.database.Database;

public class LaboratorioRepository {

    public void adicionarLaboratorio(Laboratorio laboratorio) {
        Database.adicionarLaboratorio(laboratorio);
    }

    public void buscarTodosLaboratorios() {
        Database.buscarTodosLaboratorios();
    }

    public void buscarUmLaboratorio(Number id) {
        Database.buscarUmLaboratorio(id);
    }

    public void editarLaboratorio(Laboratorio laboratorioALaboratorio) {
        Database.editarLaboratorio(laboratorioALaboratorio);
    }

    public void deletarLaboratorio(Number id) {
        Database.deletarLaboratorio(id);
    }
}
