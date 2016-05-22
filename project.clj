(defproject quartz-task-demo "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [quartz-task/quartz-task "0.1.0-SNAPSHOT"]
                 [clojurewerkz/quartzite "2.1.0-SNAPSHOT"]
                 [mysql/mysql-connector-java "5.1.34"]
                 [log4j
                  "1.2.17"
                  :exclusions
                  [javax.mail/mail
                   javax.jms/jms
                   com.sun.jdmk/jmxtools
                   com.sun.jmx/jmxri]]
                 [org.slf4j/slf4j-api "1.7.12"]
                 [org.slf4j/slf4j-log4j12 "1.7.2"]

                 [org.quartz-scheduler/quartz "2.1.7"]]
  :main ^:skip-aot quartz-task-demo.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
