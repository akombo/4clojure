(ns four-clojure.elementary.intro-to-lists-4
  (:require [clojure.test :refer :all]))

;; #4
;; Intro to Lists

;; Lists can be constructed with either a function or a quoted form.

;; (= (list __) '(:a :b :c))

(deftest test
  (is (= (list :a :b :c) '(:a :b :c))))
