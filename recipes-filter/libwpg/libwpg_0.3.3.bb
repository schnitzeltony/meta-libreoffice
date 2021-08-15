SUMMARY = "Library for importing and converting Corel WordPerfect(tm) graphics"
HOMEPAGE = "http://libwpg.sourceforge.net/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.xz"
SRC_URI[md5sum] = "c3727b1196506fc77f6f916866884411"
SRC_URI[sha256sum] = "99b3f7f8832385748582ab8130fbb9e5607bd5179bebf9751ac1d51a53099d1c"

inherit autotools pkgconfig

DEPENDS = "librevenge libwpd zlib"
RDEPENDS:${PN} = "perl"

BBCLASSEXTEND = "native"
