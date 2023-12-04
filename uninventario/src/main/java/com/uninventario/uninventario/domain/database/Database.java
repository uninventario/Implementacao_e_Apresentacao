package com.uninventario.uninventario.domain.database;

import com.uninventario.uninventario.domain.usuario.Usuario;
import com.uninventario.uninventario.domain.maquina.Maquina;
import com.uninventario.uninventario.domain.laboratorio.Laboratorio;

public class Database {

    static Usuario[] usuarios = new Usuario[0];
    static Maquina[] maquinas = new Maquina[0];
    static Laboratorio[] laboratorios = new Laboratorio[0];

    public static void adicionarLaboratorio(Laboratorio laboratorio) {
        Laboratorio[] newLaboratories = new Laboratorio[Database.laboratorios.length + 1];

        // Loop de percusão básico
        for (int i = 0; i < Database.laboratorios.length; i++) {
            newLaboratories[i] = Database.laboratorios[i];
        }

        newLaboratories[newLaboratories.length - 1] = laboratorio;

        Database.laboratorios = newLaboratories;
    }

    public static Laboratorio[] buscarTodosLaboratorios() {
        return Database.laboratorios;
    }

    public static Laboratorio buscarUmLaboratorio(Number id) {
        for (int i = 0; i < Database.laboratorios.length; i++) {
            if (Database.laboratorios[i].getId() == id) {
                return Database.laboratorios[i];
            }
        }
        return null;
    }

    public static void editarLaboratorio(Laboratorio laboratorioAtualizado) {
        for (int i = 0; i < Database.laboratorios.length; i++) {
            if (Database.laboratorios[i].getId() == laboratorioAtualizado.getId()) {
                Database.laboratorios[i].setNome(laboratorioAtualizado.getNome());
                Database.laboratorios[i].setAndar(laboratorioAtualizado.getAndar());
                Database.laboratorios[i].setPredio(laboratorioAtualizado.getPredio());
                return;
            }
        }
    }

    public static void deletarLaboratorio(Number id) {
        Laboratorio[] newLaboratories = new Laboratorio[Database.laboratorios.length - 1];
      
        int novoIndice = 0;

        // Loop de deletar básico
        for (int i = 0; i < Database.laboratorios.length; i++) {
          if (Database.laboratorios[i].getId() != id) {
            newLaboratories[novoIndice] = Database.laboratorios[i];
            novoIndice++;
          }
        }

        Database.laboratorios = newLaboratories;
      }

      public static void resetarLaboratorio() {
        Database.laboratorios = new Laboratorio[0];
      }
}