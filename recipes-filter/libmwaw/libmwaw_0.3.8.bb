SUMMARY = "A library for import of many old Mac document formats"
HOMEPAGE = "http://sourceforge.net/projects/libmwaw"
LICENSE = " LGPLv2.1 & MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL;md5=a049c5e22d3bd7bc3c9a2e9135a6d104 \
    file://COPYING.MPL;md5=cce0d89a18de69e7f51f693182ac4a3e \
"

SRC_URI = "${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.bz2"
SRC_URI[md5sum] = "72ad446d76b157e30c1baf39bb288b99"
SRC_URI[sha256sum] = "a59c5ffcbca0040d93a5b3cb00faf12659cf8b525f076081d1e7585d91d08eb5"

inherit autotools pkgconfig

DEPENDS = "librevenge"
