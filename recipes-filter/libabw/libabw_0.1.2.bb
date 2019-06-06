SUMMARY = "Library that parses the file format of AbiWord documents"
HOMEPAGE = "https://wiki.documentfoundation.org/DLP/Libraries/libabw"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = " \
    http://dev-www.libreoffice.org/src/${BPN}/${BPN}-${PV}.tar.xz \
    file://0001-Fix-build-with-gcc-9.patch \
"
SRC_URI[md5sum] = "201f477df7ea90d362c389c145c0f352"
SRC_URI[sha256sum] = "0b72944d5af81dda0a5c5803ee84cbac4b81441a4d767aa57029adc6744c2485"

inherit autotools pkgconfig

DEPENDS = " \
    gperf-native \
    libxml2 \
    librevenge \
"

BBCLASSEXTEND = "native"
