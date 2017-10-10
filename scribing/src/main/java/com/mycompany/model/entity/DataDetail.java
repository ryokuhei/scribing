package com.mycompany.model.entity;

import java.io.File;

public class DataDetail {

	private int bb;
	private int rb;
	private int art;
	private int bonusProbability;
	private int totalBonus;
	private int totalGame;
	private int totalArt;
	private int endGame;
	private int maxMedal;
	private int earnedMedals; 
	private File resultImagePath;
	
	public DataDetail() {
	}

	public int getBb() {
		return bb;
	}
	public void setBb(int bb) {
		this.bb = bb;
	}
	public int getRb() {
		return rb;
	}
	public void setRb(int rb) {
		this.rb = rb;
	}
	public int getArt() {
		return art;
	}
	public void setArt(int art) {
		this.art = art;
	}
	public int getBonusProbability() {
		return bonusProbability;
	}
	public void setBonusProbability(int bonusProbability) {
		this.bonusProbability = bonusProbability;
	}
	public int getTotalBonus() {
		return totalBonus;
	}
	public void setTotalBonus(int totalBonus) {
		this.totalBonus = totalBonus;
	}
	public int getTotalGame() {
		return totalGame;
	}
	public void setTotalGame(int totalGame) {
		this.totalGame = totalGame;
	}
	public int getTotalArt() {
		return totalArt;
	}
	public void setTotalArt(int totalArt) {
		this.totalArt = totalArt;
	}
	public int getEndGame() {
		return endGame;
	}
	public void setEndGame(int endGame) {
		this.endGame = endGame;
	}
	public int getMaxMedal() {
		return maxMedal;
	}
	public void setMaxMedal(int maxMedal) {
		this.maxMedal = maxMedal;
	}
	public File getResultImagePath() {
		return resultImagePath;
	}

	public void setResultImagePath(File resultImagePath) {
		this.resultImagePath = resultImagePath;
	}

	public int getEarnedMedals() {
		return earnedMedals;
	}

	public void setEarnedMedals(int earnedMedals) {
		this.earnedMedals = earnedMedals;
	}
}