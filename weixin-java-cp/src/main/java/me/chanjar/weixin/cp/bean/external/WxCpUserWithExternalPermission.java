package me.chanjar.weixin.cp.bean.external;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Data;
import me.chanjar.weixin.cp.util.json.WxCpGsonBuilder;

import java.io.Serializable;
import java.util.List;

/**
 * @author 曹祖鹏
 */
@Data
public class WxCpUserWithExternalPermission implements Serializable {
  private static final long serialVersionUID = -4301684507150486556L;

  @SerializedName("errcode")
  @Expose
  private Long errCode;
  @SerializedName("errmsg")
  @Expose
  private String errMsg;

  @SerializedName("follow_user")
  @Expose
  private List<String> followers = null;

  public static WxCpUserWithExternalPermission fromJson(String json) {
    return WxCpGsonBuilder.create().fromJson(json, WxCpUserWithExternalPermission.class);
  }
}
