.class public final Lka7;
.super Ljava/util/concurrent/atomic/AtomicBoolean;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Liv5;


# instance fields
.field public final X:Laq7;

.field public final Y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Laq7;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lka7;->X:Laq7;

    .line 5
    .line 6
    iput-object p2, p0, Lka7;->Y:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final request(J)V
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long p1, p1, v0

    .line 4
    .line 5
    if-ltz p1, :cond_4

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    const/4 p2, 0x1

    .line 12
    invoke-virtual {p0, p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_3

    .line 17
    .line 18
    iget-object p1, p0, Lka7;->X:Laq7;

    .line 19
    .line 20
    iget-object p2, p1, Laq7;->X:Lk01;

    .line 21
    .line 22
    iget-boolean p2, p2, Lk01;->Y:Z

    .line 23
    .line 24
    if-eqz p2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    iget-object p0, p0, Lka7;->Y:Ljava/lang/Object;

    .line 28
    .line 29
    :try_start_0
    invoke-interface {p1, p0}, Lu85;->onNext(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 30
    .line 31
    .line 32
    iget-object p0, p1, Laq7;->X:Lk01;

    .line 33
    .line 34
    iget-boolean p0, p0, Lk01;->Y:Z

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    invoke-interface {p1}, Lu85;->b()V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :catchall_0
    move-exception p2

    .line 44
    invoke-static {p2, p1, p0}, Lvr3;->e0(Ljava/lang/Throwable;Lu85;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    :cond_3
    :goto_0
    return-void

    .line 48
    :cond_4
    const-string p0, "n >= 0 required"

    .line 49
    .line 50
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method
