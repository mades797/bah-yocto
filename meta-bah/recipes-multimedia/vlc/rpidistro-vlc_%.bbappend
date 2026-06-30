# 1. Clear out all default features completely
# PACKAGECONFIG:pn-rpidistro-vlc = ""

# 2. Add BACK only what is needed for headless audio playback
# (Choose 'alsa' or 'pulseaudio' depending on your Yocto audio architecture)
# PACKAGECONFIG:append:pn-rpidistro-vlc = " alsa mad mkv ogg vorbis flac"

# 3. Aggressively strip video, window managers, and hardware pipeline

# EXTRA_OECONF:append:pn-rpidistro-vlc = " \
#     --disable-video \
#     --disable-vout \
#     --disable-qt \
#     --disable-skins2 \
#     --disable-xcb \
#     --disable-x11 \
#     --disable-wayland \
#     --disable-glx \
#     --disable-opengl \
#     --disable-gles2 \
#     --disable-mmal \
#     --disable-omxil \
#     --disable-vdpau \
#     --disable-avcodec \
#     --disable-taglib \
# "

DEPENDS += "bison-native"

PACKAGECONFIG:remove = "taglib"
EXTRA_OECONF:append = " --disable-taglib"