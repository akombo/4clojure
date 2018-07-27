(ns four-clojure.elementary.intro-to-sets-8
  (:require [clojure.test :refer :all]))

;; #8
;; Intro to Sets

;; Sets are collections of unique values.

;; (= __ (set '(:a :a :b :c :c :c :c :d :d)))
;; (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))
