(ns leiningen.new.cmd
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "cmd"))

(defn cmd
  "Create a Command Line Project."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' cmd project.")
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["test/{{sanitized}}/test_core.clj" (render "test_core.clj" data)]
             ["project.clj" (render "project.clj" data)]
             ["README.md" (render "README.md" data)]
             ["bin/{{sanitized}}" (render "cmd.sh" data) :executable true]
             [".gitignore" (render "gitignore" data)])))
