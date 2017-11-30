SUMMARY = "A library for import of Microsoft Visio diagrams"
HOMEPAGE = "http://wiki.documentfoundation.org/DLP/Libraries/libvisio"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"
SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "b60b7f4233105261eb139d82cbf3b33a"
SRC_URI[sha256sum] = "fe1002d3671d53c09bc65e47ec948ec7b67e6fb112ed1cd10966e211a8bb50f9"

inherit autotools pkgconfig

DEPENDS = "icu libxml2 librevenge"

BBCLASSEXTEND = "native"
