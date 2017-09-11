package com.intellingence.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShoepadResultQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public ShoepadResultQuery() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andDataqualityIsNull() {
            addCriterion("dataQuality is null");
            return (Criteria) this;
        }

        public Criteria andDataqualityIsNotNull() {
            addCriterion("dataQuality is not null");
            return (Criteria) this;
        }

        public Criteria andDataqualityEqualTo(String value) {
            addCriterion("dataQuality =", value, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityNotEqualTo(String value) {
            addCriterion("dataQuality <>", value, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityGreaterThan(String value) {
            addCriterion("dataQuality >", value, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityGreaterThanOrEqualTo(String value) {
            addCriterion("dataQuality >=", value, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityLessThan(String value) {
            addCriterion("dataQuality <", value, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityLessThanOrEqualTo(String value) {
            addCriterion("dataQuality <=", value, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityLike(String value) {
            addCriterion("dataQuality like", value, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityNotLike(String value) {
            addCriterion("dataQuality not like", value, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityIn(List<String> values) {
            addCriterion("dataQuality in", values, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityNotIn(List<String> values) {
            addCriterion("dataQuality not in", values, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityBetween(String value1, String value2) {
            addCriterion("dataQuality between", value1, value2, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDataqualityNotBetween(String value1, String value2) {
            addCriterion("dataQuality not between", value1, value2, "dataquality");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Double value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Double value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Double value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Double value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Double value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Double value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Double> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Double> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Double value1, Double value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Double value1, Double value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andStepcountIsNull() {
            addCriterion("stepCount is null");
            return (Criteria) this;
        }

        public Criteria andStepcountIsNotNull() {
            addCriterion("stepCount is not null");
            return (Criteria) this;
        }

        public Criteria andStepcountEqualTo(Integer value) {
            addCriterion("stepCount =", value, "stepcount");
            return (Criteria) this;
        }

        public Criteria andStepcountNotEqualTo(Integer value) {
            addCriterion("stepCount <>", value, "stepcount");
            return (Criteria) this;
        }

        public Criteria andStepcountGreaterThan(Integer value) {
            addCriterion("stepCount >", value, "stepcount");
            return (Criteria) this;
        }

        public Criteria andStepcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stepCount >=", value, "stepcount");
            return (Criteria) this;
        }

        public Criteria andStepcountLessThan(Integer value) {
            addCriterion("stepCount <", value, "stepcount");
            return (Criteria) this;
        }

        public Criteria andStepcountLessThanOrEqualTo(Integer value) {
            addCriterion("stepCount <=", value, "stepcount");
            return (Criteria) this;
        }

        public Criteria andStepcountIn(List<Integer> values) {
            addCriterion("stepCount in", values, "stepcount");
            return (Criteria) this;
        }

        public Criteria andStepcountNotIn(List<Integer> values) {
            addCriterion("stepCount not in", values, "stepcount");
            return (Criteria) this;
        }

        public Criteria andStepcountBetween(Integer value1, Integer value2) {
            addCriterion("stepCount between", value1, value2, "stepcount");
            return (Criteria) this;
        }

        public Criteria andStepcountNotBetween(Integer value1, Integer value2) {
            addCriterion("stepCount not between", value1, value2, "stepcount");
            return (Criteria) this;
        }

        public Criteria andSteprateIsNull() {
            addCriterion("stepRate is null");
            return (Criteria) this;
        }

        public Criteria andSteprateIsNotNull() {
            addCriterion("stepRate is not null");
            return (Criteria) this;
        }

        public Criteria andSteprateEqualTo(Double value) {
            addCriterion("stepRate =", value, "steprate");
            return (Criteria) this;
        }

        public Criteria andSteprateNotEqualTo(Double value) {
            addCriterion("stepRate <>", value, "steprate");
            return (Criteria) this;
        }

        public Criteria andSteprateGreaterThan(Double value) {
            addCriterion("stepRate >", value, "steprate");
            return (Criteria) this;
        }

        public Criteria andSteprateGreaterThanOrEqualTo(Double value) {
            addCriterion("stepRate >=", value, "steprate");
            return (Criteria) this;
        }

        public Criteria andSteprateLessThan(Double value) {
            addCriterion("stepRate <", value, "steprate");
            return (Criteria) this;
        }

        public Criteria andSteprateLessThanOrEqualTo(Double value) {
            addCriterion("stepRate <=", value, "steprate");
            return (Criteria) this;
        }

        public Criteria andSteprateIn(List<Double> values) {
            addCriterion("stepRate in", values, "steprate");
            return (Criteria) this;
        }

        public Criteria andSteprateNotIn(List<Double> values) {
            addCriterion("stepRate not in", values, "steprate");
            return (Criteria) this;
        }

        public Criteria andSteprateBetween(Double value1, Double value2) {
            addCriterion("stepRate between", value1, value2, "steprate");
            return (Criteria) this;
        }

        public Criteria andSteprateNotBetween(Double value1, Double value2) {
            addCriterion("stepRate not between", value1, value2, "steprate");
            return (Criteria) this;
        }

        public Criteria andStridelengthIsNull() {
            addCriterion("strideLength is null");
            return (Criteria) this;
        }

        public Criteria andStridelengthIsNotNull() {
            addCriterion("strideLength is not null");
            return (Criteria) this;
        }

        public Criteria andStridelengthEqualTo(Double value) {
            addCriterion("strideLength =", value, "stridelength");
            return (Criteria) this;
        }

        public Criteria andStridelengthNotEqualTo(Double value) {
            addCriterion("strideLength <>", value, "stridelength");
            return (Criteria) this;
        }

        public Criteria andStridelengthGreaterThan(Double value) {
            addCriterion("strideLength >", value, "stridelength");
            return (Criteria) this;
        }

        public Criteria andStridelengthGreaterThanOrEqualTo(Double value) {
            addCriterion("strideLength >=", value, "stridelength");
            return (Criteria) this;
        }

        public Criteria andStridelengthLessThan(Double value) {
            addCriterion("strideLength <", value, "stridelength");
            return (Criteria) this;
        }

        public Criteria andStridelengthLessThanOrEqualTo(Double value) {
            addCriterion("strideLength <=", value, "stridelength");
            return (Criteria) this;
        }

        public Criteria andStridelengthIn(List<Double> values) {
            addCriterion("strideLength in", values, "stridelength");
            return (Criteria) this;
        }

        public Criteria andStridelengthNotIn(List<Double> values) {
            addCriterion("strideLength not in", values, "stridelength");
            return (Criteria) this;
        }

        public Criteria andStridelengthBetween(Double value1, Double value2) {
            addCriterion("strideLength between", value1, value2, "stridelength");
            return (Criteria) this;
        }

        public Criteria andStridelengthNotBetween(Double value1, Double value2) {
            addCriterion("strideLength not between", value1, value2, "stridelength");
            return (Criteria) this;
        }

        public Criteria andSymmetryIsNull() {
            addCriterion("symmetry is null");
            return (Criteria) this;
        }

        public Criteria andSymmetryIsNotNull() {
            addCriterion("symmetry is not null");
            return (Criteria) this;
        }

        public Criteria andSymmetryEqualTo(Double value) {
            addCriterion("symmetry =", value, "symmetry");
            return (Criteria) this;
        }

        public Criteria andSymmetryNotEqualTo(Double value) {
            addCriterion("symmetry <>", value, "symmetry");
            return (Criteria) this;
        }

        public Criteria andSymmetryGreaterThan(Double value) {
            addCriterion("symmetry >", value, "symmetry");
            return (Criteria) this;
        }

        public Criteria andSymmetryGreaterThanOrEqualTo(Double value) {
            addCriterion("symmetry >=", value, "symmetry");
            return (Criteria) this;
        }

        public Criteria andSymmetryLessThan(Double value) {
            addCriterion("symmetry <", value, "symmetry");
            return (Criteria) this;
        }

        public Criteria andSymmetryLessThanOrEqualTo(Double value) {
            addCriterion("symmetry <=", value, "symmetry");
            return (Criteria) this;
        }

        public Criteria andSymmetryIn(List<Double> values) {
            addCriterion("symmetry in", values, "symmetry");
            return (Criteria) this;
        }

        public Criteria andSymmetryNotIn(List<Double> values) {
            addCriterion("symmetry not in", values, "symmetry");
            return (Criteria) this;
        }

        public Criteria andSymmetryBetween(Double value1, Double value2) {
            addCriterion("symmetry between", value1, value2, "symmetry");
            return (Criteria) this;
        }

        public Criteria andSymmetryNotBetween(Double value1, Double value2) {
            addCriterion("symmetry not between", value1, value2, "symmetry");
            return (Criteria) this;
        }

        public Criteria andVariabilityIsNull() {
            addCriterion("variability is null");
            return (Criteria) this;
        }

        public Criteria andVariabilityIsNotNull() {
            addCriterion("variability is not null");
            return (Criteria) this;
        }

        public Criteria andVariabilityEqualTo(Double value) {
            addCriterion("variability =", value, "variability");
            return (Criteria) this;
        }

        public Criteria andVariabilityNotEqualTo(Double value) {
            addCriterion("variability <>", value, "variability");
            return (Criteria) this;
        }

        public Criteria andVariabilityGreaterThan(Double value) {
            addCriterion("variability >", value, "variability");
            return (Criteria) this;
        }

        public Criteria andVariabilityGreaterThanOrEqualTo(Double value) {
            addCriterion("variability >=", value, "variability");
            return (Criteria) this;
        }

        public Criteria andVariabilityLessThan(Double value) {
            addCriterion("variability <", value, "variability");
            return (Criteria) this;
        }

        public Criteria andVariabilityLessThanOrEqualTo(Double value) {
            addCriterion("variability <=", value, "variability");
            return (Criteria) this;
        }

        public Criteria andVariabilityIn(List<Double> values) {
            addCriterion("variability in", values, "variability");
            return (Criteria) this;
        }

        public Criteria andVariabilityNotIn(List<Double> values) {
            addCriterion("variability not in", values, "variability");
            return (Criteria) this;
        }

        public Criteria andVariabilityBetween(Double value1, Double value2) {
            addCriterion("variability between", value1, value2, "variability");
            return (Criteria) this;
        }

        public Criteria andVariabilityNotBetween(Double value1, Double value2) {
            addCriterion("variability not between", value1, value2, "variability");
            return (Criteria) this;
        }

        public Criteria andEversionLeftIsNull() {
            addCriterion("eversion_left is null");
            return (Criteria) this;
        }

        public Criteria andEversionLeftIsNotNull() {
            addCriterion("eversion_left is not null");
            return (Criteria) this;
        }

        public Criteria andEversionLeftEqualTo(Integer value) {
            addCriterion("eversion_left =", value, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andEversionLeftNotEqualTo(Integer value) {
            addCriterion("eversion_left <>", value, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andEversionLeftGreaterThan(Integer value) {
            addCriterion("eversion_left >", value, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andEversionLeftGreaterThanOrEqualTo(Integer value) {
            addCriterion("eversion_left >=", value, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andEversionLeftLessThan(Integer value) {
            addCriterion("eversion_left <", value, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andEversionLeftLessThanOrEqualTo(Integer value) {
            addCriterion("eversion_left <=", value, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andEversionLeftIn(List<Integer> values) {
            addCriterion("eversion_left in", values, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andEversionLeftNotIn(List<Integer> values) {
            addCriterion("eversion_left not in", values, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andEversionLeftBetween(Integer value1, Integer value2) {
            addCriterion("eversion_left between", value1, value2, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andEversionLeftNotBetween(Integer value1, Integer value2) {
            addCriterion("eversion_left not between", value1, value2, "eversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftIsNull() {
            addCriterion("inversion_left is null");
            return (Criteria) this;
        }

        public Criteria andInversionLeftIsNotNull() {
            addCriterion("inversion_left is not null");
            return (Criteria) this;
        }

        public Criteria andInversionLeftEqualTo(Integer value) {
            addCriterion("inversion_left =", value, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftNotEqualTo(Integer value) {
            addCriterion("inversion_left <>", value, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftGreaterThan(Integer value) {
            addCriterion("inversion_left >", value, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftGreaterThanOrEqualTo(Integer value) {
            addCriterion("inversion_left >=", value, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftLessThan(Integer value) {
            addCriterion("inversion_left <", value, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftLessThanOrEqualTo(Integer value) {
            addCriterion("inversion_left <=", value, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftIn(List<Integer> values) {
            addCriterion("inversion_left in", values, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftNotIn(List<Integer> values) {
            addCriterion("inversion_left not in", values, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftBetween(Integer value1, Integer value2) {
            addCriterion("inversion_left between", value1, value2, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andInversionLeftNotBetween(Integer value1, Integer value2) {
            addCriterion("inversion_left not between", value1, value2, "inversionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftIsNull() {
            addCriterion("landingPosition_left is null");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftIsNotNull() {
            addCriterion("landingPosition_left is not null");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftEqualTo(String value) {
            addCriterion("landingPosition_left =", value, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftNotEqualTo(String value) {
            addCriterion("landingPosition_left <>", value, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftGreaterThan(String value) {
            addCriterion("landingPosition_left >", value, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftGreaterThanOrEqualTo(String value) {
            addCriterion("landingPosition_left >=", value, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftLessThan(String value) {
            addCriterion("landingPosition_left <", value, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftLessThanOrEqualTo(String value) {
            addCriterion("landingPosition_left <=", value, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftLike(String value) {
            addCriterion("landingPosition_left like", value, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftNotLike(String value) {
            addCriterion("landingPosition_left not like", value, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftIn(List<String> values) {
            addCriterion("landingPosition_left in", values, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftNotIn(List<String> values) {
            addCriterion("landingPosition_left not in", values, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftBetween(String value1, String value2) {
            addCriterion("landingPosition_left between", value1, value2, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andLandingpositionLeftNotBetween(String value1, String value2) {
            addCriterion("landingPosition_left not between", value1, value2, "landingpositionLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftIsNull() {
            addCriterion("stanceDurationMean_left is null");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftIsNotNull() {
            addCriterion("stanceDurationMean_left is not null");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftEqualTo(Double value) {
            addCriterion("stanceDurationMean_left =", value, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftNotEqualTo(Double value) {
            addCriterion("stanceDurationMean_left <>", value, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftGreaterThan(Double value) {
            addCriterion("stanceDurationMean_left >", value, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftGreaterThanOrEqualTo(Double value) {
            addCriterion("stanceDurationMean_left >=", value, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftLessThan(Double value) {
            addCriterion("stanceDurationMean_left <", value, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftLessThanOrEqualTo(Double value) {
            addCriterion("stanceDurationMean_left <=", value, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftIn(List<Double> values) {
            addCriterion("stanceDurationMean_left in", values, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftNotIn(List<Double> values) {
            addCriterion("stanceDurationMean_left not in", values, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftBetween(Double value1, Double value2) {
            addCriterion("stanceDurationMean_left between", value1, value2, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanLeftNotBetween(Double value1, Double value2) {
            addCriterion("stanceDurationMean_left not between", value1, value2, "stancedurationmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftIsNull() {
            addCriterion("stepHeightMean_left is null");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftIsNotNull() {
            addCriterion("stepHeightMean_left is not null");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftEqualTo(Double value) {
            addCriterion("stepHeightMean_left =", value, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftNotEqualTo(Double value) {
            addCriterion("stepHeightMean_left <>", value, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftGreaterThan(Double value) {
            addCriterion("stepHeightMean_left >", value, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftGreaterThanOrEqualTo(Double value) {
            addCriterion("stepHeightMean_left >=", value, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftLessThan(Double value) {
            addCriterion("stepHeightMean_left <", value, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftLessThanOrEqualTo(Double value) {
            addCriterion("stepHeightMean_left <=", value, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftIn(List<Double> values) {
            addCriterion("stepHeightMean_left in", values, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftNotIn(List<Double> values) {
            addCriterion("stepHeightMean_left not in", values, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftBetween(Double value1, Double value2) {
            addCriterion("stepHeightMean_left between", value1, value2, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanLeftNotBetween(Double value1, Double value2) {
            addCriterion("stepHeightMean_left not between", value1, value2, "stepheightmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftIsNull() {
            addCriterion("supportStabilityMean_left is null");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftIsNotNull() {
            addCriterion("supportStabilityMean_left is not null");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftEqualTo(Double value) {
            addCriterion("supportStabilityMean_left =", value, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftNotEqualTo(Double value) {
            addCriterion("supportStabilityMean_left <>", value, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftGreaterThan(Double value) {
            addCriterion("supportStabilityMean_left >", value, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftGreaterThanOrEqualTo(Double value) {
            addCriterion("supportStabilityMean_left >=", value, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftLessThan(Double value) {
            addCriterion("supportStabilityMean_left <", value, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftLessThanOrEqualTo(Double value) {
            addCriterion("supportStabilityMean_left <=", value, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftIn(List<Double> values) {
            addCriterion("supportStabilityMean_left in", values, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftNotIn(List<Double> values) {
            addCriterion("supportStabilityMean_left not in", values, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftBetween(Double value1, Double value2) {
            addCriterion("supportStabilityMean_left between", value1, value2, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanLeftNotBetween(Double value1, Double value2) {
            addCriterion("supportStabilityMean_left not between", value1, value2, "supportstabilitymeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftIsNull() {
            addCriterion("swingWidthMean_left is null");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftIsNotNull() {
            addCriterion("swingWidthMean_left is not null");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftEqualTo(Double value) {
            addCriterion("swingWidthMean_left =", value, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftNotEqualTo(Double value) {
            addCriterion("swingWidthMean_left <>", value, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftGreaterThan(Double value) {
            addCriterion("swingWidthMean_left >", value, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftGreaterThanOrEqualTo(Double value) {
            addCriterion("swingWidthMean_left >=", value, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftLessThan(Double value) {
            addCriterion("swingWidthMean_left <", value, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftLessThanOrEqualTo(Double value) {
            addCriterion("swingWidthMean_left <=", value, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftIn(List<Double> values) {
            addCriterion("swingWidthMean_left in", values, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftNotIn(List<Double> values) {
            addCriterion("swingWidthMean_left not in", values, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftBetween(Double value1, Double value2) {
            addCriterion("swingWidthMean_left between", value1, value2, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanLeftNotBetween(Double value1, Double value2) {
            addCriterion("swingWidthMean_left not between", value1, value2, "swingwidthmeanLeft");
            return (Criteria) this;
        }

        public Criteria andEversionRightIsNull() {
            addCriterion("eversion_right is null");
            return (Criteria) this;
        }

        public Criteria andEversionRightIsNotNull() {
            addCriterion("eversion_right is not null");
            return (Criteria) this;
        }

        public Criteria andEversionRightEqualTo(Integer value) {
            addCriterion("eversion_right =", value, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andEversionRightNotEqualTo(Integer value) {
            addCriterion("eversion_right <>", value, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andEversionRightGreaterThan(Integer value) {
            addCriterion("eversion_right >", value, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andEversionRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("eversion_right >=", value, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andEversionRightLessThan(Integer value) {
            addCriterion("eversion_right <", value, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andEversionRightLessThanOrEqualTo(Integer value) {
            addCriterion("eversion_right <=", value, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andEversionRightIn(List<Integer> values) {
            addCriterion("eversion_right in", values, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andEversionRightNotIn(List<Integer> values) {
            addCriterion("eversion_right not in", values, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andEversionRightBetween(Integer value1, Integer value2) {
            addCriterion("eversion_right between", value1, value2, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andEversionRightNotBetween(Integer value1, Integer value2) {
            addCriterion("eversion_right not between", value1, value2, "eversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightIsNull() {
            addCriterion("inversion_right is null");
            return (Criteria) this;
        }

        public Criteria andInversionRightIsNotNull() {
            addCriterion("inversion_right is not null");
            return (Criteria) this;
        }

        public Criteria andInversionRightEqualTo(Integer value) {
            addCriterion("inversion_right =", value, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightNotEqualTo(Integer value) {
            addCriterion("inversion_right <>", value, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightGreaterThan(Integer value) {
            addCriterion("inversion_right >", value, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightGreaterThanOrEqualTo(Integer value) {
            addCriterion("inversion_right >=", value, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightLessThan(Integer value) {
            addCriterion("inversion_right <", value, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightLessThanOrEqualTo(Integer value) {
            addCriterion("inversion_right <=", value, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightIn(List<Integer> values) {
            addCriterion("inversion_right in", values, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightNotIn(List<Integer> values) {
            addCriterion("inversion_right not in", values, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightBetween(Integer value1, Integer value2) {
            addCriterion("inversion_right between", value1, value2, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andInversionRightNotBetween(Integer value1, Integer value2) {
            addCriterion("inversion_right not between", value1, value2, "inversionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightIsNull() {
            addCriterion("landingPosition_right is null");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightIsNotNull() {
            addCriterion("landingPosition_right is not null");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightEqualTo(String value) {
            addCriterion("landingPosition_right =", value, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightNotEqualTo(String value) {
            addCriterion("landingPosition_right <>", value, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightGreaterThan(String value) {
            addCriterion("landingPosition_right >", value, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightGreaterThanOrEqualTo(String value) {
            addCriterion("landingPosition_right >=", value, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightLessThan(String value) {
            addCriterion("landingPosition_right <", value, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightLessThanOrEqualTo(String value) {
            addCriterion("landingPosition_right <=", value, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightLike(String value) {
            addCriterion("landingPosition_right like", value, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightNotLike(String value) {
            addCriterion("landingPosition_right not like", value, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightIn(List<String> values) {
            addCriterion("landingPosition_right in", values, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightNotIn(List<String> values) {
            addCriterion("landingPosition_right not in", values, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightBetween(String value1, String value2) {
            addCriterion("landingPosition_right between", value1, value2, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andLandingpositionRightNotBetween(String value1, String value2) {
            addCriterion("landingPosition_right not between", value1, value2, "landingpositionRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightIsNull() {
            addCriterion("stanceDurationMean_right is null");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightIsNotNull() {
            addCriterion("stanceDurationMean_right is not null");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightEqualTo(Double value) {
            addCriterion("stanceDurationMean_right =", value, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightNotEqualTo(Double value) {
            addCriterion("stanceDurationMean_right <>", value, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightGreaterThan(Double value) {
            addCriterion("stanceDurationMean_right >", value, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightGreaterThanOrEqualTo(Double value) {
            addCriterion("stanceDurationMean_right >=", value, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightLessThan(Double value) {
            addCriterion("stanceDurationMean_right <", value, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightLessThanOrEqualTo(Double value) {
            addCriterion("stanceDurationMean_right <=", value, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightIn(List<Double> values) {
            addCriterion("stanceDurationMean_right in", values, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightNotIn(List<Double> values) {
            addCriterion("stanceDurationMean_right not in", values, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightBetween(Double value1, Double value2) {
            addCriterion("stanceDurationMean_right between", value1, value2, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStancedurationmeanRightNotBetween(Double value1, Double value2) {
            addCriterion("stanceDurationMean_right not between", value1, value2, "stancedurationmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightIsNull() {
            addCriterion("stepHeightMean_right is null");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightIsNotNull() {
            addCriterion("stepHeightMean_right is not null");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightEqualTo(Double value) {
            addCriterion("stepHeightMean_right =", value, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightNotEqualTo(Double value) {
            addCriterion("stepHeightMean_right <>", value, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightGreaterThan(Double value) {
            addCriterion("stepHeightMean_right >", value, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightGreaterThanOrEqualTo(Double value) {
            addCriterion("stepHeightMean_right >=", value, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightLessThan(Double value) {
            addCriterion("stepHeightMean_right <", value, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightLessThanOrEqualTo(Double value) {
            addCriterion("stepHeightMean_right <=", value, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightIn(List<Double> values) {
            addCriterion("stepHeightMean_right in", values, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightNotIn(List<Double> values) {
            addCriterion("stepHeightMean_right not in", values, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightBetween(Double value1, Double value2) {
            addCriterion("stepHeightMean_right between", value1, value2, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andStepheightmeanRightNotBetween(Double value1, Double value2) {
            addCriterion("stepHeightMean_right not between", value1, value2, "stepheightmeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightIsNull() {
            addCriterion("supportStabilityMean_right is null");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightIsNotNull() {
            addCriterion("supportStabilityMean_right is not null");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightEqualTo(Double value) {
            addCriterion("supportStabilityMean_right =", value, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightNotEqualTo(Double value) {
            addCriterion("supportStabilityMean_right <>", value, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightGreaterThan(Double value) {
            addCriterion("supportStabilityMean_right >", value, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightGreaterThanOrEqualTo(Double value) {
            addCriterion("supportStabilityMean_right >=", value, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightLessThan(Double value) {
            addCriterion("supportStabilityMean_right <", value, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightLessThanOrEqualTo(Double value) {
            addCriterion("supportStabilityMean_right <=", value, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightIn(List<Double> values) {
            addCriterion("supportStabilityMean_right in", values, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightNotIn(List<Double> values) {
            addCriterion("supportStabilityMean_right not in", values, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightBetween(Double value1, Double value2) {
            addCriterion("supportStabilityMean_right between", value1, value2, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSupportstabilitymeanRightNotBetween(Double value1, Double value2) {
            addCriterion("supportStabilityMean_right not between", value1, value2, "supportstabilitymeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightIsNull() {
            addCriterion("swingWidthMean_right is null");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightIsNotNull() {
            addCriterion("swingWidthMean_right is not null");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightEqualTo(Double value) {
            addCriterion("swingWidthMean_right =", value, "swingwidthmeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightNotEqualTo(Double value) {
            addCriterion("swingWidthMean_right <>", value, "swingwidthmeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightGreaterThan(Double value) {
            addCriterion("swingWidthMean_right >", value, "swingwidthmeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightGreaterThanOrEqualTo(Double value) {
            addCriterion("swingWidthMean_right >=", value, "swingwidthmeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightLessThan(Double value) {
            addCriterion("swingWidthMean_right <", value, "swingwidthmeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightLessThanOrEqualTo(Double value) {
            addCriterion("swingWidthMean_right <=", value, "swingwidthmeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightIn(List<Double> values) {
            addCriterion("swingWidthMean_right in", values, "swingwidthmeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightNotIn(List<Double> values) {
            addCriterion("swingWidthMean_right not in", values, "swingwidthmeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightBetween(Double value1, Double value2) {
            addCriterion("swingWidthMean_right between", value1, value2, "swingwidthmeanRight");
            return (Criteria) this;
        }

        public Criteria andSwingwidthmeanRightNotBetween(Double value1, Double value2) {
            addCriterion("swingWidthMean_right not between", value1, value2, "swingwidthmeanRight");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}