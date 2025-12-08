# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
SUMMARY = "simple hello world application"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "file://helloworld.c"

S = "${UNPACKDIR}"

# NOTE: no Makefile found, unable to determine what needs to be done


do_compile () {
	# Specify compilation commands here
        ${CC} ${LDFLAGS} helloworld.c -o helloworld
}

do_install () {
	# Specify install commands here
	install -d ${D}${bindir}
        install -m 0755 helloworld ${D}${bindir}
}

