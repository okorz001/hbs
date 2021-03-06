(defproject hbs "1.0.1-SNAPSHOT"
  :description "Clojure templating by Handlebars.java"
  :url "http://github.com/sunng87/hbs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0" :scope "provided"]
                 [com.github.jknack/handlebars "4.0.6"]]
  :profiles {:examples {:dependencies [[ring "1.6.0"]]
                        :main hbs.server
                        :source-paths ["examples"]
                        :resource-paths ["example-resources"]}}
  :plugins [[codox "0.8.10"]]
  :codox {:output-dir "target/codox"
          :exclude [hbs.ext]}
  :global-vars {*warn-on-reflection* true}
  :deploy-repositories {"releases" :clojars})
