package org.particleframework.javax.inject.tck.accessories

import org.particleframework.javax.inject.tck.Seat

import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class Cupholder {

    public final Provider<Seat> seatProvider

    @Inject
    Cupholder(Provider<Seat> seatProvider) {
        this.seatProvider = seatProvider
    }
}
