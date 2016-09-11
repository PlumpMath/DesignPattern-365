import java.util.Observable;

/**
 * 被观察者
 */
public class Watched extends Observable {

    private String mData = "";

    public String getData() {
        return mData;
    }

    public void setData(String data) {

        if (!mData.equals(data)) {
            mData = data;
            setChanged();
        }
        notifyObservers();
    }
}
