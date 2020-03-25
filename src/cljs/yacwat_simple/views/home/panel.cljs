(ns yacwat-simple.views.home.panel
  (:require [re-frame.core :as re-frame]
            [yacwat-simple.views.home.styles :refer [container-class]]
            [yacwat-simple.subs :as root-subs]
            [yacwat-simple.events :as root-events]
            [yacwat-simple.views.home.subs :as subs]
            [yacwat-simple.views.home.events :as events]))

(defn home-panel []
      (let [name @(re-frame/subscribe [::root-subs/name])]
           [:div {:class (container-class)}
            [:div.content
             [:h1 (str "Hello, from " name ".")]
             [:h2 "Your journey awaits."]]]))
