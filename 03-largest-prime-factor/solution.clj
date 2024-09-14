(def prime-number 600851475143)

(defn largest-prime-factor [prime-number reminder results]
  (if (= prime-number 1)
    (apply max results)
    (if (zero? (mod prime-number reminder))
      (recur (/ prime-number reminder) 2 (conj results reminder))
      (recur prime-number (inc reminder) results))))

(defn solution []
  (let [result (largest-prime-factor prime-number 2 [])]
    (println result)))

(solution)