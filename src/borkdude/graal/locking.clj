(ns borkdude.graal.locking
  (:refer-clojure :exclude [locking])
  (:import [borkdude.graal LockFix]))

(defmacro locking
  "Patched version of clojure.core/locking to workaround GraalVM unbalanced monitor issue. Executes exprs in an implicit do, while holding the monitor of x.
  Will release the monitor of x in all circumstances."
  {:added "1.0"}
  [x & body]
  `(let [lockee# ~x]
     (LockFix/lock lockee# (^{:once true} fn* [] ~@body))))
