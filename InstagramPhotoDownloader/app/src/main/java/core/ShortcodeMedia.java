package core;

public class ShortcodeMedia
{
   private String __typename;

   public String getTypename() { return this.__typename; }

   public void setTypename(String __typename) { this.__typename = __typename; }

   private String id;

   public String getId() { return this.id; }

   public void setId(String id) { this.id = id; }

   private String shortcode;

   public String getShortcode() { return this.shortcode; }

   public void setShortcode(String shortcode) { this.shortcode = shortcode; }

   private Dimensions dimensions;

   public Dimensions getDimensions() { return this.dimensions; }

   public void setDimensions(Dimensions dimensions) { this.dimensions = dimensions; }

   private String display_url;

   public String getDisplayUrl() { return this.display_url; }

   public void setDisplayUrl(String display_url) { this.display_url = display_url; }

   private String video_url;
   public String getVideo_url() {
      return video_url;
   }

   public void setVideo_url(String video_url) {
      this.video_url = video_url;
   }
   private int video_view_count;

   public int getVideo_view_count() {
      return video_view_count;
   }

   public void setVideo_view_count(int video_view_count) {
      this.video_view_count = video_view_count;
   }
   private boolean is_video;

   public boolean getIsVideo() { return this.is_video; }

   public void setIsVideo(boolean is_video) { this.is_video = is_video; }

   private EdgeMediaToTaggedUser edge_media_to_tagged_user;

   public EdgeMediaToTaggedUser getEdgeMediaToTaggedUser() { return this.edge_media_to_tagged_user; }

   public void setEdgeMediaToTaggedUser(EdgeMediaToTaggedUser edge_media_to_tagged_user) { this.edge_media_to_tagged_user = edge_media_to_tagged_user; }

   private EdgeMediaToCaption edge_media_to_caption;

   public EdgeMediaToCaption getEdgeMediaToCaption() { return this.edge_media_to_caption; }

   public void setEdgeMediaToCaption(EdgeMediaToCaption edge_media_to_caption) { this.edge_media_to_caption = edge_media_to_caption; }

   private boolean caption_is_edited;

   public boolean getCaptionIsEdited() { return this.caption_is_edited; }

   public void setCaptionIsEdited(boolean caption_is_edited) { this.caption_is_edited = caption_is_edited; }

   private EdgeMediaToComment edge_media_to_comment;

   public EdgeMediaToComment getEdgeMediaToComment() { return this.edge_media_to_comment; }

   public void setEdgeMediaToComment(EdgeMediaToComment edge_media_to_comment) { this.edge_media_to_comment = edge_media_to_comment; }

   private boolean comments_disabled;

   public boolean getCommentsDisabled() { return this.comments_disabled; }

   public void setCommentsDisabled(boolean comments_disabled) { this.comments_disabled = comments_disabled; }

   private int taken_at_timestamp;

   public int getTakenAtTimestamp() { return this.taken_at_timestamp; }

   public void setTakenAtTimestamp(int taken_at_timestamp) { this.taken_at_timestamp = taken_at_timestamp; }

   private EdgeMediaPreviewLike edge_media_preview_like;

   public EdgeMediaPreviewLike getEdgeMediaPreviewLike() { return this.edge_media_preview_like; }

   public void setEdgeMediaPreviewLike(EdgeMediaPreviewLike edge_media_preview_like) { this.edge_media_preview_like = edge_media_preview_like; }

   private EdgeMediaToSponsorUser edge_media_to_sponsor_user;

   public EdgeMediaToSponsorUser getEdgeMediaToSponsorUser() { return this.edge_media_to_sponsor_user; }

   public void setEdgeMediaToSponsorUser(EdgeMediaToSponsorUser edge_media_to_sponsor_user) { this.edge_media_to_sponsor_user = edge_media_to_sponsor_user; }

   private Object location;

   public Object getLocation() { return this.location; }

   public void setLocation(Object location) { this.location = location; }

   private boolean viewer_has_liked;

   public boolean getViewerHasLiked() { return this.viewer_has_liked; }

   public void setViewerHasLiked(boolean viewer_has_liked) { this.viewer_has_liked = viewer_has_liked; }

   private Owner owner;

   public Owner getOwner() { return this.owner; }

   public void setOwner(Owner owner) { this.owner = owner; }

   private boolean is_ad;

   public boolean getIsAd() { return this.is_ad; }

   public void setIsAd(boolean is_ad) { this.is_ad = is_ad; }

   private EdgeWebMediaToRelatedMedia edge_web_media_to_related_media;

   public EdgeWebMediaToRelatedMedia getEdgeWebMediaToRelatedMedia() { return this.edge_web_media_to_related_media; }

   public void setEdgeWebMediaToRelatedMedia(EdgeWebMediaToRelatedMedia edge_web_media_to_related_media) { this.edge_web_media_to_related_media = edge_web_media_to_related_media; }


}
