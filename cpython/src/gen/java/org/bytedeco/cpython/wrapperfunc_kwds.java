// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class wrapperfunc_kwds extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    wrapperfunc_kwds(Pointer p) { super(p); }
    protected wrapperfunc_kwds() { allocate(); }
    private native void allocate();
    public native PyObject call(PyObject self, PyObject args,
                                      Pointer wrapped, PyObject kwds);
}
