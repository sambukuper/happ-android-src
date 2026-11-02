package defpackage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import javax.net.SocketFactory;

/* JADX INFO: compiled from: r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5 */
/* JADX INFO: loaded from: classes.dex */
public final class rw extends SocketFactory {
    public final int a;
    public final String b;
    public final String c;
    public final int d;

    public rw(String str, int i, int i2, String str2) {
        str.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
    }

    public final Socket a(int i, String str) throws Exception {
        Socket socket = new Socket();
        try {
            socket.connect(new InetSocketAddress("127.0.0.1", this.a), this.d);
            if (str == null) {
                return socket;
            }
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream.write(new byte[]{5, 1, 2});
            dataOutputStream.flush();
            byte b = dataInputStream.readByte();
            byte b2 = dataInputStream.readByte();
            if (b != 5 || b2 != 2) {
                throw new RuntimeException("SOCKS5 Proxy must support User/Pass authentication");
            }
            String str2 = this.b;
            Charset charset = iq0.a;
            byte[] bytes = str2.getBytes(charset);
            bytes.getClass();
            byte[] bytes2 = this.c.getBytes(charset);
            bytes2.getClass();
            dataOutputStream.writeByte(1);
            dataOutputStream.writeByte(bytes.length);
            dataOutputStream.write(bytes);
            dataOutputStream.writeByte(bytes2.length);
            dataOutputStream.write(bytes2);
            dataOutputStream.flush();
            dataInputStream.readByte();
            if (dataInputStream.readByte() != 0) {
                throw new RuntimeException("SOCKS5 Authentication failed");
            }
            dataOutputStream.writeByte(5);
            dataOutputStream.writeByte(1);
            int i2 = 0;
            dataOutputStream.writeByte(0);
            dataOutputStream.writeByte(3);
            byte[] bytes3 = str.getBytes(charset);
            bytes3.getClass();
            dataOutputStream.writeByte(bytes3.length);
            dataOutputStream.write(bytes3);
            dataOutputStream.writeShort(i);
            dataOutputStream.flush();
            dataInputStream.readByte();
            byte b3 = dataInputStream.readByte();
            if (b3 != 0) {
                throw new RuntimeException("SOCKS5 Connect failed with code: " + ((int) b3));
            }
            dataInputStream.readByte();
            byte b4 = dataInputStream.readByte();
            if (b4 == 1) {
                i2 = 6;
            } else if (b4 == 3) {
                i2 = dataInputStream.readByte() + 2;
            } else if (b4 == 4) {
                i2 = 18;
            }
            dataInputStream.skipBytes(i2);
            return socket;
        } catch (Exception e) {
            socket.close();
            throw e;
        }
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        inetAddress.getClass();
        inetAddress2.getClass();
        return a(i, inetAddress.getHostAddress());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i) {
        str.getClass();
        return a(i, str);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        str.getClass();
        inetAddress.getClass();
        return a(i, str);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i) {
        inetAddress.getClass();
        return a(i, inetAddress.getHostAddress());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() {
        return new Socket();
    }
}
