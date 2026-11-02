package defpackage;

import android.view.ViewTreeObserver;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public class vt1 implements gn2 {
    public final /* synthetic */ byte X;
    public final Object Y;
    public final Object Z;
    public final Object f0;

    public /* synthetic */ vt1(Object obj, Object obj2, Object obj3, byte b) {
        this.X = b;
        this.Y = obj;
        this.Z = obj2;
        this.f0 = obj3;
    }

    public static /* synthetic */ void c(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:21:0x0066, B:24:0x0071, B:26:0x0077, B:28:0x007b, B:33:0x0086, B:34:0x0089, B:36:0x008c, B:38:0x0092, B:40:0x0096, B:41:0x0099, B:42:0x009c, B:44:0x009f, B:58:0x00c1, B:62:0x00cd, B:63:0x00d1, B:64:0x00d2, B:65:0x00d4, B:70:0x00dd, B:72:0x00e8, B:73:0x00ec, B:74:0x00ed, B:75:0x00f0, B:77:0x00f4, B:78:0x00f7, B:80:0x00f9, B:81:0x00fd, B:67:0x00d6, B:68:0x00da, B:47:0x00a6, B:51:0x00b3, B:55:0x00bb, B:56:0x00bf, B:60:0x00c7, B:76:0x00f1), top: B:93:0x0066, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0092 A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:21:0x0066, B:24:0x0071, B:26:0x0077, B:28:0x007b, B:33:0x0086, B:34:0x0089, B:36:0x008c, B:38:0x0092, B:40:0x0096, B:41:0x0099, B:42:0x009c, B:44:0x009f, B:58:0x00c1, B:62:0x00cd, B:63:0x00d1, B:64:0x00d2, B:65:0x00d4, B:70:0x00dd, B:72:0x00e8, B:73:0x00ec, B:74:0x00ed, B:75:0x00f0, B:77:0x00f4, B:78:0x00f7, B:80:0x00f9, B:81:0x00fd, B:67:0x00d6, B:68:0x00da, B:47:0x00a6, B:51:0x00b3, B:55:0x00bb, B:56:0x00bf, B:60:0x00c7, B:76:0x00f1), top: B:93:0x0066, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0096 A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:21:0x0066, B:24:0x0071, B:26:0x0077, B:28:0x007b, B:33:0x0086, B:34:0x0089, B:36:0x008c, B:38:0x0092, B:40:0x0096, B:41:0x0099, B:42:0x009c, B:44:0x009f, B:58:0x00c1, B:62:0x00cd, B:63:0x00d1, B:64:0x00d2, B:65:0x00d4, B:70:0x00dd, B:72:0x00e8, B:73:0x00ec, B:74:0x00ed, B:75:0x00f0, B:77:0x00f4, B:78:0x00f7, B:80:0x00f9, B:81:0x00fd, B:67:0x00d6, B:68:0x00da, B:47:0x00a6, B:51:0x00b3, B:55:0x00bb, B:56:0x00bf, B:60:0x00c7, B:76:0x00f1), top: B:93:0x0066, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0099 A[Catch: all -> 0x0081, TryCatch #1 {all -> 0x0081, blocks: (B:21:0x0066, B:24:0x0071, B:26:0x0077, B:28:0x007b, B:33:0x0086, B:34:0x0089, B:36:0x008c, B:38:0x0092, B:40:0x0096, B:41:0x0099, B:42:0x009c, B:44:0x009f, B:58:0x00c1, B:62:0x00cd, B:63:0x00d1, B:64:0x00d2, B:65:0x00d4, B:70:0x00dd, B:72:0x00e8, B:73:0x00ec, B:74:0x00ed, B:75:0x00f0, B:77:0x00f4, B:78:0x00f7, B:80:0x00f9, B:81:0x00fd, B:67:0x00d6, B:68:0x00da, B:47:0x00a6, B:51:0x00b3, B:55:0x00bb, B:56:0x00bf, B:60:0x00c7, B:76:0x00f1), top: B:93:0x0066, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x009f A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #1 {all -> 0x0081, blocks: (B:21:0x0066, B:24:0x0071, B:26:0x0077, B:28:0x007b, B:33:0x0086, B:34:0x0089, B:36:0x008c, B:38:0x0092, B:40:0x0096, B:41:0x0099, B:42:0x009c, B:44:0x009f, B:58:0x00c1, B:62:0x00cd, B:63:0x00d1, B:64:0x00d2, B:65:0x00d4, B:70:0x00dd, B:72:0x00e8, B:73:0x00ec, B:74:0x00ed, B:75:0x00f0, B:77:0x00f4, B:78:0x00f7, B:80:0x00f9, B:81:0x00fd, B:67:0x00d6, B:68:0x00da, B:47:0x00a6, B:51:0x00b3, B:55:0x00bb, B:56:0x00bf, B:60:0x00c7, B:76:0x00f1), top: B:93:0x0066, inners: #0, #2, #3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00bb A[Catch: all -> 0x00c0, TryCatch #0 {all -> 0x00c0, blocks: (B:47:0x00a6, B:51:0x00b3, B:55:0x00bb, B:56:0x00bf), top: B:91:0x00a6, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.gn2
    public Object B(Object obj) {
        Object objPut;
        h70 h70VarD;
        byte b = this.X;
        dn8 dn8Var = dn8.a;
        Object obj2 = this.Y;
        Object obj3 = this.Z;
        Object obj4 = this.f0;
        switch (b) {
            case 0:
                ye8 ye8Var = (ye8) obj;
                wt1 wt1Var = (wt1) ye8Var;
                if (!((pd) yn0.a0((wt1) obj3).getDragAndDropManager()).b.contains(wt1Var) || !mb6.u(wt1Var, x97.A((pt1) obj4))) {
                    return xe8.X;
                }
                ((ea6) obj2).X = ye8Var;
                return xe8.Z;
            case 1:
                ve4 ve4Var = (ve4) obj2;
                qe4 qe4Var = ve4Var.b;
                t97 t97Var = ve4Var.a;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) obj3;
                Object obj5 = concurrentHashMap.get(obj);
                Object obj6 = j59.a;
                AssertionError assertionErrorF = null;
                ue4 ue4Var = ue4.Y;
                if (obj5 != null && obj5 != ue4Var) {
                    j59.a(obj5);
                    if (obj5 == obj6) {
                        return null;
                    }
                    return obj5;
                }
                t97Var.lock();
                try {
                    Object objB = concurrentHashMap.get(obj);
                    ue4 ue4Var2 = ue4.Z;
                    if (objB == ue4Var) {
                        h70 h70VarD2 = ve4Var.d(obj, _UrlKt.FRAGMENT_ENCODE_SET);
                        if (h70VarD2 == null) {
                            c(3);
                            throw null;
                        }
                        if (h70VarD2.Y) {
                            objB = ue4Var2;
                            if (objB != ue4Var2) {
                                h70VarD = ve4Var.d(obj, _UrlKt.FRAGMENT_ENCODE_SET);
                                if (h70VarD != null) {
                                    c(3);
                                    throw null;
                                }
                                if (!h70VarD.Y) {
                                    objB = h70VarD.Z;
                                } else {
                                    if (objB != null) {
                                        concurrentHashMap.put(obj, ue4Var);
                                        objB = ((gn2) obj4).B(obj);
                                        if (objB == null) {
                                            obj6 = objB;
                                        }
                                        objPut = concurrentHashMap.put(obj, obj6);
                                        if (objPut == ue4Var) {
                                            assertionErrorF = f(obj, objPut);
                                            throw assertionErrorF;
                                        }
                                        t97Var.unlock();
                                        throw th;
                                    }
                                    j59.a(objB);
                                    if (objB == obj6) {
                                        objB = null;
                                    }
                                }
                            } else {
                                if (objB != null) {
                                    concurrentHashMap.put(obj, ue4Var);
                                    objB = ((gn2) obj4).B(obj);
                                    if (objB == null) {
                                        obj6 = objB;
                                    }
                                    objPut = concurrentHashMap.put(obj, obj6);
                                    if (objPut == ue4Var) {
                                        assertionErrorF = f(obj, objPut);
                                        throw assertionErrorF;
                                    }
                                    t97Var.unlock();
                                    throw th;
                                }
                                j59.a(objB);
                                if (objB == obj6) {
                                    objB = null;
                                }
                            }
                        } else {
                            objB = h70VarD2.Z;
                        }
                    } else if (objB != ue4Var2) {
                        h70VarD = ve4Var.d(obj, _UrlKt.FRAGMENT_ENCODE_SET);
                        if (h70VarD != null) {
                            c(3);
                            throw null;
                        }
                        if (!h70VarD.Y) {
                            objB = h70VarD.Z;
                        } else {
                            if (objB != null) {
                                concurrentHashMap.put(obj, ue4Var);
                                objB = ((gn2) obj4).B(obj);
                                if (objB == null) {
                                    obj6 = objB;
                                }
                                objPut = concurrentHashMap.put(obj, obj6);
                                if (objPut == ue4Var) {
                                    assertionErrorF = f(obj, objPut);
                                    throw assertionErrorF;
                                }
                                t97Var.unlock();
                                throw th;
                            }
                            j59.a(objB);
                            if (objB == obj6) {
                                objB = null;
                            }
                        }
                    } else {
                        if (objB != null) {
                            try {
                                concurrentHashMap.put(obj, ue4Var);
                                objB = ((gn2) obj4).B(obj);
                                if (objB == null) {
                                    obj6 = objB;
                                }
                                objPut = concurrentHashMap.put(obj, obj6);
                                if (objPut == ue4Var) {
                                    assertionErrorF = f(obj, objPut);
                                    throw assertionErrorF;
                                }
                            } catch (Throwable th) {
                                if (dh3.A(th)) {
                                    try {
                                        Object objRemove = concurrentHashMap.remove(obj);
                                        if (objRemove != ue4Var) {
                                            throw e(obj, objRemove);
                                        }
                                        throw th;
                                    } catch (Throwable th2) {
                                        throw g(obj, th2);
                                    }
                                }
                                if (th != assertionErrorF) {
                                    Object objPut2 = concurrentHashMap.put(obj, new i59(th));
                                    if (objPut2 != ue4Var) {
                                        throw f(obj, objPut2);
                                    }
                                    qe4Var.getClass();
                                    throw th;
                                }
                                try {
                                    concurrentHashMap.remove(obj);
                                    qe4Var.getClass();
                                    throw th;
                                } catch (Throwable th3) {
                                    throw g(obj, th3);
                                }
                            }
                            t97Var.unlock();
                            throw th;
                        }
                        j59.a(objB);
                        if (objB == obj6) {
                            objB = null;
                        }
                    }
                    t97Var.unlock();
                    return objB;
                } catch (Throwable th4) {
                    t97Var.unlock();
                    throw th4;
                }
            case 2:
                f86 f86Var = (f86) obj2;
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) obj3;
                vx8 vx8Var = (vx8) obj4;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(vx8Var);
                } else {
                    f86Var.X.getViewTreeObserver().removeOnPreDrawListener(vx8Var);
                }
                return dn8Var;
            default:
                f39 f39Var = (f39) obj4;
                g94 g94Var = (g94) obj3;
                hv2 hv2Var = (hv2) obj2;
                b02 b02Var = b02.X;
                if (hv2Var.b1(b02Var)) {
                    hv2Var.Z0(b02Var, new e39(g94Var, f39Var, (byte) 1));
                } else {
                    g94Var.f(f39Var);
                }
                return dn8Var;
        }
    }

    public AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + ue4.Y + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + ((ve4) this.Y));
        ve4.e(assertionError);
        return assertionError;
    }

    public AssertionError f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + ((ve4) this.Y));
        ve4.e(assertionError);
        return assertionError;
    }

    public AssertionError g(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + ((ve4) this.Y), th);
        ve4.e(assertionError);
        return assertionError;
    }
}
