package com.gong.daggercodelab;

public abstract class Suit {
    public abstract String getName();

    public static class StealthSuit extends Suit {
        @Override
        public String getName() {
            return "StealthSuit";
        }
    }

    public static class SpaceSuit extends Suit {
        @Override
        public String getName() {
            return "SpaceSuit";
        }
    }

    public static class HydroSuit extends Suit {
        @Override
        public String getName() {
            return "HydroSuit";
        }
    }

    public static class CombatSuit extends Suit {
        @Override
        public String getName() {
            return "CombatSuit";
        }
    }

}

