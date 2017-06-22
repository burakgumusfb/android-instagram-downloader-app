package core;

import java.util.ArrayList;

class Dimensions
{
    private int height;

    public int getHeight() { return this.height; }

    public void setHeight(int height) { this.height = height; }

    private int width;

    public int getWidth() { return this.width; }

    public void setWidth(int width) { this.width = width; }
}

class EdgeMediaToTaggedUser
{
    private ArrayList<Object> edges;

    public ArrayList<Object> getEdges() { return this.edges; }

    public void setEdges(ArrayList<Object> edges) { this.edges = edges; }
}

 class Node
{
    private String text;

    public String getText() { return this.text; }

    public void setText(String text) { this.text = text; }
}

 class Edge
{
    private Node node;

    public Node getNode() { return this.node; }

    public void setNode(Node node) { this.node = node; }
}

 class EdgeMediaToCaption
{
    private ArrayList<Edge> edges;

    public ArrayList<Edge> getEdges() { return this.edges; }

    public void setEdges(ArrayList<Edge> edges) { this.edges = edges; }
}

 class PageInfo
{
    private boolean has_next_page;

    public boolean getHasNextPage() { return this.has_next_page; }

    public void setHasNextPage(boolean has_next_page) { this.has_next_page = has_next_page; }

    private Object end_cursor;

    public Object getEndCursor() { return this.end_cursor; }

    public void setEndCursor(Object end_cursor) { this.end_cursor = end_cursor; }
}

class Node2
{
    private String id;

    public String getId() { return this.id; }

    public void setId(String id) { this.id = id; }

    private String text;

    public String getText() { return this.text; }

    public void setText(String text) { this.text = text; }

    private int created_at;

    public int getCreatedAt() { return this.created_at; }

    public void setCreatedAt(int created_at) { this.created_at = created_at; }

    private Owner owner;

    public Owner getOwner() { return this.owner; }

    public void setOwner(Owner owner) { this.owner = owner; }
}

 class Edge2
{
    private Node2 node;

    public Node2 getNode() { return this.node; }

    public void setNode(Node2 node) { this.node = node; }
}

 class EdgeMediaToComment
{
    private int count;

    public int getCount() { return this.count; }

    public void setCount(int count) { this.count = count; }

    private PageInfo page_info;

    public PageInfo getPageInfo() { return this.page_info; }

    public void setPageInfo(PageInfo page_info) { this.page_info = page_info; }

    private ArrayList<Edge2> edges;

    public ArrayList<Edge2> getEdges() { return this.edges; }

    public void setEdges(ArrayList<Edge2> edges) { this.edges = edges; }
}

 class Node3
{
    private String id;

    public String getId() { return this.id; }

    public void setId(String id) { this.id = id; }

    private String profile_pic_url;

    public String getProfilePicUrl() { return this.profile_pic_url; }

    public void setProfilePicUrl(String profile_pic_url) { this.profile_pic_url = profile_pic_url; }

    private String username;

    public String getUsername() { return this.username; }

    public void setUsername(String username) { this.username = username; }
}

 class Edge3
{
    private Node3 node;

    public Node3 getNode() { return this.node; }

    public void setNode(Node3 node) { this.node = node; }
}

 class EdgeMediaPreviewLike
{
    private int count;

    public int getCount() { return this.count; }

    public void setCount(int count) { this.count = count; }

    private ArrayList<Edge3> edges;

    public ArrayList<Edge3> getEdges() { return this.edges; }

    public void setEdges(ArrayList<Edge3> edges) { this.edges = edges; }
}

 class EdgeMediaToSponsorUser
{
    private ArrayList<Object> edges;

    public ArrayList<Object> getEdges() { return this.edges; }

    public void setEdges(ArrayList<Object> edges) { this.edges = edges; }
}

 class Owner2
{
    private String id;

    public String getId() { return this.id; }

    public void setId(String id) { this.id = id; }

    private String profile_pic_url;

    public String getProfilePicUrl() { return this.profile_pic_url; }

    public void setProfilePicUrl(String profile_pic_url) { this.profile_pic_url = profile_pic_url; }

    private String username;

    public String getUsername() { return this.username; }

