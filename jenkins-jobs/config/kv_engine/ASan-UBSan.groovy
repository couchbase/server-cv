return {

// Breakpad disabled as it deliberately crashes (which ASan doesn't like :)
CTEST_ARGS="--exclude-regex memcached-breakpad-test-segfault"
}
