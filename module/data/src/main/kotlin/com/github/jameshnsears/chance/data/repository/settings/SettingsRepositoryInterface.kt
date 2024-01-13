package com.github.jameshnsears.chance.data.repository.settings

import com.github.jameshnsears.chance.data.domain.Settings
import com.github.jameshnsears.chance.data.protocolbuffer.SettingsProtocolBuffer
import com.github.jameshnsears.chance.data.repository.ImportExportRepositoryInterface
import kotlinx.coroutines.flow.Flow

interface SettingsRepositoryInterface : ImportExportRepositoryInterface {
    suspend fun fetch(): Flow<Settings>
    suspend fun store(newSettings: Settings)

    fun mapSettingsIntoSettingsProtocolBufferBuilder(
        settings: Settings,
        settingsProtocolBufferBuilder: SettingsProtocolBuffer.Builder
    ) {
        settingsProtocolBufferBuilder.setTabRowChance(settings.tabRowChance)

        settingsProtocolBufferBuilder.setBagZoom(settings.bagZoom)
        settingsProtocolBufferBuilder.setBagDemoBag(settings.bagDemoBag)

        settingsProtocolBufferBuilder.setRollSequentially(settings.rollSequentially)
        settingsProtocolBufferBuilder.setRollZoom(settings.rollZoom)
        settingsProtocolBufferBuilder.setRollHistory(settings.rollHistory)
        settingsProtocolBufferBuilder.setRollTitle(settings.rollTitle)
        settingsProtocolBufferBuilder.setRollSideNumber(settings.rollSideNumber)
        settingsProtocolBufferBuilder.setRollTotal(settings.rollTotal)
        settingsProtocolBufferBuilder.setRollSound(settings.rollSound)
    }
}
