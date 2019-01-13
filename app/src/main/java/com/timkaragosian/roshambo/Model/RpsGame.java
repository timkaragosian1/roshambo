package com.timkaragosian.roshambo.Model;

public class RpsGame {
    private boolean mIsGamePhaseCountDown;
    private boolean mIsGamePhaseRoundComplete;

    private boolean mHasPlayerWon;
    private boolean mHasComputerWon;
    private boolean mCanPlayerMakeLegalMove;
    private boolean mHasPlayerThrownThisRound;

    private int mPlayerScore;
    private int mComputerScore;
    private int mCountDownSeconds;
    private int mPlayerThrowValue;
    private int mComputerThrowValue;

    private int mPlayerThrowImage;
    private int mComputerThrowImage;

    private String mCountDownDisplayValue;
    private String mPlayerMoveDescription;
    private String mComputerMoveDescription;

    public void setIsGamePhaseCountDown(boolean isGamePhaseCountDown) {
        this.mIsGamePhaseCountDown = isGamePhaseCountDown;
    }

    public boolean getIsGamePhaseCountDown() {
        return mIsGamePhaseCountDown;
    }

    public void setIsGamePhaseRoundComplete(boolean isGamePhaseRoundComplete) {
        this.mIsGamePhaseRoundComplete = isGamePhaseRoundComplete;
    }

    public boolean getIsGamePhaseRoundComplete() {
        return mIsGamePhaseRoundComplete;
    }

    public void setHasPlayerWon(boolean hasPlayerWon) {
        this.mHasPlayerWon = hasPlayerWon;
    }

    public boolean getHasPlayerWon() {
        return mHasPlayerWon;
    }

    public void setHasComputerWon(boolean hasComputerWon) {
        this.mHasComputerWon = hasComputerWon;
    }

    public boolean getHasComputerWon() {
        return mHasComputerWon;
    }

    public void setCanPlayerMakeLegalMove(boolean canPlayerMakeLegalMove) {
        this.mCanPlayerMakeLegalMove = canPlayerMakeLegalMove;
    }

    public boolean getCanPlayerMakeLegalMove() {
        return mCanPlayerMakeLegalMove;
    }

    public void setHasPlayerThrownThisRound(boolean hasPlayerThrownThisRound) {
        this.mHasPlayerThrownThisRound = hasPlayerThrownThisRound;
    }

    public boolean getHasPlayerHasThrownThisRound() {
        return mHasPlayerThrownThisRound;
    }

    public void setPlayerScore(int playerScore) {
        this.mPlayerScore = playerScore;
    }

    public int getPlayerScore() {
        return mPlayerScore;
    }

    public void setComputerScore(int computerScore) {
        this.mComputerScore = computerScore;
    }

    public int getComputerScore() {
        return mComputerScore;
    }

    public void setPlayerThrowValue(int throwValue) {
        this.mPlayerThrowValue = throwValue;
    }

    public int getPlayerThrowValue() {
        return mPlayerThrowValue;
    }

    public void setComputerThrowValue(int throwValue) {
        this.mComputerThrowValue = throwValue;
    }

    public int getComputerThrowValue() {
        return mComputerThrowValue;
    }

    public void setCountDownSeconds(int seconds) {
        this.mCountDownSeconds = seconds;
    }

    public int getCountDownSeconds() {
        return mCountDownSeconds;
    }

    public void setmPlayerThrowImage(int playerThrowImage) {
        this.mPlayerThrowImage = playerThrowImage;
    }

    public int getPlayerThrowImage() {
        return mPlayerThrowImage;
    }

    public void setmComputerThrowImage(int computerThrowImage) {
        this.mComputerThrowImage = computerThrowImage;
    }

    public int getComputerThrowImage() {
        return mComputerThrowImage;
    }

    public void setCountDownDisplayValue(String countDownDisplayValue) {
        this.mCountDownDisplayValue = countDownDisplayValue;
    }

    public String getCountDownDisplayValue() {
        return mCountDownDisplayValue;
    }

    public void setPlayerMoveDescription(String playerMoveDescription) {
        this.mPlayerMoveDescription = playerMoveDescription;
    }

    public String getPlayerMoveDescription() {
        return mPlayerMoveDescription;
    }

    public void setComputerMoveDescription(String computerMoveDescription) {
        this.mComputerMoveDescription = computerMoveDescription;
    }

    public String getComputerMoveDescription() {
        return mComputerMoveDescription;
    }
}
