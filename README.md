;; In Progress

;; question: in each round, what are the odds of nothing useful happening
;; subtract them all from one
;; round 4:
;; if i've rolled x x x the odds of nothing useful are 1 / 6
;;   I roll x x x 1/36 of the time.
;;
;; if i've rolled x x y the odds of nothing useful are 2 / 6
;;   I roll x x y 15/36 of the time.
;;
;; if i've rolled x y z the odds of nothing useful are 3 / 6
;;   I roll x y z 20/36 of the time.
;; (+ (* 0/36 0/6) (* 1/36 1/6) (* 15/36 2/6) (* 20/36 3/6)) === 91/216
;;
;; round 3:
;; if i've rolled x x the odds of nothing useful are 1 / 6
;;   I roll x x 1/6 of the time
;; if i've rolled x !x the odds of nothing useful are 2 / 6
;;   I roll x !x 5/6 of the time
;; (+ (* 0/6 0/6) (* 1/6 1/6) (* 5/6 2/6)) === 11/36;; , 66/216
;;
;; round 2:
;; (+ (* 0/6 0/6)  (* 6/6 1/6)) === 1/6;; , 6/36, 36/216
;;
;; round 1:
;; (+ (* 6/6 0/6)) === 0/6
;; how often is there a y chance it's unhelpful? x of the time.

;; roll odds:
;; 0
;; 1/6
;; 1/6 2/6
;; 1/6 2/6 3/6
;; 1/6 2/6 3/6 4/6 
;; 1/6 2/6 3/6 4/6 5/6
;; 1/6 2/6 3/6 4/6 5/6 6/6

;; 1/1 1/6 1/36 1/216 1/1296
