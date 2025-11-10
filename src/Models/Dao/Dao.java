/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Dao;

import java.util.List;

public interface Dao<T> {
    /**
     * Guarda un objeto en la base de datos.
     * 
     * @param t objeto a guardar.
     * @throws DaoException si ocurre un error durante el proceso.
     */
    public abstract void save(T t) throws DaoException;
    
    /**
     * Obtiene todas los datos registrados en la base de datos.
     * 
     * @return una lista con todos los objetos.
     * @throws DaoException si ocurre un error durante la consulta SQL.
     */
    public abstract List<T> findAll() throws DaoException;
    
    /**
     * Actualiza los datos de un objeto existente.
     * 
     * @param t objeto con los nuevos datos.
     * @throws DaoException si ocurre un error durante la actualización.
     */
    public abstract void update(T t) throws DaoException;
    
    /**
     * Elimina un objeto existente de la base de datos.
     * 
     * @param id id del objeto a eliminar.
     * @throws DaoException si ocurre un error durante el proceso.
     */
    public abstract void delete(int id) throws DaoException;
}