    public void setUsername(String username) { this.username = username; }

    private boolean followed_by_viewer;

    public boolean getFollowedByViewer() { return this.followed_by_viewer; }

    public void setFollowedByViewer(boolean followed_by_viewer) { this.followed_by_viewer = followed_by_viewer; }

    private String full_name;

    public String getFullName() { return this.full_name; }

    public void setFullName(String full_name) { this.full_name = full_name; }

    private boolean is_private;

    public boolean getIsPrivate() { return this.is_private; }

    public void setIsPrivate(boolean is_private) { this.is_private = is_private; }

    private boolean requested_by_viewer;

    public boolean getRequestedByViewer() { return this.requested_by_viewer; }

    public void setRequestedByViewer(boolean requested_by_viewer) { this.requested_by_viewer = requested_by_viewer; }

    private boolean is_unpublished;

    public boolean getIsUnpublished() { return this.is_unpublished; }

    public void setIsUnpublished(boolean is_unpublished) { this.is_unpublished = is_unpublished; }

    private boolean blocked_by_viewer;

    public boolean getBlockedByViewer() { return this.blocked_by_viewer; }

    public void setBlockedByViewer(boolean blocked_by_viewer) { this.blocked_by_viewer = blocked_by_viewer; }

    private boolean has_blocked_viewer;

    public boolean getHasBlockedViewer() { return this.has_blocked_viewer; }

    public void setHasBlockedViewer(boolean has_blocked_viewer) { this.has_blocked_viewer = has_blocked_viewer; }
}

 class EdgeWebMediaToRelatedMedia
{
    private ArrayList<Object> edges;

    public ArrayList<Object> getEdges() { return this.edges; }

    public void setEdges(ArrayList<Object> edges) { this.edges = edges; }
}

class Gatekeepers
{
    private boolean bn;

    public boolean getBn() { return this.bn; }

    public void setBn(boolean bn) { this.bn = bn; }

    private boolean ld;

    public boolean getLd() { return this.ld; }

    public void setLd(boolean ld) { this.ld = ld; }

    private boolean pl;

    public boolean getPl() { return this.pl; }

    public void setPl(boolean pl) { this.pl = pl; }
}

 class P
{
    private String use_new_styles;

    public String getUseNewStyles() { return this.use_new_styles; }

    public void setUseNewStyles(String use_new_styles) { this.use_new_styles = use_new_styles; }
}

class Ebd
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P p;

    public P getP() { return this.p; }

    public void setP(P p) { this.p = p; }
}

 class P2
{}

 class Bc3l
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P2 p;

    public P2 getP() { return this.p; }

    public void setP(P2 p) { this.p = p; }
}

 class P3
{}

 class Create
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P3 p;

    public P3 getP() { return this.p; }

    public void setP(P3 p) { this.p = p; }
}

 class P4
{}

 class Disc
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P4 p;

    public P4 getP() { return this.p; }

    public void setP(P4 p) { this.p = p; }
}

 class P5
{}

 class EmptyProfile
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P5 p;

    public P5 getP() { return this.p; }

    public void setP(P5 p) { this.p = p; }
}

 class P6
{}

 class Feed
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P6 p;

    public P6 getP() { return this.p; }

    public void setP(P6 p) { this.p = p; }
}

 class P7
{}

 class Gql
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P7 p;

    public P7 getP() { return this.p; }

    public void setP(P7 p) { this.p = p; }
}

 class P8
{}

 class SuUniverse
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P8 p;

    public P8 getP() { return this.p; }

    public void setP(P8 p) { this.p = p; }
}

 class P9
{}

 class Us
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P9 p;

    public P9 getP() { return this.p; }

    public void setP(P9 p) { this.p = p; }
}

 class P10
{}

 class UsLi
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P10 p;

    public P10 getP() { return this.p; }

    public void setP(P10 p) { this.p = p; }
}

 class P11
{}

 class Nav
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P11 p;

    public P11 getP() { return this.p; }

    public void setP(P11 p) { this.p = p; }
}

 class P12
{}

 class NavLo
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P12 p;

    public P12 getP() { return this.p; }

    public void setP(P12 p) { this.p = p; }
}

 class P13
{}

 class Poe
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P13 p;

    public P13 getP() { return this.p; }

    public void setP(P13 p) { this.p = p; }
}

 class P14
{}

 class Pm
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P14 p;

    public P14 getP() { return this.p; }

    public void setP(P14 p) { this.p = p; }
}

 class P15
{}

 class Profile
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P15 p;

    public P15 getP() { return this.p; }

    public void setP(P15 p) { this.p = p; }
}

 class P16
{}

 class Deact
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P16 p;

    public P16 getP() { return this.p; }

    public void setP(P16 p) { this.p = p; }
}

 class P17
{}

 class Sidecar
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P17 p;

    public P17 getP() { return this.p; }

    public void setP(P17 p) { this.p = p; }
}

 class P18
{}

 class Ufi
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P18 p;

    public P18 getP() { return this.p; }

    public void setP(P18 p) { this.p = p; }
}

 class P19
{}

 class UfiLoggedout
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P19 p;

    public P19 getP() { return this.p; }

    public void setP(P19 p) { this.p = p; }
}

 class P20
{}

 class Video
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P20 p;

    public P20 getP() { return this.p; }

    public void setP(P20 p) { this.p = p; }
}

 class P21
{}

 class Filters
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P21 p;

    public P21 getP() { return this.p; }

    public void setP(P21 p) { this.p = p; }
}

 class P22
{}

 class Typeahead
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P22 p;

    public P22 getP() { return this.p; }

    public void setP(P22 p) { this.p = p; }
}

 class P23
{

}

 class LocationTag
{
    private String g;

