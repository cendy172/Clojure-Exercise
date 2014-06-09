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

(factorial-recur 1)