SUMMARY = "N-Gram-Based Text Categorization library for language guessing"
HOMEPAGE = "http://www.freedesktop.org/wiki/Software/libexttextcat"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=873b1664864cb88b5f5b4eca62deb23c"

SRC_URI = "http://dev-www.libreoffice.org/src/${BPN}/${BPN}-${PV}.tar.xz"
SRC_URI[sha256sum] = "13fdbc9d4c489a4d0519e51933a1aa21fe3fb9eb7da191b87f7a63e82797dac8"

inherit autotools pkgconfig

FILES:${PN} += "${datadir}/vala"
