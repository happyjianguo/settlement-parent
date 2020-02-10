package com.dili.settlement.dto;

import com.dili.settlement.domain.SettleOrder;

import java.util.List;

/**
 * 结算单DTO
 */
public class SettleOrderDto extends SettleOrder {

    //id列表
    private List<Long> idList;
    //业务类型查询列表
    private List<Integer> businessTypeList;
    //结算开始时间
    private String operateTimeStart;
    //结算结束时间
    private String operateTimeEnd;

    public List<Long> getIdList() {
        return idList;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public List<Integer> getBusinessTypeList() {
        return businessTypeList;
    }

    public void setBusinessTypeList(List<Integer> businessTypeList) {
        this.businessTypeList = businessTypeList;
    }

    public String getOperateTimeStart() {
        return operateTimeStart;
    }

    public void setOperateTimeStart(String operateTimeStart) {
        this.operateTimeStart = operateTimeStart;
    }

    public String getOperateTimeEnd() {
        return operateTimeEnd;
    }

    public void setOperateTimeEnd(String operateTimeEnd) {
        this.operateTimeEnd = operateTimeEnd;
    }
}