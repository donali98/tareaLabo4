package com.dona.labo4.domain;

import javax.validation.constraints.AssertTrue;

public class Robot {
    @AssertTrue(message="UPS no puedes agregar tu producto porque eres un robot, haz click para regresar")
	private Boolean soyRobot;

	public Boolean getSoyRobot() {
		return soyRobot;
	}

	public void setSoyRobot(Boolean soyRobot) {
		this.soyRobot = soyRobot;
	}
}