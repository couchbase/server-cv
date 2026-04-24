return {
CMAKE_ARGS="${CMAKE_ARGS} " +
           "-DBUILD_ENTERPRISE=1"

// Exclude breakpad tests as TSan doesn't like us crashing memcached...
CTEST_ARGS="--exclude-regex memcached-breakpad-test"
}
