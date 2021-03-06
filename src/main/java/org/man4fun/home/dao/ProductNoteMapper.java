package org.man4fun.home.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.man4fun.home.model.ProductNote;
import org.man4fun.home.model.ProductNoteExample;

public interface ProductNoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    long countByExample(ProductNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int deleteByPrimaryKey(Integer note_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int insert(ProductNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int insertSelective(ProductNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    List<ProductNote> selectByExample(ProductNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    ProductNote selectByPrimaryKey(Integer note_id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int updateByExampleSelective(@Param("record") ProductNote record, @Param("example") ProductNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int updateByExample(@Param("record") ProductNote record, @Param("example") ProductNoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int updateByPrimaryKeySelective(ProductNote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table productnotes
     *
     * @mbg.generated Thu Jan 11 11:52:50 CST 2018
     */
    int updateByPrimaryKey(ProductNote record);
}