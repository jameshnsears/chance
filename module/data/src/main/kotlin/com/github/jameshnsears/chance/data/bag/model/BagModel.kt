package com.github.jameshnsears.chance.data.bag.model

import com.github.jameshnsears.chance.data.bag.repository.BagRepository
import com.github.jameshnsears.chance.data.bag.repository.BagRepositoryInterface
import com.github.jameshnsears.chance.data.domain.Dice
import com.github.jameshnsears.chance.data.domain.Side
import timber.log.Timber

class BagModel(
    private val bagRepository: BagRepositoryInterface = BagRepository
) {
    fun diceClone(diceToClone: Dice) {
        var dice = dice()
        dice += diceToClone
        store(dice)
    }

    fun diceCanBeDeleted() = dice().size > 1

    fun dice(): List<Dice> {
        return bagRepository.fetch()
    }

    fun dice(diceIndex: Int): Dice {
        val dice = dice()
        if (diceIndex < 0 || diceIndex >= dice.size) {
            throw BagModelIndexException()
        }
        return dice[diceIndex]
    }

    fun diceDescription(diceIndex: Int): String = dice(diceIndex).description

    fun sides(diceIndex: Int): List<Side> = dice(diceIndex).sides

    fun side(diceIndex: Int, sideIndex: Int): Side {
        val sides = dice(diceIndex).sides
        if (sideIndex < 0 || sideIndex >= sides.size) {
            throw BagModelIndexException()
        }

        return sides[sideIndex]
    }

    fun dicePanaltyBonus(diceIndex: Int): Int = dice(diceIndex).penaltyBonus

    fun store(
        diceIndex: Int,
        sides: Int,
        description: String,
        penaltyBonus: Int
    ) {
        Timber.d("diceIndex=$diceIndex")
        Timber.d("sids=$sides")
        Timber.d("description=", description)
        Timber.d("penaltyBonus=$penaltyBonus")

        val dice = dice().map { it.copy() }.toList()

        dice[diceIndex].sides = (sides downTo 1).map { sideIndex ->
            Side(sideIndex = sideIndex)
        }
        dice[diceIndex].description = description
        dice[diceIndex].penaltyBonus = penaltyBonus

        store(dice)
    }

    fun store(allDice: List<Dice>) = bagRepository.store(allDice)
}
