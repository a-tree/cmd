(ns {{name}}.test-core
  (:require [{{name}}.core :as core]
            [clojure.tools.cli :as cli]
            [clojure.test :refer :all]))

(deftest test-{{name}}-core
  (testing "test the {{name}}"
    (is (= 42 (count "Answer to Life the Universe and Everything")))))

