package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class l03 {
    public static final Range f = new Range(120, 120);
    public final jj0 a;
    public final vz7 b;
    public final vz7 c;
    public final vz7 d;
    public final vz7 e;

    public l03(jj0 jj0Var) {
        jj0Var.getClass();
        this.a = jj0Var;
        final byte b = 0;
        this.b = new vz7(new dn2(this) { // from class: k03
            public final /* synthetic */ l03 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b2 = b;
                l03 l03Var = this.Y;
                switch (b2) {
                    case 0:
                        jj0 jj0Var2 = l03Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((lf0) jj0Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i : iArr) {
                                if (i == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) l03Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            bt.n();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = cb7.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = cb7.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        jj0 jj0Var3 = l03Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((lf0) jj0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new vk7(streamConfigurationMap, new ue5(jj0Var3));
                        }
                        bt.q("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((vk7) l03Var.d.getValue()).c.X;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? eu.K0(highSpeedVideoSizes) : d02.X;
                }
            }
        });
        final byte b2 = 1;
        this.c = new vz7(new dn2(this) { // from class: k03
            public final /* synthetic */ l03 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b3 = b2;
                l03 l03Var = this.Y;
                switch (b3) {
                    case 0:
                        jj0 jj0Var2 = l03Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((lf0) jj0Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i : iArr) {
                                if (i == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) l03Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            bt.n();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = cb7.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = cb7.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        jj0 jj0Var3 = l03Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((lf0) jj0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new vk7(streamConfigurationMap, new ue5(jj0Var3));
                        }
                        bt.q("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((vk7) l03Var.d.getValue()).c.X;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? eu.K0(highSpeedVideoSizes) : d02.X;
                }
            }
        });
        final byte b3 = 2;
        this.d = new vz7(new dn2(this) { // from class: k03
            public final /* synthetic */ l03 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b4 = b3;
                l03 l03Var = this.Y;
                switch (b4) {
                    case 0:
                        jj0 jj0Var2 = l03Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((lf0) jj0Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i : iArr) {
                                if (i == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) l03Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            bt.n();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = cb7.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = cb7.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        jj0 jj0Var3 = l03Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((lf0) jj0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new vk7(streamConfigurationMap, new ue5(jj0Var3));
                        }
                        bt.q("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((vk7) l03Var.d.getValue()).c.X;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? eu.K0(highSpeedVideoSizes) : d02.X;
                }
            }
        });
        final byte b4 = 3;
        this.e = new vz7(new dn2(this) { // from class: k03
            public final /* synthetic */ l03 Y;

            {
                this.Y = this;
            }

            @Override // defpackage.dn2
            public final Object invoke() {
                byte b5 = b4;
                l03 l03Var = this.Y;
                switch (b5) {
                    case 0:
                        jj0 jj0Var2 = l03Var.a;
                        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
                        key.getClass();
                        int[] iArr = (int[]) ((lf0) jj0Var2).c(key);
                        boolean z = false;
                        if (iArr != null) {
                            for (int i : iArr) {
                                if (i == 9) {
                                    z = true;
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    case 1:
                        List list = (List) l03Var.e.getValue();
                        if (list.isEmpty()) {
                            list = null;
                        }
                        if (list == null) {
                            return null;
                        }
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            bt.n();
                            return null;
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int iA = cb7.a((Size) next);
                            do {
                                Object next2 = it.next();
                                int iA2 = cb7.a((Size) next2);
                                if (iA < iA2) {
                                    next = next2;
                                    iA = iA2;
                                }
                            } while (it.hasNext());
                        }
                        return (Size) next;
                    case 2:
                        jj0 jj0Var3 = l03Var.a;
                        CameraCharacteristics.Key key2 = CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP;
                        key2.getClass();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) ((lf0) jj0Var3).c(key2);
                        if (streamConfigurationMap != null) {
                            return new vk7(streamConfigurationMap, new ue5(jj0Var3));
                        }
                        bt.q("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
                        return null;
                    default:
                        StreamConfigurationMap streamConfigurationMap2 = (StreamConfigurationMap) ((vk7) l03Var.d.getValue()).c.X;
                        Size[] highSpeedVideoSizes = streamConfigurationMap2 != null ? streamConfigurationMap2.getHighSpeedVideoSizes() : null;
                        return highSpeedVideoSizes != null ? eu.K0(highSpeedVideoSizes) : d02.X;
                }
            }
        });
    }

    public static List a(List list) {
        if (list.isEmpty()) {
            return d02.X;
        }
        ArrayList arrayListZ0 = wv0.Z0((Collection) wv0.r0(list));
        Iterator it = wv0.o0(list, 1).iterator();
        while (it.hasNext()) {
            arrayListZ0.retainAll((List) it.next());
        }
        return arrayListZ0;
    }

    public final Range[] b(List list) {
        int size = list.size();
        if (1 <= size && size < 3 && wv0.Y0(wv0.b1(list)).size() == 1) {
            List listC = c((Size) list.get(0));
            if (listC.isEmpty()) {
                listC = null;
            }
            if (listC != null) {
                if (list.size() == 2) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listC) {
                        Range range = (Range) obj;
                        if (dh3.f(range.getLower(), range.getUpper())) {
                            arrayList.add(obj);
                        }
                    }
                    listC = arrayList;
                }
                return (Range[]) listC.toArray(new Range[0]);
            }
        }
        return null;
    }

    public final List c(Size size) {
        Object rj6Var;
        try {
            vk7 vk7Var = (vk7) this.d.getValue();
            vk7Var.getClass();
            size.getClass();
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) vk7Var.c.X;
            rj6Var = streamConfigurationMap != null ? streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size) : null;
        } catch (Throwable th) {
            rj6Var = new rj6(th);
        }
        Range[] rangeArr = (Range[]) (rj6Var instanceof rj6 ? null : rj6Var);
        return rangeArr != null ? wv0.Y0(eu.q0(rangeArr)) : d02.X;
    }
}
