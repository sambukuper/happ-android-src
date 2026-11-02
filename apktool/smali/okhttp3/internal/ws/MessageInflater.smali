.class public final Lokhttp3/internal/ws/MessageInflater;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lokhttp3/internal/ws/MessageInflater;",
        "Ljava/io/Closeable;",
        "",
        "noContextTakeover",
        "<init>",
        "(Z)V",
        "Li90;",
        "buffer",
        "Ldn8;",
        "inflate",
        "(Li90;)V",
        "close",
        "()V",
        "Z",
        "deflatedBytes",
        "Li90;",
        "Ljava/util/zip/Inflater;",
        "inflater",
        "Ljava/util/zip/Inflater;",
        "Loc3;",
        "inflaterSource",
        "Loc3;",
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
.field private final deflatedBytes:Li90;

.field private inflater:Ljava/util/zip/Inflater;

.field private inflaterSource:Loc3;

.field private final noContextTakeover:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lokhttp3/internal/ws/MessageInflater;->noContextTakeover:Z

    .line 5
    .line 6
    new-instance p1, Li90;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Li90;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Loc3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Loc3;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Loc3;

    .line 10
    .line 11
    iput-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    .line 12
    .line 13
    return-void
.end method

.method public final inflate(Li90;)V
    .locals 6
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
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Li90;

    .line 5
    .line 6
    iget-wide v0, v0, Li90;->Y:J

    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-nez v0, :cond_6

    .line 13
    .line 14
    iget-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Ljava/util/zip/Inflater;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    .line 25
    .line 26
    :cond_0
    iget-object v1, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Loc3;

    .line 27
    .line 28
    if-nez v1, :cond_1

    .line 29
    .line 30
    new-instance v1, Loc3;

    .line 31
    .line 32
    iget-object v2, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Li90;

    .line 33
    .line 34
    invoke-direct {v1, v2, v0}, Loc3;-><init>(Lje7;Ljava/util/zip/Inflater;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Loc3;

    .line 38
    .line 39
    :cond_1
    iget-boolean v2, p0, Lokhttp3/internal/ws/MessageInflater;->noContextTakeover:Z

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->reset()V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v2, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Li90;

    .line 47
    .line 48
    invoke-virtual {v2, p1}, Li90;->M(Lje7;)J

    .line 49
    .line 50
    .line 51
    iget-object v2, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Li90;

    .line 52
    .line 53
    const v3, 0xffff

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, v3}, Li90;->Z0(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    .line 60
    .line 61
    .line 62
    move-result-wide v2

    .line 63
    iget-object v4, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Li90;

    .line 64
    .line 65
    iget-wide v4, v4, Li90;->Y:J

    .line 66
    .line 67
    add-long/2addr v2, v4

    .line 68
    :cond_3
    const-wide v4, 0x7fffffffffffffffL

    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1, v4, v5}, Loc3;->g(Li90;J)J

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    .line 77
    .line 78
    .line 79
    move-result-wide v4

    .line 80
    cmp-long v4, v4, v2

    .line 81
    .line 82
    if-gez v4, :cond_4

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->finished()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_3

    .line 89
    .line 90
    :cond_4
    invoke-virtual {v0}, Ljava/util/zip/Inflater;->getBytesRead()J

    .line 91
    .line 92
    .line 93
    move-result-wide v4

    .line 94
    cmp-long p1, v4, v2

    .line 95
    .line 96
    if-gez p1, :cond_5

    .line 97
    .line 98
    iget-object p1, p0, Lokhttp3/internal/ws/MessageInflater;->deflatedBytes:Li90;

    .line 99
    .line 100
    invoke-virtual {p1}, Li90;->g()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Loc3;->close()V

    .line 104
    .line 105
    .line 106
    const/4 p1, 0x0

    .line 107
    iput-object p1, p0, Lokhttp3/internal/ws/MessageInflater;->inflaterSource:Loc3;

    .line 108
    .line 109
    iput-object p1, p0, Lokhttp3/internal/ws/MessageInflater;->inflater:Ljava/util/zip/Inflater;

    .line 110
    .line 111
    :cond_5
    return-void

    .line 112
    :cond_6
    const-string p0, "Failed requirement."

    .line 113
    .line 114
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method
