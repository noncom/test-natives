(defproject test-natives "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  
  :repositories [["jme3" "http://updates.jmonkeyengine.org/maven/"]
                 ["sonatype" {:url "https://oss.sonatype.org/content/repositories/snapshots/"
                              :update :always}]]

  :dependencies [[org.clojure/clojure "1.6.0"]
                 
                 [com.jme3-lib/lwjgl-natives "2.9.0" :native-prefix ""]
                 [com.jme3-lib/lwjgl "2.9.0" :native-prefix ""]
                 ]
  
;  :native-path "target/native/native/windows"                      ; << !!! uncomment this ONLY AFTER you have already done lein compile or lein repl, so that you ALREADY DO have the `target` dir 
;  :jvm-opts ["-Djava.library.path=target/native/native/windows"]   ; << this is not actually required, leave it commented
  )
