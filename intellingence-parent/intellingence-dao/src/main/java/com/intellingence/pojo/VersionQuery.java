package com.intellingence.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class VersionQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public VersionQuery() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andVersioncodeIsNull() {
            addCriterion("versionCode is null");
            return (Criteria) this;
        }

        public Criteria andVersioncodeIsNotNull() {
            addCriterion("versionCode is not null");
            return (Criteria) this;
        }

        public Criteria andVersioncodeEqualTo(Integer value) {
            addCriterion("versionCode =", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotEqualTo(Integer value) {
            addCriterion("versionCode <>", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeGreaterThan(Integer value) {
            addCriterion("versionCode >", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("versionCode >=", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeLessThan(Integer value) {
            addCriterion("versionCode <", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeLessThanOrEqualTo(Integer value) {
            addCriterion("versionCode <=", value, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeIn(List<Integer> values) {
            addCriterion("versionCode in", values, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotIn(List<Integer> values) {
            addCriterion("versionCode not in", values, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeBetween(Integer value1, Integer value2) {
            addCriterion("versionCode between", value1, value2, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersioncodeNotBetween(Integer value1, Integer value2) {
            addCriterion("versionCode not between", value1, value2, "versioncode");
            return (Criteria) this;
        }

        public Criteria andVersionnameIsNull() {
            addCriterion("versionName is null");
            return (Criteria) this;
        }

        public Criteria andVersionnameIsNotNull() {
            addCriterion("versionName is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnameEqualTo(String value) {
            addCriterion("versionName =", value, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameNotEqualTo(String value) {
            addCriterion("versionName <>", value, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameGreaterThan(String value) {
            addCriterion("versionName >", value, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameGreaterThanOrEqualTo(String value) {
            addCriterion("versionName >=", value, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameLessThan(String value) {
            addCriterion("versionName <", value, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameLessThanOrEqualTo(String value) {
            addCriterion("versionName <=", value, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameLike(String value) {
            addCriterion("versionName like", value, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameNotLike(String value) {
            addCriterion("versionName not like", value, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameIn(List<String> values) {
            addCriterion("versionName in", values, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameNotIn(List<String> values) {
            addCriterion("versionName not in", values, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameBetween(String value1, String value2) {
            addCriterion("versionName between", value1, value2, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersionnameNotBetween(String value1, String value2) {
            addCriterion("versionName not between", value1, value2, "versionname");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeIsNull() {
            addCriterion("versionDateTime is null");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeIsNotNull() {
            addCriterion("versionDateTime is not null");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeEqualTo(Date value) {
            addCriterion("versionDateTime =", value, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeNotEqualTo(Date value) {
            addCriterion("versionDateTime <>", value, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeGreaterThan(Date value) {
            addCriterion("versionDateTime >", value, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("versionDateTime >=", value, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeLessThan(Date value) {
            addCriterion("versionDateTime <", value, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeLessThanOrEqualTo(Date value) {
            addCriterion("versionDateTime <=", value, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeIn(List<Date> values) {
            addCriterion("versionDateTime in", values, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeNotIn(List<Date> values) {
            addCriterion("versionDateTime not in", values, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeBetween(Date value1, Date value2) {
            addCriterion("versionDateTime between", value1, value2, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andVersiondatetimeNotBetween(Date value1, Date value2) {
            addCriterion("versionDateTime not between", value1, value2, "versiondatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatdateIsNull() {
            addCriterion("updatdate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatdateIsNotNull() {
            addCriterion("updatdate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatdateEqualTo(Date value) {
            addCriterionForJDBCDate("updatdate =", value, "updatdate");
            return (Criteria) this;
        }

        public Criteria andUpdatdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("updatdate <>", value, "updatdate");
            return (Criteria) this;
        }

        public Criteria andUpdatdateGreaterThan(Date value) {
            addCriterionForJDBCDate("updatdate >", value, "updatdate");
            return (Criteria) this;
        }

        public Criteria andUpdatdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatdate >=", value, "updatdate");
            return (Criteria) this;
        }

        public Criteria andUpdatdateLessThan(Date value) {
            addCriterionForJDBCDate("updatdate <", value, "updatdate");
            return (Criteria) this;
        }

        public Criteria andUpdatdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updatdate <=", value, "updatdate");
            return (Criteria) this;
        }

        public Criteria andUpdatdateIn(List<Date> values) {
            addCriterionForJDBCDate("updatdate in", values, "updatdate");
            return (Criteria) this;
        }

        public Criteria andUpdatdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("updatdate not in", values, "updatdate");
            return (Criteria) this;
        }

        public Criteria andUpdatdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatdate between", value1, value2, "updatdate");
            return (Criteria) this;
        }

        public Criteria andUpdatdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updatdate not between", value1, value2, "updatdate");
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