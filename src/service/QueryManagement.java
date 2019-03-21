package service;

/**
 *
 * @author bachtiar
 */
public class QueryManagement {

    public static final String GETALL_SERIAL_DATA = "SELECT * FROM `serial_data` WHERE `downloaded` = 0 ";

    public static final String FLAG_SERIAL_DATA_DOWNLOADED = "UPDATE serial_data SET downloaded = 1 WHERE ID >= ? AND ID <= ?";

    public static final String INSERT_INTO_SERIAL_DATA_QUEUE = "INSERT INTO `serial_data_queue` "
            + "(`uploaded`, `ID_start`, `ID_end`, `ticket_no`, `start`, `finish`, `start_count`, `start_count_uom`, `end_count`, "
            + "`end_count_uom`, `gross_deliver`, `gross_deliver_uom`, `avg_flow_rate`, `avg_flow_rate_uom`, `after_avg_flow_rate`, `sale_number`, `meter_number`, "
            + "`unit_id`, `duplicate`, `other_one`, `other_two`, `other_three`, `other_four`, `other_five`, `data_state`) "
            + "VALUES (0, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";


}
