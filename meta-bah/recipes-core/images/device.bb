SUMMARY = "BAH device image"
DESCRIPTION = "This is the recipe for the BAH device image"
BUGTRACKER = "https://github.com/mades797/bah-yocto/issues"
SECTION = "core"
LICENSE = "GPL-3.0-only"

CVE_PRODUCT = "${BPN}"

inherit core-image
# inherit qemuboot
# IMAGE_FSTYPES = "wic"
WKS_FILE = "device.wks"

COMPATIBLE_MACHINE = "raspberrypi0-2w"
IMAGE_INSTALL:append = " dhcpcd"
IMAGE_INSTALL:append = " systemd"
IMAGE_INSTALL:append = " brcm-config"
IMAGE_INSTALL:append = " python3"
IMAGE_INSTALL:append = " python3-adafruit-displayio-ssd1306"
IMAGE_INSTALL:append = " python3-adafruit-blinka"
IMAGE_INSTALL:append = " python3-adafruit-circuitpython-busdevice"
IMAGE_INSTALL:append = " libgpiod"
IMAGE_INSTALL:append = " libgpiod-tools"
IMAGE_INSTALL:append = " python3-adafruit-displayio"
IMAGE_INSTALL:append = " python3-adafruit-display-text"
IMAGE_INSTALL:append = " python3-adafruit-bitmap-font"
IMAGE_INSTALL:append = " python3-adafruit-shapes"
IMAGE_INSTALL:append = " libgpiod"
IMAGE_INSTALL:append = " i2c-tools"
IMAGE_INSTALL:append = " pisugar"
IMAGE_INSTALL:append = " python3-gpiozero"
IMAGE_INSTALL:remove = "rpi-gpio"
IMAGE_INSTALL:append = " python3-rpi-lgpio"
IMAGE_INSTALL:append = " python3-lg"
IMAGE_INSTALL:append = " python3-dev"
IMAGE_INSTALL:append = " alsa-utils"
IMAGE_INSTALL:append = " alsa-utils-alsactl"
IMAGE_INSTALL:append = " alsa-plugins"
IMAGE_INSTALL:append = " alsa-state"
IMAGE_INSTALL:append = " kernel-module-snd-bcm2835"
IMAGE_INSTALL:append = " bah"
IMAGE_INSTALL:append = " cifs-utils"
IMAGE_INSTALL:append = " iw"
IMAGE_INSTALL:append = " vlc"
IMAGE_INSTALL:append = " gstreamer1.0 \
                         gstreamer1.0-plugins-base \
                         gstreamer1.0-plugins-good \
                         gstreamer1.0-plugins-bad \
                         gstreamer1.0-python"

IMAGE_INSTALL:append = " mpg123 ffmpeg"

SYSTEMD_AUTO_ENABLE:remote-fs = "enable"

# Debugging tools
IMAGE_INSTALL:append = " nano"
EXTRA_IMAGE_FEATURES:append = " package-management"
IMAGE_INSTALL:append = " dpkg"
IMAGE_INSTALL:append = " ldd"
IMAGE_INSTALL:append = " procps"
IMAGE_INSTALL:append = " raspi-gpio"
IMAGE_INSTALL:append = " netcat-openbsd"
IMAGE_INSTALL:append = " python3-pip"
IMAGE_INSTALL:append = " util-linux-lsblk"
IMAGE_INSTALL:append = " psmisc"

EXTRA_IMAGE_FEATURES = "ssh-server-openssh allow-empty-password empty-root-password allow-root-login"
FILESYSTEM_PERMS_TABLES:remove = "files/fs-perms-volatile-log.txt"
FILESYSTEM_PERMS_TABLES:remove = "files/fs-perms-volatile-tmp.txt"

SDKIMAGE_FEATURES += "nativesdk-python3-setuptools"
IMAGE_INSTALL:append = " dtc"
