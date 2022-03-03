SUMMARY = "Inkscape is a Free and open source vector graphics editor"
HOMEPAGE = "https://inkscape.org/"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=d20d608cfa3a8343d722c2e69a43bbcd"

PV = "1.1.2"
SRC_URI = "https://inkscape.org/gallery/item/31668/${BP}.tar.xz"
SRC_URI[sha256sum] = "3ffe54a06d0b25a4cd8b6eb424536ef1ed205be13443a39cd437c8c7b89b96d1"
S = "${WORKDIR}/${BPN}-${PV}_2022-02-04_0a00cf5339"

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
