package com.company;

import org.lwjgl.BufferUtils;
import org.lwjgl.nuklear.NkContext;
import org.lwjgl.nuklear.NkRect;
import org.lwjgl.nuklear.NkUserFont;
import org.lwjgl.nuklear.Nuklear;
import org.lwjgl.openal.*;
import org.lwjgl.system.*;

import java.io.IOException;
import java.nio.*;

import static org.lwjgl.nuklear.Nuklear.*;
import static org.lwjgl.openal.AL10.*;
import static org.lwjgl.openal.ALC10.*;
import static org.lwjgl.openal.AL11.alSource3i;

import static org.lwjgl.openal.EXTEfx.*;
import static org.lwjgl.stb.STBVorbis.*;
import static org.lwjgl.system.MemoryStack.*;
import static org.lwjgl.system.MemoryStack.stackMallocInt;
import static org.lwjgl.system.libc.LibCStdlib.*;





public class Main {
    public static void main(String[] args) throws NullPointerException, IOException {

        StructureOptions structureOptions = new StructureOptions();
        structureOptions.starterWriterFileStructure();
        MenuAudio menuAudio = new MenuAudio();
        menuAudio.mainLoop();



    }
}