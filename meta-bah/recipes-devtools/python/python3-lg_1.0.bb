SUMMARY = "lg (lgpio)"
DESCRIPTION = "Adds lgpio library to the layer"
SECTION = "libs"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=660e614bc7efb0697cc793d8a22a55c2"
DEPENDS += "\
    python3-setuptools-native \
    python3-setuptools-scm \
    swig-native \
    virtual/libc \
"
SRC_URI = "git://github.com/joan2937/lg.git;protocol=https;branch=master \
           file://0001-Removed-strip.patch \
           "
SRCREV = "b959a17d723360e85648316757b02dbea9902feb"

S = "${WORKDIR}/git"
inherit setuptools3 autotools

FILES:${PN} += "\
    ${includedir}/lgpio.h \
    ${libdir}/liblgpio.so \
    ${libdir}/liblgpio.so.1 \
    ${libdir}/python3.12/site-packages/lgpio.py \
    ${libdir}/python3.12/site-packages/_lgpio.cpython-312-arm-linux-gnueabihf.so \
"

RDEPENDS:${PN} += "glibc"

do_compile() {
    DESTDIR="${STAGING_DIR_TARGET}"
    export DESTDIR
    cd ${S}
    oe_runmake
    make install
    cd PY_LGPIO
    python3 setup.py build_ext
}

EXTRA_OEMAKE += "'CC=${CC}' 'LD=${LD}' 'AR=${AR}' '-I${STAGING_INCDIR}'"

do_install() {
    install -d -m 0755 ${D}${libdir}
    install -m 0644 ${STAGING_DIR_TARGET}${libdir}/liblgpio.so.1 ${D}${libdir}/liblgpio.so.1
    ln -rs ${D}${libdir}/liblgpio.so.1 ${D}${libdir}/liblgpio.so
    install -d -m 0755 ${D}${includedir}
    install -m 0644 ${STAGING_DIR_TARGET}${includedir}/lgpio.h ${D}${includedir}/lgpio.h
    install -d -m 0755 ${D}${libdir}/python3.12/site-packages
    install -m 0644 ${S}/PY_LGPIO/lgpio.py ${D}${libdir}/python3.12/site-packages/lgpio.py
    install -m 0644 ${S}/PY_LGPIO/build/lib.linux-x86_64-cpython-312/_lgpio.cpython-312-arm-linux-gnueabihf.so ${D}${libdir}/python3.12/site-packages/_lgpio.cpython-312-arm-linux-gnueabihf.so
}

BBCLASSEXTEND = ""
