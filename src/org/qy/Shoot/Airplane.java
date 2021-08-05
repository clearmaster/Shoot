package org.qy.Shoot;

/**
 * 敌机,不仅是飞行物，也是敌人
 */
public class Airplane extends FlyingObject implements Enemy{
    private int speed =2;//敌机移动的步数，每次移动2步
    @Override
    public int getSore() {
        //重写敌人的方法。获取分数5分
        return 5;
    }

}
