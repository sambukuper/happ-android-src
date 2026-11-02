.class public final Lokhttp3/internal/ws/WebSocketWriter;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0017\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u000e2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u001a\u0010\u0014J\u001d\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u001d\u0010\u0014J\u000f\u0010\u001e\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010!\u001a\u0004\u0008\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010$\u001a\u0004\u0008%\u0010&R\u0014\u0010\u0008\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010 R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010*R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008,\u0010 R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u00101\u001a\u0004\u0018\u0001008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u00102R\u0016\u00104\u001a\u0004\u0018\u0001038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105\u00a8\u00066"
    }
    d2 = {
        "Lokhttp3/internal/ws/WebSocketWriter;",
        "Ljava/io/Closeable;",
        "",
        "isClient",
        "Laa0;",
        "sink",
        "Ljava/util/Random;",
        "random",
        "perMessageDeflate",
        "noContextTakeover",
        "",
        "minimumDeflateSize",
        "<init>",
        "(ZLaa0;Ljava/util/Random;ZZJ)V",
        "",
        "opcode",
        "Lkb0;",
        "payload",
        "Ldn8;",
        "writeControlFrame",
        "(ILkb0;)V",
        "writePing",
        "(Lkb0;)V",
        "writePong",
        "code",
        "reason",
        "writeClose",
        "formatOpcode",
        "data",
        "writeMessageFrame",
        "close",
        "()V",
        "Z",
        "Laa0;",
        "getSink",
        "()Laa0;",
        "Ljava/util/Random;",
        "getRandom",
        "()Ljava/util/Random;",
        "J",
        "Li90;",
        "messageBuffer",
        "Li90;",
        "sinkBuffer",
        "writerClosed",
        "Lokhttp3/internal/ws/MessageDeflater;",
        "messageDeflater",
        "Lokhttp3/internal/ws/MessageDeflater;",
        "",
        "maskKey",
        "[B",
        "Lg90;",
        "maskCursor",
        "Lg90;",
        "okhttp"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final isClient:Z

.field private final maskCursor:Lg90;

.field private final maskKey:[B

.field private final messageBuffer:Li90;

.field private messageDeflater:Lokhttp3/internal/ws/MessageDeflater;

.field private final minimumDeflateSize:J

.field private final noContextTakeover:Z

.field private final perMessageDeflate:Z

.field private final random:Ljava/util/Random;

.field private final sink:Laa0;

.field private final sinkBuffer:Li90;

.field private writerClosed:Z


# direct methods
.method public constructor <init>(ZLaa0;Ljava/util/Random;ZZJ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-boolean p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->isClient:Z

    .line 11
    .line 12
    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->sink:Laa0;

    .line 13
    .line 14
    iput-object p3, p0, Lokhttp3/internal/ws/WebSocketWriter;->random:Ljava/util/Random;

    .line 15
    .line 16
    iput-boolean p4, p0, Lokhttp3/internal/ws/WebSocketWriter;->perMessageDeflate:Z

    .line 17
    .line 18
    iput-boolean p5, p0, Lokhttp3/internal/ws/WebSocketWriter;->noContextTakeover:Z

    .line 19
    .line 20
    iput-wide p6, p0, Lokhttp3/internal/ws/WebSocketWriter;->minimumDeflateSize:J

    .line 21
    .line 22
    new-instance p3, Li90;

    .line 23
    .line 24
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p3, p0, Lokhttp3/internal/ws/WebSocketWriter;->messageBuffer:Li90;

    .line 28
    .line 29
    invoke-interface {p2}, Laa0;->c()Li90;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 34
    .line 35
    const/4 p2, 0x0

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    const/4 p3, 0x4

    .line 39
    new-array p3, p3, [B

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    move-object p3, p2

    .line 43
    :goto_0
    iput-object p3, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskKey:[B

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    new-instance p2, Lg90;

    .line 48
    .line 49
    invoke-direct {p2}, Lg90;-><init>()V

    .line 50
    .line 51
    .line 52
    :cond_1
    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskCursor:Lg90;

    .line 53
    .line 54
    return-void
.end method

.method private final writeControlFrame(ILkb0;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->writerClosed:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {p2}, Lkb0;->e()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v1, v0

    .line 10
    const-wide/16 v3, 0x7d

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-gtz v1, :cond_2

    .line 15
    .line 16
    or-int/lit16 p1, p1, 0x80

    .line 17
    .line 18
    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Li90;->H0(I)V

    .line 21
    .line 22
    .line 23
    iget-boolean p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->isClient:Z

    .line 24
    .line 25
    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 26
    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    or-int/lit16 p1, v0, 0x80

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Li90;->H0(I)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->random:Ljava/util/Random;

    .line 35
    .line 36
    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskKey:[B

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v1}, Ljava/util/Random;->nextBytes([B)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 45
    .line 46
    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskKey:[B

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/4 v2, 0x0

    .line 55
    array-length v3, v1

    .line 56
    invoke-virtual {p1, v1, v2, v3}, Li90;->write([BII)V

    .line 57
    .line 58
    .line 59
    if-lez v0, :cond_1

    .line 60
    .line 61
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 62
    .line 63
    iget-wide v0, p1, Li90;->Y:J

    .line 64
    .line 65
    invoke-virtual {p1, p2}, Li90;->C0(Lkb0;)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 69
    .line 70
    iget-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskCursor:Lg90;

    .line 71
    .line 72
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Li90;->R(Lg90;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskCursor:Lg90;

    .line 79
    .line 80
    invoke-virtual {p1, v0, v1}, Lg90;->k(J)I

    .line 81
    .line 82
    .line 83
    sget-object p1, Lokhttp3/internal/ws/WebSocketProtocol;->INSTANCE:Lokhttp3/internal/ws/WebSocketProtocol;

    .line 84
    .line 85
    iget-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskCursor:Lg90;

    .line 86
    .line 87
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskKey:[B

    .line 88
    .line 89
    invoke-virtual {p1, p2, v0}, Lokhttp3/internal/ws/WebSocketProtocol;->toggleMask(Lg90;[B)V

    .line 90
    .line 91
    .line 92
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskCursor:Lg90;

    .line 93
    .line 94
    invoke-virtual {p1}, Lg90;->close()V

    .line 95
    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_0
    invoke-virtual {v1, v0}, Li90;->H0(I)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 102
    .line 103
    invoke-virtual {p1, p2}, Li90;->C0(Lkb0;)V

    .line 104
    .line 105
    .line 106
    :cond_1
    :goto_0
    iget-object p0, p0, Lokhttp3/internal/ws/WebSocketWriter;->sink:Laa0;

    .line 107
    .line 108
    invoke-interface {p0}, Laa0;->flush()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_2
    const-string p0, "Payload size must be less than or equal to 125"

    .line 113
    .line 114
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_3
    const-string p0, "closed"

    .line 119
    .line 120
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->messageDeflater:Lokhttp3/internal/ws/MessageDeflater;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {v0}, Lokhttp3/internal/_UtilCommonKt;->closeQuietly(Ljava/io/Closeable;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p0, p0, Lokhttp3/internal/ws/WebSocketWriter;->sink:Laa0;

    .line 9
    .line 10
    invoke-static {p0}, Lokhttp3/internal/_UtilCommonKt;->closeQuietly(Ljava/io/Closeable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final getRandom()Ljava/util/Random;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/ws/WebSocketWriter;->random:Ljava/util/Random;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getSink()Laa0;
    .locals 0

    .line 1
    iget-object p0, p0, Lokhttp3/internal/ws/WebSocketWriter;->sink:Laa0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final writeClose(ILkb0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    sget-object v0, Lkb0;->f0:Lkb0;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    if-eqz p2, :cond_3

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    sget-object v0, Lokhttp3/internal/ws/WebSocketProtocol;->INSTANCE:Lokhttp3/internal/ws/WebSocketProtocol;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lokhttp3/internal/ws/WebSocketProtocol;->validateCloseCode(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    new-instance v0, Li90;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Li90;->a1(I)V

    .line 20
    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Li90;->C0(Lkb0;)V

    .line 25
    .line 26
    .line 27
    :cond_2
    iget-wide p1, v0, Li90;->Y:J

    .line 28
    .line 29
    invoke-virtual {v0, p1, p2}, Li90;->s(J)Lkb0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_3
    const/16 p1, 0x8

    .line 34
    .line 35
    const/4 p2, 0x1

    .line 36
    :try_start_0
    invoke-direct {p0, p1, v0}, Lokhttp3/internal/ws/WebSocketWriter;->writeControlFrame(ILkb0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    iput-boolean p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->writerClosed:Z

    .line 40
    .line 41
    return-void

    .line 42
    :catchall_0
    move-exception p1

    .line 43
    iput-boolean p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->writerClosed:Z

    .line 44
    .line 45
    throw p1
.end method

.method public final writeMessageFrame(ILkb0;)V
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->writerClosed:Z

    .line 5
    .line 6
    if-nez v0, :cond_6

    .line 7
    .line 8
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->messageBuffer:Li90;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Li90;->C0(Lkb0;)V

    .line 11
    .line 12
    .line 13
    or-int/lit16 v0, p1, 0x80

    .line 14
    .line 15
    iget-boolean v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->perMessageDeflate:Z

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2}, Lkb0;->e()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    int-to-long v1, p2

    .line 24
    iget-wide v3, p0, Lokhttp3/internal/ws/WebSocketWriter;->minimumDeflateSize:J

    .line 25
    .line 26
    cmp-long p2, v1, v3

    .line 27
    .line 28
    if-ltz p2, :cond_1

    .line 29
    .line 30
    iget-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->messageDeflater:Lokhttp3/internal/ws/MessageDeflater;

    .line 31
    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    new-instance p2, Lokhttp3/internal/ws/MessageDeflater;

    .line 35
    .line 36
    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->noContextTakeover:Z

    .line 37
    .line 38
    invoke-direct {p2, v0}, Lokhttp3/internal/ws/MessageDeflater;-><init>(Z)V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lokhttp3/internal/ws/WebSocketWriter;->messageDeflater:Lokhttp3/internal/ws/MessageDeflater;

    .line 42
    .line 43
    :cond_0
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->messageBuffer:Li90;

    .line 44
    .line 45
    invoke-virtual {p2, v0}, Lokhttp3/internal/ws/MessageDeflater;->deflate(Li90;)V

    .line 46
    .line 47
    .line 48
    or-int/lit16 v0, p1, 0xc0

    .line 49
    .line 50
    :cond_1
    iget-object p1, p0, Lokhttp3/internal/ws/WebSocketWriter;->messageBuffer:Li90;

    .line 51
    .line 52
    iget-wide p1, p1, Li90;->Y:J

    .line 53
    .line 54
    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 55
    .line 56
    invoke-virtual {v1, v0}, Li90;->H0(I)V

    .line 57
    .line 58
    .line 59
    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->isClient:Z

    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    const/16 v0, 0x80

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    move v0, v1

    .line 68
    :goto_0
    const-wide/16 v2, 0x7d

    .line 69
    .line 70
    cmp-long v2, p1, v2

    .line 71
    .line 72
    iget-object v3, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 73
    .line 74
    if-gtz v2, :cond_3

    .line 75
    .line 76
    long-to-int v2, p1

    .line 77
    or-int/2addr v0, v2

    .line 78
    invoke-virtual {v3, v0}, Li90;->H0(I)V

    .line 79
    .line 80
    .line 81
    goto/16 :goto_1

    .line 82
    .line 83
    :cond_3
    const-wide/32 v4, 0xffff

    .line 84
    .line 85
    .line 86
    cmp-long v2, p1, v4

    .line 87
    .line 88
    if-gtz v2, :cond_4

    .line 89
    .line 90
    or-int/lit8 v0, v0, 0x7e

    .line 91
    .line 92
    invoke-virtual {v3, v0}, Li90;->H0(I)V

    .line 93
    .line 94
    .line 95
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 96
    .line 97
    long-to-int v2, p1

    .line 98
    invoke-virtual {v0, v2}, Li90;->a1(I)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    or-int/lit8 v0, v0, 0x7f

    .line 103
    .line 104
    invoke-virtual {v3, v0}, Li90;->H0(I)V

    .line 105
    .line 106
    .line 107
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 108
    .line 109
    const/16 v2, 0x8

    .line 110
    .line 111
    invoke-virtual {v0, v2}, Li90;->u0(I)Lmz6;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    iget-object v4, v3, Lmz6;->a:[B

    .line 116
    .line 117
    iget v5, v3, Lmz6;->c:I

    .line 118
    .line 119
    add-int/lit8 v6, v5, 0x1

    .line 120
    .line 121
    const/16 v7, 0x38

    .line 122
    .line 123
    ushr-long v7, p1, v7

    .line 124
    .line 125
    const-wide/16 v9, 0xff

    .line 126
    .line 127
    and-long/2addr v7, v9

    .line 128
    long-to-int v7, v7

    .line 129
    int-to-byte v7, v7

    .line 130
    aput-byte v7, v4, v5

    .line 131
    .line 132
    add-int/lit8 v7, v5, 0x2

    .line 133
    .line 134
    const/16 v8, 0x30

    .line 135
    .line 136
    ushr-long v11, p1, v8

    .line 137
    .line 138
    and-long/2addr v11, v9

    .line 139
    long-to-int v8, v11

    .line 140
    int-to-byte v8, v8

    .line 141
    aput-byte v8, v4, v6

    .line 142
    .line 143
    add-int/lit8 v6, v5, 0x3

    .line 144
    .line 145
    const/16 v8, 0x28

    .line 146
    .line 147
    ushr-long v11, p1, v8

    .line 148
    .line 149
    and-long/2addr v11, v9

    .line 150
    long-to-int v8, v11

    .line 151
    int-to-byte v8, v8

    .line 152
    aput-byte v8, v4, v7

    .line 153
    .line 154
    add-int/lit8 v7, v5, 0x4

    .line 155
    .line 156
    const/16 v8, 0x20

    .line 157
    .line 158
    ushr-long v11, p1, v8

    .line 159
    .line 160
    and-long/2addr v11, v9

    .line 161
    long-to-int v8, v11

    .line 162
    int-to-byte v8, v8

    .line 163
    aput-byte v8, v4, v6

    .line 164
    .line 165
    add-int/lit8 v6, v5, 0x5

    .line 166
    .line 167
    const/16 v8, 0x18

    .line 168
    .line 169
    ushr-long v11, p1, v8

    .line 170
    .line 171
    and-long/2addr v11, v9

    .line 172
    long-to-int v8, v11

    .line 173
    int-to-byte v8, v8

    .line 174
    aput-byte v8, v4, v7

    .line 175
    .line 176
    add-int/lit8 v7, v5, 0x6

    .line 177
    .line 178
    const/16 v8, 0x10

    .line 179
    .line 180
    ushr-long v11, p1, v8

    .line 181
    .line 182
    and-long/2addr v11, v9

    .line 183
    long-to-int v8, v11

    .line 184
    int-to-byte v8, v8

    .line 185
    aput-byte v8, v4, v6

    .line 186
    .line 187
    add-int/lit8 v6, v5, 0x7

    .line 188
    .line 189
    ushr-long v11, p1, v2

    .line 190
    .line 191
    and-long/2addr v11, v9

    .line 192
    long-to-int v8, v11

    .line 193
    int-to-byte v8, v8

    .line 194
    aput-byte v8, v4, v7

    .line 195
    .line 196
    add-int/2addr v5, v2

    .line 197
    and-long v7, p1, v9

    .line 198
    .line 199
    long-to-int v2, v7

    .line 200
    int-to-byte v2, v2

    .line 201
    aput-byte v2, v4, v6

    .line 202
    .line 203
    iput v5, v3, Lmz6;->c:I

    .line 204
    .line 205
    iget-wide v2, v0, Li90;->Y:J

    .line 206
    .line 207
    const-wide/16 v4, 0x8

    .line 208
    .line 209
    add-long/2addr v2, v4

    .line 210
    iput-wide v2, v0, Li90;->Y:J

    .line 211
    .line 212
    :goto_1
    iget-boolean v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->isClient:Z

    .line 213
    .line 214
    if-eqz v0, :cond_5

    .line 215
    .line 216
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->random:Ljava/util/Random;

    .line 217
    .line 218
    iget-object v2, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskKey:[B

    .line 219
    .line 220
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v2}, Ljava/util/Random;->nextBytes([B)V

    .line 224
    .line 225
    .line 226
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 227
    .line 228
    iget-object v2, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskKey:[B

    .line 229
    .line 230
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    array-length v3, v2

    .line 237
    invoke-virtual {v0, v2, v1, v3}, Li90;->write([BII)V

    .line 238
    .line 239
    .line 240
    const-wide/16 v0, 0x0

    .line 241
    .line 242
    cmp-long v2, p1, v0

    .line 243
    .line 244
    if-lez v2, :cond_5

    .line 245
    .line 246
    iget-object v2, p0, Lokhttp3/internal/ws/WebSocketWriter;->messageBuffer:Li90;

    .line 247
    .line 248
    iget-object v3, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskCursor:Lg90;

    .line 249
    .line 250
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2, v3}, Li90;->R(Lg90;)V

    .line 254
    .line 255
    .line 256
    iget-object v2, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskCursor:Lg90;

    .line 257
    .line 258
    invoke-virtual {v2, v0, v1}, Lg90;->k(J)I

    .line 259
    .line 260
    .line 261
    sget-object v0, Lokhttp3/internal/ws/WebSocketProtocol;->INSTANCE:Lokhttp3/internal/ws/WebSocketProtocol;

    .line 262
    .line 263
    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskCursor:Lg90;

    .line 264
    .line 265
    iget-object v2, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskKey:[B

    .line 266
    .line 267
    invoke-virtual {v0, v1, v2}, Lokhttp3/internal/ws/WebSocketProtocol;->toggleMask(Lg90;[B)V

    .line 268
    .line 269
    .line 270
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->maskCursor:Lg90;

    .line 271
    .line 272
    invoke-virtual {v0}, Lg90;->close()V

    .line 273
    .line 274
    .line 275
    :cond_5
    iget-object v0, p0, Lokhttp3/internal/ws/WebSocketWriter;->sinkBuffer:Li90;

    .line 276
    .line 277
    iget-object v1, p0, Lokhttp3/internal/ws/WebSocketWriter;->messageBuffer:Li90;

    .line 278
    .line 279
    invoke-virtual {v0, v1, p1, p2}, Li90;->write(Li90;J)V

    .line 280
    .line 281
    .line 282
    iget-object p0, p0, Lokhttp3/internal/ws/WebSocketWriter;->sink:Laa0;

    .line 283
    .line 284
    invoke-interface {p0}, Laa0;->flush()V

    .line 285
    .line 286
    .line 287
    return-void

    .line 288
    :cond_6
    const-string p0, "closed"

    .line 289
    .line 290
    invoke-static {p0}, Lu52;->s(Ljava/lang/String;)V

    .line 291
    .line 292
    .line 293
    return-void
.end method

.method public final writePing(Lkb0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x9

    .line 5
    .line 6
    invoke-direct {p0, v0, p1}, Lokhttp3/internal/ws/WebSocketWriter;->writeControlFrame(ILkb0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final writePong(Lkb0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/16 v0, 0xa

    .line 5
    .line 6
    invoke-direct {p0, v0, p1}, Lokhttp3/internal/ws/WebSocketWriter;->writeControlFrame(ILkb0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
