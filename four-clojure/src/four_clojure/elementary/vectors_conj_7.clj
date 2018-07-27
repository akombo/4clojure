(ns four-clojure.elementary.vectors-conj-7
  (:require [clojure.test :refer :all]))

;; #7
;; Vectors: conj

;; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.

;; (= __ (conj [1 2 3] 4))
;; (= __ (conj [1 2] 3 4))

(deftest tests
  (is (= [1 2 3 4] (conj [1 2 3] 4)))
  (is (= [1 2 3 4] (conj [1 2] 3 4))))
