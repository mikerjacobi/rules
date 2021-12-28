package com.doit.do_it;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Idea implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "PK of Idea")
	private int id;
	@org.kie.api.definition.type.Label(value = "the idea itself")
	private java.lang.String description;
	@org.kie.api.definition.type.Label(value = "the person who had the idea")
	private java.lang.String author;
	@org.kie.api.definition.type.Label(value = "the value of the payoff from this idea")
	private int reward;
	@org.kie.api.definition.type.Label(value = "the pain of failure")
	private int risk;
	@org.kie.api.definition.type.Label(value = "how likely this idea is to succeed")
	private java.lang.Double successLiklihood;

	public Idea() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getAuthor() {
		return this.author;
	}

	public void setAuthor(java.lang.String author) {
		this.author = author;
	}

	public int getReward() {
		return this.reward;
	}

	public void setReward(int reward) {
		this.reward = reward;
	}

	public int getRisk() {
		return this.risk;
	}

	public void setRisk(int risk) {
		this.risk = risk;
	}

	public java.lang.Double getSuccessLiklihood() {
		return this.successLiklihood;
	}

	public void setSuccessLiklihood(java.lang.Double successLiklihood) {
		this.successLiklihood = successLiklihood;
	}

	public Idea(int id, java.lang.String description, java.lang.String author,
			int reward, int risk, java.lang.Double successLiklihood) {
		this.id = id;
		this.description = description;
		this.author = author;
		this.reward = reward;
		this.risk = risk;
		this.successLiklihood = successLiklihood;
	}

}