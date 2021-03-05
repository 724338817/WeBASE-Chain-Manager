package com.webank.webase.chain.mgr.repository.mapper;

import com.webank.webase.chain.mgr.repository.bean.TbTask;
import com.webank.webase.chain.mgr.repository.bean.TbTaskExample;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface TbTaskMapper {


    @Delete({ "delete from tb_task where chain_id=#{chainId}" })
    int deleteByChainId(@Param("chainId") int chainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbTaskSqlProvider.class, method = "countByExample")
    long countByExample(TbTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @DeleteProvider(type = TbTaskSqlProvider.class, method = "deleteByExample")
    int deleteByExample(TbTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @Delete({ "delete from tb_task", "where id = #{id,jdbcType=INTEGER}" })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @Insert({ "insert into tb_task (task_type, task_status, ", "chain_id, group_id, ", "node_id, current_handler_host, ", "gmt_create, gmt_modified, ", "description, remark)", "values (#{taskType,jdbcType=TINYINT}, #{taskStatus,jdbcType=TINYINT}, ", "#{chainId,jdbcType=INTEGER}, #{groupId,jdbcType=INTEGER}, ", "#{nodeId,jdbcType=VARCHAR}, #{currentHandlerHost,jdbcType=VARCHAR}, ", "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModified,jdbcType=TIMESTAMP}, ", "#{description,jdbcType=VARCHAR}, #{remark,jdbcType=LONGVARCHAR})" })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(TbTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @InsertProvider(type = TbTaskSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(TbTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbTaskSqlProvider.class, method = "selectByExampleWithBLOBs")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "task_type", property = "taskType", jdbcType = JdbcType.TINYINT), @Result(column = "task_status", property = "taskStatus", jdbcType = JdbcType.TINYINT), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "node_id", property = "nodeId", jdbcType = JdbcType.VARCHAR), @Result(column = "current_handler_host", property = "currentHandlerHost", jdbcType = JdbcType.VARCHAR), @Result(column = "gmt_create", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP), @Result(column = "gmt_modified", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP), @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR), @Result(column = "remark", property = "remark", jdbcType = JdbcType.LONGVARCHAR) })
    List<TbTask> selectByExampleWithBLOBs(TbTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbTaskSqlProvider.class, method = "selectByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "task_type", property = "taskType", jdbcType = JdbcType.TINYINT), @Result(column = "task_status", property = "taskStatus", jdbcType = JdbcType.TINYINT), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "node_id", property = "nodeId", jdbcType = JdbcType.VARCHAR), @Result(column = "current_handler_host", property = "currentHandlerHost", jdbcType = JdbcType.VARCHAR), @Result(column = "gmt_create", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP), @Result(column = "gmt_modified", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP), @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR) })
    List<TbTask> selectByExample(TbTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @Select({ "select", "id, task_type, task_status, chain_id, group_id, node_id, current_handler_host, ", "gmt_create, gmt_modified, description, remark", "from tb_task", "where id = #{id,jdbcType=INTEGER}" })
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "task_type", property = "taskType", jdbcType = JdbcType.TINYINT), @Result(column = "task_status", property = "taskStatus", jdbcType = JdbcType.TINYINT), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "node_id", property = "nodeId", jdbcType = JdbcType.VARCHAR), @Result(column = "current_handler_host", property = "currentHandlerHost", jdbcType = JdbcType.VARCHAR), @Result(column = "gmt_create", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP), @Result(column = "gmt_modified", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP), @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR), @Result(column = "remark", property = "remark", jdbcType = JdbcType.LONGVARCHAR) })
    TbTask selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbTaskSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("record") TbTask record, @Param("example") TbTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbTaskSqlProvider.class, method = "updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") TbTask record, @Param("example") TbTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbTaskSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("record") TbTask record, @Param("example") TbTaskExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @UpdateProvider(type = TbTaskSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(TbTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @Update({ "update tb_task", "set task_type = #{taskType,jdbcType=TINYINT},", "task_status = #{taskStatus,jdbcType=TINYINT},", "chain_id = #{chainId,jdbcType=INTEGER},", "group_id = #{groupId,jdbcType=INTEGER},", "node_id = #{nodeId,jdbcType=VARCHAR},", "current_handler_host = #{currentHandlerHost,jdbcType=VARCHAR},", "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},", "gmt_modified = #{gmtModified,jdbcType=TIMESTAMP},", "description = #{description,jdbcType=VARCHAR},", "remark = #{remark,jdbcType=LONGVARCHAR}", "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKeyWithBLOBs(TbTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @Update({ "update tb_task", "set task_type = #{taskType,jdbcType=TINYINT},", "task_status = #{taskStatus,jdbcType=TINYINT},", "chain_id = #{chainId,jdbcType=INTEGER},", "group_id = #{groupId,jdbcType=INTEGER},", "node_id = #{nodeId,jdbcType=VARCHAR},", "current_handler_host = #{currentHandlerHost,jdbcType=VARCHAR},", "gmt_create = #{gmtCreate,jdbcType=TIMESTAMP},", "gmt_modified = #{gmtModified,jdbcType=TIMESTAMP},", "description = #{description,jdbcType=VARCHAR}", "where id = #{id,jdbcType=INTEGER}" })
    int updateByPrimaryKey(TbTask record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    @Insert({ "<script>", "insert into tb_task (task_type, ", "task_status, chain_id, ", "group_id, node_id, ", "current_handler_host, gmt_create, ", "gmt_modified, description, ", "remark)", "values<foreach collection=\"list\" item=\"detail\" index=\"index\" separator=\",\">(#{detail.taskType,jdbcType=TINYINT}, ", "#{detail.taskStatus,jdbcType=TINYINT}, #{detail.chainId,jdbcType=INTEGER}, ", "#{detail.groupId,jdbcType=INTEGER}, #{detail.nodeId,jdbcType=VARCHAR}, ", "#{detail.currentHandlerHost,jdbcType=VARCHAR}, #{detail.gmtCreate,jdbcType=TIMESTAMP}, ", "#{detail.gmtModified,jdbcType=TIMESTAMP}, #{detail.description,jdbcType=VARCHAR}, ", "#{detail.remark,jdbcType=LONGVARCHAR})</foreach></script>" })
    int batchInsert(List<TbTask> list);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_task
     *
     * @mbg.generated
     */
    @SelectProvider(type = TbTaskSqlProvider.class, method = "getOneByExample")
    @Results({ @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true), @Result(column = "task_type", property = "taskType", jdbcType = JdbcType.TINYINT), @Result(column = "task_status", property = "taskStatus", jdbcType = JdbcType.TINYINT), @Result(column = "chain_id", property = "chainId", jdbcType = JdbcType.INTEGER), @Result(column = "group_id", property = "groupId", jdbcType = JdbcType.INTEGER), @Result(column = "node_id", property = "nodeId", jdbcType = JdbcType.VARCHAR), @Result(column = "current_handler_host", property = "currentHandlerHost", jdbcType = JdbcType.VARCHAR), @Result(column = "gmt_create", property = "gmtCreate", jdbcType = JdbcType.TIMESTAMP), @Result(column = "gmt_modified", property = "gmtModified", jdbcType = JdbcType.TIMESTAMP), @Result(column = "description", property = "description", jdbcType = JdbcType.VARCHAR), @Result(column = "remark", property = "remark", jdbcType = JdbcType.LONGVARCHAR) })
    Optional<TbTask> getOneByExample(TbTaskExample example);
}
