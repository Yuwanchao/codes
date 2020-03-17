package com.douqi.dao.app.model;

public class AppUser {
    private String id;

    private String nickname;

    private String address;

    private String gender;

    private String personalityAutograph;

    private Integer age;

    private Integer charmValue;

    private String speechIntroduced;

    private String label;

    private Integer wealthValue;

    private String avatar;

    private String backgroundImages;

    private String loginUserId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getPersonalityAutograph() {
        return personalityAutograph;
    }

    public void setPersonalityAutograph(String personalityAutograph) {
        this.personalityAutograph = personalityAutograph == null ? null : personalityAutograph.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getCharmValue() {
        return charmValue;
    }

    public void setCharmValue(Integer charmValue) {
        this.charmValue = charmValue;
    }

    public String getSpeechIntroduced() {
        return speechIntroduced;
    }

    public void setSpeechIntroduced(String speechIntroduced) {
        this.speechIntroduced = speechIntroduced == null ? null : speechIntroduced.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Integer getWealthValue() {
        return wealthValue;
    }

    public void setWealthValue(Integer wealthValue) {
        this.wealthValue = wealthValue;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getBackgroundImages() {
        return backgroundImages;
    }

    public void setBackgroundImages(String backgroundImages) {
        this.backgroundImages = backgroundImages == null ? null : backgroundImages.trim();
    }

    public String getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(String loginUserId) {
        this.loginUserId = loginUserId == null ? null : loginUserId.trim();
    }
}