package com.intellingence.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShoepadDataQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public ShoepadDataQuery() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andResultidIsNull() {
            addCriterion("resultId is null");
            return (Criteria) this;
        }

        public Criteria andResultidIsNotNull() {
            addCriterion("resultId is not null");
            return (Criteria) this;
        }

        public Criteria andResultidEqualTo(Integer value) {
            addCriterion("resultId =", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotEqualTo(Integer value) {
            addCriterion("resultId <>", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThan(Integer value) {
            addCriterion("resultId >", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidGreaterThanOrEqualTo(Integer value) {
            addCriterion("resultId >=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThan(Integer value) {
            addCriterion("resultId <", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidLessThanOrEqualTo(Integer value) {
            addCriterion("resultId <=", value, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidIn(List<Integer> values) {
            addCriterion("resultId in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotIn(List<Integer> values) {
            addCriterion("resultId not in", values, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidBetween(Integer value1, Integer value2) {
            addCriterion("resultId between", value1, value2, "resultid");
            return (Criteria) this;
        }

        public Criteria andResultidNotBetween(Integer value1, Integer value2) {
            addCriterion("resultId not between", value1, value2, "resultid");
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

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(String value) {
            addCriterion("creationTime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(String value) {
            addCriterion("creationTime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(String value) {
            addCriterion("creationTime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(String value) {
            addCriterion("creationTime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(String value) {
            addCriterion("creationTime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(String value) {
            addCriterion("creationTime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLike(String value) {
            addCriterion("creationTime like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotLike(String value) {
            addCriterion("creationTime not like", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<String> values) {
            addCriterion("creationTime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<String> values) {
            addCriterion("creationTime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(String value1, String value2) {
            addCriterion("creationTime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(String value1, String value2) {
            addCriterion("creationTime not between", value1, value2, "creationtime");
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(String value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(String value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(String value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(String value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(String value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(String value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLike(String value) {
            addCriterion("weight like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotLike(String value) {
            addCriterion("weight not like", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<String> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<String> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(String value1, String value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(String value1, String value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumIsNull() {
            addCriterion("leftChecksum is null");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumIsNotNull() {
            addCriterion("leftChecksum is not null");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumEqualTo(String value) {
            addCriterion("leftChecksum =", value, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumNotEqualTo(String value) {
            addCriterion("leftChecksum <>", value, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumGreaterThan(String value) {
            addCriterion("leftChecksum >", value, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumGreaterThanOrEqualTo(String value) {
            addCriterion("leftChecksum >=", value, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumLessThan(String value) {
            addCriterion("leftChecksum <", value, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumLessThanOrEqualTo(String value) {
            addCriterion("leftChecksum <=", value, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumLike(String value) {
            addCriterion("leftChecksum like", value, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumNotLike(String value) {
            addCriterion("leftChecksum not like", value, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumIn(List<String> values) {
            addCriterion("leftChecksum in", values, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumNotIn(List<String> values) {
            addCriterion("leftChecksum not in", values, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumBetween(String value1, String value2) {
            addCriterion("leftChecksum between", value1, value2, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andLeftchecksumNotBetween(String value1, String value2) {
            addCriterion("leftChecksum not between", value1, value2, "leftchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumIsNull() {
            addCriterion("rightChecksum is null");
            return (Criteria) this;
        }

        public Criteria andRightchecksumIsNotNull() {
            addCriterion("rightChecksum is not null");
            return (Criteria) this;
        }

        public Criteria andRightchecksumEqualTo(String value) {
            addCriterion("rightChecksum =", value, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumNotEqualTo(String value) {
            addCriterion("rightChecksum <>", value, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumGreaterThan(String value) {
            addCriterion("rightChecksum >", value, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumGreaterThanOrEqualTo(String value) {
            addCriterion("rightChecksum >=", value, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumLessThan(String value) {
            addCriterion("rightChecksum <", value, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumLessThanOrEqualTo(String value) {
            addCriterion("rightChecksum <=", value, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumLike(String value) {
            addCriterion("rightChecksum like", value, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumNotLike(String value) {
            addCriterion("rightChecksum not like", value, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumIn(List<String> values) {
            addCriterion("rightChecksum in", values, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumNotIn(List<String> values) {
            addCriterion("rightChecksum not in", values, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumBetween(String value1, String value2) {
            addCriterion("rightChecksum between", value1, value2, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andRightchecksumNotBetween(String value1, String value2) {
            addCriterion("rightChecksum not between", value1, value2, "rightchecksum");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(String value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(String value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(String value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(String value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(String value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(String value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLike(String value) {
            addCriterion("distance like", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotLike(String value) {
            addCriterion("distance not like", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<String> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<String> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(String value1, String value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(String value1, String value2) {
            addCriterion("distance not between", value1, value2, "distance");
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

        public Criteria andDurationEqualTo(String value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(String value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(String value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(String value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(String value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(String value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLike(String value) {
            addCriterion("duration like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotLike(String value) {
            addCriterion("duration not like", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<String> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<String> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(String value1, String value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(String value1, String value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIsNull() {
            addCriterion("maxSpeed is null");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIsNotNull() {
            addCriterion("maxSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andMaxspeedEqualTo(String value) {
            addCriterion("maxSpeed =", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotEqualTo(String value) {
            addCriterion("maxSpeed <>", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedGreaterThan(String value) {
            addCriterion("maxSpeed >", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedGreaterThanOrEqualTo(String value) {
            addCriterion("maxSpeed >=", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLessThan(String value) {
            addCriterion("maxSpeed <", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLessThanOrEqualTo(String value) {
            addCriterion("maxSpeed <=", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedLike(String value) {
            addCriterion("maxSpeed like", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotLike(String value) {
            addCriterion("maxSpeed not like", value, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedIn(List<String> values) {
            addCriterion("maxSpeed in", values, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotIn(List<String> values) {
            addCriterion("maxSpeed not in", values, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedBetween(String value1, String value2) {
            addCriterion("maxSpeed between", value1, value2, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andMaxspeedNotBetween(String value1, String value2) {
            addCriterion("maxSpeed not between", value1, value2, "maxspeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedIsNull() {
            addCriterion("averageSpeed is null");
            return (Criteria) this;
        }

        public Criteria andAveragespeedIsNotNull() {
            addCriterion("averageSpeed is not null");
            return (Criteria) this;
        }

        public Criteria andAveragespeedEqualTo(String value) {
            addCriterion("averageSpeed =", value, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedNotEqualTo(String value) {
            addCriterion("averageSpeed <>", value, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedGreaterThan(String value) {
            addCriterion("averageSpeed >", value, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedGreaterThanOrEqualTo(String value) {
            addCriterion("averageSpeed >=", value, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedLessThan(String value) {
            addCriterion("averageSpeed <", value, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedLessThanOrEqualTo(String value) {
            addCriterion("averageSpeed <=", value, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedLike(String value) {
            addCriterion("averageSpeed like", value, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedNotLike(String value) {
            addCriterion("averageSpeed not like", value, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedIn(List<String> values) {
            addCriterion("averageSpeed in", values, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedNotIn(List<String> values) {
            addCriterion("averageSpeed not in", values, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedBetween(String value1, String value2) {
            addCriterion("averageSpeed between", value1, value2, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andAveragespeedNotBetween(String value1, String value2) {
            addCriterion("averageSpeed not between", value1, value2, "averagespeed");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayIsNull() {
            addCriterion("speedAllocationArray is null");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayIsNotNull() {
            addCriterion("speedAllocationArray is not null");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayEqualTo(String value) {
            addCriterion("speedAllocationArray =", value, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayNotEqualTo(String value) {
            addCriterion("speedAllocationArray <>", value, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayGreaterThan(String value) {
            addCriterion("speedAllocationArray >", value, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayGreaterThanOrEqualTo(String value) {
            addCriterion("speedAllocationArray >=", value, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayLessThan(String value) {
            addCriterion("speedAllocationArray <", value, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayLessThanOrEqualTo(String value) {
            addCriterion("speedAllocationArray <=", value, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayLike(String value) {
            addCriterion("speedAllocationArray like", value, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayNotLike(String value) {
            addCriterion("speedAllocationArray not like", value, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayIn(List<String> values) {
            addCriterion("speedAllocationArray in", values, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayNotIn(List<String> values) {
            addCriterion("speedAllocationArray not in", values, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayBetween(String value1, String value2) {
            addCriterion("speedAllocationArray between", value1, value2, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andSpeedallocationarrayNotBetween(String value1, String value2) {
            addCriterion("speedAllocationArray not between", value1, value2, "speedallocationarray");
            return (Criteria) this;
        }

        public Criteria andCalorieIsNull() {
            addCriterion("calorie is null");
            return (Criteria) this;
        }

        public Criteria andCalorieIsNotNull() {
            addCriterion("calorie is not null");
            return (Criteria) this;
        }

        public Criteria andCalorieEqualTo(String value) {
            addCriterion("calorie =", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotEqualTo(String value) {
            addCriterion("calorie <>", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieGreaterThan(String value) {
            addCriterion("calorie >", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieGreaterThanOrEqualTo(String value) {
            addCriterion("calorie >=", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieLessThan(String value) {
            addCriterion("calorie <", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieLessThanOrEqualTo(String value) {
            addCriterion("calorie <=", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieLike(String value) {
            addCriterion("calorie like", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotLike(String value) {
            addCriterion("calorie not like", value, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieIn(List<String> values) {
            addCriterion("calorie in", values, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotIn(List<String> values) {
            addCriterion("calorie not in", values, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieBetween(String value1, String value2) {
            addCriterion("calorie between", value1, value2, "calorie");
            return (Criteria) this;
        }

        public Criteria andCalorieNotBetween(String value1, String value2) {
            addCriterion("calorie not between", value1, value2, "calorie");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayIsNull() {
            addCriterion("strideLengthArray is null");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayIsNotNull() {
            addCriterion("strideLengthArray is not null");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayEqualTo(String value) {
            addCriterion("strideLengthArray =", value, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayNotEqualTo(String value) {
            addCriterion("strideLengthArray <>", value, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayGreaterThan(String value) {
            addCriterion("strideLengthArray >", value, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayGreaterThanOrEqualTo(String value) {
            addCriterion("strideLengthArray >=", value, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayLessThan(String value) {
            addCriterion("strideLengthArray <", value, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayLessThanOrEqualTo(String value) {
            addCriterion("strideLengthArray <=", value, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayLike(String value) {
            addCriterion("strideLengthArray like", value, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayNotLike(String value) {
            addCriterion("strideLengthArray not like", value, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayIn(List<String> values) {
            addCriterion("strideLengthArray in", values, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayNotIn(List<String> values) {
            addCriterion("strideLengthArray not in", values, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayBetween(String value1, String value2) {
            addCriterion("strideLengthArray between", value1, value2, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStridelengtharrayNotBetween(String value1, String value2) {
            addCriterion("strideLengthArray not between", value1, value2, "stridelengtharray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayIsNull() {
            addCriterion("stepRateArray is null");
            return (Criteria) this;
        }

        public Criteria andStepratearrayIsNotNull() {
            addCriterion("stepRateArray is not null");
            return (Criteria) this;
        }

        public Criteria andStepratearrayEqualTo(String value) {
            addCriterion("stepRateArray =", value, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayNotEqualTo(String value) {
            addCriterion("stepRateArray <>", value, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayGreaterThan(String value) {
            addCriterion("stepRateArray >", value, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayGreaterThanOrEqualTo(String value) {
            addCriterion("stepRateArray >=", value, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayLessThan(String value) {
            addCriterion("stepRateArray <", value, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayLessThanOrEqualTo(String value) {
            addCriterion("stepRateArray <=", value, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayLike(String value) {
            addCriterion("stepRateArray like", value, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayNotLike(String value) {
            addCriterion("stepRateArray not like", value, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayIn(List<String> values) {
            addCriterion("stepRateArray in", values, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayNotIn(List<String> values) {
            addCriterion("stepRateArray not in", values, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayBetween(String value1, String value2) {
            addCriterion("stepRateArray between", value1, value2, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepratearrayNotBetween(String value1, String value2) {
            addCriterion("stepRateArray not between", value1, value2, "stepratearray");
            return (Criteria) this;
        }

        public Criteria andStepheighIsNull() {
            addCriterion("stepHeigh is null");
            return (Criteria) this;
        }

        public Criteria andStepheighIsNotNull() {
            addCriterion("stepHeigh is not null");
            return (Criteria) this;
        }

        public Criteria andStepheighEqualTo(String value) {
            addCriterion("stepHeigh =", value, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighNotEqualTo(String value) {
            addCriterion("stepHeigh <>", value, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighGreaterThan(String value) {
            addCriterion("stepHeigh >", value, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighGreaterThanOrEqualTo(String value) {
            addCriterion("stepHeigh >=", value, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighLessThan(String value) {
            addCriterion("stepHeigh <", value, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighLessThanOrEqualTo(String value) {
            addCriterion("stepHeigh <=", value, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighLike(String value) {
            addCriterion("stepHeigh like", value, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighNotLike(String value) {
            addCriterion("stepHeigh not like", value, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighIn(List<String> values) {
            addCriterion("stepHeigh in", values, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighNotIn(List<String> values) {
            addCriterion("stepHeigh not in", values, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighBetween(String value1, String value2) {
            addCriterion("stepHeigh between", value1, value2, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andStepheighNotBetween(String value1, String value2) {
            addCriterion("stepHeigh not between", value1, value2, "stepheigh");
            return (Criteria) this;
        }

        public Criteria andSwingwidthIsNull() {
            addCriterion("swingWidth is null");
            return (Criteria) this;
        }

        public Criteria andSwingwidthIsNotNull() {
            addCriterion("swingWidth is not null");
            return (Criteria) this;
        }

        public Criteria andSwingwidthEqualTo(String value) {
            addCriterion("swingWidth =", value, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthNotEqualTo(String value) {
            addCriterion("swingWidth <>", value, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthGreaterThan(String value) {
            addCriterion("swingWidth >", value, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthGreaterThanOrEqualTo(String value) {
            addCriterion("swingWidth >=", value, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthLessThan(String value) {
            addCriterion("swingWidth <", value, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthLessThanOrEqualTo(String value) {
            addCriterion("swingWidth <=", value, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthLike(String value) {
            addCriterion("swingWidth like", value, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthNotLike(String value) {
            addCriterion("swingWidth not like", value, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthIn(List<String> values) {
            addCriterion("swingWidth in", values, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthNotIn(List<String> values) {
            addCriterion("swingWidth not in", values, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthBetween(String value1, String value2) {
            addCriterion("swingWidth between", value1, value2, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andSwingwidthNotBetween(String value1, String value2) {
            addCriterion("swingWidth not between", value1, value2, "swingwidth");
            return (Criteria) this;
        }

        public Criteria andStancedurationIsNull() {
            addCriterion("stanceDuration is null");
            return (Criteria) this;
        }

        public Criteria andStancedurationIsNotNull() {
            addCriterion("stanceDuration is not null");
            return (Criteria) this;
        }

        public Criteria andStancedurationEqualTo(String value) {
            addCriterion("stanceDuration =", value, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationNotEqualTo(String value) {
            addCriterion("stanceDuration <>", value, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationGreaterThan(String value) {
            addCriterion("stanceDuration >", value, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationGreaterThanOrEqualTo(String value) {
            addCriterion("stanceDuration >=", value, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationLessThan(String value) {
            addCriterion("stanceDuration <", value, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationLessThanOrEqualTo(String value) {
            addCriterion("stanceDuration <=", value, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationLike(String value) {
            addCriterion("stanceDuration like", value, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationNotLike(String value) {
            addCriterion("stanceDuration not like", value, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationIn(List<String> values) {
            addCriterion("stanceDuration in", values, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationNotIn(List<String> values) {
            addCriterion("stanceDuration not in", values, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationBetween(String value1, String value2) {
            addCriterion("stanceDuration between", value1, value2, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andStancedurationNotBetween(String value1, String value2) {
            addCriterion("stanceDuration not between", value1, value2, "stanceduration");
            return (Criteria) this;
        }

        public Criteria andLandingcrashIsNull() {
            addCriterion("landingCrash is null");
            return (Criteria) this;
        }

        public Criteria andLandingcrashIsNotNull() {
            addCriterion("landingCrash is not null");
            return (Criteria) this;
        }

        public Criteria andLandingcrashEqualTo(String value) {
            addCriterion("landingCrash =", value, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashNotEqualTo(String value) {
            addCriterion("landingCrash <>", value, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashGreaterThan(String value) {
            addCriterion("landingCrash >", value, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashGreaterThanOrEqualTo(String value) {
            addCriterion("landingCrash >=", value, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashLessThan(String value) {
            addCriterion("landingCrash <", value, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashLessThanOrEqualTo(String value) {
            addCriterion("landingCrash <=", value, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashLike(String value) {
            addCriterion("landingCrash like", value, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashNotLike(String value) {
            addCriterion("landingCrash not like", value, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashIn(List<String> values) {
            addCriterion("landingCrash in", values, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashNotIn(List<String> values) {
            addCriterion("landingCrash not in", values, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashBetween(String value1, String value2) {
            addCriterion("landingCrash between", value1, value2, "landingcrash");
            return (Criteria) this;
        }

        public Criteria andLandingcrashNotBetween(String value1, String value2) {
            addCriterion("landingCrash not between", value1, value2, "landingcrash");
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