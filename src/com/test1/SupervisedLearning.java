package com.test1;

public class SupervisedLearning {
	private Integer imageClassificationIndicator;
	private String marketPerdictionName;
	private String marketPerdictionType;
	private String marketPerdictionOwner;
	private String models;
	private String features;
	private Long targetLabel;
	private String trainings;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public SupervisedLearning() {

	}

	public SupervisedLearning(Integer imageClassificationIndicator, String marketPerdictionName,
			String marketPerdictionType, String marketPerdictionOwner, String models, String features, Long targetLabel,
			String trainings, String creationDate, String modifiedDate, String entityState) {
		super();
		this.imageClassificationIndicator = imageClassificationIndicator;
		this.marketPerdictionName = marketPerdictionName;
		this.marketPerdictionType = marketPerdictionType;
		this.marketPerdictionOwner = marketPerdictionOwner;
		this.models = models;
		this.features = features;
		this.targetLabel = targetLabel;
		this.trainings = trainings;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getImageClassificationIndicator() {
		return imageClassificationIndicator;
	}

	public void setImageClassificationIndicator(Integer imageClassificationIndicator) {
		this.imageClassificationIndicator = imageClassificationIndicator;
	}

	public String getMarketPerdictionName() {
		return marketPerdictionName;
	}

	public void setMarketPerdictionName(String marketPerdictionName) {
		this.marketPerdictionName = marketPerdictionName;
	}

	public String getMarketPerdictionType() {
		return marketPerdictionType;
	}

	public void setMarketPerdictionType(String marketPerdictionType) {
		this.marketPerdictionType = marketPerdictionType;
	}

	public String getMarketPerdictionOwner() {
		return marketPerdictionOwner;
	}

	public void setMarketPerdictionOwner(String marketPerdictionOwner) {
		this.marketPerdictionOwner = marketPerdictionOwner;
	}

	public String getModels() {
		return models;
	}

	public void setModels(String models) {
		this.models = models;
	}

	public String getFeatures() {
		return features;
	}

	public void setFeatures(String features) {
		this.features = features;
	}

	public Long getTargetLabel() {
		return targetLabel;
	}

	public void setTargetLabel(Long targetLabel) {
		this.targetLabel = targetLabel;
	}

	public String getTrainings() {
		return trainings;
	}

	public void setTrainings(String trainings) {
		this.trainings = trainings;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
