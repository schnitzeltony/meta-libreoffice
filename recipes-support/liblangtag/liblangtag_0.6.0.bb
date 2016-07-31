SUMMARY = "An interface library to access tags for identifying languages"
HOMEPAGE = "http://tagoh.bitbucket.org/liblangtag/"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=815ca599c9df247a0c7f619bab123dad \
"

SRC_URI = " \
    https://bitbucket.org/tagoh/${BPN}/downloads/${BPN}-${PV}.tar.bz2 \
    file://0001-configure.ac-add-missing-HAVE_INTROSPECTION-check.patch \
    file://0002-configure.ac-remove-untranslated-AX_CHECK_ENABLE_DEB.patch \
"
SRC_URI[md5sum] = "dcd7a845a8a9b57ca96eb04a29083246"
SRC_URI[sha256sum] = "df84efd7e3e67cc8a38ece1e23f080c70ea29b26590ee324d03f1df37bf46576"

inherit autotools pkgconfig

# broken
EXTRA_OECONF += "--disable-introspection"

# Even though introspection is disabled , gobject-introspection package is still
# needed for m4 macros.
DEPENDS += "gobject-introspection"

BBCLASSEXTEND = "native"
