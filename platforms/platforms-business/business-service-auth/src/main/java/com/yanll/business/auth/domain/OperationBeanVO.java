package com.yanll.business.auth.domain;

import com.yanll.framework.data.mysql.domain.DataEntity;
import com.yanll.framework.data.mysql.domain.VOEntity;

/*
* 当前文件为MybatisGenerator自动生成的VO，请手动剪切到*-service项目。
*/
public class OperationBeanVO extends VOEntity {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_operation.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_operation.menu_id
     *
     * @mbg.generated
     */
    private Long menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_operation.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_operation.method
     *
     * @mbg.generated
     */
    private String method;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_operation.desc
     *
     * @mbg.generated
     */
    private String desc;

    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_operation.id
     *
     * @return the value of m_operation.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_operation.id
     *
     * @param id the value for m_operation.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_operation.menu_id
     *
     * @return the value of m_operation.menu_id
     *
     * @mbg.generated
     */
    public Long getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_operation.menu_id
     *
     * @param menuId the value for m_operation.menu_id
     *
     * @mbg.generated
     */
    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_operation.url
     *
     * @return the value of m_operation.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_operation.url
     *
     * @param url the value for m_operation.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_operation.method
     *
     * @return the value of m_operation.method
     *
     * @mbg.generated
     */
    public String getMethod() {
        return method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_operation.method
     *
     * @param method the value for m_operation.method
     *
     * @mbg.generated
     */
    public void setMethod(String method) {
        this.method = method;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_operation.desc
     *
     * @return the value of m_operation.desc
     *
     * @mbg.generated
     */
    public String getDesc() {
        return desc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_operation.desc
     *
     * @param desc the value for m_operation.desc
     *
     * @mbg.generated
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
}