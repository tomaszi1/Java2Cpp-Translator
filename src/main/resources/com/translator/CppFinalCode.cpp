class JavaClass {
};

class System {
    static void out_println(string c);
};

void main(int argc, char* argv[]) {
    System::out_println("Costam");
}

void System::out_println(string c) {
    cout << c;
}