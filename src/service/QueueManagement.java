/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.SerialData;
import model.SerialDataQueue;
import SerialProducer.SerialProducer;
import util.DbConnection;
import util.Strings;

/**
 *
 * @author bachtiar
 */
public class QueueManagement {

  Connection conn = null;

  public void queuedData(SerialData serialData) {
    String insertSerialQueuedQuery = QueryManagement.INSERT_INTO_SERIAL_DATA_QUEUE;

    try {

      conn = DriverManager.getConnection(DbConnection.MYSQL_URL, DbConnection.MYSQL_UNAME, DbConnection.MYSQL_PASSWORD);

      PreparedStatement insertQueue = conn.prepareStatement(insertSerialQueuedQuery);
      insertQueue.setLong(1, serialData.getStartId());
      insertQueue.setLong(2, serialData.getEndId());
      insertQueue.setString(3, serialData.getTicketNumber());
      if(serialData.getStart() == null || serialData.getStart() == "" )
      {
        insertQueue.setString(4, serialData.getFinish());
      }
      else
      {
       insertQueue.setString(4, serialData.getStart()); 
      }
      
      if(serialData.getStart() == null || serialData.getStart() == "" )
      {
        insertQueue.setString(5, serialData.getStart()); 
      }
      else
      {
        insertQueue.setString(5, serialData.getFinish());
      }
      if (serialData.getStartCount() == null || serialData.getStartCount() == "")
      {
        insertQueue.setString(6, "0.0");
      }
      else
      {
        insertQueue.setString(6, serialData.getStartCount());
      }      
      insertQueue.setString(7, serialData.getStartCountUom());
      insertQueue.setString(8, serialData.getEndCount());
      if (serialData.getEndCountUom() == null || serialData.getEndCountUom() == ""){
        insertQueue.setString(9, serialData.getGrossDeliver());
      }
      else
      {
       insertQueue.setString(9, serialData.getEndCountUom()); 
      }      
      if (serialData.getGrossDeliver() == null || serialData.getGrossDeliver() == "" )
      {
        insertQueue.setString(10, serialData.getEndCount());
      }
      else
      {
        insertQueue.setString(10, serialData.getGrossDeliver());
      }
      insertQueue.setString(11, serialData.getGrossDeliverUom());
      insertQueue.setString(12, serialData.getAvgFlowRate());
      insertQueue.setString(13, serialData.getAvgFlowRateUom());
      insertQueue.setString(14, serialData.getAfterAvgFlowRate());
      insertQueue.setString(15, serialData.getSaleNumber());
      insertQueue.setString(16, serialData.getMeterNumber());
      insertQueue.setString(17, serialData.getUnitId());
      insertQueue.setString(18, serialData.getDuplicate());
      insertQueue.setString(19, serialData.getOtherOne());
      insertQueue.setString(20, serialData.getOtherTwo());
      insertQueue.setString(21, serialData.getOtherThree());
      insertQueue.setString(22, serialData.getOtherFour());
      insertQueue.setString(23, serialData.getOtherFive());
      insertQueue.setString(24, serialData.getDataState());

      insertQueue.executeUpdate();

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