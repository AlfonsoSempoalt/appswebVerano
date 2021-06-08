/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio.fabricas;

import dominio.Admor;
import dominio.Normal;
import dominio.Usuario;

/**
 *
 * @author Alfon
 */
public class FabricaUsuario {

    public static Usuario getUser(String tipoUsuario) {
        if (tipoUsuario.equalsIgnoreCase(TiposUsuarios.NORMAL.toString())) {
            return new Normal();
        } else if (tipoUsuario.equalsIgnoreCase(TiposUsuarios.ADMIN.toString())) {
            return new Admor();
        }
        return null;
    }
}
