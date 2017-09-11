package com.intellingence.pojo;

import java.util.ArrayList;
import java.util.List;

public class QuarterHealthdataQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public QuarterHealthdataQuery() {
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

        public Criteria andYearIsNull() {
            addCriterion("Year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("Year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("Year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("Year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("Year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("Year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("Year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("Year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("Year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("Year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("Year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("Year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNull() {
            addCriterion("Quarter is null");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNotNull() {
            addCriterion("Quarter is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterEqualTo(Integer value) {
            addCriterion("Quarter =", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotEqualTo(Integer value) {
            addCriterion("Quarter <>", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThan(Integer value) {
            addCriterion("Quarter >", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThanOrEqualTo(Integer value) {
            addCriterion("Quarter >=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThan(Integer value) {
            addCriterion("Quarter <", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThanOrEqualTo(Integer value) {
            addCriterion("Quarter <=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterIn(List<Integer> values) {
            addCriterion("Quarter in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotIn(List<Integer> values) {
            addCriterion("Quarter not in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterBetween(Integer value1, Integer value2) {
            addCriterion("Quarter between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotBetween(Integer value1, Integer value2) {
            addCriterion("Quarter not between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andNormalecIsNull() {
            addCriterion("NormalEC is null");
            return (Criteria) this;
        }

        public Criteria andNormalecIsNotNull() {
            addCriterion("NormalEC is not null");
            return (Criteria) this;
        }

        public Criteria andNormalecEqualTo(Integer value) {
            addCriterion("NormalEC =", value, "normalec");
            return (Criteria) this;
        }

        public Criteria andNormalecNotEqualTo(Integer value) {
            addCriterion("NormalEC <>", value, "normalec");
            return (Criteria) this;
        }

        public Criteria andNormalecGreaterThan(Integer value) {
            addCriterion("NormalEC >", value, "normalec");
            return (Criteria) this;
        }

        public Criteria andNormalecGreaterThanOrEqualTo(Integer value) {
            addCriterion("NormalEC >=", value, "normalec");
            return (Criteria) this;
        }

        public Criteria andNormalecLessThan(Integer value) {
            addCriterion("NormalEC <", value, "normalec");
            return (Criteria) this;
        }

        public Criteria andNormalecLessThanOrEqualTo(Integer value) {
            addCriterion("NormalEC <=", value, "normalec");
            return (Criteria) this;
        }

        public Criteria andNormalecIn(List<Integer> values) {
            addCriterion("NormalEC in", values, "normalec");
            return (Criteria) this;
        }

        public Criteria andNormalecNotIn(List<Integer> values) {
            addCriterion("NormalEC not in", values, "normalec");
            return (Criteria) this;
        }

        public Criteria andNormalecBetween(Integer value1, Integer value2) {
            addCriterion("NormalEC between", value1, value2, "normalec");
            return (Criteria) this;
        }

        public Criteria andNormalecNotBetween(Integer value1, Integer value2) {
            addCriterion("NormalEC not between", value1, value2, "normalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecIsNull() {
            addCriterion("AbnormalEC is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalecIsNotNull() {
            addCriterion("AbnormalEC is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalecEqualTo(Integer value) {
            addCriterion("AbnormalEC =", value, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecNotEqualTo(Integer value) {
            addCriterion("AbnormalEC <>", value, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecGreaterThan(Integer value) {
            addCriterion("AbnormalEC >", value, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecGreaterThanOrEqualTo(Integer value) {
            addCriterion("AbnormalEC >=", value, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecLessThan(Integer value) {
            addCriterion("AbnormalEC <", value, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecLessThanOrEqualTo(Integer value) {
            addCriterion("AbnormalEC <=", value, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecIn(List<Integer> values) {
            addCriterion("AbnormalEC in", values, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecNotIn(List<Integer> values) {
            addCriterion("AbnormalEC not in", values, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecBetween(Integer value1, Integer value2) {
            addCriterion("AbnormalEC between", value1, value2, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andAbnormalecNotBetween(Integer value1, Integer value2) {
            addCriterion("AbnormalEC not between", value1, value2, "abnormalec");
            return (Criteria) this;
        }

        public Criteria andMissedbeatIsNull() {
            addCriterion("MissedBeat is null");
            return (Criteria) this;
        }

        public Criteria andMissedbeatIsNotNull() {
            addCriterion("MissedBeat is not null");
            return (Criteria) this;
        }

        public Criteria andMissedbeatEqualTo(Integer value) {
            addCriterion("MissedBeat =", value, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andMissedbeatNotEqualTo(Integer value) {
            addCriterion("MissedBeat <>", value, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andMissedbeatGreaterThan(Integer value) {
            addCriterion("MissedBeat >", value, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andMissedbeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("MissedBeat >=", value, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andMissedbeatLessThan(Integer value) {
            addCriterion("MissedBeat <", value, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andMissedbeatLessThanOrEqualTo(Integer value) {
            addCriterion("MissedBeat <=", value, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andMissedbeatIn(List<Integer> values) {
            addCriterion("MissedBeat in", values, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andMissedbeatNotIn(List<Integer> values) {
            addCriterion("MissedBeat not in", values, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andMissedbeatBetween(Integer value1, Integer value2) {
            addCriterion("MissedBeat between", value1, value2, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andMissedbeatNotBetween(Integer value1, Integer value2) {
            addCriterion("MissedBeat not between", value1, value2, "missedbeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatIsNull() {
            addCriterion("PrematureBeat is null");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatIsNotNull() {
            addCriterion("PrematureBeat is not null");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatEqualTo(Integer value) {
            addCriterion("PrematureBeat =", value, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatNotEqualTo(Integer value) {
            addCriterion("PrematureBeat <>", value, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatGreaterThan(Integer value) {
            addCriterion("PrematureBeat >", value, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrematureBeat >=", value, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatLessThan(Integer value) {
            addCriterion("PrematureBeat <", value, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatLessThanOrEqualTo(Integer value) {
            addCriterion("PrematureBeat <=", value, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatIn(List<Integer> values) {
            addCriterion("PrematureBeat in", values, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatNotIn(List<Integer> values) {
            addCriterion("PrematureBeat not in", values, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatBetween(Integer value1, Integer value2) {
            addCriterion("PrematureBeat between", value1, value2, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPrematurebeatNotBetween(Integer value1, Integer value2) {
            addCriterion("PrematureBeat not between", value1, value2, "prematurebeat");
            return (Criteria) this;
        }

        public Criteria andPnIsNull() {
            addCriterion("PN is null");
            return (Criteria) this;
        }

        public Criteria andPnIsNotNull() {
            addCriterion("PN is not null");
            return (Criteria) this;
        }

        public Criteria andPnEqualTo(Integer value) {
            addCriterion("PN =", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnNotEqualTo(Integer value) {
            addCriterion("PN <>", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnGreaterThan(Integer value) {
            addCriterion("PN >", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnGreaterThanOrEqualTo(Integer value) {
            addCriterion("PN >=", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnLessThan(Integer value) {
            addCriterion("PN <", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnLessThanOrEqualTo(Integer value) {
            addCriterion("PN <=", value, "pn");
            return (Criteria) this;
        }

        public Criteria andPnIn(List<Integer> values) {
            addCriterion("PN in", values, "pn");
            return (Criteria) this;
        }

        public Criteria andPnNotIn(List<Integer> values) {
            addCriterion("PN not in", values, "pn");
            return (Criteria) this;
        }

        public Criteria andPnBetween(Integer value1, Integer value2) {
            addCriterion("PN between", value1, value2, "pn");
            return (Criteria) this;
        }

        public Criteria andPnNotBetween(Integer value1, Integer value2) {
            addCriterion("PN not between", value1, value2, "pn");
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