package com.gong.daggercodelab;

/**
 *              추상 팩토리 패턴
 *              연관된 서브 클래스를 그룹화 할 수 있고 이건 이 그룹을 자유롭게 교체할 수 있는 패
 */
public interface SuitAbstractFactory {
        public Suit createSuit();
}

class SuitFactorys {
    static public Suit getSuit(SuitAbstractFactory suitAbstractFactory){
        return suitAbstractFactory.createSuit();
    }
}

class CombatFactory implements SuitAbstractFactory {

    @Override
    public Suit createSuit() {
        return new Suit.CombatSuit();
    }
}

class StealFactory implements SuitAbstractFactory {

    @Override
    public Suit createSuit() {
        return new Suit.StealthSuit();
    }
}