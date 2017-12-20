package com.inspur.qls.bpmclient;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BPMService {

    private static Log log = LogFactory.getLog(BPMService.class);

    /*
     * @author fenglin
     * 
     * @method setInfo 调用BPM webservice的服务，通知调价审核
     * 
     * @param processID 业务类型编号， dataAreaID 账套 ， dataKey 业务单据号
     * 
     * @return int 0：接收成功，-1接收失败,1 参数传递不正确
     */
    @SuppressWarnings("finally")
    public static int setInfo(String processID, String dataAreaId,
	    String dataKey) {
	int result = 0;

	if (log.isDebugEnabled()) {
	    log.debug("setInfo begin:");
	}
	if (processID == null || "".equals(processID) || dataAreaId == null
		|| "".equals(dataAreaId) || dataKey == null
		|| "".equals(dataKey)) {
	    result = 1;
	    return result;
	} else {
	    // 组织xml数据,即将账套信息及业务主键
	    if (log.isDebugEnabled()) {
		log.debug("setInfo begin:processID:" + processID
			+ "   dataAreaId:" + dataAreaId + "  dataKey主键:"
			+ dataKey);
	    }
	    String xmlInfoString = xmlString(processID, dataAreaId, dataKey);
	    if (log.isDebugEnabled()) {
		log.debug("组织传递给bpm的信息processID：" + processID
			+ "  xmlInfoString" + xmlInfoString);
	    }
	    try {
		if (log.isDebugEnabled()) {
		    log.debug("BPM服务调用开始：");
		}
		ProcessDispatcherImplService processDispatcher = new ProcessDispatcherImplService();
		ProcessDispatcher processdispatcher = processDispatcher
			.getProcessDispatcherImplPort();
		result = processdispatcher.startProcess(processID,
			xmlInfoString);
		if (log.isDebugEnabled()) {
		    log.debug("BPM服务调用结束，返回值为：" + result);
		}

	    } catch (Exception e) {
		e.getStackTrace();
		log.debug("BPM服务调用出错：");
		result = -1;
	    }
	    finally{
		    return result;
		}
	}
	
    }

    public static String xmlString(String processID, String dataAreaId,
	    String dataKey) {
	if (log.isDebugEnabled()) {
	    log.debug("xmlString begin:");
	}
	String xmlStr = "";
	if ("CW_SS_0011".equals(processID)) { // 挂牌价
	    if (log.isDebugEnabled()) {
		log.debug("CW_SS_0011");
	    }
	    xmlStr = "<param><DataAreaId>" + dataAreaId
		    + "</DataAreaId><XTGUAPAIPriceNum>" + dataKey
		    + "</XTGUAPAIPriceNum></param>";
	} else if ("CW_SS_0012".equals(processID)) { // 调价单
	    if (log.isDebugEnabled()) {
		log.debug("CW_SS_0012");
	    }
	    xmlStr = "<param><DataAreaId>" + dataAreaId
		    + "</DataAreaId><XT_EAdjustPriceBillNum>" + dataKey
		    + "</XT_EAdjustPriceBillNum></param>";
	} else if ("CW_SS_0013".equals(processID)) { // 调价通知单
	    if (log.isDebugEnabled()) {
		log.debug("CW_SS_0013");
	    }
	    xmlStr = "<param><DataAreaId>" + dataAreaId
		    + "</DataAreaId><XTEadjustBillNum>" + dataKey
		    + "</XTEadjustBillNum></param>";
	} else if ("CW_SS_0015".equals(processID)) { // 调价单
	    if (log.isDebugEnabled()) {
		log.debug("CW_SS_0015");
	    }
	    xmlStr = "<param><companyid>" + dataAreaId
		    + "</companyid><ContactId>" + dataKey
		    + "</ContactId></param>";
	}

	return xmlStr;
    }

}
