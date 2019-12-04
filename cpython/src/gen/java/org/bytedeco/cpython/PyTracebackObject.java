// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyTracebackObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyTracebackObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyTracebackObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyTracebackObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyTracebackObject position(long position) {
        return (PyTracebackObject)super.position(position);
    }

    public native @ByRef PyObject ob_base(); public native PyTracebackObject ob_base(PyObject setter);
    public native @Cast("_traceback*") PyTracebackObject tb_next(); public native PyTracebackObject tb_next(PyTracebackObject setter);
    public native _frame tb_frame(); public native PyTracebackObject tb_frame(_frame setter);
    public native int tb_lasti(); public native PyTracebackObject tb_lasti(int setter);
    public native int tb_lineno(); public native PyTracebackObject tb_lineno(int setter);
}
