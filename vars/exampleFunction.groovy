// This function will be accessible globally in pipelines
def call(String name) {
    echo "Hello, ${name}! This is a shared library function."
}
