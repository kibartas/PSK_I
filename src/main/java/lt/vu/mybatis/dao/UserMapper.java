package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.User;
import org.mybatis.cdi.Mapper;

@Mapper
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USER
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USER
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USER
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USER
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.USER
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    int updateByPrimaryKey(User record);
}