    public String getG() { return this.g; }

    public void setG(String g) { this.g = g; }

    private P23 p;

    public P23 getP() { return this.p; }

    public void setP(P23 p) { this.p = p; }
}

 class Qe
{
    private Ebd ebd;

    public Ebd getEbd() { return this.ebd; }

    public void setEbd(Ebd ebd) { this.ebd = ebd; }

    private Bc3l bc3l;

    public Bc3l getBc3l() { return this.bc3l; }

    public void setBc3l(Bc3l bc3l) { this.bc3l = bc3l; }

    private Create create;

    public Create getCreate() { return this.create; }

    public void setCreate(Create create) { this.create = create; }

    private Disc disc;

    public Disc getDisc() { return this.disc; }

    public void setDisc(Disc disc) { this.disc = disc; }

    private EmptyProfile empty_profile;

    public EmptyProfile getEmptyProfile() { return this.empty_profile; }

    public void setEmptyProfile(EmptyProfile empty_profile) { this.empty_profile = empty_profile; }

    private Feed feed;

    public Feed getFeed() { return this.feed; }

    public void setFeed(Feed feed) { this.feed = feed; }

    private Gql gql;

    public Gql getGql() { return this.gql; }

    public void setGql(Gql gql) { this.gql = gql; }

    private SuUniverse su_universe;

    public SuUniverse getSuUniverse() { return this.su_universe; }

    public void setSuUniverse(SuUniverse su_universe) { this.su_universe = su_universe; }

    private Us us;

    public Us getUs() { return this.us; }

    public void setUs(Us us) { this.us = us; }

    private UsLi us_li;

    public UsLi getUsLi() { return this.us_li; }

    public void setUsLi(UsLi us_li) { this.us_li = us_li; }

    private Nav nav;

    public Nav getNav() { return this.nav; }

    public void setNav(Nav nav) { this.nav = nav; }

    private NavLo nav_lo;

    public NavLo getNavLo() { return this.nav_lo; }

    public void setNavLo(NavLo nav_lo) { this.nav_lo = nav_lo; }

    private Poe poe;

    public Poe getPoe() { return this.poe; }

    public void setPoe(Poe poe) { this.poe = poe; }

    private Pm pm;

    public Pm getPm() { return this.pm; }

    public void setPm(Pm pm) { this.pm = pm; }

    private Profile profile;

    public Profile getProfile() { return this.profile; }

    public void setProfile(Profile profile) { this.profile = profile; }

    private Deact deact;

    public Deact getDeact() { return this.deact; }

    public void setDeact(Deact deact) { this.deact = deact; }

    private Sidecar sidecar;

