SUMMARY = "CorelDraw file format importer library for LibreOffice"
HOMEPAGE = "https://wiki.documentfoundation.org/DLP/Libraries/libcdr"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "e369f30b5b861ee0fc4f9e6cbad701fe"
SRC_URI[sha256sum] = "5160bbbfefe52bd4880840fad2b07a512813e37bfaf8ccac062fca238f230f4d"

inherit autotools pkgconfig

DEPENDS = "icu lcms librevenge"

BBCLASSEXTEND = "native"
