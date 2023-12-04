package com.uninventario.uninventario.domain.maquina;

import com.uninventario.uninventario.domain.database.Database;

public class MaquinaRepository {
    
    public void adicionarMaquina(Maquina maquina) {
        Database.adicionarMaquina(maquina);
    }

    public Maquina[] buscarTodasMaquinas() {
        Maquina[] resultado = Database.buscarTodasMaquinas();
        return resultado;
    }

    public Maquina buscarUmaMaquina(Number id) {
        Maquina resultado = Database.buscarUmaMaquina(id);
        return resultado;
    }

    public void editarMaquina(Maquina maquinaAtualizada) {
        Database.editarMaquina(maquinaAtualizada);
    }

    public void deletarMaquina(Number id) {
        Database.deletarMaquina(id);
    }
}
