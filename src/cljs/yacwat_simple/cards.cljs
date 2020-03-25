(ns yacwat-simple.cards
  (:require [devcards.core :as dc]
            [yacwat-simple.cards.components]))

(enable-console-print!)

(defn ^:export init []
  (dc/start-devcard-ui!))
