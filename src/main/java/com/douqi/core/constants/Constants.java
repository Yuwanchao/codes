package com.douqi.core.constants;

import com.douqi.core.model.IResponseStatus;

/**
 * 系统级常量
 * @author 懒猴子CG
 * @date 2020/03/13 14:22
 */
public interface Constants {

    /**
     * 系统级响应对象
     * @author 懒猴子CG
     * @date 2020/03/13 14:22
     */
    enum Response implements IResponseStatus {
        SUCCESS("SUCCESS", "请求成功"),
        FAILURE("FAILURE", "请求失败"),
        DATA_EMPTY("DATA_EMPTY", "未找到目标资源"),
        BAD_REQUEST("BAD_REQUEST", "非法请求"),
        ;

        private String code;

        private String message;

        Response(String code, String message) {
            this.code = code;
            this.message = message;
        }

        @Override
        public String getCode() {
            return code;
        }

        @Override
        public String getMessage() {
            return message;
        }
    }


    /**
     * 状态码常量类
     */
    class StatusConstants{

        /**
         * 成功状态码
         */
        public static final String SUCCESSCODE= "200";

        /**
         * 失败状态码
         */
        public static final String FAILURECODE= "500";

        /**
         * 登录账号状态正常
         */
        public static final String LOGINUSERSTATUSNORMAL = "1";

        /**
         * 登录账号状态封停
         */
        public static final String LOGINUSERSTATUSSUSPENSION = "2";

        /**
         * 男性
         */
        public static final String GENDERFORMAN = "1";

        /**
         * 女性
         */
        public static final String GENDERFORWOMAN = "1";
    }
}