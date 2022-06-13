package com.example.emailv1;

public class CustomItemModel {

    private String userName;
    private String title;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String time;
    private boolean selected;

    public CustomItemModel(String userName, String title,String desc, String time) {
        this.userName = userName;
        this.title = title;
        this.desc = desc;
        this.time = time;
        this.selected = false;
    }

    public boolean isSelected(){
        return selected;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setSelected(boolean selected){
        this.selected = true;
    }

}
