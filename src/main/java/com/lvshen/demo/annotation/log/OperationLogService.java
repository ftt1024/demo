package com.lvshen.demo.annotation.log;

import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @author Lvshen
 * @version 1.0
 * @date: 2020/10/8 11:28
 * @since JDK 1.8
 */
@Service
public class OperationLogService {

    public void insert(OperationLogRecord logRecord) {
        //todo 持久化方法
    }
}
