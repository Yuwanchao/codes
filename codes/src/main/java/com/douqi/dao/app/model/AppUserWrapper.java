package com.douqi.dao.app.model;

import java.util.ArrayList;
import java.util.List;

public class AppUserWrapper {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppUserWrapper() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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

        public Criteria andPersonalityAutographIsNull() {
            addCriterion("personality_autograph is null");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographIsNotNull() {
            addCriterion("personality_autograph is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographEqualTo(String value) {
            addCriterion("personality_autograph =", value, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographNotEqualTo(String value) {
            addCriterion("personality_autograph <>", value, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographGreaterThan(String value) {
            addCriterion("personality_autograph >", value, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographGreaterThanOrEqualTo(String value) {
            addCriterion("personality_autograph >=", value, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographLessThan(String value) {
            addCriterion("personality_autograph <", value, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographLessThanOrEqualTo(String value) {
            addCriterion("personality_autograph <=", value, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographLike(String value) {
            addCriterion("personality_autograph like", value, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographNotLike(String value) {
            addCriterion("personality_autograph not like", value, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographIn(List<String> values) {
            addCriterion("personality_autograph in", values, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographNotIn(List<String> values) {
            addCriterion("personality_autograph not in", values, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographBetween(String value1, String value2) {
            addCriterion("personality_autograph between", value1, value2, "personalityAutograph");
            return (Criteria) this;
        }

        public Criteria andPersonalityAutographNotBetween(String value1, String value2) {
            addCriterion("personality_autograph not between", value1, value2, "personalityAutograph");
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

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andCharmValueIsNull() {
            addCriterion("charm_value is null");
            return (Criteria) this;
        }

        public Criteria andCharmValueIsNotNull() {
            addCriterion("charm_value is not null");
            return (Criteria) this;
        }

        public Criteria andCharmValueEqualTo(Integer value) {
            addCriterion("charm_value =", value, "charmValue");
            return (Criteria) this;
        }

        public Criteria andCharmValueNotEqualTo(Integer value) {
            addCriterion("charm_value <>", value, "charmValue");
            return (Criteria) this;
        }

        public Criteria andCharmValueGreaterThan(Integer value) {
            addCriterion("charm_value >", value, "charmValue");
            return (Criteria) this;
        }

        public Criteria andCharmValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("charm_value >=", value, "charmValue");
            return (Criteria) this;
        }

        public Criteria andCharmValueLessThan(Integer value) {
            addCriterion("charm_value <", value, "charmValue");
            return (Criteria) this;
        }

        public Criteria andCharmValueLessThanOrEqualTo(Integer value) {
            addCriterion("charm_value <=", value, "charmValue");
            return (Criteria) this;
        }

        public Criteria andCharmValueIn(List<Integer> values) {
            addCriterion("charm_value in", values, "charmValue");
            return (Criteria) this;
        }

        public Criteria andCharmValueNotIn(List<Integer> values) {
            addCriterion("charm_value not in", values, "charmValue");
            return (Criteria) this;
        }

        public Criteria andCharmValueBetween(Integer value1, Integer value2) {
            addCriterion("charm_value between", value1, value2, "charmValue");
            return (Criteria) this;
        }

        public Criteria andCharmValueNotBetween(Integer value1, Integer value2) {
            addCriterion("charm_value not between", value1, value2, "charmValue");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedIsNull() {
            addCriterion("speech_introduced is null");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedIsNotNull() {
            addCriterion("speech_introduced is not null");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedEqualTo(String value) {
            addCriterion("speech_introduced =", value, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedNotEqualTo(String value) {
            addCriterion("speech_introduced <>", value, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedGreaterThan(String value) {
            addCriterion("speech_introduced >", value, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedGreaterThanOrEqualTo(String value) {
            addCriterion("speech_introduced >=", value, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedLessThan(String value) {
            addCriterion("speech_introduced <", value, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedLessThanOrEqualTo(String value) {
            addCriterion("speech_introduced <=", value, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedLike(String value) {
            addCriterion("speech_introduced like", value, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedNotLike(String value) {
            addCriterion("speech_introduced not like", value, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedIn(List<String> values) {
            addCriterion("speech_introduced in", values, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedNotIn(List<String> values) {
            addCriterion("speech_introduced not in", values, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedBetween(String value1, String value2) {
            addCriterion("speech_introduced between", value1, value2, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andSpeechIntroducedNotBetween(String value1, String value2) {
            addCriterion("speech_introduced not between", value1, value2, "speechIntroduced");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andWealthValueIsNull() {
            addCriterion("wealth_value is null");
            return (Criteria) this;
        }

        public Criteria andWealthValueIsNotNull() {
            addCriterion("wealth_value is not null");
            return (Criteria) this;
        }

        public Criteria andWealthValueEqualTo(Integer value) {
            addCriterion("wealth_value =", value, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andWealthValueNotEqualTo(Integer value) {
            addCriterion("wealth_value <>", value, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andWealthValueGreaterThan(Integer value) {
            addCriterion("wealth_value >", value, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andWealthValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("wealth_value >=", value, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andWealthValueLessThan(Integer value) {
            addCriterion("wealth_value <", value, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andWealthValueLessThanOrEqualTo(Integer value) {
            addCriterion("wealth_value <=", value, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andWealthValueIn(List<Integer> values) {
            addCriterion("wealth_value in", values, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andWealthValueNotIn(List<Integer> values) {
            addCriterion("wealth_value not in", values, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andWealthValueBetween(Integer value1, Integer value2) {
            addCriterion("wealth_value between", value1, value2, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andWealthValueNotBetween(Integer value1, Integer value2) {
            addCriterion("wealth_value not between", value1, value2, "wealthValue");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNull() {
            addCriterion("avatar is null");
            return (Criteria) this;
        }

        public Criteria andAvatarIsNotNull() {
            addCriterion("avatar is not null");
            return (Criteria) this;
        }

        public Criteria andAvatarEqualTo(String value) {
            addCriterion("avatar =", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotEqualTo(String value) {
            addCriterion("avatar <>", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThan(String value) {
            addCriterion("avatar >", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarGreaterThanOrEqualTo(String value) {
            addCriterion("avatar >=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThan(String value) {
            addCriterion("avatar <", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLessThanOrEqualTo(String value) {
            addCriterion("avatar <=", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarLike(String value) {
            addCriterion("avatar like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotLike(String value) {
            addCriterion("avatar not like", value, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarIn(List<String> values) {
            addCriterion("avatar in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotIn(List<String> values) {
            addCriterion("avatar not in", values, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarBetween(String value1, String value2) {
            addCriterion("avatar between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andAvatarNotBetween(String value1, String value2) {
            addCriterion("avatar not between", value1, value2, "avatar");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesIsNull() {
            addCriterion("background_images is null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesIsNotNull() {
            addCriterion("background_images is not null");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesEqualTo(String value) {
            addCriterion("background_images =", value, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesNotEqualTo(String value) {
            addCriterion("background_images <>", value, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesGreaterThan(String value) {
            addCriterion("background_images >", value, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesGreaterThanOrEqualTo(String value) {
            addCriterion("background_images >=", value, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesLessThan(String value) {
            addCriterion("background_images <", value, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesLessThanOrEqualTo(String value) {
            addCriterion("background_images <=", value, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesLike(String value) {
            addCriterion("background_images like", value, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesNotLike(String value) {
            addCriterion("background_images not like", value, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesIn(List<String> values) {
            addCriterion("background_images in", values, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesNotIn(List<String> values) {
            addCriterion("background_images not in", values, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesBetween(String value1, String value2) {
            addCriterion("background_images between", value1, value2, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andBackgroundImagesNotBetween(String value1, String value2) {
            addCriterion("background_images not between", value1, value2, "backgroundImages");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdIsNull() {
            addCriterion("login_user_id is null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdIsNotNull() {
            addCriterion("login_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdEqualTo(String value) {
            addCriterion("login_user_id =", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotEqualTo(String value) {
            addCriterion("login_user_id <>", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdGreaterThan(String value) {
            addCriterion("login_user_id >", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("login_user_id >=", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdLessThan(String value) {
            addCriterion("login_user_id <", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdLessThanOrEqualTo(String value) {
            addCriterion("login_user_id <=", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdLike(String value) {
            addCriterion("login_user_id like", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotLike(String value) {
            addCriterion("login_user_id not like", value, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdIn(List<String> values) {
            addCriterion("login_user_id in", values, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotIn(List<String> values) {
            addCriterion("login_user_id not in", values, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdBetween(String value1, String value2) {
            addCriterion("login_user_id between", value1, value2, "loginUserId");
            return (Criteria) this;
        }

        public Criteria andLoginUserIdNotBetween(String value1, String value2) {
            addCriterion("login_user_id not between", value1, value2, "loginUserId");
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