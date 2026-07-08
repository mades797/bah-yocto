# Completely strip ALSA modules from being compiled inside PulseAudio
PACKAGECONFIG:remove = "alsa alsa-ucm"

# Explicitly pass the disabled flag to the underlying Meson configuration matrix
EXTRA_OEMESON:append = " -Dalsa=disabled"
