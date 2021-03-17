package lotto.domain

class LottoGame(private var money: Money) {

    fun purchaseLottoes(lottoStrategy: LottoStrategy): Lottoes {
        return lottoStrategy.generateLotto(money)
    }

    companion object {
        const val LOTTO_COST = 1000
    }
}
