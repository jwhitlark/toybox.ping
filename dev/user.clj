(ns user
  (:require [clojure.set :as set]
            [clojure.string :as str]
            [clojure.java.io :as io]
            [clojure.pprint :as pp]
            [clojure.edn :as edn]
            [clojure.reflect :refer [reflect]]
            [ping.core :refer :all])
  (:import [java.net InetAddress]))

;; Start a root repl via:
;; sudo LEIN_ROOT=1 lein repl :headless
;; then call cider-connect
;; Disable root warning

;; java.net./getByName domain

(def t (InetAddress/getByName "www.google.com"))
;; (.isReachable t 500)


;; Need to modify to take a InetAddress

;; (pp/pprint (map :name (:members (reflect (InetAddress/getByName "www.google.com")))))
;; (isMCGlobal
;;  getAddress
;;  isAnyLocalAddress
;;  isSiteLocalAddress
;;  isLinkLocalAddress
;;  java.net.Inet4Address
;;  serialVersionUID
;;  equals
;;  isMulticastAddress
;;  java.net.Inet4Address
;;  init
;;  hashCode
;;  isMCSiteLocal
;;  getHostAddress
;;  INADDRSZ
;;  java.net.Inet4Address
;;  isMCNodeLocal
;;  isLoopbackAddress
;;  isMCLinkLocal
;;  numericToTextFormat
;;  isMCOrgLocal
;;  writeReplace)
