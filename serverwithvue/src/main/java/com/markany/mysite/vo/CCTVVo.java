package com.markany.mysite.vo;

public class CCTVVo {
	
	private Long id;
	private String idString;
	private String name;
	private String comment;
	private String address;
	private String ipAddress;
	private String area1;
	private String area2;
	private String area3;
	private String latitude;
	private String longitude;
	private String managePort;
	private String rtspPort;
	private String rtspPath;
	private String onvifPort;
	private String onvifProfile;
	private String manufacturer;
	private String model;
	private String username;
	private String alarm;
	private String cameraType;
	private String panFlip;
	private String panDegree;
	private String tiltDegree;
	private String playBefore;
	private String playAfter;
	private String forwarded;
	private String capImage;
	private String updatedAt;
	private String firmwareVersion;
	private String emergencyBell;
	private String luaScript;
	private String healthCheck;
	private String ptzScript;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdString() {
		return idString;
	}
	public void setIdString(String idString) {
		this.idString = idString;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getArea1() {
		return area1;
	}
	public void setArea1(String area1) {
		this.area1 = area1;
	}
	public String getArea2() {
		return area2;
	}
	public void setArea2(String area2) {
		this.area2 = area2;
	}
	public String getArea3() {
		return area3;
	}
	public void setArea3(String area3) {
		this.area3 = area3;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getManagePort() {
		return managePort;
	}
	public void setManagePort(String managePort) {
		this.managePort = managePort;
	}
	public String getRtspPort() {
		return rtspPort;
	}
	public void setRtspPort(String rtspPort) {
		this.rtspPort = rtspPort;
	}
	public String getRtspPath() {
		return rtspPath;
	}
	public void setRtspPath(String rtspPath) {
		this.rtspPath = rtspPath;
	}
	public String getOnvifPort() {
		return onvifPort;
	}
	public void setOnvifPort(String onvifPort) {
		this.onvifPort = onvifPort;
	}
	public String getOnvifProfile() {
		return onvifProfile;
	}
	public void setOnvifProfile(String onvifProfile) {
		this.onvifProfile = onvifProfile;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAlarm() {
		return alarm;
	}
	public void setAlarm(String alarm) {
		this.alarm = alarm;
	}
	public String getCameraType() {
		return cameraType;
	}
	public void setCameraType(String cameraType) {
		this.cameraType = cameraType;
	}
	public String getPanFlip() {
		return panFlip;
	}
	public void setPanFlip(String panFlip) {
		this.panFlip = panFlip;
	}
	public String getPanDegree() {
		return panDegree;
	}
	public void setPanDegree(String panDegree) {
		this.panDegree = panDegree;
	}
	public String getTiltDegree() {
		return tiltDegree;
	}
	public void setTiltDegree(String tiltDegree) {
		this.tiltDegree = tiltDegree;
	}
	public String getPlayBefore() {
		return playBefore;
	}
	public void setPlayBefore(String playBefore) {
		this.playBefore = playBefore;
	}
	public String getPlayAfter() {
		return playAfter;
	}
	public void setPlayAfter(String playAfter) {
		this.playAfter = playAfter;
	}
	public String getForwarded() {
		return forwarded;
	}
	public void setForwarded(String forwarded) {
		this.forwarded = forwarded;
	}
	public String getCapImage() {
		return capImage;
	}
	public void setCapImage(String capImage) {
		this.capImage = capImage;
	}
	public String getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}
	public String getFirmwareVersion() {
		return firmwareVersion;
	}
	public void setFirmwareVersion(String firmwareVersion) {
		this.firmwareVersion = firmwareVersion;
	}
	public String getEmergencyBell() {
		return emergencyBell;
	}
	public void setEmergencyBell(String emergencyBell) {
		this.emergencyBell = emergencyBell;
	}
	public String getLuaScript() {
		return luaScript;
	}
	public void setLuaScript(String luaScript) {
		this.luaScript = luaScript;
	}
	public String getHealthCheck() {
		return healthCheck;
	}
	public void setHealthCheck(String healthCheck) {
		this.healthCheck = healthCheck;
	}
	public String getPtzScript() {
		return ptzScript;
	}
	public void setPtzScript(String ptzScript) {
		this.ptzScript = ptzScript;
	}
	@Override
	public String toString() {
		return "CCTVVo [id=" + id + ", idString=" + idString + ", name=" + name + ", comment=" + comment + ", address="
				+ address + ", ipAddress=" + ipAddress + ", area1=" + area1 + ", area2=" + area2 + ", area3=" + area3
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", managePort=" + managePort + ", rtspPort="
				+ rtspPort + ", rtspPath=" + rtspPath + ", onvifPort=" + onvifPort + ", onvifProfile=" + onvifProfile
				+ ", manufacturer=" + manufacturer + ", model=" + model + ", username=" + username + ", alarm=" + alarm
				+ ", cameraType=" + cameraType + ", panFlip=" + panFlip + ", panDegree=" + panDegree + ", tiltDegree="
				+ tiltDegree + ", playBefore=" + playBefore + ", playAfter=" + playAfter + ", forwarded=" + forwarded
				+ ", capImage=" + capImage + ", updatedAt=" + updatedAt + ", firmwareVersion=" + firmwareVersion
				+ ", emergencyBell=" + emergencyBell + ", luaScript=" + luaScript + ", healthCheck=" + healthCheck
				+ ", ptzScript=" + ptzScript + "]";
	}
	
	
}