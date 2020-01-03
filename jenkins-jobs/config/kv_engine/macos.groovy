return {
CMAKE_ARGS="${CMAKE_ARGS} " +
           "-DPHOSPHOR_DISABLE=ON"
// 03.01.2020:
// Set warning threshold to 1 as we have 1 -Wtautological-compare warning
// in 6.5.0, which can't be fixed as its a locked down manifest
WARNING_THRESHOLD=1
TESTS_EXCLUDE="memcached-spdlogger-test"
}
