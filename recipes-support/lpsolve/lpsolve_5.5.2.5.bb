SUMMARY = "A Mixed Integer Linear Programming (MILP) solver"
HOMEPAGE = "http://lpsolve.sourceforge.net/5.5/"
LICENSE = "LGPL2.1"
LIC_FILES_CHKSUM = "file://README.txt;start_line=6;end_line=7;md5=883769a4ee3f3c1843e536ab0fabb3b2"

SRC_URI = " \
    http://downloads.sourceforge.net/project/${BPN}/${BPN}/${PV}/lp_solve_${PV}_source.tar.gz \
    file://0001-Align-compile.patch \
"
SRC_URI[md5sum] = "3be57261fc41dd8e210f54017220d5f7"
SRC_URI[sha256sum] = "201a7c62b8b3360c884ee2a73ed7667e5716fc1e809755053b398c2f5b0cf28a"

S = "${WORKDIR}/lp_solve_5.5"

do_compile() {
    cd lpsolve55
    sh -x ccc
    cd ../lp_solve
    sh -x ccc    
}

do_install() {
    install -d ${D}${bindir}
    install -m 755 lp_solve/bin/lp_solve ${D}${bindir}

    install -d ${D}${libdir}
    install -m 644 lpsolve55/bin/liblpsolve55.so ${D}/${libdir}

    install -d ${D}${includedir}/lpsolve
    install -m 644 lp*.h ${D}${includedir}/lpsolve
}

FILES_SOLIBSDEV = ""
FILES_${PN} += "${libdir}/liblpsolve55.so"

BBCLASSEXTEND = "native"