    public Sidecar getSidecar() { return this.sidecar; }

    public void setSidecar(Sidecar sidecar) { this.sidecar = sidecar; }

    private Ufi ufi;

    public Ufi getUfi() { return this.ufi; }

    public void setUfi(Ufi ufi) { this.ufi = ufi; }

    private UfiLoggedout ufi_loggedout;

    public UfiLoggedout getUfiLoggedout() { return this.ufi_loggedout; }

    public void setUfiLoggedout(UfiLoggedout ufi_loggedout) { this.ufi_loggedout = ufi_loggedout; }

    private Video video;

    public Video getVideo() { return this.video; }

    public void setVideo(Video video) { this.video = video; }

    private Filters filters;

    public Filters getFilters() { return this.filters; }

    public void setFilters(Filters filters) { this.filters = filters; }

    private Typeahead typeahead;

    public Typeahead getTypeahead() { return this.typeahead; }

    public void setTypeahead(Typeahead typeahead) { this.typeahead = typeahead; }

    private LocationTag location_tag;

    public LocationTag getLocationTag() { return this.location_tag; }

    public void setLocationTag(LocationTag location_tag) { this.location_tag = location_tag; }
}

 class DisplayPropertiesServerGuess
{
    private double pixel_ratio;

    public double getPixelRatio() { return this.pixel_ratio; }

    public void setPixelRatio(double pixel_ratio) { this.pixel_ratio = pixel_ratio; }

    private int viewport_width;

    public int getViewportWidth() { return this.viewport_width; }

    public void setViewportWidth(int viewport_width) { this.viewport_width = viewport_width; }
}

 public  class SharedResponseTemplate
{
    private Object activity_counts;

    public Object getActivityCounts() { return this.activity_counts; }

    public void setActivityCounts(Object activity_counts) { this.activity_counts = activity_counts; }

    private Config config;

    public Config getConfig() { return this.config; }

    public void setConfig(Config config) { this.config = config; }

    private String country_code;

    public String getCountryCode() { return this.country_code; }

    public void setCountryCode(String country_code) { this.country_code = country_code; }

    private String language_code;

    public String getLanguageCode() { return this.language_code; }

    public void setLanguageCode(String language_code) { this.language_code = language_code; }

    private EntryData entry_data;

    public EntryData getEntryData() { return this.entry_data; }

    public void setEntryData(EntryData entry_data) { this.entry_data = entry_data; }

    private Gatekeepers gatekeepers;

    public Gatekeepers getGatekeepers() { return this.gatekeepers; }

    public void setGatekeepers(Gatekeepers gatekeepers) { this.gatekeepers = gatekeepers; }

    private Qe qe;

    public Qe getQe() { return this.qe; }

    public void setQe(Qe qe) { this.qe = qe; }

    private String hostname;

    public String getHostname() { return this.hostname; }

    public void setHostname(String hostname) { this.hostname = hostname; }

    private DisplayPropertiesServerGuess display_properties_server_guess;

    public DisplayPropertiesServerGuess getDisplayPropertiesServerGuess() { return this.display_properties_server_guess; }

    public void setDisplayPropertiesServerGuess(DisplayPropertiesServerGuess display_properties_server_guess) { this.display_properties_server_guess = display_properties_server_guess; }

    private boolean environment_switcher_visible_server_guess;

    public boolean getEnvironmentSwitcherVisibleServerGuess() { return this.environment_switcher_visible_server_guess; }

    public void setEnvironmentSwitcherVisibleServerGuess(boolean environment_switcher_visible_server_guess) { this.environment_switcher_visible_server_guess = environment_switcher_visible_server_guess; }

    private String platform;

    public String getPlatform() { return this.platform; }

    public void setPlatform(String platform) { this.platform = platform; }

    private boolean probably_has_app;

    public boolean getProbablyHasApp() { return this.probably_has_app; }

    public void setProbablyHasApp(boolean probably_has_app) { this.probably_has_app = probably_has_app; }

    private boolean show_app_install;

    public boolean getShowAppInstall() { return this.show_app_install; }

    public void setShowAppInstall(boolean show_app_install) { this.show_app_install = show_app_install; }
}