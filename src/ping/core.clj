(ns ping.core
  (:require [clojure.pprint :as pp])
  (:import [java.net InetAddress])
  (:gen-class)
)

;; Originally from Clojure Cookbook
(defn timed-ping
  "Time an .isReachable ping to a given domain"
  ([target] (timed-ping target 5000))
  ([target timeout]
     (let [addr (if (string? target)
                  (java.net.InetAddress/getByName target)
                  target)
           start (. System (nanoTime))
           result (.isReachable addr timeout)
           total (/ (double (- (. System (nanoTime)) start)) 1000000.0)]
       {:time total
        :result result})))

;; (timed-ping "oreilly.com" 5000)
;; -> {:time 88.07, :result true}


(defn -main
  ""
  [host & args]
  (pp/pprint (timed-ping host)))
