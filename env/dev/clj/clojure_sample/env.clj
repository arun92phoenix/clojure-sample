(ns clojure-sample.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [clojure-sample.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[clojure-sample started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[clojure-sample has shut down successfully]=-"))
   :middleware wrap-dev})
