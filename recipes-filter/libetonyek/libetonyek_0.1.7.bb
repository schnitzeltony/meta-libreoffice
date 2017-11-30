SUMMARY = "A library for import of import of Apple iWork documents"
HOMEPAGE = "http://wiki.documentfoundation.org/DLP/Libraries/libetonyek"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=815ca599c9df247a0c7f619bab123dad \
"
SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "3088732de0028b1340668b8a3caf3c25"
SRC_URI[sha256sum] = "69dbe10d4426d52f09060d489f8eb90dfa1df592e82eb0698d9dbaf38cc734ac"

inherit autotools pkgconfig

DEPENDS = "glm mdds icu lcms libxml2 librevenge liblangtag mdds-1"

BBCLASSEXTEND = "native"
