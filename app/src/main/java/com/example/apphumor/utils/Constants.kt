package com.example.apphumor.utils

object Constants {

    // Constantes do Banco de Dados (Firebase)
    object Firebase {
        const val USERS_REF = "users"
        const val NOTES_REF = "notes"
        const val FIELD_IS_SYNCED = "isSynced"
        const val FIELD_PERFECT_WEEKS = "semanasPerfeitas"

        // Campos de atualização do Usuário
        const val USER_NAME = "nome"
        const val USER_AGE = "idade"
        const val USER_EMAIL = "email"
        const val USER_NOTIF_ACTIVE = "notificacaoAtiva"
        const val USER_NOTIF_TIME = "horarioNotificacao"
        const val USER_PHOTO = "fotoBase64"
    }

    // Constantes para tráfego de dados entre telas (Intents)
    object Intent {
        const val EXTRA_EDIT_NOTE = "EDIT_NOTE"
    }

    // Constantes para armazenamento local (SharedPreferences)
    object Prefs {
        const val CACHE_FILE_NAME = "user_cache"
        const val KEY_CACHED_NAME = "cached_name"
        const val KEY_CACHED_PHOTO = "cached_photo"
    }
}