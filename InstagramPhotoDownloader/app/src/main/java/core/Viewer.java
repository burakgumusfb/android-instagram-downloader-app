package core;

/**
 * Created by BURAK on 12/06/2017.
 */

public class Viewer {

    private String biography;
    private String external_url;
    private String full_name;
    private boolean has_profile_pic;
    private String id;
    private String profile_pic_url;
    private String profile_pic_url_hd;
    private String username;

    public String getBiography() {
        return this.biography;
    }

    public void setBiography(String profile_pic_url) {
        this.biography = profile_pic_url;
    }


    public String getExternal_url() {
        return this.external_url;
    }

    public void setExternal_url(String userName) {
        this.external_url = userName;
    }


    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }


    public boolean isHas_profile_pic() {
        return has_profile_pic;
    }

    public void setHas_profile_pic(boolean has_profile_pic) {
        this.has_profile_pic = has_profile_pic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfile_pic_url() {
        return profile_pic_url;
    }

    public void setProfile_pic_url(String profile_pic_url) {
        this.profile_pic_url = profile_pic_url;
    }

    public String getProfile_pic_url_hd() {
        return profile_pic_url_hd;
    }

    public void setProfile_pic_url_hd(String profile_pic_url_hd) {
        this.profile_pic_url_hd = profile_pic_url_hd;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
