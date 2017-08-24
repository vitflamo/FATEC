package br.com.fatec.controler;

import br.com.fatec.bean.Usuario;
import br.com.fatec.db.UsuarioDao;
import java.sql.SQLException;

public class UsuarioControler {
    
    public Usuario validaUsuario(Usuario usu) throws SQLException, ClassNotFoundException {
        UsuarioDao usuDao = new UsuarioDao();
        usu = usuDao.validaLogin(usu);
        return usu;
    }
    
    public Usuario inserirUsuario(Usuario usu) {
        usu.setId(1);
        return usu;
    }

}
