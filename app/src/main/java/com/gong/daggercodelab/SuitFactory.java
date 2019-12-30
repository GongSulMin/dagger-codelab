package com.gong.daggercodelab;

import android.widget.Space;

/**
 *              팩토리 매소드 패턴
 *              생성자를 별도의 인터페이스로 분리하여 객체를 만들어내는 공장
 */
public abstract class SuitFactory {
    public abstract Suit create(String type);

    public class SuitFactoryImpl extends SuitFactory {

        @Override
        public Suit create(String type) {
            Suit suit = null;

            switch (type) {
                case ("space"):
                    suit = new Suit.SpaceSuit();
                    break;
                case ("hydro"):
                    suit = new Suit.HydroSuit();
                    break;
                case ("steal"):
                    suit = new Suit.StealthSuit();
                    break;
                case ("combat"):
                    suit = new Suit.CombatSuit();
                    break;
                default:
                    suit = new Suit.SpaceSuit();
            }
            return suit;
        }
    }
}
