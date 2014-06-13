(ns clojure1.factorial
  (:gen-class))

(defn -main
  [& args]
  (println "factorial")
  )

(defn factorial-recur
  [x]
  (loop
    [total x]
    (if(= x 1) total
      (* total (factorial-recur (- x 1)))
      )
    )
  )

(factorial-recur 3)

(defn factorial-loop
  [x]
  (loop
    [i 1, total 1]
    (if(> i x) total
      (recur (inc i)(* i total))
    )
   )
 )

(* 1 2 3)

(take 5 (iterate inc 1))

(factorial-loop 5)
