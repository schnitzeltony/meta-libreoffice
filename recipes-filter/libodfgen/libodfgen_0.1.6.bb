SUMMARY = "An ODF generator library"
HOMEPAGE = "https://sourceforge.net/p/libwpd/wiki/libodfgen"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/libwpd/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "731fd5e5513c55ed64458a0a8c33a830"
SRC_URI[sha256sum] = "03b210ab44f05e38091508cdca6ba0ff73de3ea8a168f849b8f1c5059c20b9e9"

inherit autotools pkgconfig perlnative

DEPENDS = "librevenge"
