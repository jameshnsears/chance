package com.github.jameshnsears.chance.data.repository.roll

import com.github.jameshnsears.chance.data.domain.core.Side
import com.github.jameshnsears.chance.data.domain.core.roll.Roll
import com.github.jameshnsears.chance.data.domain.core.roll.RollHistory
import com.github.jameshnsears.chance.data.domain.proto.RollHistoryProtocolBuffer
import com.github.jameshnsears.chance.data.domain.proto.RollListProtocolBuffer
import com.github.jameshnsears.chance.data.domain.proto.RollProtocolBuffer
import com.github.jameshnsears.chance.data.domain.proto.SideProtocolBuffer
import com.github.jameshnsears.chance.data.repository.RepositoryImportExportInterface
import com.google.protobuf.util.JsonFormat
import kotlinx.coroutines.flow.Flow

interface RepositoryRollInterface : RepositoryImportExportInterface {
    suspend fun fetch(): Flow<RollHistory>
    suspend fun store(newRollHistory: RollHistory)

    fun mapRollHistoryIntoRollHistoryProtocolBufferBuilder(
        rollHistory: RollHistory,
        rollHistoryProtocolBufferBuilder: RollHistoryProtocolBuffer.Builder,
    ) {
        for ((keyEpoch, valueRolls) in rollHistory) {
            val rollListProtocolBuffer = RollListProtocolBuffer.newBuilder()

            for (roll in valueRolls) {
                val rollProtocolBuffer = RollProtocolBuffer.newBuilder()
                rollProtocolBuffer.setDiceEpoch(roll.diceEpoch)

                val sideProtocolBuffer = SideProtocolBuffer.newBuilder()
                sideProtocolBuffer.setNumber(roll.side.number)
                sideProtocolBuffer.setNumberColour(roll.side.numberColour)
                sideProtocolBuffer.setImageDrawableId(roll.side.imageDrawableId)
                sideProtocolBuffer.setImageBase64(roll.side.imageBase64)
                sideProtocolBuffer.setDescription(roll.side.description)
                sideProtocolBuffer.setDescriptionColour(roll.side.descriptionColour)
                sideProtocolBuffer.build()
                rollProtocolBuffer.setSide(sideProtocolBuffer)

                rollProtocolBuffer.setMultiplierIndex(roll.multiplierIndex)
                rollProtocolBuffer.setExplodeIndex(roll.explodeIndex)
                rollProtocolBuffer.setScoreAdjustment(roll.scoreAdjustment)
                rollProtocolBuffer.setScore(roll.score)

                rollListProtocolBuffer.addRoll(rollProtocolBuffer.build())
            }

            rollHistoryProtocolBufferBuilder.putValues(keyEpoch, rollListProtocolBuffer.build())
        }
    }

    fun jsomImportProcess(json: String): RollHistory {
        val rollHistoryProtocolBufferBuilder: RollHistoryProtocolBuffer.Builder =
            RollHistoryProtocolBuffer.newBuilder()

        JsonFormat.parser().merge(json, rollHistoryProtocolBufferBuilder)

        val newRollHistory: RollHistory = LinkedHashMap()

        rollHistoryProtocolBufferBuilder.valuesMap.forEach { mapEntry ->
            val rollList = mutableListOf<Roll>()
            mapEntry.value.rollList.forEach {
                val side = Side()
                side.number = it.side.number
                side.numberColour = it.side.numberColour
                side.imageBase64 = it.side.imageBase64
                side.imageDrawableId = it.side.imageDrawableId
                side.description = it.side.description
                side.descriptionColour = it.side.descriptionColour

                rollList.add(
                    Roll(
                        diceEpoch = it.diceEpoch,
                        side = side,
                        multiplierIndex = it.multiplierIndex,
                        explodeIndex = it.explodeIndex,
                        scoreAdjustment = it.scoreAdjustment,
                        score = it.score
                    )
                )
            }

            newRollHistory[mapEntry.key] = rollList
        }

        return newRollHistory
    }
}
