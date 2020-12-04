package com.dili.settlement.service;

import com.dili.settlement.domain.CustomerAccountSerial;
import com.dili.ss.base.BaseService;

import java.util.List;

/**
 * 由MyBatis Generator工具自动生成
 * This file was generated on 2020-12-03 18:15:40.
 */
public interface CustomerAccountSerialService extends BaseService<CustomerAccountSerial, Long> {
    /**
     * 批量保存流水
     * @param accountSerialList
     * @param customerAccountId
     */
    int batchInsert(List<CustomerAccountSerial> accountSerialList, Long customerAccountId);
}