# Log for changes in the Fragment library
#
# `Added`: for new features
# `Changed`: for changes in existing functionality
# `Deprecated`: for soon to be removed functionality
# `Removed`: for now removed feature
# `Fixed`: for any bug fixes
# `Security`: in case of vulnerabilities
#
# Possible headings:
# API Changes
# Bug Fixes
# Dependency Updates
# Behavior Change
# External Contributions

# Unreleased

### Bug Fixes
- Fixed an issue where the saved state stored when the activity was stopped but not destroyed
  would be incorrectly cached even after the fragment instance was moved back to the RESUMED state.
  This would cause that cached state to be reused if that fragment instance was on the back stack
  when using the multiple back stacks API to save and restore that fragment.

### Dependency Updates

- Changed dependency of Activity library from version 1.5.1 to version 1.7.1.

