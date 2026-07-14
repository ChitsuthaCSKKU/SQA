package com.health.fitness;
/**
 * CP353201 Software Quality Assurance (1/2569)
 * Lab#4 – Boundary value analysis and robustness testing
 * Instructor: Asst.Prof. Chitsutha Soomlek
 * 
 * 1. Use the given template to design test cases before working on the matching JUnit test code.
 * 2. Record your test results in indicated format.
 * 3. Read the lab instructions for the details.
 */

public class HealthIndexScore {
	
	public enum FitnessLevel {
        EXCELLENT, STANDARD, POOR
    }

    private final double vo2Max;
    private final int restingHeartRate;
    private final int heartRateRecovery;

    /**
     * Constructor
     * 
     * @param vo2Max (ml/kg/min)
     * @param restingHeartRate (40-220 bpm)
     * @param heartRateRecovery (beats)
     */
    public HealthIndexScore(double vo2Max, int restingHeartRate, int heartRateRecovery) {
        validateInputs(vo2Max, restingHeartRate, heartRateRecovery);
        this.vo2Max = vo2Max;
        this.restingHeartRate = restingHeartRate;
        this.heartRateRecovery = heartRateRecovery;
    }

    private void validateInputs(double vo2Max, int rhr, int hrr) {
        if (vo2Max < 0) {
            throw new IllegalArgumentException("VO2 Max cannot be negative.");
        }
        if (rhr < 40 || rhr > 220) {
            throw new IllegalArgumentException("Resting Heart Rate (RHR) must be between 40 and 220 bpm.");
        }
        if (hrr < 0) {
            throw new IllegalArgumentException("Heart Rate Recovery (HRR) cannot be negative.");
        }
    }

    /**
     * Calculate VO2 Max
     */
    public int calculateVo2MaxScore() {
        if (vo2Max < 25) {
            return 0; //very poor
        } else if (vo2Max >= 25 && vo2Max <= 30) {
            return 1; //poor
        } else if (vo2Max >= 31 && vo2Max <= 40) {
            return 2; //normal
        } else if (vo2Max >= 41 && vo2Max <= 50) {
            return 3; //good
        } else if (vo2Max >= 51 && vo2Max <= 60) {
            return 4; //very good
        } else {
            return 5; //excellent or athlete (>60)
        }
    }

    /**
     * Resting Heart Rate: RHR
     */
    public int calculateRhrScore() {
        if (restingHeartRate >= 40 && restingHeartRate <= 60) {
            return 5; //excellent or athlete
        } else if (restingHeartRate >= 61 && restingHeartRate <= 84) {
            return 3; //normal
        } else {
            return 1; //poor (85-220)
        }
    }

    /**
     * Heart Rate Recovery: HRR (number of beats dropped in 1 minute)
     */
    public int calculateHrrScore() {
        if (heartRateRecovery < 12) {
            return 1; //poor่
        } else if (heartRateRecovery >= 12 && heartRateRecovery <= 18) {
            return 3; //good
        } else if (heartRateRecovery >= 19 && heartRateRecovery <= 24) {
            return 4; //very good
        } else {
            return 5; //athlete (>= 25)
        }
    }

    /**
     * Calculate health index score
     */
    public int getTotalScore() {
        return calculateVo2MaxScore() + calculateRhrScore() + calculateHrrScore();
    }

    /**
     * Return Fitness Level based on the health index score
     */
    public FitnessLevel getFitnessLevel() {
        int totalScore = getTotalScore();
        if (totalScore >= 12 && totalScore <= 15) {
            return FitnessLevel.EXCELLENT;
        } else if (totalScore >= 6 && totalScore < 12) {
            return FitnessLevel.STANDARD;
        } else {
            return FitnessLevel.POOR;
        }
    }

    /**
     * Getters
     */
    public double getVo2Max() { return vo2Max; }
    public int getRestingHeartRate() { return restingHeartRate; }
    public int getHeartRateRecovery() { return heartRateRecovery; }
}
