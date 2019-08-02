DEPENDS += "graphite2"

EXTRA_OECONF_remove = "--without-graphite2"
EXTRA_OECONF_append = " --with-graphite2"
