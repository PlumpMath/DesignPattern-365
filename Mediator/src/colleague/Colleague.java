package colleague;

import mediator.Mediator;

/**
 * 抽象同事类角色：定义出调停者到同事对象的接口。同事对象只知道调停者而不知道其余的同事对象。
 */
public abstract class Colleague {

    private Mediator mMediator;

    public Colleague(Mediator mediator) {

        mMediator = mediator;
    }

    /**
     * 获取当前同事类对应的调停者对象
     * @return
     */
    public Mediator getMediator() {

        return mMediator;
    }
}
