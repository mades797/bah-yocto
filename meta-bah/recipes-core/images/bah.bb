SUMMARY = "BAH device image"
DESCRIPTION = "This is the recipe for the BAH device image"
BUGTRACKER = "https://github.com/mades797/bah-yocto/issues"
SECTION = "core"
LICENSE = "GPL-3.0-only"

CVE_PRODUCT = "${BPN}"

inherit core-image
# inherit qemuboot

COMPATIBLE_MACHINE = "raspberrypi0-2w"
IMAGE_INSTALL:append = " dhcpcd"
IMAGE_INSTALL:append = " systemd"
IMAGE_INSTALL:append = " brcm-config"
IMAGE_INSTALL:append = " python3"
IMAGE_INSTALL:append = " python3-adafruit-displayio-ssd1306"
IMAGE_INSTALL:append = " python3-adafruit-blinka python3-adafruit-circuitpython-busdevice libgpiod libgpiod-tools python3-adafruit-displayio python3-adafruit-display-text python3-adafruit-bitmap-font"
IMAGE_INSTALL:append = " libgpiod"
IMAGE_INSTALL:append = " i2c-tools"
IMAGE_INSTALL:append = " pisugar"
IMAGE_INSTALL:append = " python3-gpiozero"
IMAGE_INSTALL:remove = "rpi-gpio"
IMAGE_INSTALL:append = " python3-rpi-lgpio"
IMAGE_INSTALL:append = " python3-lg"
IMAGE_INSTALL:append = " bash ncurses"

# Debugging tools
IMAGE_INSTALL:append = " nano"
EXTRA_IMAGE_FEATURES:append = " package-management"
IMAGE_INSTALL:append = " dpkg"

EXTRA_IMAGE_FEATURES = "ssh-server-openssh allow-empty-password empty-root-password allow-root-login"
FILESYSTEM_PERMS_TABLES:remove = "files/fs-perms-volatile-log.txt"
FILESYSTEM_PERMS_TABLES:remove = "files/fs-perms-volatile-tmp.txt"

SDKIMAGE_FEATURES += "nativesdk-python3-setuptools"
