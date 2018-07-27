(ns four-clojure.elementary.intro-to-strings-3
  (:require [clojure.test :refer :all]))

;; #3
;; Intro to Strings

;; Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings.

;; (= __ (.toUpperCase "hello world"))

(deftest tests
  (is (= "HELLO WORLD" (.toUpperCase "hello world"))))
