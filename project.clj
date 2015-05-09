(defproject org.clojars.gregspurrier/trendrr-nsq-client "2.0.3-SNAPSHOT"
  :description "Prebuilt JARs for TrendrrNSQClient and its dependency trendrr-oss"
  :url "https://github.com/gregspurrier/trendrr-nsq-client"
  :license {:name "MIT"}
  :dependencies [[ch.qos.logback/logback-classic "1.0.13"]
                 [ch.qos.logback/logback-core "1.0.13"]
                 [com.google.guava/guava "13.0.1"]
                 [commons-logging/commons-logging "1.1.3"]
                 [io.netty/netty "3.6.10.Final"]
                 [org.slf4j/slf4j-api "1.6.4"]]
  :java-source-paths ["vendor/github/gregspurrier/TrendrrNSQClient/src/main/java"
                      "vendor/github/trendrr/java-oss-lib/src/main/java"])
