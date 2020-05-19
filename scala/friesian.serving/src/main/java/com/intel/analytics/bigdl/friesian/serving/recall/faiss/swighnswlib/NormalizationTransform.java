/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.intel.analytics.bigdl.friesian.serving.recall.faiss.swighnswlib;

public class NormalizationTransform extends VectorTransform {
  private transient long swigCPtr;

  protected NormalizationTransform(long cPtr, boolean cMemoryOwn) {
    super(swigfaissJNI.NormalizationTransform_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NormalizationTransform obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_NormalizationTransform(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setNorm(float value) {
    swigfaissJNI.NormalizationTransform_norm_set(swigCPtr, this, value);
  }

  public float getNorm() {
    return swigfaissJNI.NormalizationTransform_norm_get(swigCPtr, this);
  }

  public NormalizationTransform(int d, float norm) {
    this(swigfaissJNI.new_NormalizationTransform__SWIG_0(d, norm), true);
  }

  public NormalizationTransform(int d) {
    this(swigfaissJNI.new_NormalizationTransform__SWIG_1(d), true);
  }

  public NormalizationTransform() {
    this(swigfaissJNI.new_NormalizationTransform__SWIG_2(), true);
  }

  public void apply_noalloc(int n, SWIGTYPE_p_float x, SWIGTYPE_p_float xt) {
    swigfaissJNI.NormalizationTransform_apply_noalloc(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(x), SWIGTYPE_p_float.getCPtr(xt));
  }

  public void reverse_transform(int n, SWIGTYPE_p_float xt, SWIGTYPE_p_float x) {
    swigfaissJNI.NormalizationTransform_reverse_transform(swigCPtr, this, n, SWIGTYPE_p_float.getCPtr(xt), SWIGTYPE_p_float.getCPtr(x));
  }

}