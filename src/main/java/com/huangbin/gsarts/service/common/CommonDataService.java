package com.huangbin.gsarts.service.common;



import com.huangbin.gsarts.model.common.ReturnObject;
import org.springframework.stereotype.Service;

/**
 * Created by huangbin on 2017年5月9日10:41:25
 */
@SuppressWarnings(value = "unchecked")
@Service
public class CommonDataService  {




    /**
     * @param result      返回结果
     * @param successDesc 执行成功后描述
     * @param failureDesc 执行失败时描述
     * @return
     */
    public ReturnObject getReturnType(Boolean result, String successDesc, String failureDesc) {
        ReturnObject returnObject = new ReturnObject();
        String resultDesc = result ? successDesc : failureDesc;
        returnObject.setResult(result);
        returnObject.setResultDesc(resultDesc);
        return returnObject;
    }
}
