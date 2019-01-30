(ns user
  (:require [clojure-sample.config :refer [env]]
            [clojure.spec.alpha :as s]
            [expound.alpha :as expound]
            [mount.core :as mount]
            [clojure-sample.core :refer [start-app]]))

(alter-var-root #'s/*explain-out* (constantly expound/printer))

(defn start []
  (mount/start-without #'clojure-sample.core/repl-server))

(defn stop []
  (mount/stop-except #'clojure-sample.core/repl-server))

(defn restart []
  (stop)
  (start))


