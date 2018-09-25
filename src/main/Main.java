package main;

import java.util.ArrayList;
import java.util.List;

import cn.jiguang.common.resp.APIConnectionException;
import cn.jiguang.common.resp.APIRequestException;
import cn.jsms.api.SendSMSResult;
import cn.jsms.api.common.SMSClient;
import cn.jsms.api.common.model.SMSPayload;

public class Main {

    private static final String appkey = "242780bfdd7315dc1989fe2b";
    private static final String masterSecret = "2f5ced2bef64167950e63d13";

    private static final String devKey = "242780bfdd7315dc1989fedb";
    private static final String devSecret = "2f5ced2bef64167950e63d13";
    
    public static void main(String[] args) {

    	testSendTemplateSMS();
    }
    
    public static void testSendTemplateSMS() {
	    SMSClient client = new SMSClient(masterSecret, appkey);
        SMSPayload payload = SMSPayload.newBuilder()
                .setMobileNumber("13800138000")
                .setTempId(1)
                .addTempPara("test", "jpush")
                .build();
        try {
            SendSMSResult res = client.sendTemplateSMS(payload);
            System.out.println(res.toString());
        } catch (APIRequestException e) {
            e.printStackTrace();
        } catch (APIConnectionException e) {
            e.printStackTrace();
        }
    }
}
