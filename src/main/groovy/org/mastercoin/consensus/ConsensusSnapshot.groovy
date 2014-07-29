package org.mastercoin.consensus

import org.mastercoin.CurrencyID

/**
 * User: sean
 * Date: 7/9/14
 * Time: 1:12 PM
 */
class ConsensusSnapshot {
    CurrencyID  currencyID
    Long        blockHeight
    String      sourceType
    URL         sourceURL

    SortedMap<String, ConsensusEntry> entries

    SortedMap<String, ConsensusEntry> getEntriesExcluding(String address) {
        SortedMap<String, ConsensusEntry> temp = new TreeMap<String, ConsensusEntry>(entries)
        temp.remove(address)
        return temp
    }
}
