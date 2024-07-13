package com.github.jameshnsears.chance.data.repository.roll.testdouble

import com.github.jameshnsears.chance.data.domain.core.bag.testdouble.BagDataTestDouble
import com.github.jameshnsears.chance.data.domain.core.roll.testdouble.RollHistoryDataTestDouble
import com.github.jameshnsears.chance.utility.android.UtilityAndroidHelper
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class RepositoryRollTestDoubleUnitTest : UtilityAndroidHelper() {
    @Test
    fun storeAndFetch() = runTest {
        val rollHistory = RollHistoryDataTestDouble(BagDataTestDouble()).rollHistory

        val repositoryRoll = RepositoryRollTestDouble.getInstance(rollHistory)

        val fetched = repositoryRoll.fetch().first()
        assertEquals(rollHistory, fetched)

        val rollHistoryFirstRollTimestamp = rollHistory.keys.first()
        val fetchedFirstRollTimestamp = fetched.keys.first()
        assertEquals(rollHistoryFirstRollTimestamp, fetchedFirstRollTimestamp)

        val rollHistoryFirstRollSequence = rollHistory[rollHistoryFirstRollTimestamp]
        val fetchedFirstRollSequence = fetched[fetchedFirstRollTimestamp]
        assertEquals(rollHistoryFirstRollSequence, fetchedFirstRollSequence)

        assertEquals(
            rollHistoryFirstRollSequence!![0].side.number,
            fetchedFirstRollSequence!![0].side.number
        )
    }
}
