(defproject borkdude/graal.locking "0.0.1-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.9.0"]]
  :description "A workaround for CLJ-1472 as a library"
  :url "https://github.com/borkdude/graal.locking"
  :scm {:name "git"
        :url "https://github.com/borkdude/graal.locking"}
  :license {:name "Eclipse Public License 1.0"
            :url "http://opensource.org/licenses/eclipse-1.0.php"}
  :java-source-paths ["src-java"]
  :source-paths ["src" "src-java"]
  :aot [borkdude.graal.locking]
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :username :env/clojars_user
                                    :password :env/clojars_pass
                                    :sign-releases false}]])
