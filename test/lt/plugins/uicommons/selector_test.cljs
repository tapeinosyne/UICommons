(ns lt.plugins.uicommons.selector-test
  (:require [lt.plugins.uicommons.selector :as sel]
            [lt.objs.command :as cmd]))


;;;; common test paramters

(def items [{:key "0"
             :a "alpha"
             :b "beta"}
            {:key "1"
             :a "aleph"
             :b "bet"}])

(defn selector-transform [original scored highlighted item]
  (str "<h3>" highlighted "</h2><p>" (:a item) "</p>"))

