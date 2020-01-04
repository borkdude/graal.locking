(defproject borkdude/graal.locking "0.0.1-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :java-source-paths ["src-java"]
  :source-paths ["src" "src-java"]
  :aot [borkdude.graal.locking]
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :username :env/clojars_user
                                    :password :env/clojars_pass
                                    :sign-releases false}]])
