import rx.Observable;

import java.util.Arrays;
import java.util.List;

/**
 * Created by akshay.kumar1 on 04/07/16.
 */
public class Reactive {

    public static void main(String[] args) throws Exception {
        final List<String> tweets = Arrays.asList("abc", "123", "xyz");
        Observable<String> observable = Observable.from(tweets);
        observable.subscribe(tweet -> System.out.println("Subscribe 1 >> "+tweets));
        observable.subscribe(tweet -> System.out.println("Subscribe 2 >> "+tweets));
        observable.subscribe(tweet -> System.out.println("Subscribe 3 >> "+tweets));
    }
}
