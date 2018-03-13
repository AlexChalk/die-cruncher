(ns die-cruncher.core)

(defn get-scenario-unhelpfulness-odds
  [numbers-needed unique-numbers remaining-rolls]
  (if (< (- remaining-rolls numbers-needed) 0)
    1
    (if (zero? numbers-needed)
      0
      (if (= 1 remaining-rolls)
        (/ (dec unique-numbers) unique-numbers)
        (/ (+ (* 
                (- unique-numbers numbers-needed) 
                (get-scenario-unhelpfulness-odds numbers-needed unique-numbers (dec remaining-rolls)))
              (* 
                numbers-needed 
                (get-scenario-unhelpfulness-odds (dec numbers-needed) unique-numbers (dec remaining-rolls)))) 
          unique-numbers)))))
    
(defn get-odds
  "Returns odds of rolling n numbers with an n-sided die in n rolls"
  [numbers-needed unique-numbers remaining-rolls]
  (if (> numbers-needed unique-numbers)
    0
    (- 1 (get-scenario-unhelpfulness-odds numbers-needed unique-numbers remaining-rolls))))


(defn -main
  [& args]
  (let [int-args (map read-string args)
        [numbers-needed unique-numbers remaining-rolls] int-args]
    (println (get-odds numbers-needed unique-numbers remaining-rolls))))
