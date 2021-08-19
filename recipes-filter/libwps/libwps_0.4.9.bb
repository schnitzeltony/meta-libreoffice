SUMMARY = "Import filter library for MS Works"
HOMEPAGE = "https://sourceforge.net/projects/libwps/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "b49670696446f4e11cafa49ec566d54c"
SRC_URI[sha256sum] = "13beb0c733bb1544a542b6ab1d9d205f218e9a2202d1d4cac056f79f6db74922"

inherit autotools-brokensep pkgconfig

DEPENDS = "librevenge"
