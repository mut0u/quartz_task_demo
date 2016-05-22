(ns quartz-task-demo.core
  (:require [clojurewerkz.quartzite.scheduler :as qs]
            [quartz-task-demo.task1 :as task1]
            [quartz-task-demo.task2 :as task2])
  (:gen-class))


(def tasks (into [] (concat task1/jobs task2/jobs)))



(defn start []
  (let [s (-> (qs/initialize) qs/start)]
    (doseq [[job trigger] tasks]
      (try
        (qs/schedule s job trigger)
        (catch Exception ex
          (prn ex))))))



(defn -main [& args]
  (start)
  (prn "the quartz server is running ..."))
