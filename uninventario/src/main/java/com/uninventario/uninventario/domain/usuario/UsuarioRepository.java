package com.uninventario.uninventario.domain.usuario;

import com.uninventario.uninventario.domain.database.Database;

public class UsuarioRepository {
        public void adicionarUsuario(Usuario usuario) {
        Database.adicionarUsuario(usuario);
    }

    public Usuario[] buscarTodosUsuarios() {
        Usuario[] resultado = Database.buscarTodosUsuarios();
        return resultado;
    }

    public Usuario buscarUmUsuario(Number id) {
        Usuario resultado = Database.buscarUmUsuario(id);
        return resultado;
    }

    public void editarUsuario(Usuario usuarioAtualizado) {
        Database.editarUsuario(usuarioAtualizado);
    }

    public void deletarUsuario(Number id) {
        Database.deletarUsuario(id);
    }
}
