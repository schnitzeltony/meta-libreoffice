SUMMARY = "A library for import of import of Apple iWork documents"
HOMEPAGE = "http://wiki.documentfoundation.org/DLP/Libraries/libetonyek"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=815ca599c9df247a0c7f619bab123dad \
"
SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "b37e09b5e3f0b5b05af2b549f7fde8a1"
SRC_URI[sha256sum] = "29f8097f77a193511e940f7a70dfc6ac7fad57fbfc6e60b81fa1ee011daea903"

inherit autotools pkgconfig

DEPENDS = "glm mdds-1 icu lcms libxml2 librevenge"

BBCLASSEXTEND = "native"
