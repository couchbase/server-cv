return {
    // ForestDB's unit tests are not safe to run concurrently
    // (they don't use unique filenames for example). Therefore must
    // run tests sequentially.
    TEST_PARALLELISM=1
}
