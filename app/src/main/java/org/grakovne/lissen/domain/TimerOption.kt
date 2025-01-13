package org.grakovne.lissen.domain

sealed interface TimerOption

class DurationTimerOption(val duration: Int) : TimerOption {
    var originalDuration: Int = duration
}
data object CurrentEpisodeTimerOption : TimerOption
