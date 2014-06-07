(ns clojure1.core-test
  (:require [clojure.test :refer :all]
            [clojure1.core :refer :all]))

(deftest core-test

  (testing "square function"
    (is (= 4 (square 2))
    )
  )

  (testing "abs function"
    (is (= 1 (abs 1))
     )
    (is (= 1 (abs -1))
     )
    (is (= 0 (abs 0))
     )
    )

  (testing "average function"
    (is (= 3 (average 2 4))
     )
    (is (= 7/2 (average 3 4))
     )
    (is (= -1) (average -1 -1)
     )
   )

  (testing "good-enough function"
    (is (= true (good-enough 2 3.999))
     )
    (is (= true (good-enough 2 4.00099))
     )
    (is (= true) (good-enough -2 4.001)
     )
    (is (= false (good-enough 2 3.998))
     )
    (is (= false (good-enough 2 4.002))
      )
   )

  (testing "sqrt-iter function"
    (is (= 2.0000000929222947 (sqrt-iter 1 4))
     )
   )

  )




