package com.projectmanagement.CodeNinja.dto;

public class TeamDTO {

	private String teamId;
	private String teamName;

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "TeamDTO [teamId=" + teamId + ", teamName=" + teamName + "]";
	}

}
