(ns borkdude.graal.locking-test
  (:require [borkdude.graal.locking :as locking]
            [clojure.test :as t :refer [deftest is]]))

(def o (Object.))
(def mut (volatile! 0))

(defmacro do-parallel [n f]
  (let [fut-bindings
        (for [i (range n)
              sym [(symbol (str "fut_" i))
                   `(future (locking/locking o (vswap! mut ~f)))]]
          sym)
        fut-names (vec (take-nth 2 fut-bindings))]
    `(let [~@fut-bindings] ;; start all futures
       (doseq [f# ~fut-names] ;; wait for all futures
         @f#))))

(deftest locking-test
  (time (dotimes [_ 10000] (do-parallel 1000 inc)))
  (is (= 10000000 @mut)))
