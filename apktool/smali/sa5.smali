.class public final Lsa5;
.super Ljx4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Las4;


# instance fields
.field public q0:Lgn2;

.field public r0:J


# virtual methods
.method public final N0()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final a(J)V
    .locals 2

    .line 1
    iget-wide v0, p0, Lsa5;->r0:J

    .line 2
    .line 3
    invoke-static {v0, v1, p1, p2}, Lpf3;->a(JJ)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lsa5;->q0:Lgn2;

    .line 10
    .line 11
    new-instance v1, Lpf3;

    .line 12
    .line 13
    invoke-direct {v1, p1, p2}, Lpf3;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0, v1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    iput-wide p1, p0, Lsa5;->r0:J

    .line 20
    .line 21
    :cond_0
    return-void
.end method
