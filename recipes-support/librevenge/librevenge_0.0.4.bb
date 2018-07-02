SUMMARY = "library for REVerses ENGineered formats filters"
HOMEPAGE = "http://sf.net/p/libwpd/librevenge/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "5b9ac52ec77d4d19157cf5962ebc0aea"
SRC_URI[sha256sum] = "c51601cd08320b75702812c64aae0653409164da7825fd0f451ac2c5dbe77cbf"

inherit autotools pkgconfig

DEPENDS = "cppunit zlib boost"

BBCLASSEXTEND = "native"

do_install_append() {
    sed -i '/^Libs:/ s/$/ -lboost_system/' ${D}${libdir}/pkgconfig/librevenge-0.0.pc
}
