package okhttp3.internal.dns;

import defpackage.ba0;
import defpackage.d02;
import defpackage.i90;
import defpackage.j76;
import defpackage.kb0;
import defpackage.li4;
import defpackage.pc6;
import defpackage.t94;
import defpackage.x97;
import defpackage.xw3;
import java.io.EOFException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ProtocolException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\t*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\n\u001a\u00020\u0010*\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0082\u0010¢\u0006\u0004\b\n\u0010\u0011J#\u0010\u0015\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001e¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/dns/DnsMessageReader;", _UrlKt.FRAGMENT_ENCODE_SET, "Lba0;", "source", "<init>", "(Lba0;)V", "Lokhttp3/internal/dns/Question;", "readQuestion", "(Lba0;)Lokhttp3/internal/dns/Question;", _UrlKt.FRAGMENT_ENCODE_SET, "readName", "(Lba0;)Ljava/lang/String;", "Li90;", "sink", _UrlKt.FRAGMENT_ENCODE_SET, "maxOffset", "Ldn8;", "(Lba0;Li90;I)V", "name", "timeToLive", "Lokhttp3/internal/dns/ResourceRecord$Https;", "readHttpsResourceRecord", "(Lba0;Ljava/lang/String;I)Lokhttp3/internal/dns/ResourceRecord$Https;", "Lokhttp3/internal/dns/DnsMessage;", "read", "()Lokhttp3/internal/dns/DnsMessage;", "Lokhttp3/internal/dns/ResourceRecord;", "readResourceRecord", "(Lba0;)Lokhttp3/internal/dns/ResourceRecord;", "sourceOffsetZero", "Lba0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DnsMessageReader {
    private final ba0 source;
    private final ba0 sourceOffsetZero;

    public DnsMessageReader(ba0 ba0Var) {
        ba0Var.getClass();
        this.sourceOffsetZero = ba0Var;
        this.source = ba0Var.peek();
    }

    private final ResourceRecord.Https readHttpsResourceRecord(ba0 ba0Var, String str, int i) throws ProtocolException, EOFException {
        short s;
        boolean z;
        short s2 = ba0Var.readShort();
        String name = readName(ba0Var);
        int i2 = -1;
        boolean z2 = false;
        int i3 = 443;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        kb0 kb0VarS = null;
        while (!ba0Var.F()) {
            i2 = ba0Var.readShort() & 65535;
            if (i2 <= i2) {
                xw3.k("malformed HTTPS resource record");
                return null;
            }
            long j = ((long) ba0Var.readShort()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
            boolean z3 = z2;
            long j2 = 0;
            switch (i2) {
                case 0:
                    s = s2;
                    z = z3;
                    if (j % 2 != 0) {
                        xw3.k("malformed HTTPS / mandatory");
                        return null;
                    }
                    li4 li4VarX = x97.X(2L, x97.b0(j));
                    long j3 = li4VarX.X;
                    long j4 = li4VarX.Y;
                    long j5 = li4VarX.Z;
                    if ((j5 > 0 && j3 <= j4) || (j5 < 0 && j4 <= j3)) {
                        while (true) {
                            int i4 = ba0Var.readShort() & 65535;
                            if (i4 < 0 || i4 >= 7) {
                                throw new ProtocolException(pc6.j(i4, "unsupported HTTPS mandatory parameter "));
                            }
                            if (j3 != j4) {
                                j3 += j5;
                            }
                        }
                    }
                    s2 = s;
                    arrayList = arrayList;
                    z2 = z;
                    break;
                    break;
                case 1:
                    s = s2;
                    z = z3;
                    arrayList2 = new ArrayList();
                    while (j2 < j) {
                        long j6 = ((long) ba0Var.readByte()) & 255;
                        j2 = j2 + 1 + j6;
                        if (j2 > j) {
                            xw3.k("malformed HTTPS / alpn");
                            return null;
                        }
                        arrayList2.add(ba0Var.o(j6));
                    }
                    s2 = s;
                    arrayList = arrayList;
                    z2 = z;
                    break;
                case 2:
                    short s3 = s2;
                    if (j != 0) {
                        xw3.k("malformed HTTPS / no-default-alpn");
                        return null;
                    }
                    z2 = true;
                    i2 = i2;
                    s2 = s3;
                    break;
                    break;
                case 3:
                    s = s2;
                    z = z3;
                    if (j != 2) {
                        xw3.k("malformed HTTPS / port");
                        return null;
                    }
                    i3 = ba0Var.readShort() & 65535;
                    s2 = s;
                    arrayList = arrayList;
                    z2 = z;
                    break;
                    break;
                case 4:
                    s = s2;
                    z = z3;
                    arrayList = new ArrayList();
                    if (j % 4 != 0) {
                        xw3.k("malformed HTTPS / ipv4hint");
                        return null;
                    }
                    li4 li4VarX2 = x97.X(4L, x97.b0(j));
                    long j7 = li4VarX2.X;
                    long j8 = li4VarX2.Y;
                    long j9 = li4VarX2.Z;
                    if ((j9 > 0 && j7 <= j8) || (j9 < 0 && j8 <= j7)) {
                        while (true) {
                            arrayList.add(InetAddress.getByAddress(ba0Var.D0(4L)));
                            if (j7 != j8) {
                                j7 += j9;
                            }
                        }
                    }
                    s2 = s;
                    arrayList = arrayList;
                    z2 = z;
                    break;
                    break;
                case 5:
                    z = z3;
                    kb0VarS = ba0Var.s(j);
                    arrayList = arrayList;
                    z2 = z;
                    break;
                case 6:
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    if (j % 16 != 0) {
                        xw3.k("malformed HTTPS / ipv6hint");
                        return null;
                    }
                    li4 li4VarX3 = x97.X(16L, x97.b0(j));
                    long j10 = li4VarX3.X;
                    long j11 = li4VarX3.Y;
                    s = s2;
                    z = z3;
                    long j12 = li4VarX3.Z;
                    if ((j12 > 0 && j10 <= j11) || (j12 < 0 && j11 <= j10)) {
                        while (true) {
                            arrayList.add(InetAddress.getByAddress(ba0Var.D0(16L)));
                            if (j10 != j11) {
                                j10 += j12;
                            }
                        }
                    }
                    s2 = s;
                    arrayList = arrayList;
                    z2 = z;
                    break;
                    break;
                default:
                    ba0Var.skip(j);
                    s = s2;
                    z = z3;
                    s2 = s;
                    arrayList = arrayList;
                    z2 = z;
                    break;
            }
        }
        short s4 = s2;
        if (z2) {
            if (arrayList2 == null) {
                xw3.k("malformed HTTPS / no-default-alpn");
                return null;
            }
        } else if (arrayList2 != null) {
            Protocol protocol = Protocol.HTTP_1_1;
            if (!arrayList2.contains(protocol.getProtocol())) {
                arrayList2.add(protocol.getProtocol());
            }
        }
        int i5 = s4 & 65535;
        List list = arrayList;
        if (arrayList == null) {
            list = d02.X;
        }
        return new ResourceRecord.Https(str, i, i5, name, arrayList2, i3, list, kb0VarS);
    }

    private final void readName(ba0 ba0Var, i90 i90Var, int i) throws ProtocolException, EOFException {
        while (true) {
            byte b = ba0Var.readByte();
            int i2 = b & 192;
            int i3 = b & 63;
            if (i2 != 0) {
                if (i2 == 64 || i2 == 128) {
                    break;
                }
                if (i2 != 192) {
                    continue;
                } else {
                    int i4 = (ba0Var.readByte() & 255) | (i3 << 8);
                    if (i4 >= i) {
                        xw3.k("malformed DNS message");
                        return;
                    }
                    j76 j76VarPeek = this.sourceOffsetZero.peek();
                    j76VarPeek.skip(i4);
                    i = i4;
                    ba0Var = j76VarPeek;
                }
            } else {
                if (i3 == 0) {
                    return;
                }
                if (i90Var.Y > 0) {
                    i90Var.H0(46);
                }
                i90Var.B0(ba0Var, i3);
            }
        }
        xw3.k("unsupported label type");
    }

    public static /* synthetic */ void readName$default(DnsMessageReader dnsMessageReader, ba0 ba0Var, i90 i90Var, int i, int i2, Object obj) throws ProtocolException, EOFException {
        if ((i2 & 2) != 0) {
            i = Integer.MAX_VALUE;
        }
        dnsMessageReader.readName(ba0Var, i90Var, i);
    }

    private final Question readQuestion(ba0 ba0Var) {
        return new Question(readName(ba0Var), ba0Var.readShort(), ba0Var.readShort());
    }

    public final DnsMessage read() throws IOException {
        ba0 ba0Var;
        short s = this.source.readShort();
        short s2 = this.source.readShort();
        int i = this.source.readShort() & 65535;
        int i2 = this.source.readShort() & 65535;
        int i3 = this.source.readShort() & 65535;
        int i4 = 65535 & this.source.readShort();
        ArrayList arrayList = new ArrayList(i);
        int i5 = 0;
        for (int i6 = 0; i6 < i; i6++) {
            arrayList.add(readQuestion(this.source));
        }
        ArrayList arrayList2 = new ArrayList(i2);
        for (int i7 = 0; i7 < i2; i7++) {
            ResourceRecord resourceRecord = readResourceRecord(this.source);
            if (resourceRecord != null) {
                arrayList2.add(resourceRecord);
            }
        }
        ArrayList arrayList3 = new ArrayList(i3);
        for (int i8 = 0; i8 < i3; i8++) {
            ResourceRecord resourceRecord2 = readResourceRecord(this.source);
            if (resourceRecord2 != null) {
                arrayList3.add(resourceRecord2);
            }
        }
        ArrayList arrayList4 = new ArrayList(i4);
        while (true) {
            ba0Var = this.source;
            if (i5 >= i4) {
                break;
            }
            ResourceRecord resourceRecord3 = readResourceRecord(ba0Var);
            if (resourceRecord3 != null) {
                arrayList4.add(resourceRecord3);
            }
            i5++;
        }
        if (ba0Var.F()) {
            _UtilJvmKt.skipAll(this.sourceOffsetZero);
            return new DnsMessage(s, s2, arrayList, arrayList2, arrayList3, arrayList4);
        }
        xw3.k("unexpected trailing data in message");
        return null;
    }

    public final ResourceRecord readResourceRecord(ba0 ba0Var) throws ProtocolException, EOFException, UnknownHostException {
        ba0Var.getClass();
        String name = readName(ba0Var);
        short s = ba0Var.readShort();
        short s2 = ba0Var.readShort();
        int i = ba0Var.readInt();
        long j = ((long) ba0Var.readShort()) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
        if (s2 == 1 && s == 1) {
            if (j != 4) {
                xw3.k("unexpected record length");
                return null;
            }
            InetAddress byAddress = InetAddress.getByAddress(ba0Var.D0(4L));
            byAddress.getClass();
            return new ResourceRecord.IpAddress(name, i, byAddress);
        }
        if (s2 != 1 || s != 28) {
            if (s2 == 1 && s == 65) {
                return readHttpsResourceRecord(new j76(new t94(ba0Var, j, false)), name, i);
            }
            ba0Var.skip(j);
            return null;
        }
        if (j != 16) {
            xw3.k("unexpected record length");
            return null;
        }
        InetAddress byAddress2 = InetAddress.getByAddress(ba0Var.D0(16L));
        byAddress2.getClass();
        return new ResourceRecord.IpAddress(name, i, byAddress2);
    }

    private final String readName(ba0 ba0Var) throws ProtocolException, EOFException {
        i90 i90Var = new i90();
        readName$default(this, ba0Var, i90Var, 0, 2, null);
        return i90Var.Y();
    }
}
