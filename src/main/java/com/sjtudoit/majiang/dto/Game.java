package com.sjtudoit.majiang.dto;

import java.util.ArrayList;
import java.util.List;

public class Game {
    // 当前信息类型
    private Integer messageType;

    // 当前传达的信息内容
    private String message;

    // 当前信息的传达者，仅在messageType为CHAT时有用
    private String messageUserName;

    private List<User> userList = new ArrayList<User>() {{
        add(new User());
        add(new User());
        add(new User());
        add(new User());
    }};

    private List<Majiang> remainMajiangList = new ArrayList<>();
    private String currentUserName;
    private Majiang currentOutMajiang;

    private Majiang jin;

    // 游戏开始时有刚进的麻将，方便前端手牌显示区分开
    private Majiang currentInMajiang = new Majiang();

    // 庄家名称
    private String bankerName;

    // 每次出牌时潜在的吃碰杆胡对象
    private List<String> nextUserNameList = new ArrayList<>();

    // 如果潜在对象都过，则物理位置上的下家应该为nextUserName
    private String physicalNextUserName;

    // 游戏状态
    private Boolean gameStarted = false;

    // 当前串数
    private Integer bankerNo = 1;

    // 是否换庄
    private boolean bankerChange = false;

    public Game() {
    }

    public Game(Integer messageType) {
        this.messageType = messageType;
    }


    /**
     * 创建新的游戏对象
     * @param remainMajiangList 剩余麻将数组
     * @param bankerName 庄家名称
     */
    public Game(List<User> userList, List<Majiang> remainMajiangList, String bankerName, Integer bankerNo) {
        this.userList = userList;
        this.remainMajiangList = remainMajiangList;
        this.currentUserName = bankerName;
        this.bankerName = bankerName;
        this.bankerNo = bankerNo;
        this.physicalNextUserName = bankerName;
    }

    public Integer getMessageType() {
        return messageType;
    }

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageUserName() {
        return messageUserName;
    }

    public void setMessageUserName(String messageUserName) {
        this.messageUserName = messageUserName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<Majiang> getRemainMajiangList() {
        return remainMajiangList;
    }

    public void setRemainMajiangList(List<Majiang> remainMajiangList) {
        this.remainMajiangList = remainMajiangList;
    }


    public Majiang getJin() {
        return jin;
    }

    public void setJin(Majiang jin) {
        this.jin = jin;
    }

    public String getCurrentUserName() {
        return currentUserName;
    }

    public void setCurrentUserName(String currentUserName) {
        this.currentUserName = currentUserName;
    }

    public Majiang getCurrentOutMajiang() {
        return currentOutMajiang;
    }

    public void setCurrentOutMajiang(Majiang currentOutMajiang) {
        this.currentOutMajiang = currentOutMajiang;
    }

    public Majiang getCurrentInMajiang() {
        return currentInMajiang;
    }

    public void setCurrentInMajiang(Majiang currentInMajiang) {
        this.currentInMajiang = currentInMajiang;
    }

    public String getBankerName() {
        return bankerName;
    }

    public void setBankerName(String bankerName) {
        this.bankerName = bankerName;
    }

    public List<String> getNextUserNameList() {
        return nextUserNameList;
    }

    public void setNextUserNameList(List<String> nextUserNameList) {
        this.nextUserNameList = nextUserNameList;
    }

    public String getPhysicalNextUserName() {
        return physicalNextUserName;
    }

    public void setPhysicalNextUserName(String physicalNextUserName) {
        this.physicalNextUserName = physicalNextUserName;
    }

    public void setUnReady() {
        for (int i = 0; i < userList.size(); i++) {
            User user = userList.get(i);
            user.setReady(false);
        }
    }

    public Boolean getGameStarted() {
        return gameStarted;
    }

    public void setGameStarted(Boolean gameStarted) {
        this.gameStarted = gameStarted;
    }

    public Integer getBankerNo() {
        return bankerNo;
    }

    public void setBankerNo(Integer bankerNo) {
        this.bankerNo = bankerNo;
    }

    public boolean isBankerChange() {
        return bankerChange;
    }

    public void setBankerChange(boolean bankerChange) {
        this.bankerChange = bankerChange;
    }

    @Override
    public String toString() {
        return "Game{" +
                "messageType=" + messageType +
                ", message='" + message + '\'' +
                ", messageUserName='" + messageUserName + '\'' +
                ", userList=" + userList +
                ", remainMajiangList=" + remainMajiangList +
                ", currentUserName='" + currentUserName + '\'' +
                ", currentOutMajiang=" + currentOutMajiang +
                ", jin=" + jin +
                ", currentInMajiang=" + currentInMajiang +
                ", bankerName='" + bankerName + '\'' +
                ", nextUserNameList=" + nextUserNameList +
                ", physicalNextUserName='" + physicalNextUserName + '\'' +
                '}';
    }
}
