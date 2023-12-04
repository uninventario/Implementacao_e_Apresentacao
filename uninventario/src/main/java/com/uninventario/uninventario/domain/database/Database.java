package com.uninventario.uninventario.domain.database;

import com.uninventario.uninventario.domain.usuario.Usuario;
import com.uninventario.uninventario.domain.maquina.Maquina;
import com.uninventario.uninventario.domain.laboratorio.Laboratorio;

public class Database {

    static Usuario[] usuarios = new Usuario[0];
    static Maquina[] maquinas = new Maquina[0];
    static Laboratorio[] laboratorios = new Laboratorio[0];


    // Laboratorio
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


    // Maquina

      public static void adicionarMaquina(Maquina maquina) {
        Maquina[] newMaquinas = new Maquina[Database.maquinas.length + 1];
        // Loop de percusão básico
        for (int i = 0; i < Database.maquinas.length; i++) {
            newMaquinas[i] = Database.maquinas[i];
        }
        newMaquinas[newMaquinas.length - 1] = maquina;
        Database.maquinas = newMaquinas;
    }

    public static Maquina[] buscarTodasMaquinas() {
        return Database.maquinas;
    }

    public static Maquina buscarUmaMaquina(Number id) {
        for (int i = 0; i < Database.maquinas.length; i++) {
            if (Database.maquinas[i].getId() == id) {
                return Database.maquinas[i];
            }
        }
        return null;
    }

    public static void editarMaquina(Maquina MaquinaAtualizada) {
        for (int i = 0; i < Database.maquinas.length; i++) {
            if (Database.maquinas[i].getId() == MaquinaAtualizada.getId()) {
                Database.maquinas[i].setNome(MaquinaAtualizada.getNome());
                Database.maquinas[i].setModelo(MaquinaAtualizada.getModelo());
                Database.maquinas[i].setProcessador(MaquinaAtualizada.getProcessador());
                Database.maquinas[i].setMemoriaRam(MaquinaAtualizada.getMemoriaRam());
                Database.maquinas[i].setArmazenamento(MaquinaAtualizada.getArmazenamento());
                Database.maquinas[i].setLaboratorio(MaquinaAtualizada.getLaboratorio());
                return;
            }
        }
    }

    public static void deletarMaquina(Number id) {
        Maquina[] newMaquinas = new Maquina[Database.maquinas.length - 1];
      
        int novoIndice = 0;

        // Loop de deletar básico
        for (int i = 0; i < Database.maquinas.length; i++) {
          if (Database.maquinas[i].getId() != id) {
            newMaquinas[novoIndice] = Database.maquinas[i];
            novoIndice++;
          }
        }

        Database.maquinas = newMaquinas;
      }

      public static void resetarMaquina() {
        Database.maquinas = new Maquina[0];
      }

      // Usuario 

          public static void adicionarUsuario(Usuario usuario) {
            Usuario[] newUsuarios = new Usuario[Database.usuarios.length + 1];
            // Loop de percusão básico
            for (int i = 0; i < Database.usuarios.length; i++) {
                newUsuarios[i] = Database.usuarios[i];
            }
            newUsuarios[newUsuarios.length - 1] = usuario;
            Database.usuarios = newUsuarios;
        }
    
        public static Usuario[] buscarTodosUsuarios() {
            return Database.usuarios;
        }
    
        public static Usuario buscarUmUsuario(Number id) {
            for (int i = 0; i < Database.usuarios.length; i++) {
                if (Database.usuarios[i].getId() == id) {
                    return Database.usuarios[i];
                }
            }
            return null;
        }
    
        public static void editarUsuario(Usuario UsuarioAtualizada) {
            for (int i = 0; i < Database.usuarios.length; i++) {
                if (Database.usuarios[i].getId() == UsuarioAtualizada.getId()) {
                    Database.usuarios[i].setNome(UsuarioAtualizada.getNome());
                    Database.usuarios[i].setCargo(UsuarioAtualizada.getCargo());
                    Database.usuarios[i].setMatricula(UsuarioAtualizada.getMatricula());
                    return;
                }
            }
        }
    
        public static void deletarUsuario(Number id) {
            Usuario[] newUsuarios = new Usuario[Database.usuarios.length - 1];
          
            int novoIndice = 0;
    
            // Loop de deletar básico
            for (int i = 0; i < Database.usuarios.length; i++) {
              if (Database.usuarios[i].getId() != id) {
                newUsuarios[novoIndice] = Database.usuarios[i];
                novoIndice++;
              }
            }
    
            Database.usuarios = newUsuarios;
          }
    
          public static void resetarUsuario() {
            Database.usuarios = new Usuario[0];
          }
}