package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Copy;
import org.mybatis.cdi.Mapper;

@Mapper
public interface CopyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.COPY
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.COPY
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    int insert(Copy record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.COPY
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    Copy selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.COPY
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    List<Copy> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.COPY
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    int updateByPrimaryKey(Copy record);
}