return {
    CC="clang-19"
    CXX="clang++-19"
    PATH="/opt/clang-19.1.1/bin:" + "${PATH}"
    CMAKE_ARGS="-DBUILD_ENTERPRISE=1"
    ENABLE_ADDRESSSANITIZER=1
    ENABLE_UNDEFINEDSANITIZER=1
    UBSAN_OPTIONS="print_stacktrace=1 log_path=sanitizers.log suppressions=${WORKSPACE}/tlm/ubsan.suppressions"
    ASAN_OPTIONS="abort_on_error=true disable_coredump=0 use_madv_dontdump=1 log_path=sanitizers.log"
}
