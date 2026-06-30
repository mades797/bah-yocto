# Force Yocto to compile the ALSA plugin module for mpg123
PACKAGECONFIG:append = " alsa"

# Optional: explicitly remove pulse if you want to keep the image lean
PACKAGECONFIG:remove = "pulse"
