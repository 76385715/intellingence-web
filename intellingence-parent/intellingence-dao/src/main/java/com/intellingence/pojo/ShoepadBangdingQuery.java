package com.intellingence.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShoepadBangdingQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public ShoepadBangdingQuery() {
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
            addCriterion("userID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacIsNull() {
            addCriterion("leftDeviceMAC is null");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacIsNotNull() {
            addCriterion("leftDeviceMAC is not null");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacEqualTo(String value) {
            addCriterion("leftDeviceMAC =", value, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacNotEqualTo(String value) {
            addCriterion("leftDeviceMAC <>", value, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacGreaterThan(String value) {
            addCriterion("leftDeviceMAC >", value, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacGreaterThanOrEqualTo(String value) {
            addCriterion("leftDeviceMAC >=", value, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacLessThan(String value) {
            addCriterion("leftDeviceMAC <", value, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacLessThanOrEqualTo(String value) {
            addCriterion("leftDeviceMAC <=", value, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacLike(String value) {
            addCriterion("leftDeviceMAC like", value, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacNotLike(String value) {
            addCriterion("leftDeviceMAC not like", value, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacIn(List<String> values) {
            addCriterion("leftDeviceMAC in", values, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacNotIn(List<String> values) {
            addCriterion("leftDeviceMAC not in", values, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacBetween(String value1, String value2) {
            addCriterion("leftDeviceMAC between", value1, value2, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andLeftdevicemacNotBetween(String value1, String value2) {
            addCriterion("leftDeviceMAC not between", value1, value2, "leftdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacIsNull() {
            addCriterion("rightDeviceMAC is null");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacIsNotNull() {
            addCriterion("rightDeviceMAC is not null");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacEqualTo(String value) {
            addCriterion("rightDeviceMAC =", value, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacNotEqualTo(String value) {
            addCriterion("rightDeviceMAC <>", value, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacGreaterThan(String value) {
            addCriterion("rightDeviceMAC >", value, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacGreaterThanOrEqualTo(String value) {
            addCriterion("rightDeviceMAC >=", value, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacLessThan(String value) {
            addCriterion("rightDeviceMAC <", value, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacLessThanOrEqualTo(String value) {
            addCriterion("rightDeviceMAC <=", value, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacLike(String value) {
            addCriterion("rightDeviceMAC like", value, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacNotLike(String value) {
            addCriterion("rightDeviceMAC not like", value, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacIn(List<String> values) {
            addCriterion("rightDeviceMAC in", values, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacNotIn(List<String> values) {
            addCriterion("rightDeviceMAC not in", values, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacBetween(String value1, String value2) {
            addCriterion("rightDeviceMAC between", value1, value2, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andRightdevicemacNotBetween(String value1, String value2) {
            addCriterion("rightDeviceMAC not between", value1, value2, "rightdevicemac");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
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