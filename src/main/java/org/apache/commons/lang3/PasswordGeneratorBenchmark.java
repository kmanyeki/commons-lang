package org.apache.commons.lang3;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

// Benchmark settings
@BenchmarkMode(Mode.Throughput) // Measures operations per unit of time
@OutputTimeUnit(TimeUnit.MILLISECONDS) // Results reported in milliseconds
@State(Scope.Thread) // Each thread gets its own instance
public class PasswordGeneratorBenchmark {

    private PasswordGenerator generator;

    @Setup(Level.Iteration)
    public void setup() {
        generator = new PasswordGenerator();
    }

    @Benchmark
    public String testGeneratePassword() {
        // Generate a password with specific options
        return generator.generatePassword(12, true, true, true);
    }

    @Benchmark
    public String testValidatePassword() {
        // Generate a password and validate it
        String password = generator.generatePassword(12, true, true, true);
        return generator.validatePassword(password); // Pass only the password as expected
    }
}
