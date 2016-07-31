SUMMARY = "Library for importing and converting Corel WordPerfect(tm) graphics"
HOMEPAGE = "http://libwpg.sourceforge.net/"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "dfd066658ec9d2fb2262417039a8a1c3"
SRC_URI[sha256sum] = "29049b95895914e680390717a243b291448e76e0f82fb4d2479adee5330fbb59"

inherit autotools pkgconfig

DEPENDS = "librevenge libwpd zlib"
RDEPENDS_${PN} = "perl"
