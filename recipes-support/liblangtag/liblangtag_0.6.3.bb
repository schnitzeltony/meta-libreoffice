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
"
SRC_URI[md5sum] = "015274eb284b1dc82bf7af1d1774ec64"
SRC_URI[sha256sum] = "1f12a20a02ec3a8d22e54dedb8b683a43c9c160bda1ba337bf1060607ae733bd"

inherit autotools pkgconfig gobject-introspection

do_configure_prepend() {
    if ! grep -q ${HOST_SYS}-libtool ${S}/configure.ac; then
        # align to native libtool
        sed -i 's:libtool :${HOST_SYS}-libtool :g' ${S}/configure.ac
    fi
}

export GIR_EXTRA_LIBS_PATH="${B}/liblangtag/.libs"

BBCLASSEXTEND = "native"
