/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Conexion;
import modelo.Lugar;
import modelo.Producto;
import modelo.Serie;
import modelo.Stock;
import modelo.User;

/**
 *
 * @author Javier
 */
public class ProductoController {
    public static boolean isNumeric(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
    }

    public ProductoController() {
    }
    
    public int login(User usuario){
     int result = 0;
     Conexion conectar = new Conexion();
     Connection cn = conectar.conexion();
     PreparedStatement pst =null;
     ResultSet rs = null;
     
     String sql = "SELECT * FROM tbl_users WHERE usu_nombre = ? AND usu_password = ?";
        try {
            pst = cn.prepareStatement(sql);
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getApellido());
            rs = pst.executeQuery();
            if (!rs.next()){
               int b = 1; 
               return b;
            } else {
               int b=2;
               return b;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductoController.class.getName()).log(Level.SEVERE, null, ex);
            int b = 3;
            return b;
        }
    }

    //Visualizaremos todo lo que parece en nuestra VistaProducto
    public void añadirProducto(Serie s, Producto p, Stock so, Lugar l){
        //Hacemos la conexion
        Conexion conectar=new Conexion();
        Connection cn = conectar.conexion();
        //Sentencias SQL
        String sqlSerie= "INSERT INTO tbl_serie(serie_nom) VALUES (?)";
        String sqlProducto= "INSERT INTO tbl_producte (prod_nom, prod_foto, serie_id) VALUES (?,?,?)";
        String sqlLugar= "INSERT INTO tbl_lloc(num_bloc, num_passadis, num_lleixa)VALUES(?,?,?)";
        String sqlStock= "INSERT INTO tbl_estoc(estoc_q_max, estoc_q_actual, estoc_q_min, prod_id, lloc_id)VALUES(?,?,?)";
        
         // Compilan los IDs
        String sqlIdSerie= "select distinct last_insert_id() from tbl_serie";
        String sqlIdProducto= "select disntinct last_insert_id() from tbl_producte";
        String sqlIdLugar= "select distinct last_insert_id() from tbl_lloc";
        //ahora recogemos los datos 
        PreparedStatement pst1 = null;
        PreparedStatement pst2 = null;
        PreparedStatement pst3 = null;
        PreparedStatement pst4 = null;
        Statement st1=null;
        Statement st2=null;
        Statement st3=null;
        
        ResultSet rs=null;
        
        try {
            //
            cn.setAutoCommit(false);
            //hacemos la SQL1
            pst1 = cn.prepareStatement(sqlSerie);
            pst1.setInt(1, s.getSerie_nom());
            pst1.executeUpdate();
            //Hacemos la SQL2 y guardando el id de la SQL1
            st1=cn.createStatement();
            rs=st1.executeQuery(sqlIdSerie);
            int idst1=0;
            while(rs.next()){
                idst1=rs.getInt(1);  
            }
            JOptionPane.showMessageDialog(null,idst1);
            //Hacemos la SQL3 y le pasamos el id de la SQL1
            pst2 = cn.prepareStatement(sqlProducto);
            pst2.setString(1, p.getProd_nom());
            pst2.setString(2, p.getProd_foto());
            pst2.setInt(3,idst1);
            pst2.executeUpdate();
            //RECOGEMOS los datos del producto
            st2=cn.createStatement();
            rs=st2.executeQuery(sqlIdProducto);
            int idst2=0;
            if(rs.next()){
                idst2=rs.getInt(1);
            }
            JOptionPane.showMessageDialog(null, idst2);
            //
            pst3=cn.prepareStatement(sqlLugar);
            pst3.setString(1, l.getNum_lloc());
            pst3.setString(2, l.getNum_passadis());
            pst3.setString(3, l.getNum_lleixa());
            pst3.executeUpdate();
           
            //
            st3=cn.createStatement();
            rs=st3.executeQuery(sqlIdLugar);
            int idst3=0;
            if(rs.next()){
                idst3=rs.getInt(1); 
            }
            JOptionPane.showMessageDialog(null, idst3);
            //
            pst4=cn.prepareStatement(sqlStock);
            pst4.setInt(1, so.getEstoc_q_max());
            pst4.setInt(2, so.getEstoc_q_actual());
            pst4.setInt(3, so.getEstoc_q_min());
            pst4.setInt(4,idst2);
            pst4.setInt(5,idst3);
            pst4.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha añadido correctamente");
            cn.commit();
           
        } catch (SQLException | HeadlessException e) {
            try {
                cn.rollback();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se puede deshacer");
            }
        }
    }
    
    public DefaultTableModel mostrarProducto() {
        DefaultTableModel muestra = null;

        //1. conectarme
        Conexion conectar = new Conexion();
        Connection cn = conectar.conexion();

        String sql = "Select * FROM tbl_lloc INNER JOIN tbl_estoc on tbl_lloc.lloc_id = tbl_estoc.lloc_id INNER JOIN tbl_producte ON tbl_producte.prod_id = tbl_estoc.prod_id INNER JOIN tbl_serie ON tbl_serie.serie_id = tbl_producte.serie_id INNER JOIN tbl_categoria ON tbl_categoria.categoria_id = tbl_serie.categoria_id ORDER BY tbl_producte.prod_id";
        Statement st = null;
        String vectorProducto[] = new String[10];
        String vectorProducto1[] = new String[10];
        vectorProducto1[0] = "ID";
        vectorProducto1[1] = "Nombre";
        vectorProducto1[2] = "Nº serie";
        vectorProducto1[3] = "estoc_Actual";
        vectorProducto1[4] = "estoc_Min";
        vectorProducto1[5] = "estoc_Max";
        vectorProducto1[6] = "Bloque";
        vectorProducto1[7] = "Pasillo";
        vectorProducto1[8] = "Respisa";
        vectorProducto1[9] = "Categoria";
        
        muestra=new DefaultTableModel(null, vectorProducto1);
//String[] vectorProducto; De otra manera definir el vector

        try {

            st = cn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {    
                vectorProducto[0] = rs.getString("tbl_producte.prod_id");
                vectorProducto[1] = rs.getString("tbl_producte.prod_nom");
                vectorProducto[2] = rs.getString("tbl_serie.serie_nom");
                vectorProducto[3] = String.valueOf(rs.getInt("tbl_estoc.estoc_q_actual"));
                vectorProducto[4] = String.valueOf(rs.getInt("tbl_estoc.estoc_q_min"));
                vectorProducto[5] = String.valueOf(rs.getInt("tbl_estoc.estoc_q_max"));
                vectorProducto[6] = rs.getString("tbl_lloc.num_bloc");
                vectorProducto[7] = rs.getString("tbl_lloc.num_passadis");
                vectorProducto[8] = rs.getString("tbl_lloc.num_lleixa");
                vectorProducto[9] = rs.getString("tbl_categoria.categoria_nom");
                muestra.addRow(vectorProducto);
               
            }
        } catch (Exception e) {
        }

        return muestra;

    }
}
    

