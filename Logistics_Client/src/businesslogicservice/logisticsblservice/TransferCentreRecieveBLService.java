/**
 *2015年10月21日
 *author:tdy
 *discirption:当营业厅送达货物到中转中心或快递到达目的地中转中心时，中转中心的业务员将从其他中转中心接收的货物进行中转接收
 */
package businesslogicservice.logisticsblservice;

import businesslogic.utilitybl.ResultMessage;
import vo.TransArrivalListVO;

public interface TransferCentreRecieveBLService {
	
	/**
	 * 生成中转中心到达单
	 * @param transArrivalList
	 * @return
	 */
	public ResultMessage creatTransArrivalList(TransArrivalListVO transArrivalList);
	
	
	
}
