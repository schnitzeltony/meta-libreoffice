SUMMARY = "Inkscape is a Free and open source vector graphics editor"
HOMEPAGE = "https://inkscape.org/"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=d20d608cfa3a8343d722c2e69a43bbcd"

PV = "1.1.1"
SRC_URI = " \
    https://inkscape.org/gallery/item/29255/${BP}.tar.xz \
    file://0001-Fix-build-with-poppler-21-11-0.patch \
"
SRC_URI[sha256sum] = "aeca0b9d33b5b1cfa9aa70433bdee6a8c3d020ffafc2e6f0c9a60eed7a7978af"
S = "${WORKDIR}/${BPN}-1.1.1_2021-09-20_3bf5ae0d25"

DEPENDS = " \
    glib-2.0-native \
    pango \
    gtkmm3 \
    libsoup-2.4 \
    harfbuzz \
    poppler \
    gsl \
    bdwgc \
    lcms \
    gspell \
    libxslt \
    \
    double-conversion \
    libwpg \
    librevenge \
    libcdr \
    libvisio \
    potrace \
"

inherit cmake pkgconfig gettext gtk-icon-cache bash-completion mime-xdg

FILES:${PN} += "${datadir}/metainfo"

INSANE_SKIP:${PN} = "useless-rpaths"
