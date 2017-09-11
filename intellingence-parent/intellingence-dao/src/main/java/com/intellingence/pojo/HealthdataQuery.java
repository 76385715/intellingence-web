package com.intellingence.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HealthdataQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public HealthdataQuery() {
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

        public Criteria andFiIsNull() {
            addCriterion("FI is null");
            return (Criteria) this;
        }

        public Criteria andFiIsNotNull() {
            addCriterion("FI is not null");
            return (Criteria) this;
        }

        public Criteria andFiEqualTo(Integer value) {
            addCriterion("FI =", value, "fi");
            return (Criteria) this;
        }

        public Criteria andFiNotEqualTo(Integer value) {
            addCriterion("FI <>", value, "fi");
            return (Criteria) this;
        }

        public Criteria andFiGreaterThan(Integer value) {
            addCriterion("FI >", value, "fi");
            return (Criteria) this;
        }

        public Criteria andFiGreaterThanOrEqualTo(Integer value) {
            addCriterion("FI >=", value, "fi");
            return (Criteria) this;
        }

        public Criteria andFiLessThan(Integer value) {
            addCriterion("FI <", value, "fi");
            return (Criteria) this;
        }

        public Criteria andFiLessThanOrEqualTo(Integer value) {
            addCriterion("FI <=", value, "fi");
            return (Criteria) this;
        }

        public Criteria andFiIn(List<Integer> values) {
            addCriterion("FI in", values, "fi");
            return (Criteria) this;
        }

        public Criteria andFiNotIn(List<Integer> values) {
            addCriterion("FI not in", values, "fi");
            return (Criteria) this;
        }

        public Criteria andFiBetween(Integer value1, Integer value2) {
            addCriterion("FI between", value1, value2, "fi");
            return (Criteria) this;
        }

        public Criteria andFiNotBetween(Integer value1, Integer value2) {
            addCriterion("FI not between", value1, value2, "fi");
            return (Criteria) this;
        }

        public Criteria andEsIsNull() {
            addCriterion("ES is null");
            return (Criteria) this;
        }

        public Criteria andEsIsNotNull() {
            addCriterion("ES is not null");
            return (Criteria) this;
        }

        public Criteria andEsEqualTo(Integer value) {
            addCriterion("ES =", value, "es");
            return (Criteria) this;
        }

        public Criteria andEsNotEqualTo(Integer value) {
            addCriterion("ES <>", value, "es");
            return (Criteria) this;
        }

        public Criteria andEsGreaterThan(Integer value) {
            addCriterion("ES >", value, "es");
            return (Criteria) this;
        }

        public Criteria andEsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ES >=", value, "es");
            return (Criteria) this;
        }

        public Criteria andEsLessThan(Integer value) {
            addCriterion("ES <", value, "es");
            return (Criteria) this;
        }

        public Criteria andEsLessThanOrEqualTo(Integer value) {
            addCriterion("ES <=", value, "es");
            return (Criteria) this;
        }

        public Criteria andEsIn(List<Integer> values) {
            addCriterion("ES in", values, "es");
            return (Criteria) this;
        }

        public Criteria andEsNotIn(List<Integer> values) {
            addCriterion("ES not in", values, "es");
            return (Criteria) this;
        }

        public Criteria andEsBetween(Integer value1, Integer value2) {
            addCriterion("ES between", value1, value2, "es");
            return (Criteria) this;
        }

        public Criteria andEsNotBetween(Integer value1, Integer value2) {
            addCriterion("ES not between", value1, value2, "es");
            return (Criteria) this;
        }

        public Criteria andPiIsNull() {
            addCriterion("PI is null");
            return (Criteria) this;
        }

        public Criteria andPiIsNotNull() {
            addCriterion("PI is not null");
            return (Criteria) this;
        }

        public Criteria andPiEqualTo(Integer value) {
            addCriterion("PI =", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiNotEqualTo(Integer value) {
            addCriterion("PI <>", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiGreaterThan(Integer value) {
            addCriterion("PI >", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiGreaterThanOrEqualTo(Integer value) {
            addCriterion("PI >=", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiLessThan(Integer value) {
            addCriterion("PI <", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiLessThanOrEqualTo(Integer value) {
            addCriterion("PI <=", value, "pi");
            return (Criteria) this;
        }

        public Criteria andPiIn(List<Integer> values) {
            addCriterion("PI in", values, "pi");
            return (Criteria) this;
        }

        public Criteria andPiNotIn(List<Integer> values) {
            addCriterion("PI not in", values, "pi");
            return (Criteria) this;
        }

        public Criteria andPiBetween(Integer value1, Integer value2) {
            addCriterion("PI between", value1, value2, "pi");
            return (Criteria) this;
        }

        public Criteria andPiNotBetween(Integer value1, Integer value2) {
            addCriterion("PI not between", value1, value2, "pi");
            return (Criteria) this;
        }

        public Criteria andCcIsNull() {
            addCriterion("CC is null");
            return (Criteria) this;
        }

        public Criteria andCcIsNotNull() {
            addCriterion("CC is not null");
            return (Criteria) this;
        }

        public Criteria andCcEqualTo(Integer value) {
            addCriterion("CC =", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotEqualTo(Integer value) {
            addCriterion("CC <>", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThan(Integer value) {
            addCriterion("CC >", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcGreaterThanOrEqualTo(Integer value) {
            addCriterion("CC >=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThan(Integer value) {
            addCriterion("CC <", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcLessThanOrEqualTo(Integer value) {
            addCriterion("CC <=", value, "cc");
            return (Criteria) this;
        }

        public Criteria andCcIn(List<Integer> values) {
            addCriterion("CC in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotIn(List<Integer> values) {
            addCriterion("CC not in", values, "cc");
            return (Criteria) this;
        }

        public Criteria andCcBetween(Integer value1, Integer value2) {
            addCriterion("CC between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andCcNotBetween(Integer value1, Integer value2) {
            addCriterion("CC not between", value1, value2, "cc");
            return (Criteria) this;
        }

        public Criteria andHrvrIsNull() {
            addCriterion("HRVr is null");
            return (Criteria) this;
        }

        public Criteria andHrvrIsNotNull() {
            addCriterion("HRVr is not null");
            return (Criteria) this;
        }

        public Criteria andHrvrEqualTo(String value) {
            addCriterion("HRVr =", value, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrNotEqualTo(String value) {
            addCriterion("HRVr <>", value, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrGreaterThan(String value) {
            addCriterion("HRVr >", value, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrGreaterThanOrEqualTo(String value) {
            addCriterion("HRVr >=", value, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrLessThan(String value) {
            addCriterion("HRVr <", value, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrLessThanOrEqualTo(String value) {
            addCriterion("HRVr <=", value, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrLike(String value) {
            addCriterion("HRVr like", value, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrNotLike(String value) {
            addCriterion("HRVr not like", value, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrIn(List<String> values) {
            addCriterion("HRVr in", values, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrNotIn(List<String> values) {
            addCriterion("HRVr not in", values, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrBetween(String value1, String value2) {
            addCriterion("HRVr between", value1, value2, "hrvr");
            return (Criteria) this;
        }

        public Criteria andHrvrNotBetween(String value1, String value2) {
            addCriterion("HRVr not between", value1, value2, "hrvr");
            return (Criteria) this;
        }

        public Criteria andAhrIsNull() {
            addCriterion("AHR is null");
            return (Criteria) this;
        }

        public Criteria andAhrIsNotNull() {
            addCriterion("AHR is not null");
            return (Criteria) this;
        }

        public Criteria andAhrEqualTo(Integer value) {
            addCriterion("AHR =", value, "ahr");
            return (Criteria) this;
        }

        public Criteria andAhrNotEqualTo(Integer value) {
            addCriterion("AHR <>", value, "ahr");
            return (Criteria) this;
        }

        public Criteria andAhrGreaterThan(Integer value) {
            addCriterion("AHR >", value, "ahr");
            return (Criteria) this;
        }

        public Criteria andAhrGreaterThanOrEqualTo(Integer value) {
            addCriterion("AHR >=", value, "ahr");
            return (Criteria) this;
        }

        public Criteria andAhrLessThan(Integer value) {
            addCriterion("AHR <", value, "ahr");
            return (Criteria) this;
        }

        public Criteria andAhrLessThanOrEqualTo(Integer value) {
            addCriterion("AHR <=", value, "ahr");
            return (Criteria) this;
        }

        public Criteria andAhrIn(List<Integer> values) {
            addCriterion("AHR in", values, "ahr");
            return (Criteria) this;
        }

        public Criteria andAhrNotIn(List<Integer> values) {
            addCriterion("AHR not in", values, "ahr");
            return (Criteria) this;
        }

        public Criteria andAhrBetween(Integer value1, Integer value2) {
            addCriterion("AHR between", value1, value2, "ahr");
            return (Criteria) this;
        }

        public Criteria andAhrNotBetween(Integer value1, Integer value2) {
            addCriterion("AHR not between", value1, value2, "ahr");
            return (Criteria) this;
        }

        public Criteria andMaxhrIsNull() {
            addCriterion("MaxHR is null");
            return (Criteria) this;
        }

        public Criteria andMaxhrIsNotNull() {
            addCriterion("MaxHR is not null");
            return (Criteria) this;
        }

        public Criteria andMaxhrEqualTo(Integer value) {
            addCriterion("MaxHR =", value, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMaxhrNotEqualTo(Integer value) {
            addCriterion("MaxHR <>", value, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMaxhrGreaterThan(Integer value) {
            addCriterion("MaxHR >", value, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMaxhrGreaterThanOrEqualTo(Integer value) {
            addCriterion("MaxHR >=", value, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMaxhrLessThan(Integer value) {
            addCriterion("MaxHR <", value, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMaxhrLessThanOrEqualTo(Integer value) {
            addCriterion("MaxHR <=", value, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMaxhrIn(List<Integer> values) {
            addCriterion("MaxHR in", values, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMaxhrNotIn(List<Integer> values) {
            addCriterion("MaxHR not in", values, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMaxhrBetween(Integer value1, Integer value2) {
            addCriterion("MaxHR between", value1, value2, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMaxhrNotBetween(Integer value1, Integer value2) {
            addCriterion("MaxHR not between", value1, value2, "maxhr");
            return (Criteria) this;
        }

        public Criteria andMinhrIsNull() {
            addCriterion("MinHR is null");
            return (Criteria) this;
        }

        public Criteria andMinhrIsNotNull() {
            addCriterion("MinHR is not null");
            return (Criteria) this;
        }

        public Criteria andMinhrEqualTo(Integer value) {
            addCriterion("MinHR =", value, "minhr");
            return (Criteria) this;
        }

        public Criteria andMinhrNotEqualTo(Integer value) {
            addCriterion("MinHR <>", value, "minhr");
            return (Criteria) this;
        }

        public Criteria andMinhrGreaterThan(Integer value) {
            addCriterion("MinHR >", value, "minhr");
            return (Criteria) this;
        }

        public Criteria andMinhrGreaterThanOrEqualTo(Integer value) {
            addCriterion("MinHR >=", value, "minhr");
            return (Criteria) this;
        }

        public Criteria andMinhrLessThan(Integer value) {
            addCriterion("MinHR <", value, "minhr");
            return (Criteria) this;
        }

        public Criteria andMinhrLessThanOrEqualTo(Integer value) {
            addCriterion("MinHR <=", value, "minhr");
            return (Criteria) this;
        }

        public Criteria andMinhrIn(List<Integer> values) {
            addCriterion("MinHR in", values, "minhr");
            return (Criteria) this;
        }

        public Criteria andMinhrNotIn(List<Integer> values) {
            addCriterion("MinHR not in", values, "minhr");
            return (Criteria) this;
        }

        public Criteria andMinhrBetween(Integer value1, Integer value2) {
            addCriterion("MinHR between", value1, value2, "minhr");
            return (Criteria) this;
        }

        public Criteria andMinhrNotBetween(Integer value1, Integer value2) {
            addCriterion("MinHR not between", value1, value2, "minhr");
            return (Criteria) this;
        }

        public Criteria andHrrIsNull() {
            addCriterion("HRr is null");
            return (Criteria) this;
        }

        public Criteria andHrrIsNotNull() {
            addCriterion("HRr is not null");
            return (Criteria) this;
        }

        public Criteria andHrrEqualTo(String value) {
            addCriterion("HRr =", value, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrNotEqualTo(String value) {
            addCriterion("HRr <>", value, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrGreaterThan(String value) {
            addCriterion("HRr >", value, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrGreaterThanOrEqualTo(String value) {
            addCriterion("HRr >=", value, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrLessThan(String value) {
            addCriterion("HRr <", value, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrLessThanOrEqualTo(String value) {
            addCriterion("HRr <=", value, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrLike(String value) {
            addCriterion("HRr like", value, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrNotLike(String value) {
            addCriterion("HRr not like", value, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrIn(List<String> values) {
            addCriterion("HRr in", values, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrNotIn(List<String> values) {
            addCriterion("HRr not in", values, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrBetween(String value1, String value2) {
            addCriterion("HRr between", value1, value2, "hrr");
            return (Criteria) this;
        }

        public Criteria andHrrNotBetween(String value1, String value2) {
            addCriterion("HRr not between", value1, value2, "hrr");
            return (Criteria) this;
        }

        public Criteria andEcrIsNull() {
            addCriterion("ECr is null");
            return (Criteria) this;
        }

        public Criteria andEcrIsNotNull() {
            addCriterion("ECr is not null");
            return (Criteria) this;
        }

        public Criteria andEcrEqualTo(Integer value) {
            addCriterion("ECr =", value, "ecr");
            return (Criteria) this;
        }

        public Criteria andEcrNotEqualTo(Integer value) {
            addCriterion("ECr <>", value, "ecr");
            return (Criteria) this;
        }

        public Criteria andEcrGreaterThan(Integer value) {
            addCriterion("ECr >", value, "ecr");
            return (Criteria) this;
        }

        public Criteria andEcrGreaterThanOrEqualTo(Integer value) {
            addCriterion("ECr >=", value, "ecr");
            return (Criteria) this;
        }

        public Criteria andEcrLessThan(Integer value) {
            addCriterion("ECr <", value, "ecr");
            return (Criteria) this;
        }

        public Criteria andEcrLessThanOrEqualTo(Integer value) {
            addCriterion("ECr <=", value, "ecr");
            return (Criteria) this;
        }

        public Criteria andEcrIn(List<Integer> values) {
            addCriterion("ECr in", values, "ecr");
            return (Criteria) this;
        }

        public Criteria andEcrNotIn(List<Integer> values) {
            addCriterion("ECr not in", values, "ecr");
            return (Criteria) this;
        }

        public Criteria andEcrBetween(Integer value1, Integer value2) {
            addCriterion("ECr between", value1, value2, "ecr");
            return (Criteria) this;
        }

        public Criteria andEcrNotBetween(Integer value1, Integer value2) {
            addCriterion("ECr not between", value1, value2, "ecr");
            return (Criteria) this;
        }

        public Criteria andRaIsNull() {
            addCriterion("RA is null");
            return (Criteria) this;
        }

        public Criteria andRaIsNotNull() {
            addCriterion("RA is not null");
            return (Criteria) this;
        }

        public Criteria andRaEqualTo(Integer value) {
            addCriterion("RA =", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaNotEqualTo(Integer value) {
            addCriterion("RA <>", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaGreaterThan(Integer value) {
            addCriterion("RA >", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaGreaterThanOrEqualTo(Integer value) {
            addCriterion("RA >=", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaLessThan(Integer value) {
            addCriterion("RA <", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaLessThanOrEqualTo(Integer value) {
            addCriterion("RA <=", value, "ra");
            return (Criteria) this;
        }

        public Criteria andRaIn(List<Integer> values) {
            addCriterion("RA in", values, "ra");
            return (Criteria) this;
        }

        public Criteria andRaNotIn(List<Integer> values) {
            addCriterion("RA not in", values, "ra");
            return (Criteria) this;
        }

        public Criteria andRaBetween(Integer value1, Integer value2) {
            addCriterion("RA between", value1, value2, "ra");
            return (Criteria) this;
        }

        public Criteria andRaNotBetween(Integer value1, Integer value2) {
            addCriterion("RA not between", value1, value2, "ra");
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

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(Long value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(Long value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(Long value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(Long value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(Long value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(Long value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<Long> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<Long> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(Long value1, Long value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(Long value1, Long value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNull() {
            addCriterion("datatime is null");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNotNull() {
            addCriterion("datatime is not null");
            return (Criteria) this;
        }

        public Criteria andDatatimeEqualTo(Date value) {
            addCriterion("datatime =", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotEqualTo(Date value) {
            addCriterion("datatime <>", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThan(Date value) {
            addCriterion("datatime >", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThanOrEqualTo(Date value) {
            addCriterion("datatime >=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThan(Date value) {
            addCriterion("datatime <", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThanOrEqualTo(Date value) {
            addCriterion("datatime <=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeIn(List<Date> values) {
            addCriterion("datatime in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotIn(List<Date> values) {
            addCriterion("datatime not in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeBetween(Date value1, Date value2) {
            addCriterion("datatime between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotBetween(Date value1, Date value2) {
            addCriterion("datatime not between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("year is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("year is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(Integer value) {
            addCriterion("year =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(Integer value) {
            addCriterion("year <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(Integer value) {
            addCriterion("year >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("year >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(Integer value) {
            addCriterion("year <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(Integer value) {
            addCriterion("year <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<Integer> values) {
            addCriterion("year in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<Integer> values) {
            addCriterion("year not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(Integer value1, Integer value2) {
            addCriterion("year between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(Integer value1, Integer value2) {
            addCriterion("year not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNull() {
            addCriterion("quarter is null");
            return (Criteria) this;
        }

        public Criteria andQuarterIsNotNull() {
            addCriterion("quarter is not null");
            return (Criteria) this;
        }

        public Criteria andQuarterEqualTo(Integer value) {
            addCriterion("quarter =", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotEqualTo(Integer value) {
            addCriterion("quarter <>", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThan(Integer value) {
            addCriterion("quarter >", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterGreaterThanOrEqualTo(Integer value) {
            addCriterion("quarter >=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThan(Integer value) {
            addCriterion("quarter <", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterLessThanOrEqualTo(Integer value) {
            addCriterion("quarter <=", value, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterIn(List<Integer> values) {
            addCriterion("quarter in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotIn(List<Integer> values) {
            addCriterion("quarter not in", values, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterBetween(Integer value1, Integer value2) {
            addCriterion("quarter between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andQuarterNotBetween(Integer value1, Integer value2) {
            addCriterion("quarter not between", value1, value2, "quarter");
            return (Criteria) this;
        }

        public Criteria andMonthIsNull() {
            addCriterion("month is null");
            return (Criteria) this;
        }

        public Criteria andMonthIsNotNull() {
            addCriterion("month is not null");
            return (Criteria) this;
        }

        public Criteria andMonthEqualTo(Integer value) {
            addCriterion("month =", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotEqualTo(Integer value) {
            addCriterion("month <>", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThan(Integer value) {
            addCriterion("month >", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("month >=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThan(Integer value) {
            addCriterion("month <", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthLessThanOrEqualTo(Integer value) {
            addCriterion("month <=", value, "month");
            return (Criteria) this;
        }

        public Criteria andMonthIn(List<Integer> values) {
            addCriterion("month in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotIn(List<Integer> values) {
            addCriterion("month not in", values, "month");
            return (Criteria) this;
        }

        public Criteria andMonthBetween(Integer value1, Integer value2) {
            addCriterion("month between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("month not between", value1, value2, "month");
            return (Criteria) this;
        }

        public Criteria andWeekIsNull() {
            addCriterion("week is null");
            return (Criteria) this;
        }

        public Criteria andWeekIsNotNull() {
            addCriterion("week is not null");
            return (Criteria) this;
        }

        public Criteria andWeekEqualTo(Integer value) {
            addCriterion("week =", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotEqualTo(Integer value) {
            addCriterion("week <>", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThan(Integer value) {
            addCriterion("week >", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekGreaterThanOrEqualTo(Integer value) {
            addCriterion("week >=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThan(Integer value) {
            addCriterion("week <", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekLessThanOrEqualTo(Integer value) {
            addCriterion("week <=", value, "week");
            return (Criteria) this;
        }

        public Criteria andWeekIn(List<Integer> values) {
            addCriterion("week in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotIn(List<Integer> values) {
            addCriterion("week not in", values, "week");
            return (Criteria) this;
        }

        public Criteria andWeekBetween(Integer value1, Integer value2) {
            addCriterion("week between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andWeekNotBetween(Integer value1, Integer value2) {
            addCriterion("week not between", value1, value2, "week");
            return (Criteria) this;
        }

        public Criteria andDateIsNull() {
            addCriterion("date is null");
            return (Criteria) this;
        }

        public Criteria andDateIsNotNull() {
            addCriterion("date is not null");
            return (Criteria) this;
        }

        public Criteria andDateEqualTo(Integer value) {
            addCriterion("date =", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotEqualTo(Integer value) {
            addCriterion("date <>", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThan(Integer value) {
            addCriterion("date >", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("date >=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThan(Integer value) {
            addCriterion("date <", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateLessThanOrEqualTo(Integer value) {
            addCriterion("date <=", value, "date");
            return (Criteria) this;
        }

        public Criteria andDateIn(List<Integer> values) {
            addCriterion("date in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotIn(List<Integer> values) {
            addCriterion("date not in", values, "date");
            return (Criteria) this;
        }

        public Criteria andDateBetween(Integer value1, Integer value2) {
            addCriterion("date between", value1, value2, "date");
            return (Criteria) this;
        }

        public Criteria andDateNotBetween(Integer value1, Integer value2) {
            addCriterion("date not between", value1, value2, "date");
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

        public Criteria andDistanceEqualTo(Float value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Float value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Float value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Float value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Float value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Float value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Float> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Float> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Float value1, Float value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Float value1, Float value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Float value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Float value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Float value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Float value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Float value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Float value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Float> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Float> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Float value1, Float value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Float value1, Float value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andHrsumIsNull() {
            addCriterion("HRsum is null");
            return (Criteria) this;
        }

        public Criteria andHrsumIsNotNull() {
            addCriterion("HRsum is not null");
            return (Criteria) this;
        }

        public Criteria andHrsumEqualTo(Integer value) {
            addCriterion("HRsum =", value, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrsumNotEqualTo(Integer value) {
            addCriterion("HRsum <>", value, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrsumGreaterThan(Integer value) {
            addCriterion("HRsum >", value, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrsumGreaterThanOrEqualTo(Integer value) {
            addCriterion("HRsum >=", value, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrsumLessThan(Integer value) {
            addCriterion("HRsum <", value, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrsumLessThanOrEqualTo(Integer value) {
            addCriterion("HRsum <=", value, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrsumIn(List<Integer> values) {
            addCriterion("HRsum in", values, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrsumNotIn(List<Integer> values) {
            addCriterion("HRsum not in", values, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrsumBetween(Integer value1, Integer value2) {
            addCriterion("HRsum between", value1, value2, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrsumNotBetween(Integer value1, Integer value2) {
            addCriterion("HRsum not between", value1, value2, "hrsum");
            return (Criteria) this;
        }

        public Criteria andHrtimesIsNull() {
            addCriterion("HRtimes is null");
            return (Criteria) this;
        }

        public Criteria andHrtimesIsNotNull() {
            addCriterion("HRtimes is not null");
            return (Criteria) this;
        }

        public Criteria andHrtimesEqualTo(Integer value) {
            addCriterion("HRtimes =", value, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andHrtimesNotEqualTo(Integer value) {
            addCriterion("HRtimes <>", value, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andHrtimesGreaterThan(Integer value) {
            addCriterion("HRtimes >", value, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andHrtimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("HRtimes >=", value, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andHrtimesLessThan(Integer value) {
            addCriterion("HRtimes <", value, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andHrtimesLessThanOrEqualTo(Integer value) {
            addCriterion("HRtimes <=", value, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andHrtimesIn(List<Integer> values) {
            addCriterion("HRtimes in", values, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andHrtimesNotIn(List<Integer> values) {
            addCriterion("HRtimes not in", values, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andHrtimesBetween(Integer value1, Integer value2) {
            addCriterion("HRtimes between", value1, value2, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andHrtimesNotBetween(Integer value1, Integer value2) {
            addCriterion("HRtimes not between", value1, value2, "hrtimes");
            return (Criteria) this;
        }

        public Criteria andZaoboIsNull() {
            addCriterion("zaobo is null");
            return (Criteria) this;
        }

        public Criteria andZaoboIsNotNull() {
            addCriterion("zaobo is not null");
            return (Criteria) this;
        }

        public Criteria andZaoboEqualTo(Integer value) {
            addCriterion("zaobo =", value, "zaobo");
            return (Criteria) this;
        }

        public Criteria andZaoboNotEqualTo(Integer value) {
            addCriterion("zaobo <>", value, "zaobo");
            return (Criteria) this;
        }

        public Criteria andZaoboGreaterThan(Integer value) {
            addCriterion("zaobo >", value, "zaobo");
            return (Criteria) this;
        }

        public Criteria andZaoboGreaterThanOrEqualTo(Integer value) {
            addCriterion("zaobo >=", value, "zaobo");
            return (Criteria) this;
        }

        public Criteria andZaoboLessThan(Integer value) {
            addCriterion("zaobo <", value, "zaobo");
            return (Criteria) this;
        }

        public Criteria andZaoboLessThanOrEqualTo(Integer value) {
            addCriterion("zaobo <=", value, "zaobo");
            return (Criteria) this;
        }

        public Criteria andZaoboIn(List<Integer> values) {
            addCriterion("zaobo in", values, "zaobo");
            return (Criteria) this;
        }

        public Criteria andZaoboNotIn(List<Integer> values) {
            addCriterion("zaobo not in", values, "zaobo");
            return (Criteria) this;
        }

        public Criteria andZaoboBetween(Integer value1, Integer value2) {
            addCriterion("zaobo between", value1, value2, "zaobo");
            return (Criteria) this;
        }

        public Criteria andZaoboNotBetween(Integer value1, Integer value2) {
            addCriterion("zaobo not between", value1, value2, "zaobo");
            return (Criteria) this;
        }

        public Criteria andLouboIsNull() {
            addCriterion("loubo is null");
            return (Criteria) this;
        }

        public Criteria andLouboIsNotNull() {
            addCriterion("loubo is not null");
            return (Criteria) this;
        }

        public Criteria andLouboEqualTo(Integer value) {
            addCriterion("loubo =", value, "loubo");
            return (Criteria) this;
        }

        public Criteria andLouboNotEqualTo(Integer value) {
            addCriterion("loubo <>", value, "loubo");
            return (Criteria) this;
        }

        public Criteria andLouboGreaterThan(Integer value) {
            addCriterion("loubo >", value, "loubo");
            return (Criteria) this;
        }

        public Criteria andLouboGreaterThanOrEqualTo(Integer value) {
            addCriterion("loubo >=", value, "loubo");
            return (Criteria) this;
        }

        public Criteria andLouboLessThan(Integer value) {
            addCriterion("loubo <", value, "loubo");
            return (Criteria) this;
        }

        public Criteria andLouboLessThanOrEqualTo(Integer value) {
            addCriterion("loubo <=", value, "loubo");
            return (Criteria) this;
        }

        public Criteria andLouboIn(List<Integer> values) {
            addCriterion("loubo in", values, "loubo");
            return (Criteria) this;
        }

        public Criteria andLouboNotIn(List<Integer> values) {
            addCriterion("loubo not in", values, "loubo");
            return (Criteria) this;
        }

        public Criteria andLouboBetween(Integer value1, Integer value2) {
            addCriterion("loubo between", value1, value2, "loubo");
            return (Criteria) this;
        }

        public Criteria andLouboNotBetween(Integer value1, Integer value2) {
            addCriterion("loubo not between", value1, value2, "loubo");
            return (Criteria) this;
        }

        public Criteria andAlivenessIsNull() {
            addCriterion("aliveness is null");
            return (Criteria) this;
        }

        public Criteria andAlivenessIsNotNull() {
            addCriterion("aliveness is not null");
            return (Criteria) this;
        }

        public Criteria andAlivenessEqualTo(Integer value) {
            addCriterion("aliveness =", value, "aliveness");
            return (Criteria) this;
        }

        public Criteria andAlivenessNotEqualTo(Integer value) {
            addCriterion("aliveness <>", value, "aliveness");
            return (Criteria) this;
        }

        public Criteria andAlivenessGreaterThan(Integer value) {
            addCriterion("aliveness >", value, "aliveness");
            return (Criteria) this;
        }

        public Criteria andAlivenessGreaterThanOrEqualTo(Integer value) {
            addCriterion("aliveness >=", value, "aliveness");
            return (Criteria) this;
        }

        public Criteria andAlivenessLessThan(Integer value) {
            addCriterion("aliveness <", value, "aliveness");
            return (Criteria) this;
        }

        public Criteria andAlivenessLessThanOrEqualTo(Integer value) {
            addCriterion("aliveness <=", value, "aliveness");
            return (Criteria) this;
        }

        public Criteria andAlivenessIn(List<Integer> values) {
            addCriterion("aliveness in", values, "aliveness");
            return (Criteria) this;
        }

        public Criteria andAlivenessNotIn(List<Integer> values) {
            addCriterion("aliveness not in", values, "aliveness");
            return (Criteria) this;
        }

        public Criteria andAlivenessBetween(Integer value1, Integer value2) {
            addCriterion("aliveness between", value1, value2, "aliveness");
            return (Criteria) this;
        }

        public Criteria andAlivenessNotBetween(Integer value1, Integer value2) {
            addCriterion("aliveness not between", value1, value2, "aliveness");
            return (Criteria) this;
        }

        public Criteria andInuseIsNull() {
            addCriterion("inuse is null");
            return (Criteria) this;
        }

        public Criteria andInuseIsNotNull() {
            addCriterion("inuse is not null");
            return (Criteria) this;
        }

        public Criteria andInuseEqualTo(Integer value) {
            addCriterion("inuse =", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseNotEqualTo(Integer value) {
            addCriterion("inuse <>", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseGreaterThan(Integer value) {
            addCriterion("inuse >", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseGreaterThanOrEqualTo(Integer value) {
            addCriterion("inuse >=", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseLessThan(Integer value) {
            addCriterion("inuse <", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseLessThanOrEqualTo(Integer value) {
            addCriterion("inuse <=", value, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseIn(List<Integer> values) {
            addCriterion("inuse in", values, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseNotIn(List<Integer> values) {
            addCriterion("inuse not in", values, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseBetween(Integer value1, Integer value2) {
            addCriterion("inuse between", value1, value2, "inuse");
            return (Criteria) this;
        }

        public Criteria andInuseNotBetween(Integer value1, Integer value2) {
            addCriterion("inuse not between", value1, value2, "inuse");
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