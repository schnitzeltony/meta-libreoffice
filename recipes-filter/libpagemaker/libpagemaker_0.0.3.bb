SUMMARY = "A library for import of Adobe PageMaker documents"
HOMEPAGE = "http://wiki.documentfoundation.org/DLP/Libraries/libpagemaker"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=815ca599c9df247a0c7f619bab123dad \
"
SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "9f377b0690fa6e96a94bb309509860e9"
SRC_URI[sha256sum] = "d896dc55dafd84ee3441e0ca497b810809f9eea44805a495c3843412309036d6"

inherit autotools pkgconfig

DEPENDS = "icu librevenge"

BBCLASSEXTEND = "native"
