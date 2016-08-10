package com.ixs.model;

public class T_Model {
	private int ModelID;
	private String ModelName;
	private String ModelVersion;
	private String ModelDesc;
	
	public int getModelID() {
		return ModelID;
	}

	public void setModelID(int modelID) {
		ModelID = modelID;
	}

	public String getModelName() {
		return ModelName;
	}

	public void setModelName(String modelName) {
		ModelName = modelName;
	}

	public String getModelVersion() {
		return ModelVersion;
	}

	public void setModelVersion(String modelVersion) {
		ModelVersion = modelVersion;
	}

	public String getModelDesc() {
		return ModelDesc;
	}

	public void setModelDesc(String modelDesc) {
		ModelDesc = modelDesc;
	}

	@Override
	public String toString() {
		return "T_Model [ModelID=" + ModelID + ", ModelName=" + ModelName + ", ModelVersion=" + ModelVersion
				+ ", ModelDesc=" + ModelDesc + "]";
	}
	
}
