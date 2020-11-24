SUMMARY = "CorelDraw file format importer library for LibreOffice"
HOMEPAGE = "https://wiki.documentfoundation.org/DLP/Libraries/libcdr"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = " \
    file://COPYING.MPL;md5=815ca599c9df247a0c7f619bab123dad \
"
SRC_URI = " \
    https://dev-www.libreoffice.org/src/libcdr/${BPN}-${PV}.tar.xz \
    file://0001-Fix-build-with-ICU-68.patch \
"
SRC_URI[sha256sum] = "01cd00b04a030977e544433c2d127c997205332cd9b8e35ec0ee17110da7f861"

inherit autotools pkgconfig

DEPENDS = "icu lcms librevenge"

BBCLASSEXTEND = "native"
