(ns clojure1.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

;; basic expression
(+ 1 3 4 5 (- 1 2 3 4))

;;composition
(def x 3)
(defn square
  [x]
  (* x x)
  )
(square 2)

;;abstrations
partial
map
apply

(defn abs
  [x]
  (cond
    (> x 0) x
    (< x 0) (- x)
    (= x 0) 0
   )
  )

(abs (+ 1 1))

;;defination

;;var fn

;;evaluation

;;subsititution model

;;application order vs form order

;;given y, when y >= 0 makes y*y=x


(defn average
  [x y]
  (/ (+ x y) 2)
  )

(average 3 4)

(defn good-enough
  [guess x]
  (<= (abs (- (square guess) x)) 0.001)
 )

(good-enough 2 4.001)

(defn sqrt-iter
  [guess x]
  (loop
    [g guess]
    (if (good-enough g x) g
    (sqrt-iter (average g (double (/ x g))) x))
    )
  )

(sqrt-iter 1 5)
