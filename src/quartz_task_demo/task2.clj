(ns quartz-task-demo.task2
  (:require [quartz-task.core :refer [defjob deftasks]]))

(defn job1-fn []
  (prn "this is the job1 for task2 ...."))




(def jobs (deftasks [{:id job1-task
                      :handler job1-fn
                      :schedule "*/1 * * * * ?"}
                     ]))
