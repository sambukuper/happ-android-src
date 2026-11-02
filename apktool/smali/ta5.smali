.class public final Lta5;
.super Laq7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final g0:Lua5;

.field public h0:J


# direct methods
.method public constructor <init>(Lua5;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Laq7;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lta5;->g0:Lua5;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 3

    .line 1
    iget-object v0, p0, Lta5;->g0:Lua5;

    .line 2
    .line 3
    iget-wide v1, p0, Lta5;->h0:J

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Lua5;->i(J)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final f(Liv5;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lta5;->g0:Lua5;

    .line 2
    .line 3
    iget-object p0, p0, Lua5;->i0:Ljv5;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljv5;->b(Liv5;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lta5;->g0:Lua5;

    .line 2
    .line 3
    iget-object v0, p0, Lua5;->l0:Ljava/util/concurrent/atomic/AtomicReference;

    .line 4
    .line 5
    invoke-static {v0, p1}, Lm42;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Ljr6;->b(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-static {v0}, Lm42;->b(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object v0, Lm42;->X:Ljava/lang/Throwable;

    .line 20
    .line 21
    if-ne p1, v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    iget-object v0, p0, Lua5;->g0:Lm5;

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Lm5;->onError(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p0}, Laq7;->c()V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lta5;->h0:J

    .line 2
    .line 3
    const-wide/16 v2, 0x1

    .line 4
    .line 5
    add-long/2addr v0, v2

    .line 6
    iput-wide v0, p0, Lta5;->h0:J

    .line 7
    .line 8
    iget-object p0, p0, Lta5;->g0:Lua5;

    .line 9
    .line 10
    iget-object p0, p0, Lua5;->g0:Lm5;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lm5;->onNext(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
