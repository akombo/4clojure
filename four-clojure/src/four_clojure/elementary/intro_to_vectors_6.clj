(ns four-clojure.elementary.intro-to-vectors-6
  (:require [clojure.test :refer :all]))

;; #6
;; Intro to Vectors

;; Vectors can be constructed several ways. You can compare them with lists.
;; Note: the brackets [] surrounding the blanks __ are part of the test case.

;; (= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

(deftest tests
  (is (= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))))
