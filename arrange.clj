(defn arrange 
   ([arr] (let [cnt (/ (count arr) 2)] (arrange (take cnt arr) (drop cnt arr))))
   ([a b] (if (= (count a) 1) (concat a b) 
                             (concat (arrange (take (/ (count a) 2) a) (take (/ (count a) 2) b)) (arrange (drop (/ (count a) 2) a) (drop (/ (count b) 2) b))))))



