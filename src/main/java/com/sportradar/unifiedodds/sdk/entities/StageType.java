/*
 * Copyright (C) Sportradar AG. See LICENSE for full license governing this code
 */

package com.sportradar.unifiedodds.sdk.entities;

/**
 * An enumeration of possible stage types
 */
// Constant names should comply with a naming convention
@SuppressWarnings({ "java:S115", "CyclomaticComplexity", "ReturnCount" })
public enum StageType {
    Parent,
    Child,
    Event,
    Season,
    Round,
    CompetitionGroup,
    Prologue,
    Discipline,
    Race,
    Stage,
    Practice,
    Qualifying,
    QualifyingPart,
    Lap,
    SprintRace,
    Run;

    public static StageType mapFromApiValue(String str) {
        if (str == null) {
            return null;
        }

        switch (str.toLowerCase()) {
            case "child":
                return Child;
            case "parent":
                return Parent;
            case "event":
                return Event;
            case "season":
                return Season;
            case "round":
                return Round;
            case "prologue":
                return Prologue;
            case "competition_group":
                return CompetitionGroup;
            case "discipline":
            case "dicipline":
                return Discipline;
            case "race":
                return Race;
            case "stage":
                return Stage;
            case "practice":
                return Practice;
            case "qualifying":
                return Qualifying;
            case "qualifyingpart":
            case "qualifying_part":
                return QualifyingPart;
            case "lap":
                return Lap;
            case "run":
                return Run;
            case "sprint_race":
                return SprintRace;
            default:
                return null;
        }
    }
}
