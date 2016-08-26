SUMMARY = "An interface library to access tags for identifying languages"
HOMEPAGE = "http://tagoh.bitbucket.org/liblangtag/"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=e6a600fd5e1d9cbde2d983680233ad02 \
"

DEPENDS = "libxml2"

SRC_URI = " \
    https://bitbucket.org/tagoh/${BPN}/downloads/${BPN}-${PV}.tar.bz2 \
    file://0001-configure.ac-add-missing-HAVE_INTROSPECTION-check.patch \
    file://0002-configure.ac-remove-untranslated-AX_CHECK_ENABLE_DEB.patch \
    file://0003-move-_lt_tag_filter_t-after-neum-to-fix-build.patch \
"
SRC_URI[md5sum] = "dcd7a845a8a9b57ca96eb04a29083246"
SRC_URI[sha256sum] = "df84efd7e3e67cc8a38ece1e23f080c70ea29b26590ee324d03f1df37bf46576"

inherit autotools pkgconfig

# broken
EXTRA_OECONF += "--disable-introspection"

# Even though introspection is disabled , gobject-introspection package is still
# needed for m4 macros.
DEPENDS += "gobject-introspection"

do_configure_prepend() {
    if ! grep -q ${HOST_SYS}-libtool ${S}/configure.ac; then
        # align to native libtool
        sed -i 's:libtool :${HOST_SYS}-libtool :g' ${S}/configure.ac
    fi
}

BBCLASSEXTEND = "native"
