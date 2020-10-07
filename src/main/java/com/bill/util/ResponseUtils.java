package com.bill.util;

import java.util.List;

/**
 * @author zhulongkun20@163.com
 * @since 2020/10/6 1:10 上午
 */
public class ResponseUtils {

    private static final Integer SUCCESS_CODE = 0;

    private static final Integer FIALED_CODE = -1;

    private static final String DEFAULT_SUCCESS_MSG = "处理成功";

    private static final String DETAULT_FAILED_MSG = "处理失败";

    public static ResponseVO sucess(String msg, List<?> data) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode(SUCCESS_CODE);
        responseVO.setMsg(msg);
        responseVO.setData(data);
        return responseVO;
    }

    public static ResponseVO success(List<?> data) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode(SUCCESS_CODE);
        responseVO.setMsg(DEFAULT_SUCCESS_MSG);
        responseVO.setData(data);
        return responseVO;
    }

    public static ResponseVO sucess(String msg) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode(SUCCESS_CODE);
        responseVO.setMsg(msg);
        return responseVO;
    }

    public static ResponseVO failed(String msg) {
        ResponseVO responseVO = new ResponseVO();
        responseVO.setCode(FIALED_CODE);
        responseVO.setMsg(msg);
        return responseVO;
    }

}
