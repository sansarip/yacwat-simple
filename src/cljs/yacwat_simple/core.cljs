(ns ^:figwheel-hooks yacwat-simple.core
  (:require
   [reagent.core :as reagent]
   [re-frame.core :as re-frame]
   [yacwat-simple.events :as events]
   [yacwat-simple.routes :refer [init-routes!]]
   [yacwat-simple.views :as views]
   [yacwat-simple.config :as config]))

(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (init-routes!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn ^:after-load re-render []
  (mount-root))

(defn ^:export init []
  (re-frame/dispatch-sync [::events/initialize-db])
  (dev-setup)
  (mount-root))
