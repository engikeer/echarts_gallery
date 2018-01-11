package org.man4fun.home.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.man4fun.home.model.Vendor;
import org.man4fun.home.model.VendorExample;

public interface VendorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    long countByExample(VendorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int deleteByPrimaryKey(Integer vend_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int insert(Vendor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int insertSelective(Vendor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    List<Vendor> selectByExample(VendorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    Vendor selectByPrimaryKey(Integer vend_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") Vendor record, @Param("example") VendorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int updateByExample(@Param("record") Vendor record, @Param("example") VendorExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int updateByPrimaryKeySelective(Vendor record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vendors
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int updateByPrimaryKey(Vendor record);
}