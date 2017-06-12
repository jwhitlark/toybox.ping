(defproject ping "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [inet.data "0.5.5"]
                 [org.flatland/useful "0.11.2"]
                 [jpcap/jpcap-macosx-native-deps "0.1.18-002"]
                 [jpcap "0.1.18-002"]
                 ;; [clojurewerkz/balagan "1.0.0"]
                 ;; [org.clojure/tools.cli "0.3.1"]
                 ;; [org.clojure/data.json "0.2.5"]
                 ;; [org.clojure/data.csv "0.1.2"]
                 ;; [clj-http "0.9.2"]
                 ;; [fogus/minderbinder "0.2.0"]
                 ;; [org.clojure/core.match "0.2.1"]
                 ;; [http-kit "2.1.16"]
                 ;; [org.clojure/core.async "0.1.303.0-886421-alpha"]
                 ]
  :main ^:skip-aot ping.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev {:source-paths ["dev"]
                   :dependencies [[org.clojure/tools.namespace "0.2.5"]
                                  [org.clojure/java.classpath "0.2.2"]
                                  [criterium "0.4.3"]
                                  ]}
})
