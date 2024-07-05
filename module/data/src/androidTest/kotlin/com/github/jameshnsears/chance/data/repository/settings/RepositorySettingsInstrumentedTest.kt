package com.github.jameshnsears.chance.data.repository.settings

import androidx.test.platform.app.InstrumentationRegistry
import com.github.jameshnsears.chance.data.repository.bag.testdouble.RepositoryBagTestDouble
import com.github.jameshnsears.chance.data.repository.settings.impl.RepositorySettings
import com.github.jameshnsears.chance.data.repository.settings.impl.settingsDataStore
import com.github.jameshnsears.chance.data.sample.bag.SampleBagTestData
import com.github.jameshnsears.chance.data.sample.settings.SampleSettingsStartup
import com.github.jameshnsears.chance.utility.logging.UtilityLoggingInstrumentedHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class RepositorySettingsInstrumentedTest : UtilityLoggingInstrumentedHelper() {
    private val repositoryBag = RepositoryBagTestDouble.getInstance()

    init {
        val sampleBagTestData = SampleBagTestData()

        runBlocking(Dispatchers.Main) {
            repositoryBag.store(
                mutableListOf(
                    sampleBagTestData.d2,
                ),
            )
        }
    }

    @Before
    fun emptyDataStore() = runTest {
        RepositorySettings.getInstance(
            InstrumentationRegistry.getInstrumentation().targetContext
        ).clear()
    }

    @Test
    fun demoProtocolBufferUsage() = runTest {
        val context = InstrumentationRegistry.getInstrumentation().targetContext

        val before: Flow<Int> = context.settingsDataStore.data
            .map { settingsProtocolBuffer ->
                settingsProtocolBuffer.tabRowChance
            }

        assertEquals(0, before.first())

        context.settingsDataStore.updateData { currentSettingsProtocolBuffer ->
            currentSettingsProtocolBuffer.toBuilder()
                .setTabRowChance(1)
                .build()
        }

        val after: Flow<Int> = context.settingsDataStore.data
            .map { currentSettingsProtocolBuffer ->
                currentSettingsProtocolBuffer.tabRowChance
            }

        assertEquals(1, after.first())
    }

    @Test
    fun storeAndFetch() = runTest {
        val repositorySettings = RepositorySettings.getInstance(
            InstrumentationRegistry.getInstrumentation().targetContext
        )

        val originalSettings = SampleSettingsStartup().settings
        originalSettings.tabRowChance = 1
        originalSettings.resize = 2f
        originalSettings.rollIndexTime = false
        originalSettings.rollScore = false
        originalSettings.diceTitle = true
        originalSettings.sideNumber = false
        originalSettings.behaviour = true
        originalSettings.sideDescription = true
        originalSettings.sideSVG = false
        originalSettings.rollSound = true

        repositorySettings.store(originalSettings)

        val fetchedSettings = repositorySettings.fetch().first()

        assertEquals(originalSettings.tabRowChance, fetchedSettings.tabRowChance)

        assertEquals(originalSettings.resize, fetchedSettings.resize)

        assertEquals(originalSettings.rollIndexTime, fetchedSettings.rollIndexTime)
        assertEquals(originalSettings.rollScore, fetchedSettings.rollScore)

        assertEquals(originalSettings.diceTitle, fetchedSettings.diceTitle)
        assertEquals(originalSettings.sideNumber, fetchedSettings.sideNumber)
        assertEquals(originalSettings.behaviour, fetchedSettings.behaviour)
        assertEquals(originalSettings.sideDescription, fetchedSettings.sideDescription)
        assertEquals(originalSettings.sideSVG, fetchedSettings.sideSVG)

        assertEquals(originalSettings.rollSound, fetchedSettings.rollSound)
    }

    @Test
    fun importAndExport() = runTest {
        val repositorySettings = RepositorySettings.getInstance(
            InstrumentationRegistry.getInstrumentation().targetContext
        )

        val originalSettings = SampleSettingsStartup().settings

        repositorySettings.store(originalSettings)

        val json = repositorySettings.exportJson()

        repositorySettings.clear()

        repositorySettings.importJson(json)

        assertEquals(json, repositorySettings.exportJson())

        assertEquals(originalSettings, repositorySettings.fetch().first())
    }
}
