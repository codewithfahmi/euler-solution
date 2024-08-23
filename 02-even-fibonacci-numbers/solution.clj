(defn is-fib? [num]
  (let [root (Math/sqrt num)]
    (== root (Math/floor root))))

(defn solution []
  (let [result (->> (range 1 4000000)
                    (filter
                     (fn [num] (or (is-fib? (+ (* 5 num num) 4))
                                   (is-fib? (- (* 5 num num) 4)))))
                    (filter even?)
                    (reduce +))]
    (println result)))

(solution)