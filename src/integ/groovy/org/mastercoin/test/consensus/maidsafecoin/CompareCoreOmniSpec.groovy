package org.mastercoin.test.consensus.maidsafecoin

import static org.mastercoin.CurrencyID.*
import org.mastercoin.test.consensus.BaseConsensusSpec

/**
 * User: sean
 * Date: 7/20/14
 * Time: 1:50 AM
 */
class CompareCoreOmniSpec extends BaseConsensusSpec {

    void setupSpec() {
        setupComparisonForCurrency(MaidSafeCoin)
    }
}