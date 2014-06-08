(ns clojure1.factorial_test
  (:require [clojure.test :refer :all]
            [clojure1.factorial :refer :all])
 )

(deftest factorial-test
  (testing "factorial by recursion"
    (is (= 720 (factorial-recur 6))
     )
    (is (= 1 (factorial-recur 6))
     )
    )
  )