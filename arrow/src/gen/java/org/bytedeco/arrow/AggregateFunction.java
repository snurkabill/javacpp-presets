// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


///
@Namespace("arrow::compute") @Opaque @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class AggregateFunction extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AggregateFunction() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AggregateFunction(Pointer p) { super(p); }
}
