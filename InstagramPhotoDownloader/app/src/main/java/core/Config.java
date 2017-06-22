package core;

/**
 * Created by BURAK on 11/06/2017.
 */

public class Config
{
    private String csrf_token;

    public String getCsrfToken() { return this.csrf_token; }

    public void setCsrfToken(String csrf_token) { this.csrf_token = csrf_token; }

    private Viewer viewer;

    public Viewer getViewer() { return this.viewer; }

    public void setViewer(Viewer viewer) { this.viewer = viewer; }
}
