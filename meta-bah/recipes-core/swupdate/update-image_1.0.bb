SUMMARY = "Update image"
DESCRIPTION = "Generating the update image for SWUpdate"
SECTION = "core"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# images to build before building update image
IMAGE_DEPENDS = "device"
# local files to be added to the update image
SRC_URI = "\
    file://sw-description \
    "

# images and files that will be included in the .swu image
SWUPDATE_IMAGES = "device"

# the chosen format for the deployable image
SWUPDATE_IMAGES_FSTYPES[device] = ".rootfs.ext4.gz"
SWUPDATE_IMAGES_FSTYPES[uImage] = ".bin"

inherit swupdate

BBCLASSEXTEND = ""
