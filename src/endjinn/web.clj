(ns endjinn.web)

(defn local-url 
  ([request] (local-url request ""))
  ([request path] (let [{:keys [server-name server-port]} request]
                    (format "http://%s:%s%s" server-name server-port path))))
