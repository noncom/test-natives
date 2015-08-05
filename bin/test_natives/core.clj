(ns test-natives.core)

(defn go [] "This function checks if lwjgl natives were correctly hooked up. It should return nil upon success."
  (org.lwjgl.opengl.Display/setLocation 0 0))