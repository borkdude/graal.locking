package borkdude.graal;

// taken from https://github.com/taylorwood/clojurl/blob/locking-fix/java/src/clojurl/LockFix.java

import clojure.lang.IFn;

public class LockFix {
    static public Object lock(final Object lockee, final IFn f) {
        synchronized (lockee) {
            return f.invoke();
        }
    }
}
