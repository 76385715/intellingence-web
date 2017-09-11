package com.intellingence.pojo;

import java.util.ArrayList;
import java.util.List;

public class WeatherQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public WeatherQuery() {
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

        public Criteria andUpdatetimestampIsNull() {
            addCriterion("updatetimestamp is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampIsNotNull() {
            addCriterion("updatetimestamp is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampEqualTo(Integer value) {
            addCriterion("updatetimestamp =", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampNotEqualTo(Integer value) {
            addCriterion("updatetimestamp <>", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampGreaterThan(Integer value) {
            addCriterion("updatetimestamp >", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatetimestamp >=", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampLessThan(Integer value) {
            addCriterion("updatetimestamp <", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampLessThanOrEqualTo(Integer value) {
            addCriterion("updatetimestamp <=", value, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampIn(List<Integer> values) {
            addCriterion("updatetimestamp in", values, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampNotIn(List<Integer> values) {
            addCriterion("updatetimestamp not in", values, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampBetween(Integer value1, Integer value2) {
            addCriterion("updatetimestamp between", value1, value2, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andUpdatetimestampNotBetween(Integer value1, Integer value2) {
            addCriterion("updatetimestamp not between", value1, value2, "updatetimestamp");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Integer value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Integer value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Integer value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Integer value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Integer value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Integer value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Integer> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Integer> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Integer value1, Integer value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Integer value1, Integer value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNull() {
            addCriterion("humidity is null");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNotNull() {
            addCriterion("humidity is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityEqualTo(Integer value) {
            addCriterion("humidity =", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotEqualTo(Integer value) {
            addCriterion("humidity <>", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThan(Integer value) {
            addCriterion("humidity >", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThanOrEqualTo(Integer value) {
            addCriterion("humidity >=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThan(Integer value) {
            addCriterion("humidity <", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThanOrEqualTo(Integer value) {
            addCriterion("humidity <=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityIn(List<Integer> values) {
            addCriterion("humidity in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotIn(List<Integer> values) {
            addCriterion("humidity not in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityBetween(Integer value1, Integer value2) {
            addCriterion("humidity between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotBetween(Integer value1, Integer value2) {
            addCriterion("humidity not between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andUvIsNull() {
            addCriterion("uv is null");
            return (Criteria) this;
        }

        public Criteria andUvIsNotNull() {
            addCriterion("uv is not null");
            return (Criteria) this;
        }

        public Criteria andUvEqualTo(Integer value) {
            addCriterion("uv =", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotEqualTo(Integer value) {
            addCriterion("uv <>", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThan(Integer value) {
            addCriterion("uv >", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvGreaterThanOrEqualTo(Integer value) {
            addCriterion("uv >=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThan(Integer value) {
            addCriterion("uv <", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvLessThanOrEqualTo(Integer value) {
            addCriterion("uv <=", value, "uv");
            return (Criteria) this;
        }

        public Criteria andUvIn(List<Integer> values) {
            addCriterion("uv in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotIn(List<Integer> values) {
            addCriterion("uv not in", values, "uv");
            return (Criteria) this;
        }

        public Criteria andUvBetween(Integer value1, Integer value2) {
            addCriterion("uv between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andUvNotBetween(Integer value1, Integer value2) {
            addCriterion("uv not between", value1, value2, "uv");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("longitude is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("longitude is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Integer value) {
            addCriterion("longitude =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Integer value) {
            addCriterion("longitude <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Integer value) {
            addCriterion("longitude >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Integer value) {
            addCriterion("longitude >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Integer value) {
            addCriterion("longitude <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Integer value) {
            addCriterion("longitude <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Integer> values) {
            addCriterion("longitude in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Integer> values) {
            addCriterion("longitude not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Integer value1, Integer value2) {
            addCriterion("longitude between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Integer value1, Integer value2) {
            addCriterion("longitude not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("latitude is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("latitude is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Integer value) {
            addCriterion("latitude =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Integer value) {
            addCriterion("latitude <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Integer value) {
            addCriterion("latitude >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Integer value) {
            addCriterion("latitude >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Integer value) {
            addCriterion("latitude <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Integer value) {
            addCriterion("latitude <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Integer> values) {
            addCriterion("latitude in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Integer> values) {
            addCriterion("latitude not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Integer value1, Integer value2) {
            addCriterion("latitude between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Integer value1, Integer value2) {
            addCriterion("latitude not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftIsNull() {
            addCriterion("longitude0left is null");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftIsNotNull() {
            addCriterion("longitude0left is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftEqualTo(Integer value) {
            addCriterion("longitude0left =", value, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftNotEqualTo(Integer value) {
            addCriterion("longitude0left <>", value, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftGreaterThan(Integer value) {
            addCriterion("longitude0left >", value, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftGreaterThanOrEqualTo(Integer value) {
            addCriterion("longitude0left >=", value, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftLessThan(Integer value) {
            addCriterion("longitude0left <", value, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftLessThanOrEqualTo(Integer value) {
            addCriterion("longitude0left <=", value, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftIn(List<Integer> values) {
            addCriterion("longitude0left in", values, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftNotIn(List<Integer> values) {
            addCriterion("longitude0left not in", values, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftBetween(Integer value1, Integer value2) {
            addCriterion("longitude0left between", value1, value2, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0leftNotBetween(Integer value1, Integer value2) {
            addCriterion("longitude0left not between", value1, value2, "longitude0left");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightIsNull() {
            addCriterion("longitude0right is null");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightIsNotNull() {
            addCriterion("longitude0right is not null");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightEqualTo(Integer value) {
            addCriterion("longitude0right =", value, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightNotEqualTo(Integer value) {
            addCriterion("longitude0right <>", value, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightGreaterThan(Integer value) {
            addCriterion("longitude0right >", value, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightGreaterThanOrEqualTo(Integer value) {
            addCriterion("longitude0right >=", value, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightLessThan(Integer value) {
            addCriterion("longitude0right <", value, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightLessThanOrEqualTo(Integer value) {
            addCriterion("longitude0right <=", value, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightIn(List<Integer> values) {
            addCriterion("longitude0right in", values, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightNotIn(List<Integer> values) {
            addCriterion("longitude0right not in", values, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightBetween(Integer value1, Integer value2) {
            addCriterion("longitude0right between", value1, value2, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLongitude0rightNotBetween(Integer value1, Integer value2) {
            addCriterion("longitude0right not between", value1, value2, "longitude0right");
            return (Criteria) this;
        }

        public Criteria andLatitude0upIsNull() {
            addCriterion("latitude0Up is null");
            return (Criteria) this;
        }

        public Criteria andLatitude0upIsNotNull() {
            addCriterion("latitude0Up is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude0upEqualTo(Integer value) {
            addCriterion("latitude0Up =", value, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0upNotEqualTo(Integer value) {
            addCriterion("latitude0Up <>", value, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0upGreaterThan(Integer value) {
            addCriterion("latitude0Up >", value, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0upGreaterThanOrEqualTo(Integer value) {
            addCriterion("latitude0Up >=", value, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0upLessThan(Integer value) {
            addCriterion("latitude0Up <", value, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0upLessThanOrEqualTo(Integer value) {
            addCriterion("latitude0Up <=", value, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0upIn(List<Integer> values) {
            addCriterion("latitude0Up in", values, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0upNotIn(List<Integer> values) {
            addCriterion("latitude0Up not in", values, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0upBetween(Integer value1, Integer value2) {
            addCriterion("latitude0Up between", value1, value2, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0upNotBetween(Integer value1, Integer value2) {
            addCriterion("latitude0Up not between", value1, value2, "latitude0up");
            return (Criteria) this;
        }

        public Criteria andLatitude0downIsNull() {
            addCriterion("latitude0Down is null");
            return (Criteria) this;
        }

        public Criteria andLatitude0downIsNotNull() {
            addCriterion("latitude0Down is not null");
            return (Criteria) this;
        }

        public Criteria andLatitude0downEqualTo(Integer value) {
            addCriterion("latitude0Down =", value, "latitude0down");
            return (Criteria) this;
        }

        public Criteria andLatitude0downNotEqualTo(Integer value) {
            addCriterion("latitude0Down <>", value, "latitude0down");
            return (Criteria) this;
        }

        public Criteria andLatitude0downGreaterThan(Integer value) {
            addCriterion("latitude0Down >", value, "latitude0down");
            return (Criteria) this;
        }

        public Criteria andLatitude0downGreaterThanOrEqualTo(Integer value) {
            addCriterion("latitude0Down >=", value, "latitude0down");
            return (Criteria) this;
        }

        public Criteria andLatitude0downLessThan(Integer value) {
            addCriterion("latitude0Down <", value, "latitude0down");
            return (Criteria) this;
        }

        public Criteria andLatitude0downLessThanOrEqualTo(Integer value) {
            addCriterion("latitude0Down <=", value, "latitude0down");
            return (Criteria) this;
        }

        public Criteria andLatitude0downIn(List<Integer> values) {
            addCriterion("latitude0Down in", values, "latitude0down");
            return (Criteria) this;
        }

        public Criteria andLatitude0downNotIn(List<Integer> values) {
            addCriterion("latitude0Down not in", values, "latitude0down");
            return (Criteria) this;
        }

        public Criteria andLatitude0downBetween(Integer value1, Integer value2) {
            addCriterion("latitude0Down between", value1, value2, "latitude0down");
            return (Criteria) this;
        }

        public Criteria andLatitude0downNotBetween(Integer value1, Integer value2) {
            addCriterion("latitude0Down not between", value1, value2, "latitude0down");
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