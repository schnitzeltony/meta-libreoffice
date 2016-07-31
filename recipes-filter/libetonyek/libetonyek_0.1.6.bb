SUMMARY = "A library for import of import of Apple iWork documents"
HOMEPAGE = "http://wiki.documentfoundation.org/DLP/Libraries/libetonyek"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=815ca599c9df247a0c7f619bab123dad \
"
SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "dfe25b0c7739283a5c61a930ea1f9bf8"
SRC_URI[sha256sum] = "df54271492070fbcc6aad9f81ca89658b25dd106cc4ab6b04b067b7a43dcc078"

inherit autotools pkgconfig

DEPENDS = "glm mdds icu lcms libxml2 librevenge liblangtag mdds-1"

BBCLASSEXTEND = "native"
