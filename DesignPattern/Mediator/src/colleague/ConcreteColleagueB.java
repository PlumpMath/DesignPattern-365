package colleague;

import mediator.Mediator;

/**
 * 具体同事类角色：所有的具体同事类均从抽象同事类继承而来。
 * 实现自己的业务，在需要与其他同事通信的时候，就与持有的调停者通信，调停者会负责与其他的同事交互。
 */
public class ConcreteColleagueB extends Colleague {

    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void opertion() {
        //在需要跟其他同事通信的时候，通知调停者对象
        getMediator().changed(this);
    }
}
