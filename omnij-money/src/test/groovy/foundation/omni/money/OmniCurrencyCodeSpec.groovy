package foundation.omni.money

import foundation.omni.CurrencyID
import foundation.omni.Ecosystem
import spock.lang.Specification
import static foundation.omni.money.OmniCurrencyCode.*

/**
 *
 */
class OmniCurrencyCodeSpec extends Specification {
    def "test OMNI code"() {
        expect:
        OMNI.id() == CurrencyID.OMNI
        OMNI.id().ecosystem == Ecosystem.MSC
        OMNI.name() == "OMNI"
        TOMNI.id() == CurrencyID.TOMNI
        TOMNI.id().ecosystem == Ecosystem.TMSC
        TOMNI.name() == "TOMNI"
    }
}