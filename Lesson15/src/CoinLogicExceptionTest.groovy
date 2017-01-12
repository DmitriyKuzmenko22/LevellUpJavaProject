import spock.lang.Specification

class CoinTest extends Specification {

    def 'should pass negative diameter and throw CoinLogicException'() {
        when: 'pass negative diameter'
        new Coin(5, -12)

        then:
        thrown CoinLogicException
    }

    def 'should pass positive diameter without exception'() {
        expect:'pass positive diameter'
        new Coin(weight, diameter) != null

        where:
        diameter << 12
        weight << 5
    }

}
