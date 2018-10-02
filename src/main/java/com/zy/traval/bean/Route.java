package com.zy.traval.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * 行程路线
 *
 * @author cgl
 * @date 2018/9/26 20:11
 */
@Entity
public class Route {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String creator;
    private Date creatTime;

    /**
     * 出发地
     */
    private String beginPlace;
    /**
     * 目的地
     */
    private String endPlace;

    /**
     * 描述
     */
    private String description;

    /**
     * 餐饮标准
     */
    @OneToMany
    private List<FoodStandard> foodStandards;

    /**
     * 行程交通工具
     */
    @OneToMany
    private List<Transport> transports;

    /**
     * 收费标准
     */
    @OneToMany
    private List<PriceStandard> priceStandards;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getBeginPlace() {
        return beginPlace;
    }

    public void setBeginPlace(String beginPlace) {
        this.beginPlace = beginPlace;
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String description) {
        this.description = description;
    }

    public List<FoodStandard> getFoodStandards() {
        return foodStandards;
    }

    public void setFoodStandards(List<FoodStandard> foodStandards) {
        this.foodStandards = foodStandards;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Transport> getTransports() {
        return transports;
    }

    public void setTransports(List<Transport> transports) {
        this.transports = transports;
    }

    public List<PriceStandard> getPriceStandards() {
        return priceStandards;
    }

    public void setPriceStandards(List<PriceStandard> priceStandards) {
        this.priceStandards = priceStandards;
    }
}
