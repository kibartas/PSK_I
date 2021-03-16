package lt.vu.mybatis.dao;

import java.util.List;
import lt.vu.mybatis.model.Author;
import org.mybatis.cdi.Mapper;

@Mapper
public interface AuthorMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.AUTHOR
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.AUTHOR
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    int insert(Author record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.AUTHOR
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    Author selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.AUTHOR
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    List<Author> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.AUTHOR
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    int updateByPrimaryKey(Author record);
}