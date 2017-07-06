SUMMARY = "A library for import of many old Mac document formats"
HOMEPAGE = "http://sourceforge.net/projects/libmwaw"
LICENSE = " LGPLv2.1 & MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.LGPL;md5=a049c5e22d3bd7bc3c9a2e9135a6d104 \
    file://COPYING.MPL;md5=cce0d89a18de69e7f51f693182ac4a3e \
"

SRC_URI = " \
    ${SOURCEFORGE_MIRROR}/project/${BPN}/${BPN}/${BPN}-${PV}/${BPN}-${PV}.tar.bz2 \
    file://0001-gcc7-try-to-correct-some-warnings.patch \
    file://0002-Rename-FALLTHROUGH-in-MWAW_FALLTHROUGH-simplify-code.patch \
"
SRC_URI[md5sum] = "d986a3405788666c4e716f130666499f"
SRC_URI[sha256sum] = "61f5435ebe5e16581d297e8e29b4c9d24d3a1a8a41d497b9fed2452146050150"

inherit autotools-brokensep pkgconfig

DEPENDS = "librevenge"
