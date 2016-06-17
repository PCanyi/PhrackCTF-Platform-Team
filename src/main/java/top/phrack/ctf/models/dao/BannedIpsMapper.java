package top.phrack.ctf.models.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.phrack.ctf.pojo.BannedIps;
import top.phrack.ctf.pojo.BannedIpsExample;

public interface BannedIpsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    int countByExample(BannedIpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    int deleteByExample(BannedIpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    int insert(BannedIps record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    int insertSelective(BannedIps record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    List<BannedIps> selectByExample(BannedIpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    BannedIps selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    int updateByExampleSelective(@Param("record") BannedIps record, @Param("example") BannedIpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    int updateByExample(@Param("record") BannedIps record, @Param("example") BannedIpsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    int updateByPrimaryKeySelective(BannedIps record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.banned_ips
     *
     * @mbggenerated Sun Apr 10 19:05:37 CST 2016
     */
    int updateByPrimaryKey(BannedIps record);
    
    BannedIps selectByIpAddr(String ip);
    
    List<BannedIps> selectAll();
    
}