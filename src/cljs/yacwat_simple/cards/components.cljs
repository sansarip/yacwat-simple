(ns yacwat-simple.cards.components
  (:require [devcards.core :refer-macros (defcard)]
            [sablono.core :as sab]
            [yacwat-simple.styles]))

(defcard
  sample-component
  "Here's a sample component that incorporates global styling"
  (fn [] (sab/html [:div {:class "container"}
                    [:h1 "Hello, World!"]])))

