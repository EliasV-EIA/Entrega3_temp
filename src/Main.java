import usr.AdministradorContenido;
import usr.AdministradorUsuario;
import usr.Duena;
import usr.Usuario;

import javax.swing.*;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static HashMap<String,Usuario> usuarios = new HashMap<String, Usuario>();
    public static void main(String[] args) {


        Duena Cabra = new Duena("baaa","Cabrita Sakura", "jhadfvasdeofjhojh", "Presidente", "01/01/25","Activa","AAAAAAAAAAAAAAAAAA","01/01/25");
        usuarios.put("Cabrita Sakura",Cabra);
//    electorBase();
        testmenu();
    }
    public static void electorBase(){
        Object[] opciones= {"Login", "Registrar", "Salir"};
        int inp;
        JOptionPane.showMessageDialog(null, "Bienvenido, eliga una accion");
        inp= JOptionPane.showOptionDialog(null, "Seleccione su accion deseada", "Principal", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[2]);
//    inp=JOptionPane.showInputDialog(null, "Escriba la opcion deseada: login , registrar, salir");

        switch (inp) {
            case 0: {
                login();
                electorBase();
                break;
            }
            case 1: {
                registar();
                electorBase();
                break;
            }
            case 2: {
                break;
            }




        }

    }
    public static void login(){
        String username;
        String password;
        int retry;
        username=JOptionPane.showInputDialog(null, "Nombre");
        if (usuarios.containsKey(username))
        {
            System.out.println(usuarios.get(username).getPasswordHash());
            password=JOptionPane.showInputDialog(null, "Contrasena");

            if (password.compareTo(usuarios.get(username).getPasswordHash())==0){

                System.out.println("CORRECTo");
                accionUsuario(usuarios.get(username));
            }
            else
                JOptionPane.showMessageDialog(null, "Contrasena incorrecta");
        }
        else {
            retry = JOptionPane.showConfirmDialog(null, "Ese usuario no existe, quiere intentar de nuevo?");
            if (retry == JOptionPane.YES_OPTION){
                login();
            }

        }
    }
    public static void accionUsuario(Usuario u){
        if (u instanceof Duena){
            System.out.println("Menu cabra");

        }
        else if (u instanceof AdministradorContenido){
            System.out.println("(menu admincontenido");
        }
        else if (u instanceof AdministradorUsuario) {
            System.out.println("AdminUsuario");
        }
        else
            throw new RuntimeException("Tipo de usuario no encontrado");

    }

    public static void registar(){
        Object[] opciones = {"usr.Cliente", "AdminUsuario", "AdminContenido"};
        int tipo;
        String id;
        String nombre;
        String pass;
        String fecha;
        String estado;
        String rol;
        tipo=JOptionPane.showOptionDialog(null, "Seleccione tipo de cuenta", "Registrar", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null, opciones, opciones[0]);
        nombre=JOptionPane.showInputDialog(null,"Nombre");
        id=JOptionPane.showInputDialog(null,"ID");
        pass=JOptionPane.showInputDialog(null,"Contrasena");
        fecha=JOptionPane.showInputDialog(null,"Fecha de registro(automatica en el futuro)");
        estado=JOptionPane.showInputDialog(null,"Estado");
        rol=JOptionPane.showInputDialog(null,"Rol");
        if (tipo==0){
            System.out.println("Creacion cliente");

        }
        else if (tipo==1){
            int nivel = Integer.parseInt(JOptionPane.showInputDialog(null, "Nivel de acceso"));
            usuarios.put(nombre, new AdministradorUsuario(id,nombre,pass,rol,fecha,estado,nivel));

        }
        else if (tipo==2) {
            AdministradorContenido obj_cont = new AdministradorContenido(id,nombre,pass,rol,fecha,estado,
                    JOptionPane.showConfirmDialog(null, "Tiene este usuario permiso para editar nombres?","Permisos",JOptionPane.YES_NO_OPTION)==1,
                    JOptionPane.showConfirmDialog(null, "Tiene este usuario permiso para editar categorias?","Permisos",JOptionPane.YES_NO_OPTION)==1,
                    JOptionPane.showConfirmDialog(null, "Tiene este usuario permiso para editar descripciones?","Permisos",JOptionPane.YES_NO_OPTION)==1,
                    JOptionPane.showConfirmDialog(null, "Tiene este usuario permiso para editar precios?","Permisos",JOptionPane.YES_NO_OPTION)==1,
                    JOptionPane.showConfirmDialog(null, "Tiene este usuario permiso para editar stocks?","Permisos",JOptionPane.YES_NO_OPTION)==1,
                    JOptionPane.showConfirmDialog(null, "Tiene este usuario permiso para editar fechas de lanzamiento?","Permisos",JOptionPane.YES_NO_OPTION)==1);
            usuarios.put(nombre, obj_cont);
            System.out.println(obj_cont.getPermisosDeEdicion());
            System.out.println(((AdministradorContenido)usuarios.get(nombre)).getPermisosDeEdicion());
            System.out.println(usuarios.get(nombre).detalleUsuario());
            System.out.println(usuarios.get(nombre).getClass());
        }

    }
    public static void testmenu(){
        String inp= JOptionPane.showInputDialog(null, "comando");
        switch (inp)
        {
            case "normal":
            {
                electorBase();
                testmenu();
                break;
            }
            case "listusers":
            {
                System.out.println(usuarios);
                testmenu();
                break;
            }
            case "exit":
            {
                break;
            }
            case "geteditperms":{
                inp=JOptionPane.showInputDialog(null,"");
            }
            default:{
                testmenu();
                break;
            }
        }
    }
}