.class public final Lfd5;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Liv5;


# instance fields
.field public final X:Lgd5;


# direct methods
.method public constructor <init>(Lgd5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfd5;->X:Lgd5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final request(J)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, p1, v0

    .line 4
    .line 5
    if-lez v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide v2, 0x7fffffffffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {p0, p1, p2}, Lmb6;->B(Ljava/util/concurrent/atomic/AtomicLong;J)J

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lfd5;->X:Lgd5;

    .line 25
    .line 26
    invoke-virtual {p0}, Lgd5;->h()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    if-ltz v0, :cond_2

    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :cond_2
    const-string p0, "n >= 0 required"

    .line 34
    .line 35
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
