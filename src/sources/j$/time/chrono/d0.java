package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public d0(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objX;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.a;
                objX = a.x(objectInput.readUTF());
                break;
            case 2:
                objX = ((ChronoLocalDate) objectInput.readObject()).F((LocalTime) objectInput.readObject());
                break;
            case 3:
                objX = ((ChronoLocalDateTime) objectInput.readObject()).B((ZoneOffset) objectInput.readObject()).A((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = w.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                u.c.getClass();
                objX = new w(LocalDate.of(i, b2, b3));
                break;
            case 5:
                x xVar = x.d;
                objX = x.q(objectInput.readByte());
                break;
            case 6:
                n nVar = (n) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                nVar.getClass();
                objX = new p(nVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                z.c.getClass();
                objX = new b0(LocalDate.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                f0.c.getClass();
                objX = new h0(LocalDate.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = f.e;
                objX = new f(a.x(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objX;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((a) obj).getId());
                return;
            case 2:
                e eVar = (e) obj;
                objectOutput.writeObject(eVar.a);
                objectOutput.writeObject(eVar.b);
                return;
            case 3:
                j jVar = (j) obj;
                objectOutput.writeObject(jVar.a);
                objectOutput.writeObject(jVar.b);
                objectOutput.writeObject(jVar.c);
                return;
            case 4:
                w wVar = (w) obj;
                wVar.getClass();
                objectOutput.writeInt(wVar.h(ChronoField.YEAR));
                objectOutput.writeByte(wVar.h(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(wVar.h(ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((x) obj).a);
                return;
            case 6:
                p pVar = (p) obj;
                objectOutput.writeObject(pVar.a);
                objectOutput.writeInt(pVar.h(ChronoField.YEAR));
                objectOutput.writeByte(pVar.h(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(pVar.h(ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                objectOutput.writeInt(b0Var.h(ChronoField.YEAR));
                objectOutput.writeByte(b0Var.h(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(b0Var.h(ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                h0 h0Var = (h0) obj;
                h0Var.getClass();
                objectOutput.writeInt(h0Var.h(ChronoField.YEAR));
                objectOutput.writeByte(h0Var.h(ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(h0Var.h(ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                f fVar = (f) obj;
                objectOutput.writeUTF(fVar.a.getId());
                objectOutput.writeInt(fVar.b);
                objectOutput.writeInt(fVar.c);
                objectOutput.writeInt(fVar.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    public d0() {
    }
}
