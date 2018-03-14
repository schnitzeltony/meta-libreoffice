SUMMARY = "Import filter library for MS Works"
HOMEPAGE = "https://sourceforge.net/projects/libwps/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "84abff8615a266b91a3e81064eb17eea"
SRC_URI[sha256sum] = "e478e825ef33f6a434a19ff902c5469c9da7acc866ea0d8ab610a8b2aa94177e"

inherit autotools-brokensep pkgconfig

DEPENDS = "librevenge"
