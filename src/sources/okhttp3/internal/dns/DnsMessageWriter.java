package okhttp3.internal.dns;

import defpackage.b61;
import defpackage.bt;
import defpackage.ct7;
import defpackage.dh3;
import defpackage.i90;
import defpackage.kb0;
import defpackage.ra;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import okhttp3.Protocol;
import okhttp3.internal.url._UrlKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000f\u001a\u00020\b*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lokhttp3/internal/dns/DnsMessageWriter;", _UrlKt.FRAGMENT_ENCODE_SET, "Li90;", "sink", "<init>", "(Li90;)V", "Lokhttp3/internal/dns/Question;", "question", "Ldn8;", "writeQuestion", "(Lokhttp3/internal/dns/Question;)V", "Lkb0;", "name", _UrlKt.FRAGMENT_ENCODE_SET, "receiverOffset", "writeName", "(Li90;Lkb0;J)V", "Lokhttp3/internal/dns/ResourceRecord;", "resourceRecord", "writeResourceRecord", "(Lokhttp3/internal/dns/ResourceRecord;)V", "Lokhttp3/internal/dns/ResourceRecord$IpAddress;", "record", "writeIpAddress", "(Lokhttp3/internal/dns/ResourceRecord$IpAddress;)V", "Lokhttp3/internal/dns/ResourceRecord$Https;", "writeHttps", "(Lokhttp3/internal/dns/ResourceRecord$Https;)V", "Lokhttp3/internal/dns/DnsMessage;", "message", "write", "(Lokhttp3/internal/dns/DnsMessage;)V", "Li90;", _UrlKt.FRAGMENT_ENCODE_SET, "labelToOffset", "Ljava/util/Map;", "messageStart", "J", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DnsMessageWriter {
    private final Map<kb0, Long> labelToOffset;
    private final long messageStart;
    private final i90 sink;

    public DnsMessageWriter(i90 i90Var) {
        i90Var.getClass();
        this.sink = i90Var;
        this.labelToOffset = new LinkedHashMap();
        this.messageStart = i90Var.Y;
    }

    private final void writeHttps(ResourceRecord.Https record) {
        i90 i90Var = this.sink;
        kb0 kb0Var = kb0.f0;
        writeName$default(this, i90Var, ra.g(record.getName()), 0L, 2, null);
        this.sink.a1(65);
        this.sink.a1(1);
        this.sink.Z0(record.getTimeToLive());
        i90 i90Var2 = new i90();
        i90Var2.a1(record.getPriority());
        writeName(i90Var2, ra.g(record.getTargetName()), this.sink.Y + 2);
        if (record.getAlpnIds() != null) {
            i90Var2.a1(1);
            List<String> alpnIds = record.getAlpnIds();
            ArrayList<String> arrayList = new ArrayList();
            for (Object obj : alpnIds) {
                if (!dh3.f((String) obj, Protocol.HTTP_1_1.getProtocol())) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            long jG = 0;
            while (it.hasNext()) {
                jG += ct7.g((String) it.next()) + 1;
            }
            i90Var2.a1((int) jG);
            for (String str : arrayList) {
                i90Var2.H0((int) ct7.g(str));
                i90Var2.d1(str);
            }
            if (!record.getAlpnIds().contains(Protocol.HTTP_1_1.getProtocol())) {
                i90Var2.a1(2);
                i90Var2.a1(0);
            }
        }
        if (record.getPort() != 443) {
            i90Var2.a1(3);
            i90Var2.a1(2);
            i90Var2.a1(record.getPort());
        }
        List<InetAddress> ipAddressHints = record.getIpAddressHints();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : ipAddressHints) {
            if (obj2 instanceof Inet4Address) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            i90Var2.a1(4);
            i90Var2.a1(arrayList2.size() * 4);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                byte[] address = ((Inet4Address) it2.next()).getAddress();
                address.getClass();
                i90Var2.write(address, 0, address.length);
            }
        }
        if (record.getEchConfigList() != null) {
            i90Var2.a1(5);
            i90Var2.a1(record.getEchConfigList().e());
            i90Var2.C0(record.getEchConfigList());
        }
        List<InetAddress> ipAddressHints2 = record.getIpAddressHints();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : ipAddressHints2) {
            if (obj3 instanceof Inet6Address) {
                arrayList3.add(obj3);
            }
        }
        if (!arrayList3.isEmpty()) {
            i90Var2.a1(6);
            i90Var2.a1(arrayList3.size() * 16);
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                byte[] address2 = ((Inet6Address) it3.next()).getAddress();
                address2.getClass();
                i90Var2.write(address2, 0, address2.length);
            }
        }
        long j = i90Var2.Y;
        if (j >= WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            bt.i("record too long");
        } else {
            this.sink.a1((int) j);
            this.sink.M(i90Var2);
        }
    }

    private final void writeIpAddress(ResourceRecord.IpAddress record) {
        int i;
        byte[] address = record.getAddress().getAddress();
        i90 i90Var = this.sink;
        kb0 kb0Var = kb0.f0;
        writeName$default(this, i90Var, ra.g(record.getName()), 0L, 2, null);
        i90 i90Var2 = this.sink;
        int length = address.length;
        if (length == 4) {
            i = 1;
        } else {
            if (length != 16) {
                bt.i("unexpected address");
                return;
            }
            i = 28;
        }
        i90Var2.a1(i);
        this.sink.a1(1);
        this.sink.Z0(record.getTimeToLive());
        this.sink.a1(address.length);
        i90 i90Var3 = this.sink;
        i90Var3.getClass();
        i90Var3.write(address, 0, address.length);
    }

    private final void writeName(i90 i90Var, kb0 kb0Var, long j) {
        while (kb0Var.e() != 0) {
            Long l = this.labelToOffset.get(kb0Var);
            if (l != null) {
                i90Var.a1(((int) l.longValue()) | 49152);
                return;
            }
            this.labelToOffset.put(kb0Var, Long.valueOf((i90Var.Y + j) - this.messageStart));
            int iH = kb0.h(kb0Var, _DnsMessageWriterKt.LABEL_SEPARATOR);
            if (iH == -1) {
                if (kb0Var.e() >= 64) {
                    bt.i("label too long");
                    return;
                }
                i90Var.H0(kb0Var.e());
                i90Var.C0(kb0Var);
                i90Var.H0(0);
                return;
            }
            if (iH >= 64) {
                bt.i("label too long");
                return;
            } else {
                i90Var.H0(iH);
                kb0Var.u(iH, i90Var);
                kb0Var = kb0.q(kb0Var, iH + 1, 0, 2);
            }
        }
        i90Var.H0(0);
    }

    public static /* synthetic */ void writeName$default(DnsMessageWriter dnsMessageWriter, i90 i90Var, kb0 kb0Var, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        dnsMessageWriter.writeName(i90Var, kb0Var, j);
    }

    private final void writeQuestion(Question question) {
        i90 i90Var = this.sink;
        kb0 kb0Var = kb0.f0;
        writeName$default(this, i90Var, ra.g(question.getName()), 0L, 2, null);
        this.sink.a1(question.getType());
        this.sink.a1(question.getClass());
    }

    private final void writeResourceRecord(ResourceRecord resourceRecord) {
        if (resourceRecord instanceof ResourceRecord.Https) {
            writeHttps((ResourceRecord.Https) resourceRecord);
        } else if (resourceRecord instanceof ResourceRecord.IpAddress) {
            writeIpAddress((ResourceRecord.IpAddress) resourceRecord);
        } else {
            b61.c();
        }
    }

    public final void write(DnsMessage message) {
        message.getClass();
        this.sink.a1(message.getId());
        this.sink.a1(message.getFlags());
        this.sink.a1(message.getQuestions().size());
        this.sink.a1(message.getAnswers().size());
        this.sink.a1(message.getAuthorityRecords().size());
        this.sink.a1(message.getAdditionalRecords().size());
        Iterator<Question> it = message.getQuestions().iterator();
        while (it.hasNext()) {
            writeQuestion(it.next());
        }
        Iterator<ResourceRecord> it2 = message.getAnswers().iterator();
        while (it2.hasNext()) {
            writeResourceRecord(it2.next());
        }
        Iterator<ResourceRecord> it3 = message.getAuthorityRecords().iterator();
        while (it3.hasNext()) {
            writeResourceRecord(it3.next());
        }
        Iterator<ResourceRecord> it4 = message.getAdditionalRecords().iterator();
        while (it4.hasNext()) {
            writeResourceRecord(it4.next());
        }
    }
}
