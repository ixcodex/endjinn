(ns endjinn.config
  (:require [clj-yaml.core :as yaml]))

(defn load-config [key] ((yaml/parse-string 
 (slurp (clojure.java.io/resource "config.yml"))) key))
