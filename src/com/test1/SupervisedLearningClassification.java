package com.test1;

public class SupervisedLearningClassification {
	private Integer imageClassificationIndicator;
	private String problemDefinition;
	private String dataExploration;
	private String preprocess;
	private String processing;
	private Integer dataSplitId;
	private boolean isSplitted;
	private boolean modelSelection;
	private Integer modelId;
	private String modelTrain;
	private String evaluation;
	private String deployStage;
	private String monitorStage;

	public SupervisedLearningClassification() {

	}

	public SupervisedLearningClassification(Integer imageClassificationIndicator, String problemDefinition,
			String dataExploration, String preprocess, String processing, Integer dataSplitId, boolean isSplitted,
			boolean modelSelection, Integer modelId, String modelTrain, String evaluation, String deployStage,
			String monitorStage) {
		super();
		this.imageClassificationIndicator = imageClassificationIndicator;
		this.problemDefinition = problemDefinition;
		this.dataExploration = dataExploration;
		this.preprocess = preprocess;
		this.processing = processing;
		this.dataSplitId = dataSplitId;
		this.isSplitted = isSplitted;
		this.modelSelection = modelSelection;
		this.modelId = modelId;
		this.modelTrain = modelTrain;
		this.evaluation = evaluation;
		this.deployStage = deployStage;
		this.monitorStage = monitorStage;
	}

	public Integer getImageClassificationIndicator() {
		return imageClassificationIndicator;
	}

	public void setImageClassificationIndicator(Integer imageClassificationIndicator) {
		this.imageClassificationIndicator = imageClassificationIndicator;
	}

	public String getProblemDefinition() {
		return problemDefinition;
	}

	public void setProblemDefinition(String problemDefinition) {
		this.problemDefinition = problemDefinition;
	}

	public String getDataExploration() {
		return dataExploration;
	}

	public void setDataExploration(String dataExploration) {
		this.dataExploration = dataExploration;
	}

	public String getPreprocess() {
		return preprocess;
	}

	public void setPreprocess(String preprocess) {
		this.preprocess = preprocess;
	}

	public String getProcessing() {
		return processing;
	}

	public void setProcessing(String processing) {
		this.processing = processing;
	}

	public Integer getDataSplitId() {
		return dataSplitId;
	}

	public void setDataSplitId(Integer dataSplitId) {
		this.dataSplitId = dataSplitId;
	}

	public boolean isSplitted() {
		return isSplitted;
	}

	public void setSplitted(boolean isSplitted) {
		this.isSplitted = isSplitted;
	}

	public boolean isModelSelection() {
		return modelSelection;
	}

	public void setModelSelection(boolean modelSelection) {
		this.modelSelection = modelSelection;
	}

	public Integer getModelId() {
		return modelId;
	}

	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}

	public String getModelTrain() {
		return modelTrain;
	}

	public void setModelTrain(String modelTrain) {
		this.modelTrain = modelTrain;
	}

	public String getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}

	public String getDeployStage() {
		return deployStage;
	}

	public void setDeployStage(String deployStage) {
		this.deployStage = deployStage;
	}

	public String getMonitorStage() {
		return monitorStage;
	}

	public void setMonitorStage(String monitorStage) {
		this.monitorStage = monitorStage;
	}

}
