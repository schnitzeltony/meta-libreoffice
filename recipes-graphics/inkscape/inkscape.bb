SUMMARY = "Inkscape is a Free and open source vector graphics editor"
HOMEPAGE = "https://inkscape.org/"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=d20d608cfa3a8343d722c2e69a43bbcd"

PV = "1.1"
SRC_URI = "https://inkscape.org/gallery/item/26932/${BP}.tar.xz"
SRC_URI[sha256sum] = "71e6e8ce3fdf702f59dbc4a276665eb982eb7822b029bbdbeced2df4301795e6"
S = "${WORKDIR}/${BPN}-1.1_2021-05-24_c4e8f9ed74"

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
