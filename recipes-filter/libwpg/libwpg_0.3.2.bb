SUMMARY = "Library for importing and converting Corel WordPerfect(tm) graphics"
HOMEPAGE = "http://libwpg.sourceforge.net/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "9bd45e72071897367b5b3ba2854fa36f"
SRC_URI[sha256sum] = "57faf1ab97d63d57383ac5d7875e992a3d190436732f4083310c0471e72f8c33"

inherit autotools pkgconfig

DEPENDS = "librevenge libwpd zlib"
RDEPENDS_${PN} = "perl"
