# # 1. Clean up any invalid configuration arguments
# EXTRA_OECONF:remove = "--disable-alsaucm"

# # 2. Stop the recipe from creating the sub-package split
# PACKAGES:remove = "alsa-utils-alsaucm"

# # 3. Force-strip the mandatory runtime dependency requirement
# RDEPENDS:${PN}:remove = "alsa-utils-alsaucm"
# RDEPENDS:alsa-utils:remove = "alsa-utils-alsaucm"
