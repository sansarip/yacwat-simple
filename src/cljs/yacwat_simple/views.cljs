(ns yacwat-simple.views
  (:require
    [yacwat-simple.routes :refer [router-component]]
    ;; global styles
    [yacwat-simple.styles]))

;; good place to put a header and footer - before and after the router component, respectively
(defn main-panel []
  (router-component))
