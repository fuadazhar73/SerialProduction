/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SerialData;
import SerialProducer.SerialProducer;
import util.DbConnection;
import util.Strings;

/**
 *
 * @author bachtiar
 */
public class FlagManagement {

  public void flagDownloaded(SerialData serialData) {
    String insertSerialUploadQuery = QueryManagement.FLAG_SERIAL_DATA_DOWNLOADED;
    Connection conn = null;

    try {

      conn = DriverManager.getConnection(DbConnection.MYSQL_URL, DbConnection.MYSQL_UNAME, DbConnection.MYSQL_PASSWORD);
      PreparedStatement insertUpload = conn.prepareStatement(insertSerialUploadQuery);

      insertUpload.setLong(1, serialData.getStartId());
      insertUpload.setLong(2, serialData.getEndId());

      insertUpload.executeUpdate();
      System.out.println(Strings.SERIAL_DOWNLOADED);

    } catch (SQLException | NumberFormatException e) {
      System.out.println(e);
    } finally {
      try {
        conn.close();

      } catch (SQLException ex) {
        Logger.getLogger(SerialProducer.class.getName()).log(Level.SEVERE, null, ex);
      }
    }
  }
 }
