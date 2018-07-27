(ns four-clojure.elementary.simple-math-2
  (:require [clojure.test :refer :all]))

;; #2
;; Simple Math

;; If you are not familiar with polish notation, simple arithmetic might seem confusing.
;; Note: Enter only enough to fill in the blank (in this case, a single number) - do not retype the whole problem.

;; (= (- 10 (* 2 3)) __)

(deftest tests
  (is (= (- 10 (* 2 3)) 4)))
