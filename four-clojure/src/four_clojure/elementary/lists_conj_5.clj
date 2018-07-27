(ns four-clojure.elementary.lists-conj-5
  (:require [clojure.test :refer :all]))

;; #5
;; Lists: conj

;; When operating on a list, the conj function will return a new list with one or more items "added" to the front.
;; Note that there are two test cases, but you are expected to supply only one answer, which will cause all the tests to pass.

;; (is (= __ (conj '(2 3 4) 1)))
;; (is (= __ (conj '(3 4) 2 1)))

(deftest tests
  (is (= '(1 2 3 4) (conj '(2 3 4) 1)))
  (is (= '(1 2 3 4) (conj '(3 4) 2 1))))
