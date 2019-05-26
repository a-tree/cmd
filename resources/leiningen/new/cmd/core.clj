(ns {{name}}.core
  (:require [clojure.tools.cli :as cli]))


(def {{name}}-options
  [["-h" "--help" "Show Help" ]
   ;; additional options
   ])

(def usage
  (str
   "Usage: "
   "{{name}} [option] ...\n"
   "\n"
   "-h, --help      display this help and exit.\n"))

(defn -main
  [& args]
  "{{name}} main"
  (let [{:keys [options      ;; The options map, keyed by :id, mapped to the parsed value
                arguments    ;; A vector of unprocessed arguments
                summary      ;; A string containing a minimal options summary
                errors]}     ;; A possible vector of error message strings generated during parsing; nil when no errors exist
        (cli/parse-opts args {{name}}-options)]
    (when (:help options)
      (println usage)
      (System/exit 0))
    (println "Hello {{name}}.")))
