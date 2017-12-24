package behavioralDesignPatterns.observer.src;

import behavioralDesignPatterns.observer.src.api.Observer;
import behavioralDesignPatterns.observer.src.impl.MyTopic;
import behavioralDesignPatterns.observer.src.impl.MyTopicSubscriber;

/**
 * ObserverMain.
 *
 * @author Mikalai Bezmen
 */
public class ObserverMain {

    public static void main(String[] args) {
        //create subject
        MyTopic topic = new MyTopic();
        //create observers
        Observer observer1 = new MyTopicSubscriber("Obj1");
        Observer observer2 = new MyTopicSubscriber("Obj2");
        Observer observer3 = new MyTopicSubscriber("Obj3");
        //register observers to the subject
        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);
        //attach observer to subject
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);
        //check if any update is available
        observer1.update();
        //now send message to subject
        topic.postMessage("New Message");
    }
}
