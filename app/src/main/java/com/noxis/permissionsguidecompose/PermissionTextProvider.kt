package com.noxis.permissionsguidecompose

interface PermissionTextProvider {
    fun getDescription(isPermanentlyDeclined: Boolean): String
}
