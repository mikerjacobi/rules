package doit.doit;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Idea implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("PK of idea")
	private java.lang.String id;
	@org.kie.api.definition.type.Label("the idea itself")
	private java.lang.String description;
	@org.kie.api.definition.type.Label("pain of failure")
	private Float risk;
	@org.kie.api.definition.type.Label("upside of success")
	private Float reward;
	@org.kie.api.definition.type.Label("odds of hitting the reward")
	private Float successChance;

	@org.kie.api.definition.type.Label("do it or not")
	private java.lang.Boolean shouldDoIt;

	@org.kie.api.definition.type.Label(value = "cost to attempt this idea")
	private java.lang.Float cost;

	public Idea() {
	}

	public java.lang.String getId() {
		return this.id;
	}

	public void setId(java.lang.String id) {
		this.id = id;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.Boolean getShouldDoIt() {
		return this.shouldDoIt;
	}

	public void setShouldDoIt(java.lang.Boolean shouldDoIt) {
		this.shouldDoIt = shouldDoIt;
	}

	public java.lang.Float getRisk() {
		return this.risk;
	}

	public void setRisk(java.lang.Float risk) {
		this.risk = risk;
	}

	public java.lang.Float getReward() {
		return this.reward;
	}

	public void setReward(java.lang.Float reward) {
		this.reward = reward;
	}

	public java.lang.Float getSuccessChance() {
		return this.successChance;
	}

	public void setSuccessChance(java.lang.Float successChance) {
		this.successChance = successChance;
	}

	public java.lang.Float getCost() {
		return this.cost;
	}

	public void setCost(java.lang.Float cost) {
		this.cost = cost;
	}

	public Idea(java.lang.String id, java.lang.String description,
			java.lang.Float risk, java.lang.Float reward,
			java.lang.Float successChance, java.lang.Boolean shouldDoIt,
			java.lang.Float cost) {
		this.id = id;
		this.description = description;
		this.risk = risk;
		this.reward = reward;
		this.successChance = successChance;
		this.shouldDoIt = shouldDoIt;
		this.cost = cost;
	}

}