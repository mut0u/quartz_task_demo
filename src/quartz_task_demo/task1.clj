(ns quartz-task-demo.task1
  (:require
   [clojure.java.shell :refer [sh]]
   [quartz-task.core :refer [defjob deftasks]]))

(defn job1-fn []
  (sh "bash" "-c" "echo aaa >> ~/b.log")
  (prn "this is the job1 for task1 ...."))


(defn job2-fn []
  (prn "this is the job2 for task1 ...."))

(def jobs (deftasks [{:id job1-task
                      :handler job1-fn
                      :schedule "*/1 * * * * ?"}
                     {:id job2-task
                      :handler job2-fn
                      :schedule "*/1 * * * * ?"}]))
