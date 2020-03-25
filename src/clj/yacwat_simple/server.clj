(ns yacwat-simple.server
  (:require [yacwat-simple.handler :refer [app]]
            [config.core :refer [env]]
            [ring.adapter.jetty :refer [run-jetty]])
  (:gen-class))

(defn -main [& _args]
  (let [env-port (str (env :port))
        port (-> (if (not-empty env-port) env-port)
                 (or "3000")
                 Integer/parseInt)]
    (run-jetty app {:port port :join? false})))
