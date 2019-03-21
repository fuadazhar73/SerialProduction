/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author bachtiar
 */
@Entity
@Table(name = "serial_data_queue")
@XmlRootElement
@NamedQueries({
  @NamedQuery(name = "SerialDataQueue.findAll", query = "SELECT s FROM SerialDataQueue s")
  , @NamedQuery(name = "SerialDataQueue.findById", query = "SELECT s FROM SerialDataQueue s WHERE s.id = :id")
  , @NamedQuery(name = "SerialDataQueue.findByUploaded", query = "SELECT s FROM SerialDataQueue s WHERE s.uploaded = :uploaded")
  , @NamedQuery(name = "SerialDataQueue.findByIDstart", query = "SELECT s FROM SerialDataQueue s WHERE s.iDstart = :iDstart")
  , @NamedQuery(name = "SerialDataQueue.findByIDend", query = "SELECT s FROM SerialDataQueue s WHERE s.iDend = :iDend")
  , @NamedQuery(name = "SerialDataQueue.findByDataState", query = "SELECT s FROM SerialDataQueue s WHERE s.dataState = :dataState")
  , @NamedQuery(name = "SerialDataQueue.findByTicketNo", query = "SELECT s FROM SerialDataQueue s WHERE s.ticketNo = :ticketNo")
  , @NamedQuery(name = "SerialDataQueue.findByStart", query = "SELECT s FROM SerialDataQueue s WHERE s.start = :start")
  , @NamedQuery(name = "SerialDataQueue.findByFinish", query = "SELECT s FROM SerialDataQueue s WHERE s.finish = :finish")
  , @NamedQuery(name = "SerialDataQueue.findByStartCount", query = "SELECT s FROM SerialDataQueue s WHERE s.startCount = :startCount")
  , @NamedQuery(name = "SerialDataQueue.findByStartCountUom", query = "SELECT s FROM SerialDataQueue s WHERE s.startCountUom = :startCountUom")
  , @NamedQuery(name = "SerialDataQueue.findByEndCount", query = "SELECT s FROM SerialDataQueue s WHERE s.endCount = :endCount")
  , @NamedQuery(name = "SerialDataQueue.findByEndCountUom", query = "SELECT s FROM SerialDataQueue s WHERE s.endCountUom = :endCountUom")
  , @NamedQuery(name = "SerialDataQueue.findByGrossDeliver", query = "SELECT s FROM SerialDataQueue s WHERE s.grossDeliver = :grossDeliver")
  , @NamedQuery(name = "SerialDataQueue.findByGrossDeliverUom", query = "SELECT s FROM SerialDataQueue s WHERE s.grossDeliverUom = :grossDeliverUom")
  , @NamedQuery(name = "SerialDataQueue.findByAvgFlowRate", query = "SELECT s FROM SerialDataQueue s WHERE s.avgFlowRate = :avgFlowRate")
  , @NamedQuery(name = "SerialDataQueue.findByAvgFlowRateUom", query = "SELECT s FROM SerialDataQueue s WHERE s.avgFlowRateUom = :avgFlowRateUom")
  , @NamedQuery(name = "SerialDataQueue.findByAfterAvgFlowRate", query = "SELECT s FROM SerialDataQueue s WHERE s.afterAvgFlowRate = :afterAvgFlowRate")
  , @NamedQuery(name = "SerialDataQueue.findBySaleNumber", query = "SELECT s FROM SerialDataQueue s WHERE s.saleNumber = :saleNumber")
  , @NamedQuery(name = "SerialDataQueue.findByMeterNumber", query = "SELECT s FROM SerialDataQueue s WHERE s.meterNumber = :meterNumber")
  , @NamedQuery(name = "SerialDataQueue.findByUnitId", query = "SELECT s FROM SerialDataQueue s WHERE s.unitId = :unitId")
  , @NamedQuery(name = "SerialDataQueue.findByDuplicate", query = "SELECT s FROM SerialDataQueue s WHERE s.duplicate = :duplicate")
  , @NamedQuery(name = "SerialDataQueue.findByOtherOne", query = "SELECT s FROM SerialDataQueue s WHERE s.otherOne = :otherOne")
  , @NamedQuery(name = "SerialDataQueue.findByOtherTwo", query = "SELECT s FROM SerialDataQueue s WHERE s.otherTwo = :otherTwo")
  , @NamedQuery(name = "SerialDataQueue.findByOtherThree", query = "SELECT s FROM SerialDataQueue s WHERE s.otherThree = :otherThree")
  , @NamedQuery(name = "SerialDataQueue.findByOtherFour", query = "SELECT s FROM SerialDataQueue s WHERE s.otherFour = :otherFour")
  , @NamedQuery(name = "SerialDataQueue.findByOtherFive", query = "SELECT s FROM SerialDataQueue s WHERE s.otherFive = :otherFive")})
