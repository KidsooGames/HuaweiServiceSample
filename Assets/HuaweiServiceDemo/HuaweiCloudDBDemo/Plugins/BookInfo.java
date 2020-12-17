/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2019-2019. All rights reserved.
 * Generated by the CloudDB ObjectType compiler.  DO NOT EDIT!
 */
package com.huawei.agc.clouddb.quickstart.model;

import com.huawei.agconnect.cloud.database.CloudDBZoneObject;
import com.huawei.agconnect.cloud.database.annotations.DefaultValue;
import com.huawei.agconnect.cloud.database.Text;
import com.huawei.agconnect.cloud.database.annotations.NotNull;
import com.huawei.agconnect.cloud.database.annotations.IsIndex;
import com.huawei.agconnect.cloud.database.annotations.PrimaryKey;

import java.util.Date;

/**
 * Definition of ObjectType BookInfo.
 *
 * @since 2020-12-04
 */
public class BookInfo extends CloudDBZoneObject {
    @PrimaryKey
    private Integer id;

    @IsIndex(indexName = "bookName")
    private String bookName;

    private String author;

    private Double price;

    private String publisher;

    private Date publishTime;

    @DefaultValue(booleanValue = true)
    private Boolean shadowFlag;

    public BookInfo() {
        super();
        this.shadowFlag = true;

    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setShadowFlag(Boolean shadowFlag) {
        this.shadowFlag = shadowFlag;
    }

    public Boolean getShadowFlag() {
        return shadowFlag;
    }

}
