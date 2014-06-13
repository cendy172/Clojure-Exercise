(ns clojure1.lesson3
  (:gen-class))

(defn -main
  [& args]
  (println "factorial")
  )

(defn fib
  [x]
  (cond
   (= x 0) 0
   (= x 1) 1
   :else (+ (fib (- x 1)) (fib (- x 2)))
 )
)

(fib 5)

(defn coins
  [x]
  (cond
   (= x 1) 1
   (= x 2) 5
   (= x 3) 10
   (= x 4) 25
   (= x 5) 50
   )
  )


(defn charge-conds
  [a x]
  (cond
   (= a 0) 1
   (or (< a 0) (= x 0)) 0
   :else (+ (charge-conds a (dec x )) (charge-conds (- a (coins x)) x))
   )
  )

(charge-conds 100 5)

