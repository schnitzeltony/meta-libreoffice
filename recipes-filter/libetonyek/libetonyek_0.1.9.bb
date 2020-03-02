SUMMARY = "A library for import of import of Apple iWork documents"
HOMEPAGE = "http://wiki.documentfoundation.org/DLP/Libraries/libetonyek"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=815ca599c9df247a0c7f619bab123dad \
"
SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "b891c14c5233f93fb7db052b5762a692"
SRC_URI[sha256sum] = "e61677e8799ce6e55b25afc11aa5339113f6a49cff031f336e32fa58635b1a4a"

inherit autotools pkgconfig

DEPENDS = "glm icu lcms libxml2 librevenge liblangtag mdds-1.2"

BBCLASSEXTEND = "native"