public class SerialDataQueue implements Serializable {

  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Basic(optional = false)
  @Column(name = "ID")
  private Long id;
  @Column(name = "uploaded")
  private Short uploaded;
  @Basic(optional = false)
  @Column(name = "ID_start")
  private long iDstart;
  @Basic(optional = false)
  @Column(name = "ID_end")
  private long iDend;
  @Column(name = "data_state")
  private String dataState;
  @Column(name = "ticket_no")
  private String ticketNo;
  @Column(name = "start")
  private String start;
  @Column(name = "finish")
  private String finish;
  @Column(name = "start_count")
  private String startCount;
  @Column(name = "start_count_uom")
  private String startCountUom;
  @Column(name = "end_count")
  private String endCount;
  @Column(name = "end_count_uom")
  private String endCountUom;
  @Column(name = "gross_deliver")
  private String grossDeliver;
  @Column(name = "gross_deliver_uom")
  private String grossDeliverUom;
  @Column(name = "avg_flow_rate")
  private String avgFlowRate;
  @Column(name = "avg_flow_rate_uom")
  private String avgFlowRateUom;
  @Column(name = "after_avg_flow_rate")
  private String afterAvgFlowRate;
  @Column(name = "sale_number")
  private String saleNumber;
  @Column(name = "meter_number")
  private String meterNumber;
  @Column(name = "unit_id")
  private String unitId;
  @Column(name = "duplicate")
  private String duplicate;
  @Column(name = "other_one")
  private String otherOne;
  @Column(name = "other_two")
  private String otherTwo;
  @Column(name = "other_three")
  private String otherThree;
  @Column(name = "other_four")
  private String otherFour;
  @Column(name = "other_five")
  private String otherFive;

  public SerialDataQueue() {
  }

  public SerialDataQueue(Long id) {
    this.id = id;
  }

  public SerialDataQueue(Long id, long iDstart, long iDend) {
    this.id = id;
    this.iDstart = iDstart;
    this.iDend = iDend;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Short getUploaded() {
    return uploaded;
  }

  public void setUploaded(Short uploaded) {
    this.uploaded = uploaded;
  }

  public long getIDstart() {
    return iDstart;
  }

  public void setIDstart(long iDstart) {
    this.iDstart = iDstart;
  }

  public long getIDend() {
    return iDend;
  }

  public void setIDend(long iDend) {
    this.iDend = iDend;
  }

  public String getDataState() {
    return dataState;
  }

  public void setDataState(String dataState) {
    this.dataState = dataState;
  }

  public String getTicketNo() {
    return ticketNo;
  }

  public void setTicketNo(String ticketNo) {
    this.ticketNo = ticketNo;
  }

  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }

  public String getFinish() {
    return finish;
  }

  public void setFinish(String finish) {
    this.finish = finish;
  }

  public String getStartCount() {
    return startCount;
  }

  public void setStartCount(String startCount) {
    this.startCount = startCount;
  }

  public String getStartCountUom() {
    return startCountUom;
  }

  public void setStartCountUom(String startCountUom) {
    this.startCountUom = startCountUom;
  }

  public String getEndCount() {
    return endCount;
  }

  public void setEndCount(String endCount) {
    this.endCount = endCount;
  }

  public String getEndCountUom() {
    return endCountUom;
  }

  public void setEndCountUom(String endCountUom) {
    this.endCountUom = endCountUom;
  }

  public String getGrossDeliver() {
    return grossDeliver;
  }

  public void setGrossDeliver(String grossDeliver) {
    this.grossDeliver = grossDeliver;
  }

  public String getGrossDeliverUom() {
    return grossDeliverUom;
  }

  public void setGrossDeliverUom(String grossDeliverUom) {
    this.grossDeliverUom = grossDeliverUom;
  }

  public String getAvgFlowRate() {
    return avgFlowRate;
  }

  public void setAvgFlowRate(String avgFlowRate) {
    this.avgFlowRate = avgFlowRate;
  }

  public String getAvgFlowRateUom() {
    return avgFlowRateUom;
  }

  public void setAvgFlowRateUom(String avgFlowRateUom) {
    this.avgFlowRateUom = avgFlowRateUom;
  }

  public String getAfterAvgFlowRate() {
    return afterAvgFlowRate;
  }

  public void setAfterAvgFlowRate(String afterAvgFlowRate) {
    this.afterAvgFlowRate = afterAvgFlowRate;
  }

  public String getSaleNumber() {
    return saleNumber;
  }

  public void setSaleNumber(String saleNumber) {
    this.saleNumber = saleNumber;
  }

  public String getMeterNumber() {
    return meterNumber;
  }

  public void setMeterNumber(String meterNumber) {
    this.meterNumber = meterNumber;
  }

  public String getUnitId() {
    return unitId;
  }

  public void setUnitId(String unitId) {
    this.unitId = unitId;
  }

  public String getDuplicate() {
    return duplicate;
  }

  public void setDuplicate(String duplicate) {
    this.duplicate = duplicate;
  }

  public String getOtherOne() {
    return otherOne;
  }

  public void setOtherOne(String otherOne) {
    this.otherOne = otherOne;
  }

  public String getOtherTwo() {
    return otherTwo;
  }

  public void setOtherTwo(String otherTwo) {
    this.otherTwo = otherTwo;
  }

  public String getOtherThree() {
    return otherThree;
  }

  public void setOtherThree(String otherThree) {
    this.otherThree = otherThree;
  }

  public String getOtherFour() {
    return otherFour;
  }

  public void setOtherFour(String otherFour) {
    this.otherFour = otherFour;
  }

  public String getOtherFive() {
    return otherFive;
  }

  public void setOtherFive(String otherFive) {
    this.otherFive = otherFive;
  }

  @Override
  public int hashCode() {
    int hash = 0;
    hash += (id != null ? id.hashCode() : 0);
    return hash;
  }

  @Override
  public boolean equals(Object object) {
    // TODO: Warning - this method won't work in the case the id fields are not set
    if (!(object instanceof SerialDataQueue)) {
      return false;
    }
    SerialDataQueue other = (SerialDataQueue) object;
    if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "model.SerialDataQueue[ id=" + id + " ]";
  }
  
}
