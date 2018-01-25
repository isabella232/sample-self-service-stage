/*
 * Copyright 2018 ForgeRock AS. All Rights Reserved
 *
 * Use of this code requires a commercial software license with ForgeRock AS.
 * or with one of its affiliates. All use shall be exclusively subject
 * to such license between the licensee and ForgeRock AS.
 */
package org.forgerock.selfservice.sample.stage;

import java.util.Objects;

import org.forgerock.selfservice.core.config.StageConfig;

/**
 * Configuration required by the sample math stage.
 */
public final class MathStageConfig implements StageConfig {

    private static final String STAGE_NAME = "mathStage";

    private int leftHandValue;
    private int rightHandValue;

    public int getLeftHandValue() {
        return leftHandValue;
    }

    public MathStageConfig withLeftHandValue(int leftHandValue) {
        this.leftHandValue = leftHandValue;
        return this;
    }

    public int getRightHandValue() {
        return rightHandValue;
    }

    public MathStageConfig withRightHandValue(int rightHandValue) {
        this.rightHandValue = rightHandValue;
        return this;
    }

    public String getProgressStageClassName() {
        return MathStage.class.getName();
    }

    public String getName() {
        return STAGE_NAME;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof MathStageConfig)) {
            return false;
        }

        MathStageConfig config = (MathStageConfig) other;
        return leftHandValue == config.leftHandValue &&
                rightHandValue == config.rightHandValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(leftHandValue, rightHandValue);
    }

}
