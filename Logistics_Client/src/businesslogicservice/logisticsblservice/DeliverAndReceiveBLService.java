/**
 *2015年10月21日
 *author:tdy
 *discirption:营业厅的接收和派件接口 
 */
package businesslogicservice.logisticsblservice;

import businesslogic.utilitybl.ResultMessage;
import vo.DeliveringListVO;
import vo.HallArrivalListVO;



public interface DeliverAndReceiveBLService {

	/**
	 * 营业厅生成营业厅到达单
	 * @param hallArrivalList
	 * @return
	 */
	public ResultMessage createHallArrivalList(HallArrivalListVO hallArrivalList);
	
	/**
	 * 营业厅生成派件单
	 * @param deliveringList
	 * @return
	 */
	public ResultMessage createDeliveringList (DeliveringListVO deliveringList);

}