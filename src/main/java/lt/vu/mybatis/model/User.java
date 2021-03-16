package lt.vu.mybatis.model;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.USER.ID
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.USER.ADDRESS
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.USER.DATE_OF_BIRTH
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    private Date dateOfBirth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.USER.NAME
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.USER.SURNAME
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    private String surname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.USER.ID
     *
     * @return the value of PUBLIC.USER.ID
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.USER.ID
     *
     * @param id the value for PUBLIC.USER.ID
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.USER.ADDRESS
     *
     * @return the value of PUBLIC.USER.ADDRESS
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.USER.ADDRESS
     *
     * @param address the value for PUBLIC.USER.ADDRESS
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.USER.DATE_OF_BIRTH
     *
     * @return the value of PUBLIC.USER.DATE_OF_BIRTH
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.USER.DATE_OF_BIRTH
     *
     * @param dateOfBirth the value for PUBLIC.USER.DATE_OF_BIRTH
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.USER.NAME
     *
     * @return the value of PUBLIC.USER.NAME
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.USER.NAME
     *
     * @param name the value for PUBLIC.USER.NAME
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.USER.SURNAME
     *
     * @return the value of PUBLIC.USER.SURNAME
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.USER.SURNAME
     *
     * @param surname the value for PUBLIC.USER.SURNAME
     *
     * @mbg.generated Fri Mar 05 01:21:41 EET 2021
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }
}