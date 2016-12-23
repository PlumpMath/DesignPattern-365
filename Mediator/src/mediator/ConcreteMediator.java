package mediator;

import colleague.Colleague;
import colleague.ConcreteColleagueA;
import colleague.ConcreteColleagueB;

/**
 * 具体调停者角色：实现了抽象调停者所声明的事件方法。
 * 具体调停者知晓所有的具体同事类，并负责具体的协调各同事对象的交互关系。
 */
public class ConcreteMediator implements Mediator {

    private ConcreteColleagueA mColleagueA;
    private ConcreteColleagueB mColleagueB;

    public void setColleagueA(ConcreteColleagueA a) {
        mColleagueA = a;
    }

    public void setColleagueB(ConcreteColleagueB b) {
        mColleagueB = b;
    }

    @Override
    public void changed(Colleague c) {
        /**
         * 某一个同事类发生了变化，通常需要与其他同事交互
         * 具体协调相应的同事对象来实现协作行为
         */
    }
}
