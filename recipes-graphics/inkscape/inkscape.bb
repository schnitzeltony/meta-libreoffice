SUMMARY = "Inkscape is a Free and open source vector graphics editor"
HOMEPAGE = "https://inkscape.org/"
LICENSE = "GPL-3.0-or-later"
LIC_FILES_CHKSUM = "file://COPYING;md5=46f815712c095f667139ef42f2270d57"

SRC_URI = "gitsm://gitlab.com/inkscape/inkscape.git;protocol=https;nobranch=1"
SRCREV = "b0a8486541ac36327488da641d58a86bee2f07ad"
S = "${WORKDIR}/git"
PV = "1.2.2"

DEPENDS = " \
    bdwgc \
    cairo \
    glib-2.0-native \
    gsl \
    gspell \
    gtkmm3 \
    harfbuzz \
    lcms \
    libsoup-2.4 \
    libxslt \
    pango \
    poppler \
    \
    double-conversion \
    lib2geom \
    libcdr \
    librevenge \
    libvisio \
    libwpg \
    potrace \
"

inherit cmake pkgconfig gettext gtk-icon-cache bash-completion mime-xdg

FILES:${PN} += "${datadir}/metainfo"
