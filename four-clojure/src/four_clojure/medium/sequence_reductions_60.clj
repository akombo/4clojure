(ns four-clojure.medium.sequence-reductions-60
  (:require [clojure.test :refer :all]))

;; Write a function which behaves like reduce, but returns each intermediate value of the reduction.
;; Your function must accept either two or three arguments, and the return sequence must be lazy.

(defn F
  ([f C]
   (F f (first C) (rest C)))
  ([f A C]
   (let [a (atom A)]
     (cons @a
       (for [c C]
         (swap! a f c))))))

(deftest tests
  (is (= (take 5 (F + (range))) [0 1 3 6 10]))
  (is (= (F conj [1] [2 3 4]) [[1] [1 2] [1 2 3] [1 2 3 4]]))
  (is (= (last (F * 2 [3 4 5])) (reduce * 2 [3 4 5]) 120)))

;; My favorite other solution
(fn r
  ([f [a & b]] (r f a b))
  ([f a b]
   (let [m (atom a)]
     (cons a (map #(swap! m f %) b)))))
