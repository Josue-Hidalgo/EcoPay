# Social Media UI - Fixed Version

This project has been fixed to work without IntelliJ-specific configurations and external dependencies.

## Issues Fixed

1. **Main Class Configuration**: Fixed the incorrect main class path in `pom.xml` (removed `.java` extension)
2. **Missing Dependencies**: The original project required FlatLaf and MigLayout dependencies that weren't available
3. **Missing Notifications Class**: Created a custom `Notifications` class to replace the missing external library
4. **IntelliJ-specific Code**: Adapted the code to work with standard Java compilation

## Two Versions Available

### 1. Original Version (with Dependencies)
- **Files**: `Application.java`, `Login.java`, `Register.java`, etc.
- **Requirements**: FlatLaf and MigLayout libraries
- **Status**: Requires external dependencies to compile and run

### 2. Simplified Version (No Dependencies)
- **Files**: `SimpleApplication.java`, `SimpleLogin.java`, `SimpleRegister.java`, etc.
- **Requirements**: Only standard Java Swing
- **Status**: ✅ **WORKING** - Can be compiled and run immediately

## How to Run the Simplified Version

### Option 1: Use the Batch Script (Recommended)
```bash
# Navigate to the project directory
cd social-media-ui-main

# Run the batch script
.\run_simple.bat
```

### Option 2: Manual Compilation
```bash
# Navigate to the project directory
cd social-media-ui-main

# Create target directory
mkdir target\classes

# Compile the simple version
javac -d target\classes src\main\java\raven\main\SimpleApplication.java src\main\java\raven\login\Simple*.java src\main\java\raven\manager\Simple*.java src\main\java\raven\toast\Simple*.java

# Run the application
java -cp "target\classes" raven.main.SimpleApplication
```

## Features

The simplified version includes:

- **Login Form**: Username/password fields with validation
- **Registration Form**: Complete registration with password confirmation
- **Form Switching**: Smooth transitions between login and registration
- **Toast Notifications**: Success/error messages
- **Modern UI**: Clean, professional design using standard Swing
- **Responsive Layout**: Proper spacing and alignment

## System Requirements

- Java 8 or higher
- No external dependencies required

## File Structure

```
social-media-ui-main/
├── src/main/java/raven/
│   ├── main/
│   │   ├── Application.java          # Original version
│   │   └── SimpleApplication.java    # ✅ Working version
│   ├── login/
│   │   ├── Login.java               # Original version
│   │   ├── Register.java            # Original version
│   │   ├── SimpleLogin.java         # ✅ Working version
│   │   └── SimpleRegister.java      # ✅ Working version
│   ├── manager/
│   │   ├── FormsManager.java        # Original version
│   │   └── SimpleFormsManager.java  # ✅ Working version
│   ├── toast/
│   │   ├── Notifications.java       # Custom implementation
│   │   └── SimpleNotifications.java # ✅ Working version
│   └── util/
│       └── MethodUtil.java          # Utility methods
├── run_simple.bat                   # ✅ Easy run script
└── README_FIXED.md                  # This file
```

## Troubleshooting

If you encounter any issues:

1. **Java not found**: Make sure Java is installed and in your PATH
2. **Compilation errors**: Ensure you're using Java 8 or higher
3. **Runtime errors**: Check that all source files are present

## Next Steps

To add the original FlatLaf dependencies:

1. Install Maven
2. Add the required JAR files to a `lib` directory
3. Update the classpath in compilation commands
4. Use the original `Application.java` as the main class

The simplified version provides the same functionality with a clean, modern interface using standard Java Swing components.
