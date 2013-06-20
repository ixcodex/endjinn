(ns endjinn.protocol
  (:require [clojure.set :as set]))

(defn tags-match? [tags & match]
  (let [match-tags (apply hash-set match)]
    (= (count match) (count (set/intersection tags match-tags)))))
