SUMMARY = "CorelDraw file format importer library for LibreOffice"
HOMEPAGE = "https://wiki.documentfoundation.org/DLP/Libraries/libcdr"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/libcdr/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "4e52342983d798ae584e26bdf7a5f18a"
SRC_URI[sha256sum] = "e7a7e8b00a3df5798110024d7061fe9d1c3330277d2e4fa9213294f966a4a66d"

inherit autotools pkgconfig

DEPENDS = "icu lcms librevenge"

BBCLASSEXTEND = "native"
