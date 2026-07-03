import java.time.*
return {
    // Every day, sometime between 00:00 and 05:00
    CRON_SCHEDULE="H H(0-5) * * *"

    CC="clang-19"
    CXX="clang++-19"
    PATH="/opt/clang-19.1.1/bin:" + "${PATH}"

    CMAKE_ARGS="${CMAKE_ARGS} -DCB_ADDRESSSANITIZER=ON -DFUZZTEST_FUZZING_MODE=ON"
    // Time budget for fuzzing (per test).
    if (LocalDate.now().getDayOfWeek() == DayOfWeek.SATURDAY) {
        FLAGS_fuzz_for="10m"
    } else {
        FLAGS_fuzz_for="10s"
    }
    CTEST_ARGS="--tests-regex ^fuzztest\\."
    CB_FUZZTEST_LOG_FILE="yes"
    ADDITIONAL_ARTIFACTS="**/*_fuzztest_*.log"
    LOG_RETENTION_DAYS="30"
    ARTIFACT_RETENTION_DAYS="30"
}
