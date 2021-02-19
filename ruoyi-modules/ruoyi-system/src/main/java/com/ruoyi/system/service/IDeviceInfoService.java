package com.ruoyi.system.service;

import com.ruoyi.system.domain.DeviceInfo;

import java.util.List;

/**
 * 设备信息维护Service接口
 * 
 * @author zengjl
 * @date 2021-02-19
 */
public interface IDeviceInfoService 
{
    /**
     * 查询设备信息维护
     * 
     * @param id 设备信息维护ID
     * @return 设备信息维护
     */
    public DeviceInfo selectDeviceInfoById(Long id);

    /**
     * 查询设备信息维护列表
     * 
     * @param deviceInfo 设备信息维护
     * @return 设备信息维护集合
     */
    public List<DeviceInfo> selectDeviceInfoList(DeviceInfo deviceInfo);

    /**
     * 新增设备信息维护
     * 
     * @param deviceInfo 设备信息维护
     * @return 结果
     */
    public int insertDeviceInfo(DeviceInfo deviceInfo);

    /**
     * 修改设备信息维护
     * 
     * @param deviceInfo 设备信息维护
     * @return 结果
     */
    public int updateDeviceInfo(DeviceInfo deviceInfo);

    /**
     * 批量删除设备信息维护
     * 
     * @param ids 需要删除的设备信息维护ID
     * @return 结果
     */
    public int deleteDeviceInfoByIds(Long[] ids);

    /**
     * 删除设备信息维护信息
     * 
     * @param id 设备信息维护ID
     * @return 结果
     */
    public int deleteDeviceInfoById(Long id);
}
