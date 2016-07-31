SUMMARY = "Import filter library for MS Works"
HOMEPAGE = "https://sourceforge.net/projects/libwps/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "027fb17fb9e43553aa6624dc18f830ac"
SRC_URI[sha256sum] = "0c30407865a873ff76b6d5b2d2aa599f6af68936638c81ca8292449324042a6c"

inherit autotools pkgconfig

DEPENDS = "librevenge"
